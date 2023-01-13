
package commercetools.customer;

import static commercetools.customer.CustomerFixtures.*;
import static commercetools.customer_group.CustomerGroupFixtures.*;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.customer.*;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFields;
import commercetools.utils.CommercetoolsTestUtils;
import commercetools.utils.TestUtils;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerIntegrationTests {

    @Test
    public void createAndDeleteById() {
        withCustomerGroup(customerGroup -> {
            Customer customer = createCustomer(customerGroup);
            Customer deletedCustomer = deleteCustomer(customer.getId(), customer.getVersion());
            Assertions.assertEquals(customer.getId(), deletedCustomer.getId());
        });
    }

    @Test
    public void getById() {
        withCustomer(customer -> {
            Customer queriedCustomer = CommercetoolsTestUtils.getProjectApiRoot()
                    .customers()
                    .withId(customer.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedCustomer);
            Assertions.assertEquals(queriedCustomer.getId(), customer.getId());
        });
    }

    @Test
    public void getByKey() {
        withCustomer(customer -> {
            Customer queriedCustomer = CommercetoolsTestUtils.getProjectApiRoot()
                    .customers()
                    .withKey(customer.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedCustomer);
            Assertions.assertEquals(queriedCustomer.getId(), customer.getId());
        });
    }

    @Test
    public void query() {
        withCustomer(customer -> {
            CustomerPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .customers()
                    .get()
                    .withWhere("id=" + "\"" + customer.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), customer.getId());
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

            Assertions.assertNotNull(updatedCustomer);
            Assertions.assertEquals(updatedCustomer.getKey(), newKey);

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

            Assertions.assertNotNull(updatedCustomer);
            Assertions.assertEquals(updatedCustomer.getKey(), newKey);

            return updatedCustomer;
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

            Assertions.assertNotNull(deletedCustomer);
            Assertions.assertEquals(customer.getId(), deletedCustomer.getId());
        });
    }

    @Test
    public void customerClone() {
        Customer customer = JsonUtils.fromJsonString(TestUtils.stringFromResource("customer.json"), Customer.class);

        List<BaseAddress> addresses = new ArrayList<>(customer.getAddresses());
        Map<String, Integer> addressIds = IntStream.range(0, addresses.size())
                .boxed()
                .collect(Collectors.toMap(integer -> addresses.get(integer).getId(), Function.identity()));
        CustomerDraft draft = CustomerDraft.builder()
                .key(customer.getKey())
                .customerNumber(customer.getCustomerNumber())
                .externalId(customer.getExternalId())
                .email(CommercetoolsTestUtils.randomKey() + "+" + customer.getEmail())
                .password("weak-new-password")
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .middleName(customer.getMiddleName())
                .title(customer.getTitle())
                .dateOfBirth(customer.getDateOfBirth())
                .companyName(customer.getCompanyName())
                .vatId(customer.getVatId())
                .addresses(addresses.size() > 0 ? addresses : null)
                .defaultBillingAddress(customer.getDefaultBillingAddressId() != null
                        ? addressIds.get(customer.getDefaultBillingAddressId())
                        : null)
                .defaultShippingAddress(customer.getDefaultShippingAddressId() != null
                        ? addressIds.get(customer.getDefaultShippingAddressId())
                        : null)
                .billingAddresses(customer.getBillingAddressIds().size() > 0 ? addressIds.entrySet()
                        .stream()
                        .filter(entry -> customer.getBillingAddressIds().contains(entry.getKey()))
                        .map(Map.Entry::getValue)
                        .collect(Collectors.toList()) : null)
                .shippingAddresses(customer.getShippingAddressIds().size() > 0 ? addressIds.entrySet()
                        .stream()
                        .filter(entry -> customer.getShippingAddressIds().contains(entry.getKey()))
                        .map(Map.Entry::getValue)
                        .collect(Collectors.toList()) : null)
                .isEmailVerified(customer.getIsEmailVerified())
                .customerGroup(Optional.ofNullable(customer.getCustomerGroup())
                        .map(reference -> CustomerGroupResourceIdentifier.builder().id(reference.getId()).build())
                        .orElse(null))
                .locale(customer.getLocale())
                .salutation(customer.getSalutation())
                .stores(Optional.ofNullable(customer.getStores())
                        .map(stores -> stores.stream()
                                .map(store -> StoreResourceIdentifier.builder().key(store.getKey()).build())
                                .collect(Collectors.toList()))
                        .orElse(null))
                .authenticationMode(customer.getAuthenticationMode())
                .custom(Optional.ofNullable(customer.getCustom()).map(CustomFields::toDraft).orElse(null))
                .build();

        Assertions.assertEquals(addressIds.get(customer.getDefaultBillingAddressId()),
            draft.getDefaultBillingAddress());
        Assertions.assertEquals(addressIds.get(customer.getDefaultShippingAddressId()),
            draft.getDefaultShippingAddress());

        Customer newCustomer = CommercetoolsTestUtils.getProjectApiRoot()
                .customers()
                .post(draft)
                .executeBlocking()
                .getBody()
                .getCustomer();

        try {
            Assertions.assertEquals("FR",
                newCustomer.getAddresses()
                        .stream()
                        .filter(address -> address.getId().equals(newCustomer.getDefaultBillingAddressId()))
                        .findFirst()
                        .get()
                        .getCountry());
            Assertions.assertEquals("JP",
                newCustomer.getAddresses()
                        .stream()
                        .filter(address -> address.getId().equals(newCustomer.getDefaultShippingAddressId()))
                        .findFirst()
                        .get()
                        .getCountry());
            Assertions.assertEquals(Arrays.asList("UK", "JP"),
                newCustomer.getAddresses()
                        .stream()
                        .filter(address -> newCustomer.getShippingAddressIds().contains(address.getId()))
                        .map(Address::getCountry)
                        .collect(Collectors.toList()));
            Assertions.assertEquals(Arrays.asList("US", "FR"),
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
