package com.phone.dto;

import java.io.IOException;

import javax.persistence.Column;
import javax.persistence.Lob;

import org.springframework.web.multipart.MultipartFile;

import com.phone.common.AttachmentBaseDto;

public class AttachmentDTO extends AttachmentBaseDto {

	@Lob
	@Column(name = "DOC")
	private byte[] doc;

	public AttachmentDTO() {
		super();
	}

	public AttachmentDTO(MultipartFile file) {

		name = file.getOriginalFilename();

		type = file.getContentType();

		try {
			doc = file.getBytes();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public byte[] getDoc() {
		return doc;
	}

	public void setDoc(byte[] doc) {
		this.doc = doc;
	}

}
