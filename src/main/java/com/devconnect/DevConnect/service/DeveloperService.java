package com.devconnect.DevConnect.service;

import com.devconnect.DevConnect.model.Developer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperService {

	public List<Developer> getAllDevelopers() {
		return List.of(
			new Developer(
				1L,
				"Darshan Patil",
				"Full Stack Developer",
				"darshan@example.com",
				List.of("Java", "Spring Boot", "React", "PostgreSQL"),
				"Building robust full-stack applications and RESTful APIs."
			),
			new Developer(
				2L,
				"Alex Chen",
				"Backend Architect",
				"alex.chen@example.com",
				List.of("Java", "Docker", "Kubernetes", "Microservices"),
				"Specializing in high-throughput distributed architectures."
			),
			new Developer(
				3L,
				"Sarah Jenkins",
				"Frontend Specialist",
				"sarah.j@example.com",
				List.of("TypeScript", "React", "Next.js", "Tailwind CSS"),
				"Designing accessible, responsive, and intuitive web interfaces."
			)
		);
	}
}
