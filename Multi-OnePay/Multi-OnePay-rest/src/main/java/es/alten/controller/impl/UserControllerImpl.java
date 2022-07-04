package es.alten.controller.impl;

import es.alten.bo.UserBO;
import es.alten.controller.UserController;
import es.alten.domain.User;
import es.alten.dto.UserDTO;
import es.alten.rest.impl.RestControllerImpl;
import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@Api(value = "users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserControllerImpl extends RestControllerImpl<User, UserDTO, Long, UserBO>
    implements UserController {}
