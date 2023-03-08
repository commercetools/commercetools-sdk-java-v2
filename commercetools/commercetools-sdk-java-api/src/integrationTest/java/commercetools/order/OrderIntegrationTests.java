
package commercetools.order;

import static commercetools.cart.CartsFixtures.withUpdateableCart;
import static commercetools.product.ProductFixtures.withPublishedProduct;
import static commercetools.tax_category.TaxCategoryFixtures.withTaxCategory;

import java.util.function.Consumer;

import com.commercetools.api.models.cart.*;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.common.BaseAddressBuilder;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order.OrderFromCartDraft;
import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.order.OrderUpdate;
import commercetools.utils.CommercetoolsTestUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderIntegrationTests {

    @Test
    public void testOrderUpdate() {
        OrdersFixtures.withUpdateableOrder(order -> {
            Assertions.assertThat(order).isNotNull();

            Assertions.assertThat(order.getBillingAddress()).isNull();
            Order updatedOrder = CommercetoolsTestUtils.getProjectApiRoot()
                    .orders()
                    .withId(order.getId())
                    .post(OrderUpdate.builder()
                            .version(order.getVersion())
                            .plusActions(builder -> builder.setBillingAddressBuilder()
                                    .address(address -> address.country("DE").state("Berlin")))
                            .plusActions(builder -> builder.changeOrderStateBuilder().orderState(OrderState.CONFIRMED))
                            .build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertThat(updatedOrder.getBillingAddress().getCountry()).isEqualTo("DE");
            return updatedOrder;
        });
    }

    @Test
    public void createOrderFromCart() {
        withCart(cart -> {
            final OrderFromCartDraft orderFromCartDraft = OrderFromCartDraft.builder()
                    .cart(cart.toResourceIdentifier())
                    .version(cart.getVersion())
                    .build();

            final Order createdOrder = CommercetoolsTestUtils.getProjectApiRoot()
                    .orders()
                    .create(orderFromCartDraft)
                    .executeBlocking()
                    .getBody();
            Assertions.assertThat(createdOrder).isNotNull();
        });
    }

    private void withCart(final Consumer<Cart> operator) {
        withTaxCategory(taxCategory -> {
            withPublishedProduct(product -> {
                withUpdateableCart(cart -> {
                    final String sku = product.getMasterData().getCurrent().getMasterVariant().getSku();
                    final CartAddLineItemAction addLineItemAction = CartAddLineItemActionBuilder.of().sku(sku).build();
                    final BaseAddress address1 = BaseAddressBuilder.of()
                            .country(taxCategory.getRates().get(0).getCountry())
                            .state(taxCategory.getRates().get(0).getState())
                            .key(CommercetoolsTestUtils.randomKey())
                            .build();
                    final CartSetShippingAddressAction setShippingAddressAction = CartSetShippingAddressActionBuilder
                            .of()
                            .address(address1)
                            .build();

                    final Cart updatedCart = CommercetoolsTestUtils.getProjectApiRoot()
                            .carts()
                            .update(cart)
                            .with(builder -> builder.plus(addLineItemAction).plus(setShippingAddressAction))
                            .executeBlocking()
                            .getBody();

                    operator.accept(updatedCart);

                    return CommercetoolsTestUtils.getProjectApiRoot()
                            .carts()
                            .withId(updatedCart.getId())
                            .get()
                            .executeBlocking()
                            .getBody();
                });
            });
        });
    }
}
