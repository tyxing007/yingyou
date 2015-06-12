package com.shadowgame.rpg.modules.exec;

import com.alibaba.fastjson.JSONObject;
import com.shadowgame.rpg.modules.core.Player;
import com.shadowgame.rpg.service.Services;

public class Execution {
	private JSONObject param;
	private Exec exec;
	
	public Execution(String execStr) {
		JSONObject json = JSONObject.parseObject(execStr);
		this.param = json.getJSONObject("param");
		this.exec = Services.config.execConfig.key2exec.get(json.getString("key"));
	}
	
	public Execution(String key, JSONObject param) {
		this.exec = Services.config.execConfig.key2exec.get(key);
		this.param = param;
	}

	public boolean check(Player player) {
		return (boolean)invoke(player);
	}
	
	public <T> T invoke(Player player) {
		return exec.invoke(player, param);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public Exec getExec() {
		return exec;
	}

	public JSONObject getParam() {
		return param;
	}
}