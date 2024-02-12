package com.xworkz.blogs.service;

import com.xworkz.blogs.dto.BlogDTO;

public interface BlogService {

    boolean validateAndSave(BlogDTO blogDTO);
}
