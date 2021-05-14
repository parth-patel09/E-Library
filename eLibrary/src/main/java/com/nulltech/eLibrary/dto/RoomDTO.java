package com.nulltech.eLibrary.dto;


public class RoomDTO
{
		private int roomId;
		
		private String buildingType;
		
		private String floor;
		
		private String roomNo;

		public String getFloor() 		{
			return floor;
		}

		public void setFloor(String floor) {
			this.floor = floor;
		}

		public int getRoomId() {
			return roomId;
		}

		public void setRoomId(int roomId) {
			this.roomId = roomId;
		}

		public String getBuildingType() {
			return buildingType;
		}

		public void setBuildingType(String buildingType) {
			this.buildingType = buildingType;
		}

		public String getRoomNo() {
			return roomNo;
		}

		public void setRoomNo(String roomNo) {
			this.roomNo = roomNo;
		}		
		
}
