package com.github.leandroAlcantara1997.saladereuniao.repository;

import com.github.leandroAlcantara1997.saladereuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{
}
