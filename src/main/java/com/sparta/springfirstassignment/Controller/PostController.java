package com.sparta.springfirstassignment.Controller;


import com.sparta.springfirstassignment.IncorrectPwException;
import com.sparta.springfirstassignment.Service.PostService;
import com.sparta.springfirstassignment.dto.PostRequestDto;
import com.sparta.springfirstassignment.dto.PostResponseDto;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/post")
    public PostResponseDto createPost(@RequestBody PostRequestDto requestDto){
        return postService.createPost(requestDto);
    }

    @GetMapping("/post")
    public List<PostResponseDto> getPosts(){
        return postService.getPosts();
    }

    @GetMapping("/post/{postId}")
    public PostResponseDto getPostsByPostId(@PathVariable Long postId){
        return postService.getPostByPostId(postId);
    }

    @PutMapping("/post/{postId}")
    public Long updatePost(@PathVariable Long postId, @RequestBody PostRequestDto requestDto){
        return postService.updatePost(postId, requestDto);
    }

    @PutMapping("/post/delete/{postId}")
    public Long deletePost(@PathVariable Long postId, @RequestBody Long pw){
        return postService.deletePost(postId, pw);
    }

}
