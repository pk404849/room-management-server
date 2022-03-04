package org.rodion.solution.util;

import java.util.ArrayList;
import java.util.List;

import org.rodion.solution.entity.Facility;
import org.rodion.solution.entity.Resident;
import org.rodion.solution.entity.Room;
import org.rodion.solution.model.FacilityModel;
import org.rodion.solution.model.ResidentModel;
import org.rodion.solution.model.RoomModel;

public class ApiConverter {

	public static Room getRoomJpaObject(RoomModel roomModel) {

		if (roomModel != null) {
			Room room = new Room();
			room.setId(roomModel.getId());
			room.setFloor(roomModel.getFloor());
			room.setIsBooked(roomModel.getIsBooked());
			room.setRoomFare(roomModel.getRoomFare());
			room.setRoomType(roomModel.getRoomType());
			room.setRoomNumber(roomModel.getRoomNumber());

			Integer facilityId = roomModel.getFacilityId();
			if (facilityId != null && facilityId != 0) {
				Facility facility = new Facility();
				facility.setId(facilityId);
				room.setFacility(facility);
			}
			return room;
		}
		return null;

	}

	public static RoomModel getRoomModelObject(Room room) {

		if (room != null) {
			RoomModel roomModel = new RoomModel();
			roomModel.setId(room.getId());
			roomModel.setFloor(room.getFloor());
			roomModel.setIsBooked(room.getIsBooked());
			roomModel.setRoomFare(room.getRoomFare());
			roomModel.setRoomType(room.getRoomType());
			roomModel.setRoomNumber(room.getRoomNumber());
			return roomModel;
		}
		return null;
	}

	public static List<RoomModel> getAllRoomModelObject(List<Room> roomList) {

		if (roomList != null && !roomList.isEmpty()) {
			List<RoomModel> roomModelList = new ArrayList<RoomModel>();
			for (Room room : roomList) {
				roomModelList.add(getRoomModelObject(room));
			}
			return roomModelList;
		}
		return null;
	}

	public static Resident getResidentJpaObject(ResidentModel residentModel) {

		if (residentModel != null) {
			Resident resident = new Resident();
			resident.setId(residentModel.getId());
			resident.setResidentAddress(residentModel.getResidentAddress());
			resident.setResidentIdProof(residentModel.getResidentIdProof());
			resident.setResidentName(residentModel.getResidentName());
			resident.setResidentPhoneNo(residentModel.getResidentPhoneNo());
			resident.setCheckinTime(residentModel.getCheckInTime());
			resident.setCheckOutTime(residentModel.getCheckOutTime());
			resident.setRoomIdList(residentModel.getRoomIdList());
			return resident;
		}
		return null;
	}

	public static Room getRoomObject(Integer roomId) {
		Room room = new Room();
		room.setId(roomId);
		return room;
	}

	public static ResidentModel getResidentModelObject(Resident resident) {

		if (resident != null) {
			ResidentModel residentModel = new ResidentModel();
			residentModel.setId(resident.getId());
			residentModel.setResidentAddress(resident.getResidentAddress());
			residentModel.setResidentIdProof(resident.getResidentIdProof());
			residentModel.setResidentName(resident.getResidentName());
			residentModel.setResidentPhoneNo(resident.getResidentPhoneNo());
			return residentModel;
		}
		return null;
	}

	public static List<ResidentModel> getAllResidentModelObject(List<Resident> residentList) {

		if (residentList != null && !residentList.isEmpty()) {
			List<ResidentModel> residentModelList = new ArrayList<ResidentModel>();
			for (Resident resident : residentList) {
				residentModelList.add(getResidentModelObject(resident));
			}
			return residentModelList;
		}
		return null;
	}

	public static Facility getFacilityJpaObject(FacilityModel facilityModel) {

		if (facilityModel != null) {
			Facility facility = new Facility();
			facility.setId(facilityModel.getId());
			facility.setBedRoom(facilityModel.getBedRoom());
			facility.setHasGizer(facilityModel.getHasGizer());
			facility.setHasLift(facilityModel.getHasLift());
			facility.setHasPhone(facilityModel.getHasPhone());
			facility.setHasTV(facilityModel.getHasTV());
			facility.setHasWIFI(facilityModel.getHasWIFI());
			facility.setHasAC(facilityModel.getHasAC());
			facility.setRoomIdList(facilityModel.getRoomIdList());
			return facility;
		}
		return null;
	}

	public static FacilityModel getFacilityModelObject(Facility facility) {
		if (facility != null) {
			FacilityModel facilityModel = new FacilityModel();
			facilityModel.setId(facility.getId());
			facilityModel.setBedRoom(facility.getBedRoom());
			facilityModel.setHasGizer(facility.getHasGizer());
			facilityModel.setHasLift(facility.getHasLift());
			facilityModel.setHasPhone(facility.getHasPhone());
			facilityModel.setHasTV(facility.getHasTV());
			facilityModel.setHasWIFI(facility.getHasWIFI());
			return facilityModel;
		}
		return null;
	}

	public static List<FacilityModel> getAllFacilityModelObject(List<Facility> facilityList) {

		if (facilityList != null && !facilityList.isEmpty()) {
			List<FacilityModel> facilityModelList = new ArrayList<FacilityModel>();
			for (Facility facility : facilityList) {
				facilityModelList.add(getFacilityModelObject(facility));
			}
			return facilityModelList;
		}
		return null;
	}

}