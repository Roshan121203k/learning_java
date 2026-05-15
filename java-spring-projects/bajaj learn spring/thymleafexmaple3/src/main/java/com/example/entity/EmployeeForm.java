package com.example.entity;
import org.springframework.web.multipart.MultipartFile;

public class EmployeeForm {
	private Long id;
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private String name;
    private String email;
    private String role;

    private MultipartFile image; // 🔥 directly bind file

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

    // getters and setters
}