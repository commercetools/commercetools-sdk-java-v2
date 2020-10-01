package commercetools.misc;


import com.commercetools.api.client.ByProjectKeyCategoriesGet;
import commercetools.utils.CommercetoolsTestUtils;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.okhttp.VrapOkHttpClient;
import org.junit.Ignore;
import org.junit.Test;

public class UserAgentHeaderTest {

    @Ignore
    @Test
    public void execute() {
        ByProjectKeyCategoriesGet request = CommercetoolsTestUtils.getProjectRoot()
                .categories()
                .get();

        VrapHttpClient vrapHttpClient = new VrapOkHttpClient();

//        new HttpMiddleware(
//                "https://api.europe-west1.gcp.commercetools.com",
//                vrapHttpClient,
//                new ClientCredentialsTokenSupplier(
//                        getClientId(),
//                        getClientSecret(),
//                        getScopes(),
//                        "https://auth.europe-west1.gcp.commercetools.com/oauth/token"
//                        , vrapHttpClient
//                )
//        )
//        .next(MiddlewareArg.from(request.createHttpRequest(), null, null, null))
//        .thenApply(middlewareArg -> middlewareArg.getRequest().getHeaders().getHeaders().stream().anyMatch(s -> s.getKey().equalsIgnoreCase("user-agent")));
    }
}
