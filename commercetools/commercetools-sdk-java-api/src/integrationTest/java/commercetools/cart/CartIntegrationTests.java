package commercetools.cart;

import com.commercetools.api.models.cart.Cart;
import commercetools.customer.CustomerFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CartIntegrationTests {
    @Test
    public void getByCustomerId() {
        CartsFixtures.withCartWithCustomer((cart, customer) -> {
            Cart queriedCart = CommercetoolsTestUtils.getProjectApiRoot()
                    .carts()
                    .get()
                    .withWhere("customerId = \"" + customer.getId() + "\" and cartState = \"Active\"")
                    .executeBlocking()
                    .getBody()
                    .getResults()
                    .get(0);
            Assertions.assertThat(queriedCart.getId()).isEqualTo(cart.getId());
        });
    }
}
