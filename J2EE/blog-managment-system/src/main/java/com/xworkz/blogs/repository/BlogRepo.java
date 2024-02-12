package com.xworkz.blogs.repository;

import com.xworkz.blogs.dto.BlogDTO;

public interface BlogRepo {

   boolean addPost(BlogDTO blogDTO);

}
