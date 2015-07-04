package com.shadowgame.rpg.modules.buff;

import com.shadowgame.rpg.modules.core.AbstractFighter;
import com.shadowgame.rpg.persist.entity.TBuff;
import com.shadowgame.rpg.persist.entity.TSkill;

public class AbstractBuff implements BuffLogic {
	protected TBuff entity;
	
	public AbstractBuff(TBuff entity) {
		this.entity = entity;
	}

	@Override
	public long getPeriod(BuffTask task) {
		return entity.period;
	}

	@Override
	public void onStart(BuffTask task) {
		System.out.println("buff " + entity.id + " start");
		task.target.buffList.addBuff(task);
	}

	@Override
	public void onPeriod(BuffTask task) {
		System.out.println("buff " + entity.id + " execute");
	}

	@Override
	public void onStop(BuffTask task) {
		System.out.println("buff " + entity.id + " stop");
		task.target.buffList.removeBuff(task);
	}

	@Override
	public boolean isFinish(BuffTask task) {
		if(this.entity.duration > 0)
			return task.startTime + this.entity.duration < System.currentTimeMillis();
		return task.executeCount >= this.entity.count;
	}

	@Override
	public TBuff getBuff() {
		return entity;
	}
	
	public void effect(AbstractFighter source, TSkill skill, AbstractFighter target) {
		new BuffTask(source, skill, target, this).start();
	}
}