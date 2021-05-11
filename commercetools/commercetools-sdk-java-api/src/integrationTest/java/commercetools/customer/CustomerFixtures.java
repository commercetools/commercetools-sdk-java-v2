
package commercetools.customer;

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
import commercetools.customer_group.CustomerGroupFixtures;
import commercetools.store.StoreFixtures;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;

public class CustomerFixtures {

    public static final String TEST_CUSTOMER_PASSWORD = "test-customer-password";

    public static void withCustomer(final Consumer<Customer> consumer) {
        Customer customer = createCustomer();
        consumer.accept(customer);
        deleteCustomer(customer.getId(), customer.getVersion());
    }

    public static void withUpdateableCustomer(final UnaryOperator<Customer> operator) {
        Customer customer = createCustomer();
        customer = operator.apply(customer);
        deleteCustomer(customer.getId(), customer.getVersion());
    }

    public static Customer createCustomer() {
        CustomerGroup customerGroup = CustomerGroupFixtures.createCustomerGroup();
        CustomerDraft customerDraft = CustomerDraftBuilder.of()
                .email("test-email-" + CommercetoolsTestUtils.randomString() + "@test.com")
                .key(CommercetoolsTestUtils.randomKey())
                .password(TEST_CUSTOMER_PASSWORD)
                .customerGroup(CustomerGroupResourceIdentifierBuilder.of().id(customerGroup.getId()).build())
                .addresses(Arrays.asList(AddressBuilder.of().country("DE").build()))
                .build();

        Customer customer = CommercetoolsTestUtils.getProjectRoot()
                .customers()
                .post(customerDraft)
                .executeBlocking()
                .getBody()
                .getCustomer();

        Assert.assertNotNull(customer);
        Assert.assertEquals(customer.getKey(), customerDraft.getKey());

        return customer;
    }

    public static Customer createStoreCustomer() {

        Store store = StoreFixtures.createStore();
        CustomerGroup customerGroup = CustomerGroupFixtures.createCustomerGroup();
        CustomerDraft customerDraft = CustomerDraftBuilder.of()
                .email("test-email-" + CommercetoolsTestUtils.randomString() + "@test.com")
                .key(CommercetoolsTestUtils.randomKey())
                .password(CommercetoolsTestUtils.randomString())
                .stores(Arrays.asList(StoreResourceIdentifierBuilder.of().id(store.getId()).build()))
                .customerGroup(CustomerGroupResourceIdentifierBuilder.of().id(customerGroup.getId()).build())
                .addresses(Arrays.asList(AddressBuilder.of().country("DE").build()))
                .build();

        Customer customer = CommercetoolsTestUtils.getProjectRoot()
                .customers()
                .post(customerDraft)
                .executeBlocking()
                .getBody()
                .getCustomer();

        Assert.assertNotNull(customer);
        Assert.assertEquals(customer.getKey(), customerDraft.getKey());

        return customer;
    }

    public static Customer deleteCustomer(final String id, final Long version) {
        Customer customer = CommercetoolsTestUtils.getProjectRoot()
                .customers()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(customer);
        Assert.assertEquals(customer.getId(), id);

        return customer;
    }

}
