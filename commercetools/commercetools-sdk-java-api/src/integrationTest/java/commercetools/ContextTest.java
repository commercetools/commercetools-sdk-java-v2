
package commercetools;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartSetCountryActionBuilder;
import com.commercetools.api.models.cart.CartUpdateBuilder;
import commercetools.cart.CartsFixtures;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.MDCContext;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.MDC;

public class ContextTest {
    @Test
    public void concurrentModMiddleware() {
        MDC.put("context", "test");
        ProjectApiRoot projectApiRoot = ProjectApiRoot.withContext(CommercetoolsTestUtils.getProjectApiRoot(),
            new MDCContext());

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
