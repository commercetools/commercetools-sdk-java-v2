
package commercetools.order;

import com.commercetools.api.models.order.Order;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderQueryTests {

    @Test
    public void getById() {
        OrdersFixtures.withOrder(order -> {
            final Order queriedOrder = CommercetoolsTestUtils.getProjectApiRoot()
                    .orders()
                    .withId(order.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertEquals(order.getId(), queriedOrder.getId());
        });
    }

    @Test
    public void getByOrderNumber() {
        OrdersFixtures.withOrder(order -> {
            final Order queriedOrder = CommercetoolsTestUtils.getProjectApiRoot()
                    .orders()
                    .withOrderNumber(order.getOrderNumber())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertEquals(order.getId(), queriedOrder.getId());
        });
    }
}
