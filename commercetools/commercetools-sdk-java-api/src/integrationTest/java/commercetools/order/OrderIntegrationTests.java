
package commercetools.order;

import com.commercetools.api.models.cart.*;
import com.commercetools.api.models.order.Order;
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
}
