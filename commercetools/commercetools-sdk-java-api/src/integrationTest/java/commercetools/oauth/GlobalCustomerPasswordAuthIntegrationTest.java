
package commercetools.oauth;

import static commercetools.utils.CommercetoolsTestUtils.*;

import java.time.Duration;
import java.util.concurrent.ExecutionException;

import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerDraft;
import com.commercetools.api.models.customer.CustomerDraftBuilder;
import commercetools.customer.CustomerFixtures;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.HttpClientSupplier;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.oauth2.GlobalCustomerPasswordTokenSupplier;
import io.vrap.rmf.base.client.oauth2.InMemoryTokenStorage;
import io.vrap.rmf.base.client.oauth2.RefreshFlowTokenSupplier;
import io.vrap.rmf.base.client.utils.ClientUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GlobalCustomerPasswordAuthIntegrationTest {

    private static final VrapHttpClient vrapHttpClient = HttpClientSupplier.of().get();

    @Test
    public void execute() {
        String password = "pw-" + CommercetoolsTestUtils.randomString();

        CustomerDraft customerDraft = CustomerDraftBuilder.of()
                .email("test-email-" + CommercetoolsTestUtils.randomString() + "@test.com")
                .key(CommercetoolsTestUtils.randomKey())
                .password(password)
                .build();

        Customer customer = CommercetoolsTestUtils.getProjectApiRoot()
                .customers()
                .post(customerDraft)
                .executeBlocking()
                .getBody()
                .getCustomer();

        String email = customer.getEmail();

        GlobalCustomerPasswordTokenSupplier globalCustomerPasswordTokenSupplier = new GlobalCustomerPasswordTokenSupplier(
            getClientId(), getClientSecret(), email, password, "",
            "https://auth.europe-west1.gcp.commercetools.com/oauth/" + getProjectKey() + "/customers/token",
            vrapHttpClient);

        try {
            String token = globalCustomerPasswordTokenSupplier.getToken().get().getAccessToken();
            Assertions.assertNotNull(token);
            Assertions.assertFalse(token.isEmpty());
        }
        catch (Exception e) {
            Assertions.fail("Obtaining token failed");
        }
        finally {
            CustomerFixtures.deleteCustomer(customer.getId(), customer.getVersion());
        }
    }

    @Test
    public void refreshTokenFlow() {
        CustomerFixtures.withCustomer(customer -> {
            GlobalCustomerPasswordTokenSupplier globalCustomerPasswordTokenSupplier = new GlobalCustomerPasswordTokenSupplier(
                getClientId(), getClientSecret(), customer.getEmail(), CustomerFixtures.TEST_CUSTOMER_PASSWORD, null,
                ServiceRegion.GCP_EUROPE_WEST1.getPasswordFlowTokenURL(CommercetoolsTestUtils.getProjectKey()),
                vrapHttpClient);

            final AuthenticationToken authenticationToken = ClientUtils
                    .blockingWait(globalCustomerPasswordTokenSupplier.getToken(), Duration.ofSeconds(10));

            InMemoryTokenStorage tokenStorage = new InMemoryTokenStorage(authenticationToken);

            RefreshFlowTokenSupplier refreshFlowTokenSupplier = new RefreshFlowTokenSupplier(getClientId(),
                getClientSecret(), ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), tokenStorage, vrapHttpClient);
            AuthenticationToken newAuthenticationToken = ClientUtils
                    .blockingWait(refreshFlowTokenSupplier.refreshToken(), Duration.ofSeconds(10));

            Assertions.assertNotEquals(authenticationToken.getAccessToken(), newAuthenticationToken.getAccessToken());
            Assertions.assertTrue(authenticationToken.getExpiresInZonedDateTime()
                    .isBefore(newAuthenticationToken.getExpiresInZonedDateTime()));
        });
    }

    @Test
    public void throwExceptionWrongCredentials() {
        Assertions.assertThrows(ExecutionException.class, () -> {
            GlobalCustomerPasswordTokenSupplier globalCustomerPasswordTokenSupplier = new GlobalCustomerPasswordTokenSupplier(
                getClientId(), getClientSecret(), "wront-email@test.com", "wrong-password", "",
                "https://auth.europe-west1.gcp.commercetools.com/oauth/" + getProjectKey() + "/customers/token",
                vrapHttpClient);

            globalCustomerPasswordTokenSupplier.getToken().get();
        });
    }
}
