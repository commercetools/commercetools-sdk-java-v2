
package commercetools;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartSetCountryActionBuilder;
import com.commercetools.api.models.cart.CartUpdateBuilder;
import commercetools.cart.CartsFixtures;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ContextApiHttpClient;
import io.vrap.rmf.base.client.MDCContext;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.MDC;

public class ContextTest {
    @Test
    public void concurrentModMiddleware() {
        String projectKey = CommercetoolsTestUtils.getProjectKey();

        MDC.put("context", "test");
        ApiHttpClient client = ContextApiHttpClient.withMdc(ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build(),
                    ServiceRegion.GCP_EUROPE_WEST1)
                .addConcurrentModificationMiddleware(3)
                .buildClient());
        ProjectApiRoot projectApiRoot = ProjectApiRoot.fromClient(projectKey, client);

        CartsFixtures.withUpdateableCart(cart -> {

            final ApiHttpResponse<Cart> deCart = projectApiRoot.carts()
                    .withId(cart.getId())
                    .post(CartUpdateBuilder.of()
                            .version(cart.getVersion())
                            .actions(CartSetCountryActionBuilder.of().country("DE").build())
                            .build())
                    .executeBlocking();

            final ApiHttpResponse<Cart> modCart = projectApiRoot.carts()
                    .withId(cart.getId())
                    .post(CartUpdateBuilder.of()
                            .version(cart.getVersion())
                            .actions(CartSetCountryActionBuilder.of().country("DE").build())
                            .build())
                    .executeBlocking();
            Assertions.assertThat(modCart.getContext(MDCContext.class).getValue().get("context")).isEqualTo("test");
            return modCart.getBody();
        });
    }
}
