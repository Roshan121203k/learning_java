package com.example.demo;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="app")
public class ConfigExample {
	
	public List<String> getSupportedLanguages() {
		return supportedLanguages;
	}
	public void setSupportedLanguages(List<String> supportedLanguages) {
		this.supportedLanguages = supportedLanguages;
	}
	private String version;
	private String author;
	private List<String> supportedLanguages;
	@Override
	public String toString() {
		return "ConfigExample [version=" + version + ", author=" + author + ", supportedLanguages=" + supportedLanguages
				+ "]";
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
