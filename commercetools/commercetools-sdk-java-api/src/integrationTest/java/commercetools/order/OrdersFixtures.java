
package commercetools.order;

import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order_edit.OrderEdit;
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
}
