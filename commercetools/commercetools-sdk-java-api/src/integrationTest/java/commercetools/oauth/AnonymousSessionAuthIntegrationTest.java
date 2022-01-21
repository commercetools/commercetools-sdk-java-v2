
package commercetools.oauth;

import static commercetools.utils.CommercetoolsTestUtils.*;

import java.util.concurrent.ExecutionException;

import io.vrap.rmf.base.client.HttpClientSupplier;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.oauth2.AnonymousSessionTokenSupplier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnonymousSessionAuthIntegrationTest {

    private static final VrapHttpClient vrapHttpClient = HttpClientSupplier.of().get();

    @Test
    public void execute() {
        AnonymousSessionTokenSupplier anonymousSessionTokenSupplier = new AnonymousSessionTokenSupplier(getClientId(),
            getClientSecret(), "",
            "https://auth.europe-west1.gcp.commercetools.com/oauth/" + getProjectKey() + "/anonymous/token",
            vrapHttpClient);

        try {
            String accessToken = anonymousSessionTokenSupplier.getToken().get().getAccessToken();
            Assertions.assertNotNull(accessToken);
            Assertions.assertFalse(accessToken.isEmpty());
        }
        catch (Exception e) {
            Assertions.fail("Failed to obtain anonymous session token");
        }
    }

    @Test
    public void throwExceptionWrongCredentials() {
        Assertions.assertThrows(ExecutionException.class, () -> {
            AnonymousSessionTokenSupplier anonymousSessionTokenSupplier = new AnonymousSessionTokenSupplier(
                "wrong-client-id", getClientSecret(), "",
                "https://auth.europe-west1.gcp.commercetools.com/oauth/" + getProjectKey() + "/anonymous/token",
                vrapHttpClient);

            anonymousSessionTokenSupplier.getToken().get();
        });
    }

}
