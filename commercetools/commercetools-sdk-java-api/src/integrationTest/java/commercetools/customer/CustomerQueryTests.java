
package commercetools.customer;

import static commercetools.customer.CustomerFixtures.withCustomer;

import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerPagedQueryResponse;
import com.commercetools.api.models.customer_group.CustomerGroupImpl;
import commercetools.utils.CommercetoolsTestUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerQueryTests {

    @Test
    public void getById() {
        withCustomer(customer -> {
            final Customer queriedCustomer = CommercetoolsTestUtils.getProjectApiRoot()
                    .customers()
                    .withId(customer.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertThat(queriedCustomer).isNotNull();
            Assertions.assertThat(queriedCustomer.getId()).isEqualTo(customer.getId());
        });
    }

    @Test
    public void getByKey() {
        withCustomer(customer -> {
            final Customer queriedCustomer = CommercetoolsTestUtils.getProjectApiRoot()
                    .customers()
                    .withKey(customer.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertThat(queriedCustomer).isNotNull();
            Assertions.assertThat(queriedCustomer.getId()).isEqualTo(customer.getId());
        });
    }

    @Test
    public void queryWithCustomerGroupExpand() {
        withCustomer(customer -> {
            final CustomerPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .customers()
                    .get()
                    .withExpand("customerGroup")
                    .withWhere("id=:customerId", "customerId", customer.getId())
                    .executeBlocking()
                    .getBody();

            final Customer queriedCustomer = response.getResults().get(0);
            Assertions.assertThat(queriedCustomer.getId()).isEqualTo(customer.getId());
            Assertions.assertThat(queriedCustomer.getCustomerGroup().getObj()).isInstanceOf(CustomerGroupImpl.class);
        });
    }

    @Test
    public void queryWithCustomerGroupExpandWithQueryModel() {
        withCustomer(customer -> {
            final CustomerPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .customers()
                    .get()
                    .withExpand("customerGroup")
                    .withQuery(c -> c.id().isVar("customerId"), "customerId", customer.getId())
                    .executeBlocking()
                    .getBody();

            final Customer queriedCustomer = response.getResults().get(0);
            Assertions.assertThat(queriedCustomer.getId()).isEqualTo(customer.getId());
            Assertions.assertThat(queriedCustomer.getCustomerGroup().getObj()).isInstanceOf(CustomerGroupImpl.class);
        });
    }
}
