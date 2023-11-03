package com.sparta.springfirstassignment.Service;

import com.sparta.springfirstassignment.Entity.Post;
import com.sparta.springfirstassignment.IncorrectPwException;
import com.sparta.springfirstassignment.Repository.PostRepository;
import com.sparta.springfirstassignment.dto.PostRequestDto;
import com.sparta.springfirstassignment.dto.PostResponseDto;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public PostResponseDto createPost(PostRequestDto requestDto) {
        Post post = new Post(requestDto);

        Post savePost = postRepository.save(post);

        PostResponseDto postResponseDto = new PostResponseDto(post);

        return postResponseDto;
    }

    public List<PostResponseDto> getPosts() {
        return postRepository.findAllByOrderByCreatedAtDesc()
            .stream().map(PostResponseDto::new).toList();
    }

    public PostResponseDto getPostByPostId(Long postId) {
        return new PostResponseDto(postRepository.findByPostId(postId));
    }

    @Transactional
    public Long updatePost(Long postId, PostRequestDto requestDto) {
        //DB에 존재하는지 확인
        Post post = findPost(postId);

        //비밀번호가 일치하는지 확인
        try {
            checkPw(post,requestDto.getPw());
        } catch (IncorrectPwException e){
            System.out.println(e.getMessage());
            return null;
        }

        post.update(requestDto);

        return postId;
    }

    public Long deletePost(Long postId, Long pw) {
        //DB에 존재하는지 확인
        Post post = findPost(postId);

        //비밀번호가 일치하는지 확인
        try {
            checkPw(post,pw);


        } catch (IncorrectPwException e){
            System.out.println(e.getMessage());
            return null;
        }
        postRepository.delete(post);

        return postId;

    }

    public Post findPost(Long postId){
        return postRepository.findById(postId).orElseThrow(() ->
            new IllegalArgumentException("선택한 게시글은 존재하지 않습니다.")
        );
    }

    public void checkPw(Post post, Long pw) throws IncorrectPwException{
        if(!Objects.equals(post.getPw(), pw)){
            throw new IncorrectPwException();
        }
    }
}
