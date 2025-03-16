package com.styletrademark.ecommerce.service;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Service
public class CloudinaryService {

    private final Cloudinary cloudinary;

    public CloudinaryService(@Value("${cloudinary.cloud_name}") String cloudName,
                             @Value("${cloudinary.key}") String key,
                             @Value("${cloudinary.secret}") String secret) {
        this.cloudinary = new Cloudinary(ObjectUtils.asMap(
            "cloud_name", cloudName,
            "api_key", key,
            "api_secret", secret,
            "secure", true
        ));
    }

    public String saveImage(MultipartFile image) {
        try {
            Map<String, Object> result = cloudinary.uploader().upload(image.getBytes(), ObjectUtils.asMap("folder", "Products"));
            return (String) result.get("url");
        } catch (IOException e) {
            throw new RuntimeException("Failed to upload image to Cloudinary", e);
        }
    }
}
