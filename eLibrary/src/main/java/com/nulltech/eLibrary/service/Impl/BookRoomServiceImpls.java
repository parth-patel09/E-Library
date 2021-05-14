package com.nulltech.eLibrary.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nulltech.eLibrary.dto.BookRoomDTO;
import com.nulltech.eLibrary.model.BookRoom;
import com.nulltech.eLibrary.repository.BookRoomRepository;
import com.nulltech.eLibrary.service.IBookRoomServices;

@Service
public class BookRoomServiceImpls implements IBookRoomServices 
{
	@Autowired
	private BookRoomRepository bookRoomRepo;
	
	@Override
	public void addBookRoom(BookRoomDTO bookRoom) 
	{
		BookRoom book = new BookRoom();
//		book.setUser(bookRoom.getUser());
//		book.setRoom(boosetStartTimekRoom.getRoom());
		book.setNumberOfPersons(bookRoom.getNumberOfPersons());
		book.setAdditionalRequirements(bookRoom.getAdditionalRequirements());
		book.setBookingStatus(bookRoom.getBookingStatus());
		book.setStartTime(bookRoom.getStartTime());
		book.setEndDate(bookRoom.getEndDate());
		
		bookRoomRepo.save(book);

	}

}
