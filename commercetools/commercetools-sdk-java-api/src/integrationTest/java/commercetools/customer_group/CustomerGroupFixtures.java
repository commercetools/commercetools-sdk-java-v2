
package commercetools.customer_group;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.customer_group.CustomerGroup;
import com.commercetools.api.models.customer_group.CustomerGroupDraft;
import com.commercetools.api.models.customer_group.CustomerGroupDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;

public class CustomerGroupFixtures {

    public static void withCustomerGroup(final Consumer<CustomerGroup> consumer) {
        CustomerGroup customerGroup = createCustomerGroup();
        try {
            consumer.accept(customerGroup);
        }
        finally {
            deleteCustomerGroup(customerGroup.getId(), customerGroup.getVersion());
        }
    }

    public static void withUpdateableCustomerGroup(final UnaryOperator<CustomerGroup> operator) {
        CustomerGroup customerGroup = createCustomerGroup();
        try {
            customerGroup = operator.apply(customerGroup);
        }
        finally {
            deleteCustomerGroup(customerGroup.getId(), customerGroup.getVersion());
        }
    }

    public static CustomerGroup createCustomerGroup() {
        CustomerGroupDraft customerGroupDraft = CustomerGroupDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .groupName(CommercetoolsTestUtils.randomString())
                .build();

        CustomerGroup customerGroup = CommercetoolsTestUtils.getProjectApiRoot()
                .customerGroups()
                .post(customerGroupDraft)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(customerGroup);
        Assertions.assertEquals(customerGroup.getKey(), customerGroupDraft.getKey());

        return customerGroup;
    }

    public static CustomerGroup deleteCustomerGroup(final String id, final Long version) {
        CustomerGroup customerGroup = CommercetoolsTestUtils.getProjectApiRoot()
                .customerGroups()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(customerGroup);
        Assertions.assertEquals(customerGroup.getId(), id);

        return customerGroup;
    }

}
