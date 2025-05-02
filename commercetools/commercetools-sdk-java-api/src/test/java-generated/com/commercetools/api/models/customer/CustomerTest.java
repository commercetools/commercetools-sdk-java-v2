
package com.commercetools.api.models.customer;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerBuilder builder) {
        Customer customer = builder.buildUnchecked();
        Assertions.assertThat(customer).isInstanceOf(Customer.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Customer.builder().id("id") },
                new Object[] { "version", Customer.builder().version(2L) },
                new Object[] { "key", Customer.builder().key("key") },
                new Object[] { "customerNumber", Customer.builder().customerNumber("customerNumber") },
                new Object[] { "externalId", Customer.builder().externalId("externalId") },
                new Object[] { "createdAt", Customer.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        Customer.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        Customer.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        Customer.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "email", Customer.builder().email("email") },
                new Object[] { "password", Customer.builder().password("password") },
                new Object[] { "firstName", Customer.builder().firstName("firstName") },
                new Object[] { "lastName", Customer.builder().lastName("lastName") },
                new Object[] { "middleName", Customer.builder().middleName("middleName") },
                new Object[] { "title", Customer.builder().title("title") },
                new Object[] { "dateOfBirth", Customer.builder().dateOfBirth(LocalDate.parse("2023-06-01")) },
                new Object[] { "companyName", Customer.builder().companyName("companyName") },
                new Object[] { "vatId", Customer.builder().vatId("vatId") },
                new Object[] { "addresses", Customer.builder()
                        .addresses(Collections.singletonList(new com.commercetools.api.models.common.AddressImpl())) },
                new Object[] { "defaultShippingAddressId",
                        Customer.builder().defaultShippingAddressId("defaultShippingAddressId") },
                new Object[] { "shippingAddressIds",
                        Customer.builder().shippingAddressIds(Collections.singletonList("shippingAddressIds")) },
                new Object[] { "defaultBillingAddressId",
                        Customer.builder().defaultBillingAddressId("defaultBillingAddressId") },
                new Object[] { "billingAddressIds",
                        Customer.builder().billingAddressIds(Collections.singletonList("billingAddressIds")) },
                new Object[] { "isEmailVerified", Customer.builder().isEmailVerified(true) },
                new Object[] { "customerGroup", Customer.builder()
                        .customerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) },
                new Object[] { "custom",
                        Customer.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "locale", Customer.builder().locale("locale") },
                new Object[] { "salutation", Customer.builder().salutation("salutation") },
                new Object[] { "stores",
                        Customer.builder()
                                .stores(Collections.singletonList(
                                    new com.commercetools.api.models.store.StoreKeyReferenceImpl())) },
                new Object[] { "authenticationMode",
                        Customer.builder()
                                .authenticationMode(
                                    com.commercetools.api.models.customer.AuthenticationMode.findEnum("Password")) },
                new Object[] { "customerGroupAssignments",
                        Customer.builder()
                                .customerGroupAssignments(Collections.singletonList(
                                    new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl())) } };
    }

    @Test
    public void id() {
        Customer value = Customer.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        Customer value = Customer.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void key() {
        Customer value = Customer.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void customerNumber() {
        Customer value = Customer.of();
        value.setCustomerNumber("customerNumber");
        Assertions.assertThat(value.getCustomerNumber()).isEqualTo("customerNumber");
    }

    @Test
    public void externalId() {
        Customer value = Customer.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }

    @Test
    public void createdAt() {
        Customer value = Customer.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        Customer value = Customer.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        Customer value = Customer.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        Customer value = Customer.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void email() {
        Customer value = Customer.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }

    @Test
    public void password() {
        Customer value = Customer.of();
        value.setPassword("password");
        Assertions.assertThat(value.getPassword()).isEqualTo("password");
    }

    @Test
    public void firstName() {
        Customer value = Customer.of();
        value.setFirstName("firstName");
        Assertions.assertThat(value.getFirstName()).isEqualTo("firstName");
    }

    @Test
    public void lastName() {
        Customer value = Customer.of();
        value.setLastName("lastName");
        Assertions.assertThat(value.getLastName()).isEqualTo("lastName");
    }

    @Test
    public void middleName() {
        Customer value = Customer.of();
        value.setMiddleName("middleName");
        Assertions.assertThat(value.getMiddleName()).isEqualTo("middleName");
    }

    @Test
    public void title() {
        Customer value = Customer.of();
        value.setTitle("title");
        Assertions.assertThat(value.getTitle()).isEqualTo("title");
    }

    @Test
    public void dateOfBirth() {
        Customer value = Customer.of();
        value.setDateOfBirth(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getDateOfBirth()).isEqualTo(LocalDate.parse("2023-06-01"));
    }

    @Test
    public void companyName() {
        Customer value = Customer.of();
        value.setCompanyName("companyName");
        Assertions.assertThat(value.getCompanyName()).isEqualTo("companyName");
    }

    @Test
    public void vatId() {
        Customer value = Customer.of();
        value.setVatId("vatId");
        Assertions.assertThat(value.getVatId()).isEqualTo("vatId");
    }

    @Test
    public void addresses() {
        Customer value = Customer.of();
        value.setAddresses(Collections.singletonList(new com.commercetools.api.models.common.AddressImpl()));
        Assertions.assertThat(value.getAddresses())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AddressImpl()));
    }

    @Test
    public void defaultShippingAddressId() {
        Customer value = Customer.of();
        value.setDefaultShippingAddressId("defaultShippingAddressId");
        Assertions.assertThat(value.getDefaultShippingAddressId()).isEqualTo("defaultShippingAddressId");
    }

    @Test
    public void shippingAddressIds() {
        Customer value = Customer.of();
        value.setShippingAddressIds(Collections.singletonList("shippingAddressIds"));
        Assertions.assertThat(value.getShippingAddressIds()).isEqualTo(Collections.singletonList("shippingAddressIds"));
    }

    @Test
    public void defaultBillingAddressId() {
        Customer value = Customer.of();
        value.setDefaultBillingAddressId("defaultBillingAddressId");
        Assertions.assertThat(value.getDefaultBillingAddressId()).isEqualTo("defaultBillingAddressId");
    }

    @Test
    public void billingAddressIds() {
        Customer value = Customer.of();
        value.setBillingAddressIds(Collections.singletonList("billingAddressIds"));
        Assertions.assertThat(value.getBillingAddressIds()).isEqualTo(Collections.singletonList("billingAddressIds"));
    }

    @Test
    public void isEmailVerified() {
        Customer value = Customer.of();
        value.setIsEmailVerified(true);
        Assertions.assertThat(value.getIsEmailVerified()).isEqualTo(true);
    }

    @Test
    public void customerGroup() {
        Customer value = Customer.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }

    @Test
    public void custom() {
        Customer value = Customer.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void locale() {
        Customer value = Customer.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }

    @Test
    public void salutation() {
        Customer value = Customer.of();
        value.setSalutation("salutation");
        Assertions.assertThat(value.getSalutation()).isEqualTo("salutation");
    }

    @Test
    public void stores() {
        Customer value = Customer.of();
        value.setStores(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
    }

    @Test
    public void authenticationMode() {
        Customer value = Customer.of();
        value.setAuthenticationMode(com.commercetools.api.models.customer.AuthenticationMode.findEnum("Password"));
        Assertions.assertThat(value.getAuthenticationMode())
                .isEqualTo(com.commercetools.api.models.customer.AuthenticationMode.findEnum("Password"));
    }

    @Test
    public void customerGroupAssignments() {
        Customer value = Customer.of();
        value.setCustomerGroupAssignments(
            Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()));
        Assertions.assertThat(value.getCustomerGroupAssignments())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()));
    }
}
