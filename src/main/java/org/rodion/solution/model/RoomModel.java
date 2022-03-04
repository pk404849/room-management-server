package org.rodion.solution.model;

import java.math.BigDecimal;

public class RoomModel {

	private Integer id;
	private String floor;
	private Integer roomNumber;
	private Boolean isBooked;
	private String roomType;
	private BigDecimal roomFare;
	private Integer facilityId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Boolean getIsBooked() {
		return isBooked;
	}

	public void setIsBooked(Boolean isBooked) {
		this.isBooked = isBooked;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public BigDecimal getRoomFare() {
		return roomFare;
	}

	public void setRoomFare(BigDecimal roomFare) {
		this.roomFare = roomFare;
	}

	public Integer getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(Integer facilityId) {
		this.facilityId = facilityId;
	}

}
