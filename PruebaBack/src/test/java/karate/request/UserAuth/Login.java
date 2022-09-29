package karate.request.UserAuth;

import com.intuit.karate.junit5.Karate;

public class Login {
    @Karate.Test
    Karate testSample(){return Karate.run("classpath:Karate/Request/UserAuthentication/Login/login.feature").relativeTo(getClass());
    }
}
