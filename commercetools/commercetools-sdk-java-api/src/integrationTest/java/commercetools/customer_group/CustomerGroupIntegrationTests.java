
package commercetools.customer_group;

import static commercetools.customer_group.CustomerGroupFixtures.*;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.customer_group.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerGroupIntegrationTests {

    @Test
    public void createAndDeleteById() {
        CustomerGroup customerGroup = createCustomerGroup();
        CustomerGroup deletedCustomerGroup = deleteCustomerGroup(customerGroup.getId(), customerGroup.getVersion());

        Assertions.assertNotNull(customerGroup);
        Assertions.assertNotNull(deletedCustomerGroup);
        Assertions.assertEquals(customerGroup.getId(), deletedCustomerGroup.getId());
    }

    @Test
    public void getById() {
        withCustomerGroup(customerGroup -> {
            CustomerGroup queriedCustomerGroup = CommercetoolsTestUtils.getProjectApiRoot()
                    .customerGroups()
                    .withId(customerGroup.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedCustomerGroup);
            Assertions.assertEquals(customerGroup.getId(), queriedCustomerGroup.getId());
        });
    }

    @Test
    public void getByKey() {
        withCustomerGroup(customerGroup -> {
            CustomerGroup queriedCustomerGroup = CommercetoolsTestUtils.getProjectApiRoot()
                    .customerGroups()
                    .withKey(customerGroup.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedCustomerGroup);
            Assertions.assertEquals(customerGroup.getId(), queriedCustomerGroup.getId());
        });
    }

    @Test
    public void query() {
        withCustomerGroup(customerGroup -> {
            CustomerGroupPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .customerGroups()
                    .get()
                    .withWhere("id=" + "\"" + customerGroup.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), customerGroup.getId());
        });
    }

    @Test
    public void updateById() {
        withUpdateableCustomerGroup(customerGroup -> {
            List<CustomerGroupUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(CustomerGroupSetKeyActionBuilder.of().key(newKey).build());
            CustomerGroup updatedCustomerGroup = CommercetoolsTestUtils.getProjectApiRoot()
                    .customerGroups()
                    .withId(customerGroup.getId())
                    .post(CustomerGroupUpdateBuilder.of()
                            .actions(updateActions)
                            .version(customerGroup.getVersion())
                            .build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedCustomerGroup);
            Assertions.assertEquals(updatedCustomerGroup.getKey(), newKey);

            return updatedCustomerGroup;
        });
    }

    @Test
    public void updateByKey() {
        withUpdateableCustomerGroup(customerGroup -> {
            List<CustomerGroupUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(CustomerGroupSetKeyActionBuilder.of().key(newKey).build());
            CustomerGroup updatedCustomerGroup = CommercetoolsTestUtils.getProjectApiRoot()
                    .customerGroups()
                    .withKey(customerGroup.getKey())
                    .post(CustomerGroupUpdateBuilder.of()
                            .actions(updateActions)
                            .version(customerGroup.getVersion())
                            .build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedCustomerGroup);
            Assertions.assertEquals(updatedCustomerGroup.getKey(), newKey);

            return updatedCustomerGroup;
        });
    }

    @Test
    public void deleteByKey() {
        CustomerGroup customerGroup = createCustomerGroup();
        CustomerGroup deletedCustomerGroup = CommercetoolsTestUtils.getProjectApiRoot()
                .customerGroups()
                .withId(customerGroup.getId())
                .delete()
                .withVersion(customerGroup.getVersion())
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(deletedCustomerGroup);
        Assertions.assertEquals(customerGroup.getId(), deletedCustomerGroup.getId());
    }

}
