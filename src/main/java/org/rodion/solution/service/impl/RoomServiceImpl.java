package org.rodion.solution.service.impl;

import java.util.List;

import org.rodion.solution.entity.Room;
import org.rodion.solution.repository.RoomRepository;
import org.rodion.solution.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomRepository roomRepository;
	
	@Override
	public Room addRoom(Room room) {
		return roomRepository.save(room);
	}

	@Override
	public Room updateRoom(Room room) {
		return roomRepository.save(room);
	}

	@Override
	public Room getRoomById(Integer roomId) {
		return roomRepository.getById(roomId);
	}

	@Override
	public List<Room> findAllRoom() {
		return roomRepository.findAll();
	}

	@Override
	public Boolean deleteRoomById(Integer roomId) {
		roomRepository.deleteById(roomId);
		return true;
	}

}
