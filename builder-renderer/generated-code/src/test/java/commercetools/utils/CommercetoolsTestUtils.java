package commercetools.utils;

import client.middlewares.CtpOAuthMiddlewareForClientCredentialsGrant;
import client.middlewares.HttpMiddleware;
import client.middlewares.LoggerMiddleware;
import com.commercetools.client.ApiRoot;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.LocalizedStringImpl;

import java.util.UUID;

public class CommercetoolsTestUtils {
    
    public static String randomString() {
        return "random-string-" + UUID.randomUUID().toString();
    }
    
    public static String randomId() {
        return "random-id-" + UUID.randomUUID().toString();
    }
    
    public static String randomKey() {
        return "random-key-" + UUID.randomUUID().toString();
    }
    
    public static LocalizedString randomLocalizedString() {
        LocalizedString localizedString = new LocalizedStringImpl();
        localizedString.setValue(randomString(), randomString());
        return localizedString;
    }

    public static String getProjectKey() {
        return System.getenv("CTP_PROJECT_KEY");
    }

    public static String getClientId() {
        return System.getenv("CTP_CLIENT_ID");
    }

    public static String getClientSecret() {
        return System.getenv("CTP_CLIENT_SECRET");
    }

    public static String getScopes() {
        return "manage_project:"+getProjectKey();
    }

    public static ApiRoot getApiRoot(){
        return ApiRoot.formMiddlewares(
                new CtpOAuthMiddlewareForClientCredentialsGrant(
                        getClientId(),
                        getClientSecret(),
                        getScopes(),
                        "https://auth.sphere.io/oauth/token",
                        "https://auth.sphere.io/"
                ),
                new HttpMiddleware("https://api.sphere.io"),
                new LoggerMiddleware()
        );
    }
}