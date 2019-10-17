package commercetools.oauth;

import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;
import io.vrap.rmf.impl.okhttp.VrapOkhttpClient;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

public class ClientCredentialsTokenSupplierIntegrationTests {

    private static final VrapHttpClient vrapHttpClient = new VrapOkhttpClient();
    
    @Test(expected = ExecutionException.class)
    public void throwExceptionWrongCredentials() throws Exception {
        ClientCredentialsTokenSupplier clientCredentialsTokenSupplier  = new ClientCredentialsTokenSupplier(
                "wrong-client-id",
                "wrong-client-secret",
                "",
                "https://auth.sphere.io/oauth/token"
                , vrapHttpClient
        );

        clientCredentialsTokenSupplier.getToken().get();
    }
    
}
