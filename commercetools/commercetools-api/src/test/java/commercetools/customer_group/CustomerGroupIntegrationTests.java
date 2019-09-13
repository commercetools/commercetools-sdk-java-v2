package commercetools.customer_group;

import com.commercetools.models.customer_group.*;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomerGroupIntegrationTests {
    
    @Test
    public void createAndDeleteById() {
        CustomerGroup customerGroup = CustomerGroupFixtures.createCustomerGroup();
        CustomerGroup deletedCustomerGroup = CustomerGroupFixtures.deleteCustomerGroup(customerGroup.getId(), customerGroup.getVersion());

        Assertions.assertNotNull(customerGroup);
        Assertions.assertNotNull(deletedCustomerGroup);
        Assertions.assertEquals(customerGroup.getId(), deletedCustomerGroup.getId());
    }

    @Test
    public void getById() {
        CustomerGroupFixtures.withCustomerGroup(customerGroup -> {
            CustomerGroup queriedCustomerGroup = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .customerGroups()
                    .withId(customerGroup.getId())
                    .get()
                    .executeBlocking().getBody();

            Assertions.assertNotNull(queriedCustomerGroup);
            Assertions.assertEquals(customerGroup.getId(), queriedCustomerGroup.getId());
        });
    }

    @Test
    public void getByKey() {
        CustomerGroupFixtures.withCustomerGroup(customerGroup -> {
            CustomerGroup queriedCustomerGroup = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .customerGroups()
                    .withKey(customerGroup.getKey())
                    .get()
                    .executeBlocking().getBody();

            Assertions.assertNotNull(queriedCustomerGroup);
            Assertions.assertEquals(customerGroup.getId(), queriedCustomerGroup.getId());
        });
    }

    @Test
    public void query() {
        CustomerGroupFixtures.withCustomerGroup(customerGroup -> {
            CustomerGroupPagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .customerGroups()
                    .get()
                    .addWhere("id=" + "\"" + customerGroup.getId() + "\"")
                    .executeBlocking().getBody();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), customerGroup.getId());
        });
    }
    
    @Test
    public void updateById() {
        CustomerGroupFixtures.withUpdateableCustomerGroup(customerGroup -> {
            List<CustomerGroupUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(CustomerGroupSetKeyActionBuilder.of().key(newKey).build());
            CustomerGroup updatedCustomerGroup = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .customerGroups()
                    .withId(customerGroup.getId())
                    .post(CustomerGroupUpdateBuilder.of()
                            .actions(updateActions)
                            .version(customerGroup.getVersion())
                            .build())
                    .executeBlocking().getBody();

            Assertions.assertNotNull(updatedCustomerGroup);
            Assertions.assertEquals(updatedCustomerGroup.getKey(), newKey);
            
            return updatedCustomerGroup;
        });
    }

    @Test
    public void updateByKey() {
        CustomerGroupFixtures.withUpdateableCustomerGroup(customerGroup -> {
            List<CustomerGroupUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(CustomerGroupSetKeyActionBuilder.of().key(newKey).build());
            CustomerGroup updatedCustomerGroup = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .customerGroups()
                    .withKey(customerGroup.getKey())
                    .post(CustomerGroupUpdateBuilder.of()
                            .actions(updateActions)
                            .version(customerGroup.getVersion())
                            .build())
                    .executeBlocking().getBody();

            Assertions.assertNotNull(updatedCustomerGroup);
            Assertions.assertEquals(updatedCustomerGroup.getKey(), newKey);

            return updatedCustomerGroup;
        });
    }
    
    @Test
    public void deleteByKey() {
        CustomerGroup customerGroup = CustomerGroupFixtures.createCustomerGroup();
        CustomerGroup deletedCustomerGroup = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .customerGroups()
                .withId(customerGroup.getId())
                .delete()
                .addVersion(customerGroup.getVersion())
                .executeBlocking().getBody();

        Assertions.assertNotNull(deletedCustomerGroup);
        Assertions.assertEquals(customerGroup.getId(), deletedCustomerGroup.getId());
    }
    
}
