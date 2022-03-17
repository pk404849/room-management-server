package org.rodion.solution.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.rodion.solution.entity.Resident;
import org.rodion.solution.entity.Room;
import org.rodion.solution.repository.ResidentRepository;
import org.rodion.solution.repository.RoomRepository;
import org.rodion.solution.service.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResidentServiceImpl implements ResidentService {

	@Autowired
	private ResidentRepository residentRepository;
	
	@Autowired
	private RoomRepository roomRepository;

	@Override
	public Resident addResident(Resident resident) {
		List<Integer> roomIdList = resident.getRoomIdList();
		List<Room> roomList = new ArrayList<Room>();
		if(roomIdList != null && !roomIdList.isEmpty()) {
			for(Integer roomId : roomIdList) {
				Room room = roomRepository.getRoomById(roomId);
				room.setIsBooked(true);
				roomList.add(room);
			}
			resident.setRoomList(roomList);
		}else {
			Room room = roomRepository.getRoomById(resident.getRoomId());
			room.setIsBooked(true);
			roomList.add(room);
			resident.setRoomList(roomList);
		}
		return residentRepository.save(resident);
	}

	@Override
	public Resident updateResident(Resident resident) {
		return residentRepository.save(resident);
	}

	@Override
	public Resident getResidentById(Integer residentId) {
		return residentRepository.getById(residentId);
	}

	@Override
	public List<Resident> findAllResident() {
		return residentRepository.findAll();
	}

	@Override
	public Boolean deleteResidentById(Integer residentId) {
		residentRepository.deleteById(residentId);
		return true;
	}

}
