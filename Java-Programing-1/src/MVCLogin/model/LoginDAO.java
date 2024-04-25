package MVCLogin.model;

import MVCLogin.entity.Users;

public interface LoginDAO {
    public String checkLoginStatement(Users users);
    public String checkLoginPrepareStatement(Users users);

}
