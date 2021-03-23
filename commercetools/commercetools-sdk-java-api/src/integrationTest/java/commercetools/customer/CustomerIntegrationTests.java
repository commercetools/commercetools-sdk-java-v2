
package commercetools.customer;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.customer.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;
import org.junit.Test;

public class CustomerIntegrationTests {

    @Test
    public void createAndDeleteById() {
        Customer customer = CustomerFixtures.createCustomer();
        Customer deletedCustomer = CustomerFixtures.deleteCustomer(customer.getId(), customer.getVersion());
        Assert.assertEquals(customer.getId(), deletedCustomer.getId());
    }

    @Test
    public void getById() {
        CustomerFixtures.withCustomer(customer -> {
            Customer queriedCustomer = CommercetoolsTestUtils.getProjectRoot()
                    .customers()
                    .withId(customer.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedCustomer);
            Assert.assertEquals(queriedCustomer.getId(), customer.getId());
        });
    }

    @Test
    public void getByKey() {
        CustomerFixtures.withCustomer(customer -> {
            Customer queriedCustomer = CommercetoolsTestUtils.getProjectRoot()
                    .customers()
                    .withKey(customer.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedCustomer);
            Assert.assertEquals(queriedCustomer.getId(), customer.getId());
        });
    }

    @Test
    public void query() {
        CustomerFixtures.withCustomer(customer -> {
            CustomerPagedQueryResponse response = CommercetoolsTestUtils.getProjectRoot()
                    .customers()
                    .get()
                    .withWhere("id=" + "\"" + customer.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(response);
            Assert.assertEquals(response.getResults().get(0).getId(), customer.getId());
        });
    }

    @Test
    public void updateById() {
        CustomerFixtures.withUpdateableCustomer(customer -> {
            List<CustomerUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(CustomerSetKeyActionBuilder.of().key(newKey).build());

            Customer updatedCustomer = CommercetoolsTestUtils.getProjectRoot()
                    .customers()
                    .withId(customer.getId())
                    .post(CustomerUpdateBuilder.of().actions(updateActions).version(customer.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedCustomer);
            Assert.assertEquals(updatedCustomer.getKey(), newKey);

            return updatedCustomer;
        });
    }

    @Test
    public void updateByKey() {
        CustomerFixtures.withUpdateableCustomer(customer -> {
            List<CustomerUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(CustomerSetKeyActionBuilder.of().key(newKey).build());

            Customer updatedCustomer = CommercetoolsTestUtils.getProjectRoot()
                    .customers()
                    .withKey(customer.getKey())
                    .post(CustomerUpdateBuilder.of().actions(updateActions).version(customer.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedCustomer);
            Assert.assertEquals(updatedCustomer.getKey(), newKey);

            return updatedCustomer;
        });
    }

    @Test
    public void deleteByKey() {
        Customer customer = CustomerFixtures.createCustomer();
        Customer deletedCustomer = CommercetoolsTestUtils.getProjectRoot()
                .customers()
                .withKey(customer.getKey())
                .delete()
                .withVersion(customer.getVersion())
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(deletedCustomer);
        Assert.assertEquals(customer.getId(), deletedCustomer.getId());
    }
}
