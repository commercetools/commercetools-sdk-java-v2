
package commercetools.me;

import java.time.Duration;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.category.CategoryPagedQueryResponse;
import com.commercetools.api.models.me.MyCartDraftBuilder;
import commercetools.customer.CustomerFixtures;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.HttpClientSupplier;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.GlobalCustomerPasswordTokenSupplier;
import io.vrap.rmf.base.client.oauth2.InMemoryTokenStorage;
import io.vrap.rmf.base.client.oauth2.TokenStorage;
import io.vrap.rmf.base.client.utils.ClientUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MeIntegrationTest {

    @Test
    public void createClient() throws InterruptedException {
        final ClientCredentials credentials = ClientCredentials.of()
                .withClientId(CommercetoolsTestUtils.getClientId())
                .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                .build();
        final ApiHttpClient client = ApiRootBuilder.of().defaultClient(credentials).buildClient();
        final ProjectApiRoot projectApiRoot = ProjectApiRoot.fromClient(CommercetoolsTestUtils.getProjectKey(), client);

        final CategoryPagedQueryResponse categories = projectApiRoot.categories().get().executeBlocking().getBody();

        Assertions.assertThat(categories).isInstanceOf(CategoryPagedQueryResponse.class);

        TokenStorage storage = new InMemoryTokenStorage();
        final ProjectApiRoot meClient = ApiRootBuilder.of(client)
                .withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .withAnonymousRefreshFlow(credentials, ServiceRegion.GCP_EUROPE_WEST1, storage)
                .buildProjectRoot();

        final Cart cart = meClient.me()
                .carts()
                .post(MyCartDraftBuilder.of().currency("EUR").build())
                .executeBlocking()
                .getBody();
        Assertions.assertThat(cart).isInstanceOf(Cart.class);

        storage.getToken().setExpiresIn(0L);
        final Cart activeCart = meClient.me().activeCart().get().executeBlocking().getBody();

        Assertions.assertThat(activeCart).isInstanceOf(Cart.class);
        Assertions.assertThat(activeCart.getId()).isEqualTo(cart.getId());
    }

    @Test
    public void testMeLogin() {
        CustomerFixtures.withCustomer(customer -> {
            final ClientCredentials credentials = ClientCredentials.of()
                    .withClientId(CommercetoolsTestUtils.getClientId())
                    .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                    .build();
            GlobalCustomerPasswordTokenSupplier supplier = new GlobalCustomerPasswordTokenSupplier(
                credentials.getClientId(), credentials.getClientSecret(), customer.getEmail(),
                CustomerFixtures.TEST_CUSTOMER_PASSWORD, null,
                ServiceRegion.GCP_EUROPE_WEST1.getPasswordFlowTokenURL(CommercetoolsTestUtils.getProjectKey()),
                HttpClientSupplier.of().get());
            final AuthenticationToken token = ClientUtils.blockingWait(supplier.getToken(), Duration.ofSeconds(10));

            Assertions.assertThat(token.getScope()).contains("customer_id:" + customer.getId());
        });
    }
}
