package commercetools.customer;

import com.commercetools.models.Customer.Customer;
import com.commercetools.models.Customer.CustomerDraft;
import com.commercetools.models.Customer.CustomerDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class CustomerFixtures {
    
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
        CustomerDraft customerDraft = CustomerDraftBuilder.of()
                .email("test-email-" + CommercetoolsTestUtils.randomString() + "@test.com")
                .key(CommercetoolsTestUtils.randomKey())
                .password(CommercetoolsTestUtils.randomString())
                .build();
        
        Customer customer = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .customers()
                .post(customerDraft)
                .executeBlocking()
                .getCustomer();

        Assertions.assertNotNull(customer);
        Assertions.assertEquals(customer.getKey(), customerDraft.getKey());
        
        return customer;
    }
    
    public static Customer deleteCustomer(final String id, final Long version) {
        Customer customer = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .customers()
                .withId(id)
                .delete()
                .addVersion(version)
                .executeBlocking();

        Assertions.assertNotNull(customer);
        Assertions.assertEquals(customer.getId(), id);
        
        return customer;
    }
    
}
