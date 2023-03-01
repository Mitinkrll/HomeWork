package model;
import lombok.AllArgsConstructor;
@AllArgsConstructor

public class RequestToDBPut {
    String login;
    String name;
    String id;
    String email;
    String birthday;

    @Override
    public String toString() {
        return "{\"login\":\""+login+"\",\"name\":\""+name+"\",\"email\":\""+email+"\",\"birthday\":\""+ birthday + "\",\"id\":\""+ id + "\"}";
    }


}