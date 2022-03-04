package org.rodion.solution.model;

import java.time.LocalDateTime;
import java.util.List;

public class ResidentModel {
	private Integer id;
	private String residentIdProof;
	private String residentName;;
	private String residentAddress;
	private String residentPhoneNo;
	private LocalDateTime checkInTime;
	private LocalDateTime checkOutTime;
	private List<Integer> roomIdList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getResidentIdProof() {
		return residentIdProof;
	}

	public void setResidentIdProof(String residentIdProof) {
		this.residentIdProof = residentIdProof;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getResidentAddress() {
		return residentAddress;
	}

	public void setResidentAddress(String residentAddress) {
		this.residentAddress = residentAddress;
	}

	public String getResidentPhoneNo() {
		return residentPhoneNo;
	}

	public void setResidentPhoneNo(String residentPhoneNo) {
		this.residentPhoneNo = residentPhoneNo;
	}

	public LocalDateTime getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(LocalDateTime checkInTime) {
		this.checkInTime = checkInTime;
	}

	public LocalDateTime getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(LocalDateTime checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	public List<Integer> getRoomIdList() {
		return roomIdList;
	}

	public void setRoomIdList(List<Integer> roomIdList) {
		this.roomIdList = roomIdList;
	}

}
