package com.resto.oncf.model;

import javax.persistence.*;

@Entity
@Table(name = "image_table")
public class ImageModel {

	public ImageModel() {
		super();
	}

	public ImageModel(String name, String type, byte[] picByte ,Long idplat) {
		this.name = name;
		this.type = type;
		this.picByte = picByte;
		this.idplat = idplat;
	}

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "type")
	private String type;

	@Column(name = "picByte", length = 1000)
	private byte[] picByte;

	@Column(name = "Id_Plat")
	private Long idplat ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdplat() {
		return idplat;
	}

	public void setIdplat(Long idplat) {
		this.idplat = idplat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getPicByte() {
		return picByte;
	}

	public void setPicByte(byte[] picByte) {
		this.picByte = picByte;
	}
}