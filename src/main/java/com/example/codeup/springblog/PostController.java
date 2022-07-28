package com.example.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    @ResponseBody
    public String posts() {
        return "Posts index page";
    }

    @RequestMapping(path ="/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String postsId(@PathVariable int id) {
        return id + "View an individual post";
    }

    @RequestMapping(path ="/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String newPost() {
        return "create a new post";
    }

}
