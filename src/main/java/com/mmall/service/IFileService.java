package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by user on 2017/7/12.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
