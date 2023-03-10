
package commercetools.order;

import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order.OrderPagedSearchResponse;
import com.commercetools.api.models.order.OrderSearchQuery;
import com.commercetools.api.models.project.OrderSearchStatus;
import com.commercetools.api.models.project.Project;
import com.commercetools.api.models.project.ProjectUpdateActionBuilder;
import com.commercetools.api.models.project.ProjectUpdateBuilder;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import commercetools.utils.CommercetoolsTestUtils;

import org.assertj.core.api.Assertions;
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

            Assertions.assertThat(order.getId()).isEqualTo(queriedOrder.getId());
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

            Assertions.assertThat(order.getId()).isEqualTo(queriedOrder.getId());
        });
    }

    @Test
    public void search() {
        OrdersFixtures.withOrder(order -> {
            try {
                Project project = CommercetoolsTestUtils.getProjectApiRoot().get().executeBlocking().getBody();
                CommercetoolsTestUtils.getProjectApiRoot()
                        .post(ProjectUpdateBuilder.of()
                                .plusActions(ProjectUpdateActionBuilder.of()
                                        .changeOrderSearchStatusBuilder()
                                        .status(OrderSearchStatus.ACTIVATED)
                                        .build())
                                .version(project.getVersion())
                                .build())
                        .executeBlocking();
            }
            catch (Exception e) {
                System.out.println(e);
            }

            try {

                OrderPagedSearchResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                        .orders()
                        .search()
                        .post(orderSearchRequestBuilder -> orderSearchRequestBuilder.query(new OrderSearchQuery() {
                            @JsonUnwrapped
                            public ObjectNode getValue() throws JsonProcessingException {
                                final ObjectMapper mapper = new ObjectMapper();
                                return mapper.createObjectNode()
                                        .set("exists",
                                            mapper.createObjectNode()
                                                    .putObject("exists")
                                                    .put("field", "custom.deliveryDate")
                                                    .put("customType", "StringType"));
                            }
                        }))
                        .executeBlocking()
                        .getBody();
                Assertions.assertThat(response).isNotNull();
            }
            catch (Exception e) {
                System.out.println(e);
            }
        });
    }
}
