package karate.request.UserAuth;

import com.intuit.karate.junit5.Karate;

public class Register {
@Karate.Test
Karate testSample(){return Karate.run("classpath:Karate/Request/UserAuthentication/Register/register.feature").relativeTo(getClass());
}
}
