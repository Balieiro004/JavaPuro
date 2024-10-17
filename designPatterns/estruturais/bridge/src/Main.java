import dao.UserMongoDao;
import dao.UserMysqlDao;
import dao.UserOracleDao;
import dao.UserPostgresDao;
import model.User;
import service.UserEJB;
import service.UserRest;
import service.UserService;
import service.UserSoap;

public class Main {
    public static void main(String[] args) {

        User user = new User("anderson", "anderson@email.com", "passwd");

        UserService userRestOracleService = new UserRest(new UserOracleDao());
        userRestOracleService.save(user);

        UserService userEJBMongoService = new UserEJB(new UserMongoDao());
        userEJBMongoService.save(user);

        UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
        userSoapPostgresService.save(user);

        UserService userRestMySqlService = new UserRest(new UserMysqlDao());
        userRestMySqlService.save(user);
    }
}