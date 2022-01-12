
package commercetools.misc;

import com.commercetools.api.client.ByProjectKeyCategoriesGet;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.HttpClientSupplier;
import io.vrap.rmf.base.client.VrapHttpClient;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class UserAgentHeaderTest {

    @Disabled
    @Test
    public void execute() {
        ByProjectKeyCategoriesGet request = CommercetoolsTestUtils.getProjectApiRoot().categories().get();

        VrapHttpClient vrapHttpClient = HttpClientSupplier.of().get();

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
