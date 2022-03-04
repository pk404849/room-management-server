package org.rodion.solution.model;

import java.util.List;

public class FacilityModel {

	private Integer id;
	private Integer bedRoom;
	private Boolean hasTV;
	private Boolean hasWIFI;
	private Boolean hasGizer;
	private Boolean hasPhone;
	private Boolean hasLift;
	private Boolean hasAC;
	private List<Integer> roomIdList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBedRoom() {
		return bedRoom;
	}

	public void setBedRoom(Integer bedRoom) {
		this.bedRoom = bedRoom;
	}

	public Boolean getHasTV() {
		return hasTV;
	}

	public void setHasTV(Boolean hasTV) {
		this.hasTV = hasTV;
	}

	public Boolean getHasWIFI() {
		return hasWIFI;
	}

	public void setHasWIFI(Boolean hasWIFI) {
		this.hasWIFI = hasWIFI;
	}

	public Boolean getHasGizer() {
		return hasGizer;
	}

	public void setHasGizer(Boolean hasGizer) {
		this.hasGizer = hasGizer;
	}

	public Boolean getHasPhone() {
		return hasPhone;
	}

	public void setHasPhone(Boolean hasPhone) {
		this.hasPhone = hasPhone;
	}

	public Boolean getHasLift() {
		return hasLift;
	}

	public void setHasLift(Boolean hasLift) {
		this.hasLift = hasLift;
	}

	public Boolean getHasAC() {
		return hasAC;
	}

	public void setHasAC(Boolean hasAC) {
		this.hasAC = hasAC;
	}

	public List<Integer> getRoomIdList() {
		return roomIdList;
	}

	public void setRoomIdList(List<Integer> roomIdList) {
		this.roomIdList = roomIdList;
	}

}
