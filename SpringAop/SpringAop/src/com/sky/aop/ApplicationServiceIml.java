package com.sky.aop;

import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceIml implements ApplicationService {
	@Log
	@Override
	public void processApplication() {
		System.out.println("Process Application Form");

	}

}
