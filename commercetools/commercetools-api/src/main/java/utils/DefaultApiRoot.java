package utils;

import com.commercetools.client.ApiRoot;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.middlewares.HttpMiddleware;
import io.vrap.rmf.base.client.middlewares.LoggerMiddleware;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;
import io.vrap.rmf.impl.okhttp.VrapOkhttpClient;

import java.util.Arrays;

public class DefaultApiRoot {

    private static final VrapHttpClient vrapHttpClient = new VrapOkhttpClient();
    private static final ApiRoot apiRoot = ApiRoot.fromMiddlewares(
            new HttpMiddleware(
                    "https://api.sphere.io",
                    vrapHttpClient,
                    new ClientCredentialsTokenSupplier(
                            System.getenv("CTP_CLIENT_ID"),
                            System.getenv("CTP_CLIENT_SECRET"),
                            Arrays.stream(System.getenv("CTP_SCOPES").split(",")).map(s -> s.trim() + ":" + System.getenv("CTP_PROJECT_KEY")).reduce((s, s2) -> s + " " + s2).get(),
                            "https://auth.sphere.io/oauth/token"
                            , vrapHttpClient
                    )
            ),
            new LoggerMiddleware()
    );

    public static ApiRoot getApiRoot() {
        return apiRoot;
    }
    
}
