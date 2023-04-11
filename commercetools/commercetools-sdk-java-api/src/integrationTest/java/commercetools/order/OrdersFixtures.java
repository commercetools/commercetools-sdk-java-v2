
package commercetools.order;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.cart.*;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order.OrderFromCartDraft;
import com.commercetools.api.models.order_edit.OrderEdit;
import commercetools.cart.CartsFixtures;
import commercetools.product.ProductFixtures;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;

public class OrdersFixtures {
    public static Order deleteOrder(final String id, final Long version) {
        Order order = CommercetoolsTestUtils.getProjectApiRoot()
                .orders()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(order);
        Assertions.assertEquals(order.getId(), id);

        return order;
    }

    public static OrderEdit deleteOrderEdit(final String id, final Long version) {
        OrderEdit orderEdit = CommercetoolsTestUtils.getProjectApiRoot()
                .orders()
                .edits()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(orderEdit);
        Assertions.assertEquals(orderEdit.getId(), id);

        return orderEdit;
    }

    private static void withCreateOrder(final Consumer<Order> execFn) {
        ProductFixtures.withPublishedProduct(product -> {
            CartsFixtures.withUpdateableCart(cart -> {
                Cart updatedCart = CommercetoolsTestUtils.getProjectApiRoot()
                        .carts()
                        .withId(cart.getId())
                        .post(CartUpdate.builder()
                                .version(cart.getVersion())
                                .plusActions(builder -> builder.addLineItemBuilder()
                                        .sku(product.getMasterData().getCurrent().getMasterVariant().getSku()))
                                .plusActions(builder -> builder.setShippingAddressBuilder()
                                        .address(
                                            baseAddressBuilder -> baseAddressBuilder.country("DE").state("Berlin")))
                                .build())
                        .executeBlocking()
                        .getBody();

                OrderFromCartDraft orderDraft = OrderFromCartDraft.builder()
                        .cart(updatedCart.toResourceIdentifier())
                        .version(updatedCart.getVersion())
                        .orderNumber(CommercetoolsTestUtils.randomString())
                        .build();

                Order order = createOrder(orderDraft);
                execFn.accept(order);

                try {
                    return CommercetoolsTestUtils.getProjectApiRoot()
                            .carts()
                            .withId(updatedCart.getId())
                            .get()
                            .executeBlocking()
                            .getBody();
                }
                catch (Exception ignored) {
                }

                return updatedCart;
            });

        });
    }

    public static void withOrder(final Consumer<Order> consumer) {
        withCreateOrder(order -> {
            try {
                consumer.accept(order);
            }
            finally {
                deleteOrder(order.getId(), order.getVersion());
            }
        });
    }

    public static void withUpdateableOrder(final UnaryOperator<Order> operator) {
        withCreateOrder(order -> {
            try {
                order = operator.apply(order);
            }
            finally {
                deleteOrder(order.getId(), order.getVersion());
            }
        });
    }

    public static Order createOrder(final OrderFromCartDraft orderDraft) {
        Order order = CommercetoolsTestUtils.getProjectApiRoot().orders().post(orderDraft).executeBlocking().getBody();

        Assertions.assertNotNull(order);
        Assertions.assertEquals(order.getCart().getId(), orderDraft.getCart().getId());

        return order;
    }
}
