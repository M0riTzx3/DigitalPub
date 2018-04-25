package de.digitalpub.controller.dao;

import de.digitalpub.controller.dao.model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModel,Long> {


    UserModel findByUsername(String username);
}
