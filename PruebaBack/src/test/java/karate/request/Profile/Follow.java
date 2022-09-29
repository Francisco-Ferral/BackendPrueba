package karate.request.Profile;

import com.intuit.karate.junit5.Karate;

public class Follow {
    @Karate.Test
    Karate testSample(){return Karate.run("classpath:Karate/Request/Profile/Follow/follow.feature").relativeTo(getClass());
    }
}