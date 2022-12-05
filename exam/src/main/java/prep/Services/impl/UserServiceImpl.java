package prep.Services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import prep.Repository.UserRepository;
import prep.Services.UserService;
import prep.model.service.UserServiceModel;
import prep.model.entity.User;

@Service
public class UserServiceImpl implements UserService {
 private final UserRepository userRepository;
 private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public UserServiceModel register(UserServiceModel userDto) {
        User user = this.modelMapper.map(userDto,User.class);
        return this.modelMapper
                .map(this.userRepository.saveAndFlush(user),
                        UserServiceModel.class);
    }
}
