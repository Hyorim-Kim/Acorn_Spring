package pack.controller;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class UploadDto {
	private String myName;
	private MultipartFile myFile;
	
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public MultipartFile getMyFile() {
		return myFile;
	}
	public void setMyFile(MultipartFile myFile) {
		this.myFile = myFile;
	}
}
