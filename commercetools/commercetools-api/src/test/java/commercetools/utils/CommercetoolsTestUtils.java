package commercetools.utils;

import com.commercetools.client.ApiRoot;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.common.LocalizedStringImpl;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.middlewares.HttpMiddleware;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;
import io.vrap.rmf.impl.okhttp.VrapOkhttpClient;

import java.util.UUID;

public class CommercetoolsTestUtils {

    private static final VrapHttpClient vrapHttpClient = new VrapOkhttpClient();
    private static final ApiRoot apiRoot = ApiRoot.fromMiddlewares(
            new HttpMiddleware(
                    "https://api.sphere.io",
                    vrapHttpClient,
                    new ClientCredentialsTokenSupplier(
                            getClientId(),
                            getClientSecret(),
                            getScopes(),
                            "https://auth.sphere.io/oauth/token"
                            , vrapHttpClient
                    )
            )
    );

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
        return "manage_project:" + getProjectKey() + " manage_api_clients:" + getProjectKey();
    }

    public static ApiRoot getApiRoot() {
        return apiRoot;
    }
}