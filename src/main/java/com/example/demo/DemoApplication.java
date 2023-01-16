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

	@GetMapping("/dog")					// displaying all dog breeds
	public static List<Dog> dog(){
		List<Dog> dogList = ArrayListDatabase();
			return dogList;
			}

	@GetMapping("/dog/poodle")			// displaying all poodles
	public static List<Dog> poodle(){
		List<Dog> dogList = ArrayListDatabase();

		List<Dog> poodleList = new ArrayList<>();
		for(Dog dogObject : dogList ){
			if(dogObject.getBreed().equalsIgnoreCase("poodle")){
				poodleList.add(dogObject);
			}
		}
		
	return poodleList;
	}

	@GetMapping("/dog/german-shepard")			//displaying all german shepards
	public static List<Dog> germanShepard(){
		List<Dog> dogList = ArrayListDatabase();

		List<Dog> germanShepardList = new ArrayList<>();
		for(Dog dogObject : dogList ){
			if(dogObject.getBreed().equalsIgnoreCase("german-shepard")){
			germanShepardList.add(dogObject);
			}
		}
		
	return germanShepardList;
	}

	@GetMapping("/dog/siberian-husky")			//displaying siberian huskies 
	public static List<Dog> siberianHusky(){
		List<Dog> dogList = ArrayListDatabase();

		List<Dog> siberianHuskyList = new ArrayList<>();
		for(Dog dogObject : dogList ){
			if(dogObject.getBreed().equalsIgnoreCase("siberian-husky")){
				siberianHuskyList.add(dogObject);
			}
		}
		
	return siberianHuskyList;
	}

	@GetMapping("/dog/bulldog")			//displaying all bulldogs
	public static List<Dog> bulldog(){
		List<Dog> dogList = ArrayListDatabase();

		List<Dog> bulldogList = new ArrayList<>();
		for(Dog dogObject : dogList ){
			if(dogObject.getBreed().equalsIgnoreCase("bulldog")){
				bulldogList.add(dogObject);
			}
		}
		
	return bulldogList;
	}

	@GetMapping("/dog/goldenRetriver")			//displaying all Golden Retrivers
	public static List<Dog> goldenRetriver(){
		List<Dog> dogList = ArrayListDatabase();

		List<Dog> goldenRetriverList = new ArrayList<>();
		for(Dog dogObject : dogList ){
			if(dogObject.getBreed().equalsIgnoreCase("golden-retriver")){
				goldenRetriverList.add(dogObject);
			}
		}
		
	return goldenRetriverList;
	}

	@GetMapping("/dog/beagle")			//displaying all beagles
	public static List<Dog> beagle(){
		List<Dog> dogList = ArrayListDatabase();

		List<Dog>beagleList = new ArrayList<>();
		for(Dog dogObject : dogList ){
			if(dogObject.getBreed().equalsIgnoreCase("beagle")){
				beagleList.add(dogObject);
			}
		}
		
	return beagleList;
	}

	@GetMapping("/dog/chihuahua")			//displaying all chihuahuas
	public static List<Dog> chihuahua(){
		List<Dog> dogList = ArrayListDatabase();

		List<Dog>chihuahuaList = new ArrayList<>();
		for(Dog dogObject : dogList ){
			if(dogObject.getBreed().equalsIgnoreCase("chihuahua")){
				chihuahuaList.add(dogObject);
			}
		}
		
	return chihuahuaList;
	}

	@GetMapping("/dog/frankie")			//displaying all dogs named frankie
	public static List<Dog> frankie(){
		List<Dog> dogList = ArrayListDatabase();

		List<Dog>frankieList = new ArrayList<>();
		for(Dog dogObject : dogList ){
			if(dogObject.getName().equalsIgnoreCase("frankie")){
				frankieList.add(dogObject);
			}
		}
		
	return frankieList;
	}

	@GetMapping("/dog/bobers")			//displaying all dogs named  bobers
	public static List<Dog> bobers(){
		List<Dog> dogList = ArrayListDatabase();

		List<Dog>bobersList = new ArrayList<>();
		for(Dog dogObject : dogList ){
			if(dogObject.getName().equalsIgnoreCase("bobers")){
				bobersList.add(dogObject);
			}
		}
		
	return bobersList;
	}

	@GetMapping("/dog/jimmin")			//displaying all dogs named jimmin
	public static List<Dog> jimmin(){
		List<Dog> dogList = ArrayListDatabase();

		List<Dog>jimminList = new ArrayList<>();
		for(Dog dogObject : dogList ){
			if(dogObject.getName().equalsIgnoreCase("jimmin")){
				jimminList.add(dogObject);
			}
		}
		
	return jimminList;
	}



public static List<Dog> ArrayListDatabase(){			// Hard Coded Database
	List<Dog> dogList = new ArrayList<>();
	dogList.add(new Dog("frankie","poodle")); 
	dogList.add(new Dog("bobers","poodle"));  
	dogList.add(new Dog("jimmin","poodle"));  
	
	dogList.add(new Dog("frankie", "german-shepard")); 
	dogList.add(new Dog("bobers", "german-shepard")); 
	dogList.add(new Dog("jimmin", "german-shepard")); 

	dogList.add(new Dog("frankie","siberian-husky")); 
	dogList.add(new Dog("bobers","siberian-husky")); 
	dogList.add(new Dog("jimmin","siberian-husky"));

	dogList.add(new Dog("frankie", "bulldog")); 
	dogList.add(new Dog("bobers", "bulldog")); 
	dogList.add(new Dog("jimmin", "bulldog")); 

	dogList.add(new Dog("frankie","golden-retriver")); 
	dogList.add(new Dog("bobers","golden-retriver")); 
	dogList.add(new Dog("jimmin","golden-retriver")); 

	dogList.add(new Dog("frankie","beagle")); 
	dogList.add(new Dog("bobers","beagle")); 
	dogList.add(new Dog("jimmin","beagle")); 

	dogList.add(new Dog("frankie", "chihuahua"));
	dogList.add(new Dog("bobers", "chihuahua")); 
	dogList.add(new Dog("jimmin","chihuahua")); 

	return dogList;

}

	}
	
	






