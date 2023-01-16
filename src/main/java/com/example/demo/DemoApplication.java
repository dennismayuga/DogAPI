package com.example.demo;

import java.util.ArrayList;
import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	
	}

	@GetMapping("/dog")
	public static List<Dog> dog(List<Dog>){

			List<Dog> list = new ArrayList<>();
			list.add(new Dog("pepper","poodle"));  // 1 
			list.add(new Dog("sir", "german-shepard")); // 2
			list.add(new Dog("bear","siberian-husky")); // 3
			list.add(new Dog("star", "bulldog")); // 4
			list.add(new Dog("snow","golden-retriver")); // 5
			list.add(new Dog("summer","labrador-retriever")); //6 
			list.add(new Dog("spring","french-bulldog")); // 7
			list.add(new Dog("fantasy","beagle")); // 8
			list.add(new Dog("price","great-dane")); // 9
			list.add(new Dog("mario", "chihuahua")); // 10
			return list;
			}

	@GetMapping("/dog/poodle")
	public String poodle(){

	return "dog";
	}



	}
	
	
	










	/* 
	}

	@GetMapping("/dog/poodle")
	public String poodle(){

	return "dog";
	}
	@GetMapping("/dog/bulldog")
	public String bulldog(){

	return "dog";
	}
	@GetMapping("/dog/golden-retriever")
	public String goldenRetriever(){

	return "dog";
	}
	@GetMapping("/dog/labrador-retriever")
	public String labradorRetriever(){

	return "dog";
	}
	@GetMapping("/dog/french-bulldog")
	public String frenchBulldog(){

	return "dog";
	}
	@GetMapping("/dog/beagle")
	public String beagle(){

	return "dog";
	}
	@GetMapping("/dog/great-dane")
	public String greatDane(){

	return "dog";
	}
	@GetMapping("/dog/siberian-husky")
	public String siberianHusly(){

	return "dog";
	}
	*/
	   // {german shepherd, poodle, bulldog, golden retriever, labrador retriever, french bulldog, beagle, great dane, siberian husky}








	






