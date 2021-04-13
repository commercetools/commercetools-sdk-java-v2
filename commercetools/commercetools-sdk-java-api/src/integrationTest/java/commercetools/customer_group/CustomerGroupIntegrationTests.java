
package commercetools.customer_group;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.customer_group.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;
import org.junit.Test;

public class CustomerGroupIntegrationTests {

    @Test
    public void createAndDeleteById() {
        CustomerGroup customerGroup = CustomerGroupFixtures.createCustomerGroup();
        CustomerGroup deletedCustomerGroup = CustomerGroupFixtures.deleteCustomerGroup(customerGroup.getId(),
            customerGroup.getVersion());

        Assert.assertNotNull(customerGroup);
        Assert.assertNotNull(deletedCustomerGroup);
        Assert.assertEquals(customerGroup.getId(), deletedCustomerGroup.getId());
    }

    @Test
    public void getById() {
        CustomerGroupFixtures.withCustomerGroup(customerGroup -> {
            CustomerGroup queriedCustomerGroup = CommercetoolsTestUtils.getProjectRoot()
                    .customerGroups()
                    .withId(customerGroup.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedCustomerGroup);
            Assert.assertEquals(customerGroup.getId(), queriedCustomerGroup.getId());
        });
    }

    @Test
    public void getByKey() {
        CustomerGroupFixtures.withCustomerGroup(customerGroup -> {
            CustomerGroup queriedCustomerGroup = CommercetoolsTestUtils.getProjectRoot()
                    .customerGroups()
                    .withKey(customerGroup.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedCustomerGroup);
            Assert.assertEquals(customerGroup.getId(), queriedCustomerGroup.getId());
        });
    }

    @Test
    public void query() {
        CustomerGroupFixtures.withCustomerGroup(customerGroup -> {
            CustomerGroupPagedQueryResponse response = CommercetoolsTestUtils.getProjectRoot()
                    .customerGroups()
                    .get()
                    .withWhere("id=" + "\"" + customerGroup.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(response);
            Assert.assertEquals(response.getResults().get(0).getId(), customerGroup.getId());
        });
    }

    @Test
    public void updateById() {
        CustomerGroupFixtures.withUpdateableCustomerGroup(customerGroup -> {
            List<CustomerGroupUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(CustomerGroupSetKeyActionBuilder.of().key(newKey).build());
            CustomerGroup updatedCustomerGroup = CommercetoolsTestUtils.getProjectRoot()
                    .customerGroups()
                    .withId(customerGroup.getId())
                    .post(CustomerGroupUpdateBuilder.of()
                            .actions(updateActions)
                            .version(customerGroup.getVersion())
                            .build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedCustomerGroup);
            Assert.assertEquals(updatedCustomerGroup.getKey(), newKey);

            return updatedCustomerGroup;
        });
    }

    @Test
    public void updateByKey() {
        CustomerGroupFixtures.withUpdateableCustomerGroup(customerGroup -> {
            List<CustomerGroupUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(CustomerGroupSetKeyActionBuilder.of().key(newKey).build());
            CustomerGroup updatedCustomerGroup = CommercetoolsTestUtils.getProjectRoot()
                    .customerGroups()
                    .withKey(customerGroup.getKey())
                    .post(CustomerGroupUpdateBuilder.of()
                            .actions(updateActions)
                            .version(customerGroup.getVersion())
                            .build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedCustomerGroup);
            Assert.assertEquals(updatedCustomerGroup.getKey(), newKey);

            return updatedCustomerGroup;
        });
    }

    @Test
    public void deleteByKey() {
        CustomerGroup customerGroup = CustomerGroupFixtures.createCustomerGroup();
        CustomerGroup deletedCustomerGroup = CommercetoolsTestUtils.getProjectRoot()
                .customerGroups()
                .withId(customerGroup.getId())
                .delete()
                .withVersion(customerGroup.getVersion())
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(deletedCustomerGroup);
        Assert.assertEquals(customerGroup.getId(), deletedCustomerGroup.getId());
    }

}
