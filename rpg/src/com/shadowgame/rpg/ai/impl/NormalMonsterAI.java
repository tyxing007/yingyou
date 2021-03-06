package com.shadowgame.rpg.ai.impl;

import com.shadowgame.rpg.ai.AbstractAI;
import com.shadowgame.rpg.ai.event.AIEvent;
import com.shadowgame.rpg.ai.event.handler.AttackedEventHandler;
import com.shadowgame.rpg.ai.event.handler.StopEventHandler;
import com.shadowgame.rpg.ai.state.AIState;
import com.shadowgame.rpg.ai.state.impl.AttackingStateHandler;
import com.shadowgame.rpg.ai.state.impl.StopStateHandler;
import com.shadowgame.rpg.ai.state.impl.ThinkingStateHandler;
import com.shadowgame.rpg.modules.fight.AbstractFighter;

public class NormalMonsterAI extends AbstractAI {
	
	public NormalMonsterAI(AbstractFighter monster) {
		super(monster);
		//event
		this.addEventHandler(AIEvent.ATTACKED, new AttackedEventHandler());
		this.addEventHandler(AIEvent.STOP_AI, new StopEventHandler());
		//state
		this.addStateHandler(AIState.ATTACKING, new AttackingStateHandler());
		this.addStateHandler(AIState.THINKING, new ThinkingStateHandler());
		this.addStateHandler(AIState.STOP, new StopStateHandler());
	}
}
