package prep.Services;

import prep.model.service.UserServiceModel;

public interface UserService {
    UserServiceModel register(UserServiceModel userDto);

    UserServiceModel findByUserName(String username);
}
