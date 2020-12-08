package commercetools.cart;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartDraft;
import com.commercetools.api.models.cart.CartDraftBuilder;
import com.commercetools.api.models.common.AddressBuilder;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerDraft;
import com.commercetools.api.models.customer.CustomerDraftBuilder;
import com.commercetools.api.models.customer_group.CustomerGroup;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order_edit.OrderEdit;
import com.commercetools.api.models.store.Store;
import com.commercetools.api.models.store.StoreResourceIdentifierBuilder;
import commercetools.customer.CustomerFixtures;
import commercetools.customer_group.CustomerGroupFixtures;
import commercetools.store.StoreFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class CartsFixtures {
    public static Cart deleteCart(final String id, final Long version) {
        Cart cart = CommercetoolsTestUtils.getProjectRoot()
                .carts()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking().getBody();

        Assert.assertNotNull(cart);
        Assert.assertEquals(cart.getId(), id);

        return cart;
    }

    public static void withCart(final Consumer<Cart> consumer) {
        CartDraft cartDraft = CartDraftBuilder.of()
                .currency("EUR")
                .country("DE")
                .build();

        Cart cart = createCart(cartDraft);
        consumer.accept(cart);
        deleteCart(cart.getId(), cart.getVersion());
    }

    public static void withCartWithCustomer(final Consumer<Cart> consumer) {
        CustomerFixtures.withCustomer(customer -> {
            CartDraft cartDraft = CartDraftBuilder.of()
                    .currency("EUR")
                    .country("DE")
                    .anonymousId(customer.getId())
                    .build();

            Cart cart = createCart(cartDraft);
            consumer.accept(cart);
            deleteCart(cart.getId(), cart.getVersion());
        });
    }

    public static void withUpdateableCart(final UnaryOperator<Cart> operator) {
        CartDraft cartDraft = CartDraftBuilder.of()
                .currency("EUR")
                .country("DE")
                .build();

        Cart cart = createCart(cartDraft);
        cart = operator.apply(cart);
        deleteCart(cart.getId(), cart.getVersion());
    }

    public static Cart createCart(final CartDraft cartDraft) {
        Cart cart = CommercetoolsTestUtils.getProjectRoot()
                .carts()
                .post(cartDraft)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(cart);
        Assert.assertEquals(cart.getCountry(), cartDraft.getCountry());

        return cart;
    }

    public static Cart createCartWithCountry() {
        return createCart(CartDraftBuilder.of()
                .country("DE")
                .currency("EUR")
                .build());
    }
}
