package cn.cooper.blog.web.front.controller;

import cn.cooper.blog.contants.WebConstant;
import cn.cooper.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wangliang on 2017/1/11.
 */
@Controller
public class IndexController {

    @Autowired
    private PostService postService;
    @RequestMapping("/")
    public String initPages(@RequestParam(value = "page", defaultValue = "1") int page, String word, Model model){
        if (StringUtils.hasText(word)){
            word = word.trim();
            model.addAttribute("search", word);
            model.addAttribute(WebConstant.PRE_TITLE_KEY, word);
        }else {
            model.addAttribute("page", postService.listPost(page, 10));
        }
        model.addAttribute("key","value");
        return "index";
    }
}
