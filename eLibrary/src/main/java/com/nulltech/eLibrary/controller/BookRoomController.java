package com.nulltech.eLibrary.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nulltech.eLibrary.dto.BookRoomDTO;
import com.nulltech.eLibrary.service.IBookRoomServices;
import com.nulltech.eLibrary.service.Impl.BookRoomServiceImpls;

@RestController
public class BookRoomController
{
	@Autowired
	private BookRoomServiceImpls bookRoomService;
	
	@Autowired
	private IBookRoomServices Ibookroom;
	
	@GetMapping("/bookRoom")
	public void home()
	{
		BookRoomDTO bookroom = new BookRoomDTO();
		bookroom.setAdditionalRequirements("yes");
		bookroom.setBookingStatus(2);
		bookroom.setEndDate(new Date());
		bookroom.setNumberOfPersons(4);
		bookroom.setStartTime(new Date());
		
		bookRoomService.addBookRoom(bookroom);
	}
}
