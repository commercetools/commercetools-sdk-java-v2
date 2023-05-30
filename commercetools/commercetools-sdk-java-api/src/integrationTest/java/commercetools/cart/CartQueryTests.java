
package commercetools.cart;

import static commercetools.cart.CartsFixtures.*;
import static commercetools.product.ProductFixtures.*;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

import com.commercetools.api.models.cart.*;
import com.commercetools.api.models.discount_code.DiscountCode;
import commercetools.discount_code.DiscountCodeFixtures;
import commercetools.utils.CommercetoolsTestUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CartQueryTests {

    @Test
    public void queryById() {
        CartsFixtures.withCart(cart -> {
            Cart queriedCart = CommercetoolsTestUtils.getProjectApiRoot()
                    .carts()
                    .withId(cart.getId())
                    .get()
                    .executeBlocking()
                    .getBody();
            Assertions.assertThat(queriedCart).isEqualTo(cart);
        });
    }

    @Test
    public void queryByKey() {
        CartsFixtures.withCart(cart -> {
            Cart queriedCart = CommercetoolsTestUtils.getProjectApiRoot()
                    .carts()
                    .withKey(cart.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();
            Assertions.assertThat(queriedCart).isEqualTo(cart);
        });
    }

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

            Cart queriedCart3 = CommercetoolsTestUtils.getProjectApiRoot()
                    .carts()
                    .get()
                    .withQuery(c -> c.customerId().is(customer.getId()).and(c.cartState().is("Active")))
                    .executeBlocking()
                    .getBody()
                    .getResults()
                    .get(0);
            Assertions.assertThat(queriedCart3.getId()).isEqualTo(cart.getId());
        });
    }

    @Test
    public void queryByCustomerIdFailed() {
        CartsFixtures.withCartWithCustomer((cart, customer) -> {
            List<Cart> queriedCart = CommercetoolsTestUtils.getProjectApiRoot()
                    .carts()
                    .get()
                    .withWhere("customerId = \"40c4e90e-0666-499c-b645-c6b0a1e7d190\" and cartState = \"Active\"")
                    .executeBlocking()
                    .getBody()
                    .getResults();
            Assertions.assertThat(queriedCart).isEmpty();

            List<Cart> queriedCart2 = CommercetoolsTestUtils.getProjectApiRoot()
                    .carts()
                    .get()
                    .withWhere("customerId = :customerId and cartState = \"Active\"")
                    .withPredicateVar("customerId", "40c4e90e-0666-499c-b645-c6b0a1e7d190")
                    .executeBlocking()
                    .getBody()
                    .getResults();
            Assertions.assertThat(queriedCart2).isEmpty();
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

    @Test
    public void expandDiscountCodeReference() {
        withUpdateableCartAndDiscount((cart, discountCode) -> {
            Cart queriedCartWithExpandedDiscountCode = CommercetoolsTestUtils.getProjectApiRoot()
                    .carts()
                    .withId(cart.getId())
                    .get()
                    .withExpand(() -> "discountCodes[*].discountCode")
                    .executeBlocking()
                    .getBody();

            Assertions
                    .assertThat(
                        queriedCartWithExpandedDiscountCode.getDiscountCodes().get(0).getDiscountCode().getObj())
                    .isEqualTo(discountCode);
            return queriedCartWithExpandedDiscountCode;
        });
    }

    private void withUpdateableCartAndDiscount(final BiFunction<Cart, DiscountCode, Cart> function) {
        DiscountCodeFixtures
                .withUpdateableDiscountCode(discountCodeDraftBuilder -> discountCodeDraftBuilder.isActive(true)
                        .validFrom(ZonedDateTime.now().minus(1, ChronoUnit.HOURS)),
                    discountCode -> {
                        CartsFixtures.withUpdateableCart(cart -> {
                            CartAddDiscountCodeAction cartAddDiscountCodeAction = CartAddDiscountCodeActionBuilder.of()
                                    .code(discountCode.getCode())
                                    .build();
                            Cart updatedCart = CommercetoolsTestUtils.getProjectApiRoot()
                                    .carts()
                                    .update(cart, Collections.singletonList(cartAddDiscountCodeAction))
                                    .executeBlocking()
                                    .getBody();

                            return function.apply(updatedCart, discountCode);
                        });

                        return CommercetoolsTestUtils.getProjectApiRoot()
                                .discountCodes()
                                .withId(discountCode.getId())
                                .get()
                                .executeBlocking()
                                .getBody();
                    });
    }

}
