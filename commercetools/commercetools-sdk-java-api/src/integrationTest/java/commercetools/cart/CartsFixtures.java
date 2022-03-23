
package commercetools.cart;

import static commercetools.customer.CustomerFixtures.*;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartDraft;
import com.commercetools.api.models.cart.CartDraftBuilder;
import com.commercetools.api.models.customer.Customer;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;

public class CartsFixtures {
    public static Cart deleteCart(final String id, final Long version) {
        Cart cart = CommercetoolsTestUtils.getProjectApiRoot()
                .carts()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(cart);
        Assertions.assertEquals(cart.getId(), id);

        return cart;
    }

    public static void withCart(final Consumer<Cart> consumer) {
        CartDraft cartDraft = CartDraftBuilder.of().currency("EUR").country("DE").build();

        Cart cart = createCart(cartDraft);
        try {
            consumer.accept(cart);
        }
        finally {
            deleteCart(cart.getId(), cart.getVersion());
        }
    }

    public static void withCartWithCustomer(final BiConsumer<Cart, Customer> consumer) {
        withCustomer(customer -> {
            CartDraft cartDraft = CartDraftBuilder.of()
                    .currency("EUR")
                    .country("DE")
                    .customerId(customer.getId())
                    .build();

            Cart cart = createCart(cartDraft);
            try {
                consumer.accept(cart, customer);
            }
            finally {
                deleteCart(cart.getId(), cart.getVersion());
            }
        });
    }

    public static void withUpdateableCart(final UnaryOperator<Cart> operator) {
        CartDraft cartDraft = CartDraftBuilder.of().currency("EUR").country("DE").build();

        Cart cart = createCart(cartDraft);
        try {
            cart = operator.apply(cart);
        }
        finally {
            deleteCart(cart.getId(), cart.getVersion());
        }
    }

    public static Cart createCart(final CartDraft cartDraft) {
        Cart cart = CommercetoolsTestUtils.getProjectApiRoot().carts().post(cartDraft).executeBlocking().getBody();

        Assertions.assertNotNull(cart);
        Assertions.assertEquals(cart.getCountry(), cartDraft.getCountry());

        return cart;
    }

    public static Cart createCartWithCountry() {
        return createCart(CartDraftBuilder.of().country("DE").currency("EUR").build());
    }
}
