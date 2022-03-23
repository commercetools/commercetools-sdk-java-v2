package commercetools.cart;

import com.commercetools.api.models.cart.Cart;
import commercetools.utils.CommercetoolsTestUtils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CartIntegrationTests {
    @Test
    public void queryByCustomerId() {
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

            Cart queriedCart2 = CommercetoolsTestUtils.getProjectApiRoot()
                    .carts()
                    .get()
                    .withWhere("customerId = :customerId and cartState = \"Active\"")
                    .withPredicateVar("customerId", customer.getId())
                    .executeBlocking()
                    .getBody()
                    .getResults()
                    .get(0);
            Assertions.assertThat(queriedCart2.getId()).isEqualTo(cart.getId());
        });
    }

    @Test
    public void getByCustomerId() {
        CartsFixtures.withCartWithCustomer((cart, customer) -> {
            Cart queriedCart = CommercetoolsTestUtils.getProjectApiRoot()
                    .carts()
                    .withCustomerId(customer.getId())
                    .get()
                    .executeBlocking()
                    .getBody();
            Assertions.assertThat(queriedCart.getId()).isEqualTo(cart.getId());
        });
    }

}
