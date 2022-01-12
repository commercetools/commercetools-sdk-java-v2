
package commercetools.customer;

import static commercetools.customer_group.CustomerGroupFixtures.*;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.common.AddressBuilder;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerDraft;
import com.commercetools.api.models.customer.CustomerDraftBuilder;
import com.commercetools.api.models.customer_group.CustomerGroup;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder;
import com.commercetools.api.models.store.Store;
import com.commercetools.api.models.store.StoreResourceIdentifierBuilder;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;

public class CustomerFixtures {

    public static final String TEST_CUSTOMER_PASSWORD = "test-custo@%$#!mer-password";

    public static void withCustomer(final Consumer<Customer> consumer) {
        withCustomerGroup(customerGroup -> {
            Customer customer = createCustomer(customerGroup);
            try {
                consumer.accept(customer);
            }
            finally {
                deleteCustomer(customer.getId(), customer.getVersion());
            }
        });
    }

    public static void withUpdateableCustomer(final UnaryOperator<Customer> operator) {
        withCustomerGroup(customerGroup -> {
            Customer customer = createCustomer(customerGroup);
            try {
                customer = operator.apply(customer);
            }
            finally {
                deleteCustomer(customer.getId(), customer.getVersion());
            }
        });
    }

    public static Customer createCustomer(CustomerGroup customerGroup) {
        CustomerDraft customerDraft = CustomerDraftBuilder.of()
                .email("test-email-" + CommercetoolsTestUtils.randomString() + "@test.com")
                .key(CommercetoolsTestUtils.randomKey())
                .password(TEST_CUSTOMER_PASSWORD)
                .customerGroup(CustomerGroupResourceIdentifierBuilder.of().id(customerGroup.getId()).build())
                .addresses(Arrays.asList(AddressBuilder.of().country("DE").build()))
                .build();

        Customer customer = CommercetoolsTestUtils.getProjectApiRoot()
                .customers()
                .post(customerDraft)
                .executeBlocking()
                .getBody()
                .getCustomer();

        Assertions.assertNotNull(customer);
        Assertions.assertEquals(customer.getKey(), customerDraft.getKey());

        return customer;
    }

    public static Customer createStoreCustomer(Store store, CustomerGroup customerGroup) {
        CustomerDraft customerDraft = CustomerDraftBuilder.of()
                .email("test-email-" + CommercetoolsTestUtils.randomString() + "@test.com")
                .key(CommercetoolsTestUtils.randomKey())
                .password(CommercetoolsTestUtils.randomString())
                .stores(Arrays.asList(StoreResourceIdentifierBuilder.of().id(store.getId()).build()))
                .customerGroup(CustomerGroupResourceIdentifierBuilder.of().id(customerGroup.getId()).build())
                .addresses(Arrays.asList(AddressBuilder.of().country("DE").build()))
                .build();

        Customer customer = CommercetoolsTestUtils.getProjectApiRoot()
                .customers()
                .post(customerDraft)
                .executeBlocking()
                .getBody()
                .getCustomer();

        Assertions.assertNotNull(customer);
        Assertions.assertEquals(customer.getKey(), customerDraft.getKey());

        return customer;
    }

    public static Customer deleteCustomer(final String id, final Long version) {
        Customer customer = CommercetoolsTestUtils.getProjectApiRoot()
                .customers()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(customer);
        Assertions.assertEquals(customer.getId(), id);

        return customer;
    }

}
