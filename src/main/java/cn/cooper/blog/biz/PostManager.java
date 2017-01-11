package cn.cooper.blog.biz;

import cn.cooper.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Cooper on 2017/1/11.
 */
@Component
public class PostManager {
    @Autowired
    private PostService postService;
}
