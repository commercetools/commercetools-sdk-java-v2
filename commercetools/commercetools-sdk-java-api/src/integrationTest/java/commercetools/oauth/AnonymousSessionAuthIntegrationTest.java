
package commercetools.oauth;

import static commercetools.utils.CommercetoolsTestUtils.*;

import java.util.concurrent.ExecutionException;

import io.vrap.rmf.base.client.HttpClientSupplier;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.oauth2.AnonymousSessionTokenSupplier;

import org.junit.Assert;
import org.junit.Test;

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
            Assert.assertNotNull(accessToken);
            Assert.assertFalse(accessToken.isEmpty());
        }
        catch (Exception e) {
            Assert.fail("Failed to obtain anonymous session token");
        }
    }

    @Test(expected = ExecutionException.class)
    public void throwExceptionWrongCredentials() throws Exception {
        AnonymousSessionTokenSupplier anonymousSessionTokenSupplier = new AnonymousSessionTokenSupplier(
            "wrong-client-id", getClientSecret(), "",
            "https://auth.europe-west1.gcp.commercetools.com/oauth/" + getProjectKey() + "/anonymous/token",
            vrapHttpClient);

        anonymousSessionTokenSupplier.getToken().get();
    }

}
