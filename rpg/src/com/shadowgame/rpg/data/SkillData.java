package com.shadowgame.rpg.data;

import java.util.HashMap;
import java.util.Map;

import xgame.core.util.ObjectUtils;

import com.shadowgame.rpg.core.AppException;
import com.shadowgame.rpg.core.Data;
import com.shadowgame.rpg.modules.skill.AbstractSkill;
import com.shadowgame.rpg.persist.dao.TSkillDao;
import com.shadowgame.rpg.persist.entity.TSkill;
import com.shadowgame.rpg.service.Services;

@Data
public class SkillData {
	private TSkillDao dao = Services.daoFactory.get(TSkillDao.class);
	private Map<Integer, TSkill> skills = new HashMap<Integer, TSkill>();
	private Map<Integer, AbstractSkill> skillLogics = new HashMap<Integer, AbstractSkill>();
	public SkillData() {
		for (TSkill entity : dao.getAll()) {
			skills.put(entity.id, entity);
			try {
				Class<?> clazz = Class.forName("com.shadowgame.rpg.modules.skill.Skill" + entity.id);
				skillLogics.put(entity.id, (AbstractSkill)ObjectUtils.create(clazz, new Class[]{TSkill.class}, new Object[]{entity}));
			} catch (Exception e) {
				throw new AppException("skill init error:" + entity.id, e);
			}
		}
	}
	
	public TSkill getSkillEntity(int skillId) {
		return this.skills.get(skillId);
	}
	
	public AbstractSkill getSkillLogic(int skillId) {
		return this.skillLogics.get(skillId);
	}
}