package com.rain.beans;

import org.springframework.stereotype.Component;

@Component
public class GroupMappingBean {

	private String groupId;
	private String userId;
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
