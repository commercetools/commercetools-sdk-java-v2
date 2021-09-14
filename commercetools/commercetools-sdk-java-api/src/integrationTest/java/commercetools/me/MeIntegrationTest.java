
package commercetools.me;

import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.category.CategoryPagedQueryResponse;
import com.commercetools.api.models.me.MyCartDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.InMemoryTokenStorage;
import io.vrap.rmf.base.client.oauth2.TokenStorage;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MeIntegrationTest {

    @Test
    public void createClient() {
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
                .withApiBaseUrl(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withAnonymousRefreshFlow(credentials,
                    ServiceRegion.GCP_EUROPE_WEST1.getOAuthAnonymousTokenUrl(CommercetoolsTestUtils.getProjectKey()),
                    ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), storage)
                .buildProjectRoot(CommercetoolsTestUtils.getProjectKey());

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
}
