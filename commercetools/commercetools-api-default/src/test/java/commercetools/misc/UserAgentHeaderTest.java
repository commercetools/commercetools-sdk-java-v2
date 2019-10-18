package commercetools.misc;


import com.commercetools.api.generated.client.ByProjectKeyCategoriesGet;
import commercetools.utils.CommercetoolsTestUtils;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.middlewares.HttpMiddleware;
import io.vrap.rmf.base.client.middlewares.MiddlewareArg;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;
import io.vrap.rmf.impl.okhttp.VrapOkhttpClient;
import org.junit.Test;

import static commercetools.utils.CommercetoolsTestUtils.*;

public class UserAgentHeaderTest {
    
    @Test
    public void execute() {
        ByProjectKeyCategoriesGet request = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .categories()
                .get();
        
        VrapHttpClient vrapHttpClient = new VrapOkhttpClient();
        
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
        .next(MiddlewareArg.from(request.createHttpRequest(), null, null, null))
        .thenApply(middlewareArg -> middlewareArg.getRequest().getHeaders().getHeaders().keySet().stream().anyMatch(s -> s.equalsIgnoreCase("user-agent")));
    }
}