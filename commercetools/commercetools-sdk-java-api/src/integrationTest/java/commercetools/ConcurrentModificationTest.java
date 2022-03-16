
package commercetools;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.client.RetryHandler;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartSetCountryActionBuilder;
import com.commercetools.api.models.cart.CartUpdate;
import com.commercetools.api.models.cart.CartUpdateBuilder;
import commercetools.cart.CartsFixtures;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.utils.ClientUtils;

import org.junit.jupiter.api.Test;

public class ConcurrentModificationTest {
    @Test
    public void concurrentMod() {
        final ProjectApiRoot projectApiRoot = CommercetoolsTestUtils.getProjectApiRoot();
        CartsFixtures.withUpdateableCart(cart -> {

            final ApiHttpResponse<Cart> deCart = projectApiRoot.carts()
                    .withId(cart.getId())
                    .post(CartUpdateBuilder.of()
                            .version(cart.getVersion())
                            .actions(CartSetCountryActionBuilder.of().country("DE").build())
                            .build())
                    .executeBlocking();

            final Cart modCart = RetryHandler
                    .concurrentModification(projectApiRoot.carts()
                            .withId(cart.getId())
                            .post(CartUpdateBuilder.of()
                                    .version(cart.getVersion())
                                    .actions(CartSetCountryActionBuilder.of().country("DE").build())
                                    .build()),
                        CartUpdate::builder, CartUpdateBuilder::version)
                    .executeBlocking()
                    .getBody();
            return modCart;
        });
    }
}
