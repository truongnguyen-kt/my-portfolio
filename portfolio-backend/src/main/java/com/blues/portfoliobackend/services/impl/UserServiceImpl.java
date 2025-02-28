package com.blues.portfoliobackend.services.impl;

import com.blues.portfoliobackend.repositories.UserRepository;
import com.blues.portfoliobackend.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
}
