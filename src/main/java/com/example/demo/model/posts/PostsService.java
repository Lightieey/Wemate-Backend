package com.example.demo.model.posts;

import com.example.demo.model.posts.dto.PostsListResponseDto;
import com.example.demo.model.posts.dto.PostsResponseDto;
import com.example.demo.model.posts.dto.PostsSaveRequestDto;
import com.example.demo.model.posts.dto.PostsUpdateRequestDto;
import com.example.demo.model.profile.Profile;
import com.example.demo.model.profile.ProfileRepository;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//���������� Bean�� ���Թ޴� ���: @Autowired / setter / ������
@RequiredArgsConstructor    // �����ڷ� Bean ��ü�� �޵��� ��
@Service
public class PostsService {

	private final PostsRepository postsRepository;

	@Transactional
	public Long save(PostsSaveRequestDto requestDto) {
		return postsRepository.save(requestDto.toEntity()).getId();
	}

	@Transactional
	public Long update(Long id, PostsUpdateRequestDto requestDto) {
		Posts posts = postsRepository.findById(id).orElseThrow(() ->
			new IllegalArgumentException("�ش� �Խñ��� �����ϴ�. id=" + id));

		posts.update(requestDto.getContent(), requestDto.isPin());

		return id;
	}

	public PostsResponseDto findById(Long id) {
		Posts entity = postsRepository.findById(id).orElseThrow(()
				-> new IllegalArgumentException("�ش� �Խñ��� �����ϴ�. id=" + id));

		return new PostsResponseDto(entity);
	}
	
	@Transactional
	public List<PostsListResponseDto> findAllDesc() {
		return postsRepository.findAllDesc().stream()
				.map(posts -> new PostsListResponseDto(posts))	// posts list
				.collect(Collectors.toList());
	}
	
	@Transactional
    public void delete(Long id) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new
                IllegalArgumentException("�ش� �Խñ��� �����ϴ�. id=" + id));
        postsRepository.delete(posts);
    }

}
