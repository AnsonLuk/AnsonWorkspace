package com.hsbc.gltc.utilites.iUpload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class DoucmentExtractionAndUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoucmentExtractionAndUploadApplication.class, args);
	}
}
