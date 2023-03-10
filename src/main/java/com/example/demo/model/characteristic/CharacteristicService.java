package com.example.demo.model.characteristic;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.posts.Posts;
import com.example.demo.model.posts.dto.PostsResponseDto;
import com.example.demo.model.posts.dto.PostsUpdateRequestDto;

@Service 
public class CharacteristicService {

  @Autowired
  private CharacteristicRepository repository;

  public Characteristic save(Characteristic characteristic) {

    return repository.save(characteristic);
  }

  public List<Characteristic> getAllCharacteristic() { 
    List<Characteristic> characteristic = new ArrayList<>();
    Streamable.of(repository.findAll())
        .forEach(characteristic::add);
    return characteristic;
  }

  	@Transactional
	public String update(String id, CharacteristicUpdateRequestDto requestDto) {
  		Characteristic characteristic = repository.findById(id).orElseThrow(() ->
			new IllegalArgumentException("�ش� �Խñ��� �����ϴ�. id=" + id));

  		characteristic.update(requestDto.getId(), requestDto.getRelation(),requestDto.getRest_style(), requestDto.getLife_style(), requestDto.getShare(),
				requestDto.getShare(), requestDto.getClean(), requestDto.getGuest());
		return id;
	}
  
  public void delete(String characteristicId) {
    repository.deleteById(characteristicId);
  }
  
  public Characteristic findById(String id) {
	  Characteristic entity = repository.findById(id).orElseThrow(()
				-> new IllegalArgumentException("�ش� �Խñ��� �����ϴ�. id=" + id));

		return entity;
	}
}