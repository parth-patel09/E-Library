package com.nulltech.eLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nulltech.eLibrary.model.BookRoom;

public interface BookRoomRepository extends JpaRepository<BookRoom, Long>
{
		
}
