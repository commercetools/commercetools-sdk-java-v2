
package commercetools.customer;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.common.BaseAddressBuilder;
import com.commercetools.api.models.customer.*;
import commercetools.utils.CommercetoolsTestUtils;
import commercetools.utils.TestUtils;
import io.vrap.rmf.base.client.utils.json.JsonUtils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static commercetools.customer.CustomerFixtures.*;
import static commercetools.customer_group.CustomerGroupFixtures.withCustomerGroup;
import static commercetools.store.StoreFixtures.withStore;

public class CustomerIntegrationTests {

    @Test
    public void createAndDeleteById() {
        withCustomerGroup(customerGroup -> {
            Customer customer = createCustomer(customerGroup);
            Customer deletedCustomer = deleteCustomer(customer.getId(), customer.getVersion());
            Assertions.assertThat(customer.getId()).isEqualTo(deletedCustomer.getId());
        });
    }

    @Test
    public void updateById() {
        withUpdateableCustomer(customer -> {
            List<CustomerUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(CustomerSetKeyActionBuilder.of().key(newKey).build());

            Customer updatedCustomer = CommercetoolsTestUtils.getProjectApiRoot()
                    .customers()
                    .withId(customer.getId())
                    .post(CustomerUpdateBuilder.of().actions(updateActions).version(customer.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertThat(updatedCustomer).isNotNull();
            Assertions.assertThat(updatedCustomer.getKey()).isEqualTo(newKey);

            return updatedCustomer;
        });
    }

    @Test
    public void updateByKey() {
        withUpdateableCustomer(customer -> {
            List<CustomerUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(CustomerSetKeyActionBuilder.of().key(newKey).build());

            Customer updatedCustomer = CommercetoolsTestUtils.getProjectApiRoot()
                    .customers()
                    .withKey(customer.getKey())
                    .post(CustomerUpdateBuilder.of().actions(updateActions).version(customer.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertThat(updatedCustomer).isNotNull();
            Assertions.assertThat(updatedCustomer.getKey()).isEqualTo(newKey);

            return updatedCustomer;
        });
    }

    @Test
    public void addNewAddress(){
        withUpdateableCustomer(customer -> {
            final String newAddressKey = CommercetoolsTestUtils.randomKey();
            final BaseAddress address1 = BaseAddressBuilder.of()
                    .country(Locale.GERMANY.getCountry())
                    .key(newAddressKey)
                    .build();

            final CustomerAddAddressAction addAddressAction = CustomerAddAddressActionBuilder.of().address(address1).build();

            final Customer updatedCustomer = CommercetoolsTestUtils.getProjectApiRoot()
                    .customers()
                    .update(customer)
                    .with(builder -> builder.plus(
                            addAddressAction))
                    .executeBlocking()
                    .getBody();

            final Optional<Address> newAddress = updatedCustomer.getAddresses()
                    .stream()
                    .filter(address -> address.getKey() != null
                            && address.getKey().equals(newAddressKey))
                    .findAny();
            Assertions.assertThat(newAddress).isPresent();

            return updatedCustomer;
        });
    }

    @Test
    public void setCustomerToStore(){
        withStore(store -> {
            withUpdateableCustomer(customer -> {
                Assertions.assertThat(customer.getStores()).isEmpty();

                final CustomerSetStoresAction customerSetStoresAction = CustomerSetStoresActionBuilder.of()
                        .plusStores(store.toResourceIdentifier())
                        .build();
                final Customer updatedCustomer = CommercetoolsTestUtils.getProjectApiRoot()
                        .customers()
                        .update(customer)
                        .with(customerUpdateActionCustomerUpdateActionBuilderUpdateActionBuilder -> customerUpdateActionCustomerUpdateActionBuilderUpdateActionBuilder.plus(
                                customerSetStoresAction))
                        .executeBlocking()
                        .getBody();

                Assertions.assertThat(updatedCustomer.getStores()).isNotEmpty();

                return updatedCustomer;
            });
        });
    }

    @Test
    public void deleteByKey() {
        withCustomerGroup(customerGroup -> {
            Customer customer = createCustomer(customerGroup);
            Customer deletedCustomer = CommercetoolsTestUtils.getProjectApiRoot()
                    .customers()
                    .withKey(customer.getKey())
                    .delete()
                    .withVersion(customer.getVersion())
                    .executeBlocking()
                    .getBody();

            Assertions.assertThat(deletedCustomer).isNotNull();
            Assertions.assertThat(customer.getId()).isEqualTo(deletedCustomer.getId());
        });
    }

    @Test
    public void customerClone() {
        Customer customer = JsonUtils.fromJsonString(TestUtils.stringFromResource("customer.json"), Customer.class);

        CustomerDraft draft = CustomerDraft.builder(customer)
                .email(CommercetoolsTestUtils.randomKey() + "+" + customer.getEmail())
                .password("weak-new-password")
                .build();

        Assertions.assertThat(4).isEqualTo(draft.getDefaultBillingAddress());
        Assertions.assertThat(3).isEqualTo(draft.getDefaultShippingAddress());

        Customer newCustomer = CommercetoolsTestUtils.getProjectApiRoot()
                .customers()
                .post(draft)
                .executeBlocking()
                .getBody()
                .getCustomer();

        try {
            Assertions.assertThat("FR").isEqualTo(
                newCustomer.getAddresses()
                        .stream()
                        .filter(address -> address.getId().equals(newCustomer.getDefaultBillingAddressId()))
                        .findFirst()
                        .get()
                        .getCountry());
            Assertions.assertThat("JP").isEqualTo(
                newCustomer.getAddresses()
                        .stream()
                        .filter(address -> address.getId().equals(newCustomer.getDefaultShippingAddressId()))
                        .findFirst()
                        .get()
                        .getCountry());
            Assertions.assertThat(Arrays.asList("UK", "JP")).isEqualTo(
                newCustomer.getAddresses()
                        .stream()
                        .filter(address -> newCustomer.getShippingAddressIds().contains(address.getId()))
                        .map(Address::getCountry)
                        .collect(Collectors.toList()));
            Assertions.assertThat(Arrays.asList("US", "FR")).isEqualTo(
                newCustomer.getAddresses()
                        .stream()
                        .filter(address -> newCustomer.getBillingAddressIds().contains(address.getId()))
                        .map(Address::getCountry)
                        .collect(Collectors.toList()));
        }
        finally {
            CommercetoolsTestUtils.getProjectApiRoot().customers().delete(newCustomer).executeBlocking();
        }
    }
}
