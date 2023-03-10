package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.characteristic.Characteristic;
import com.example.demo.model.characteristic.CharacteristicService;
import com.example.demo.model.posts.dto.PostsResponseDto;
import com.example.demo.model.profile.ProfileUpdateRequestDto;



@RestController
public class CharacteristicController {

	@Autowired
	private CharacteristicService characteristicDao;

	@GetMapping("/characteristic/get-all")
	public List<Characteristic> getAllCharacteristic() {
		return characteristicDao.getAllCharacteristic();
	}

	
	@PostMapping("/characteristic/save")
	public Characteristic save(@RequestBody Characteristic characteristic) {
		System.out.println("������ postmapping �����");
		return characteristicDao.save(characteristic);
	}
	
	@GetMapping("/characteristic/{id}")
    public Characteristic findById(@PathVariable String id) {
        return characteristicDao.findById(id);
    }

}