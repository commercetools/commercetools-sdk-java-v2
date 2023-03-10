
package commercetools.order;

import java.util.HashMap;
import java.util.Map;

import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order.OrderPagedSearchResponse;
import com.commercetools.api.models.order.OrderSearchQuery;
import com.commercetools.api.models.order.OrderSearchSorting;
import com.commercetools.api.models.project.OrderSearchStatus;
import com.commercetools.api.models.project.Project;
import com.commercetools.api.models.project.ProjectUpdateActionBuilder;
import com.commercetools.api.models.project.ProjectUpdateBuilder;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
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
            ensureOrderSearchIndexing();

            OrderPagedSearchResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .orders()
                    .search()
                    .post(orderSearchRequestBuilder -> orderSearchRequestBuilder.query(new OrderSearchQuery() {
                        /*
                        {
                            "exists": {
                                "field": "custom.deliveryDate",
                                "customType": "StringType"
                            }
                        }
                        */
                        @JsonAnyGetter
                        public Map<String, Object> getValue() {
                            final Map<String, Object> mapper = new HashMap<>();
                            final Map<String, Object> exists = new HashMap<>();
                            exists.put("field", "custom.deliveryDate");
                            exists.put("customType", "StringType");
                            mapper.put("exists", exists);
                            return mapper;
                        }
                    }).sort(new OrderSearchSorting() {
                        @JsonAnyGetter
                        public Map<String, Object> getValue() {
                            final Map<String, Object> mapper = new HashMap<>();
                            mapper.put("field", "createdAt");
                            mapper.put("order", "desc");
                            return mapper;
                        }
                    }).limit(20))
                    .executeBlocking()
                    .getBody();
            Assertions.assertThat(response).isNotNull();
        });
    }

    private static void ensureOrderSearchIndexing() {
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
            // ignore exception in this case
        }
    }
}
