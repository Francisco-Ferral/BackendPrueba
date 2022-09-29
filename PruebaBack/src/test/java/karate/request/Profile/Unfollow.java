package karate.request.Profile;

import com.intuit.karate.junit5.Karate;

public class Unfollow {
    @Karate.Test
    Karate testSample(){return Karate.run("classpath:Karate/Request/Profile/UnfollowUser").relativeTo(getClass());
    }
}