
package commercetools.oauth;

import java.util.concurrent.ExecutionException;

import io.vrap.rmf.base.client.HttpClientSupplier;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClientCredentialsTokenSupplierIntegrationTests {

    private static final VrapHttpClient vrapHttpClient = HttpClientSupplier.of().get();

    @Test
    public void throwExceptionWrongCredentials() throws Exception {
        Assertions.assertThrows(ExecutionException.class, () -> {
            ClientCredentialsTokenSupplier clientCredentialsTokenSupplier = new ClientCredentialsTokenSupplier(
                "wrong-client-id", "wrong-client-secret", "",
                "https://auth.europe-west1.gcp.commercetools.com/oauth/token", vrapHttpClient);

            clientCredentialsTokenSupplier.getToken().get();
        });
    }
}
