package com.social.media.service;

import com.social.media.models.SocialUser;
import com.social.media.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialService {

    @Autowired
    private UserRepository userRepository;

    public List<SocialUser> getAllUsers() {
        return userRepository.findAll();
    }

    public SocialUser saveUser(SocialUser socialUser) {
        return userRepository.save(socialUser);
    }
}
