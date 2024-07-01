
package com.commercetools.api.models.customer;

import java.time.LocalDate;
import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class CustomerDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerDraftBuilder builder) {
        CustomerDraft customerDraft = builder.buildUnchecked();
        Assertions.assertThat(customerDraft).isInstanceOf(CustomerDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerDraft.builder().key("key") },
                new Object[] { CustomerDraft.builder().customerNumber("customerNumber") },
                new Object[] { CustomerDraft.builder().externalId("externalId") },
                new Object[] { CustomerDraft.builder().email("email") },
                new Object[] { CustomerDraft.builder().password("password") },
                new Object[] { CustomerDraft.builder().firstName("firstName") },
                new Object[] { CustomerDraft.builder().lastName("lastName") },
                new Object[] { CustomerDraft.builder().middleName("middleName") },
                new Object[] { CustomerDraft.builder().title("title") },
                new Object[] { CustomerDraft.builder().anonymousCartId("anonymousCartId") },
                new Object[] { CustomerDraft.builder()
                        .anonymousCart(new com.commercetools.api.models.cart.CartResourceIdentifierImpl()) },
                new Object[] { CustomerDraft.builder().anonymousId("anonymousId") },
                new Object[] { CustomerDraft.builder().dateOfBirth(LocalDate.parse("2023-06-01")) },
                new Object[] { CustomerDraft.builder().companyName("companyName") },
                new Object[] { CustomerDraft.builder().vatId("vatId") },
                new Object[] {
                        CustomerDraft.builder()
                                .addresses(Collections
                                        .singletonList(new com.commercetools.api.models.common.BaseAddressImpl())) },
                new Object[] { CustomerDraft.builder().defaultShippingAddress(4) },
                new Object[] { CustomerDraft.builder().shippingAddresses(Collections.singletonList(5)) },
                new Object[] { CustomerDraft.builder().defaultBillingAddress(3) },
                new Object[] { CustomerDraft.builder().billingAddresses(Collections.singletonList(7)) },
                new Object[] { CustomerDraft.builder().isEmailVerified(true) },
                new Object[] { CustomerDraft.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) },
                new Object[] {
                        CustomerDraft.builder().custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { CustomerDraft.builder().locale("locale") },
                new Object[] { CustomerDraft.builder().salutation("salutation") },
                new Object[] { CustomerDraft.builder()
                        .stores(Collections
                                .singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl())) },
                new Object[] { CustomerDraft.builder()
                        .authenticationMode(
                            com.commercetools.api.models.customer.AuthenticationMode.findEnum("Password")) },
                new Object[] { CustomerDraft.builder()
                        .customerGroupAssignments(Collections.singletonList(
                            new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl())) } };
    }

    @Test
    public void key() {
        CustomerDraft value = CustomerDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void customerNumber() {
        CustomerDraft value = CustomerDraft.of();
        value.setCustomerNumber("customerNumber");
        Assertions.assertThat(value.getCustomerNumber()).isEqualTo("customerNumber");
    }

    @Test
    public void externalId() {
        CustomerDraft value = CustomerDraft.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }

    @Test
    public void email() {
        CustomerDraft value = CustomerDraft.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }

    @Test
    public void password() {
        CustomerDraft value = CustomerDraft.of();
        value.setPassword("password");
        Assertions.assertThat(value.getPassword()).isEqualTo("password");
    }

    @Test
    public void firstName() {
        CustomerDraft value = CustomerDraft.of();
        value.setFirstName("firstName");
        Assertions.assertThat(value.getFirstName()).isEqualTo("firstName");
    }

    @Test
    public void lastName() {
        CustomerDraft value = CustomerDraft.of();
        value.setLastName("lastName");
        Assertions.assertThat(value.getLastName()).isEqualTo("lastName");
    }

    @Test
    public void middleName() {
        CustomerDraft value = CustomerDraft.of();
        value.setMiddleName("middleName");
        Assertions.assertThat(value.getMiddleName()).isEqualTo("middleName");
    }

    @Test
    public void title() {
        CustomerDraft value = CustomerDraft.of();
        value.setTitle("title");
        Assertions.assertThat(value.getTitle()).isEqualTo("title");
    }

    @Test
    public void anonymousCartId() {
        CustomerDraft value = CustomerDraft.of();
        value.setAnonymousCartId("anonymousCartId");
        Assertions.assertThat(value.getAnonymousCartId()).isEqualTo("anonymousCartId");
    }

    @Test
    public void anonymousCart() {
        CustomerDraft value = CustomerDraft.of();
        value.setAnonymousCart(new com.commercetools.api.models.cart.CartResourceIdentifierImpl());
        Assertions.assertThat(value.getAnonymousCart())
                .isEqualTo(new com.commercetools.api.models.cart.CartResourceIdentifierImpl());
    }

    @Test
    public void anonymousId() {
        CustomerDraft value = CustomerDraft.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }

    @Test
    public void dateOfBirth() {
        CustomerDraft value = CustomerDraft.of();
        value.setDateOfBirth(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getDateOfBirth()).isEqualTo(LocalDate.parse("2023-06-01"));
    }

    @Test
    public void companyName() {
        CustomerDraft value = CustomerDraft.of();
        value.setCompanyName("companyName");
        Assertions.assertThat(value.getCompanyName()).isEqualTo("companyName");
    }

    @Test
    public void vatId() {
        CustomerDraft value = CustomerDraft.of();
        value.setVatId("vatId");
        Assertions.assertThat(value.getVatId()).isEqualTo("vatId");
    }

    @Test
    public void addresses() {
        CustomerDraft value = CustomerDraft.of();
        value.setAddresses(Collections.singletonList(new com.commercetools.api.models.common.BaseAddressImpl()));
        Assertions.assertThat(value.getAddresses())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.BaseAddressImpl()));
    }

    @Test
    public void defaultShippingAddress() {
        CustomerDraft value = CustomerDraft.of();
        value.setDefaultShippingAddress(4);
        Assertions.assertThat(value.getDefaultShippingAddress()).isEqualTo(4);
    }

    @Test
    public void shippingAddresses() {
        CustomerDraft value = CustomerDraft.of();
        value.setShippingAddresses(Collections.singletonList(5));
        Assertions.assertThat(value.getShippingAddresses()).isEqualTo(Collections.singletonList(5));
    }

    @Test
    public void defaultBillingAddress() {
        CustomerDraft value = CustomerDraft.of();
        value.setDefaultBillingAddress(3);
        Assertions.assertThat(value.getDefaultBillingAddress()).isEqualTo(3);
    }

    @Test
    public void billingAddresses() {
        CustomerDraft value = CustomerDraft.of();
        value.setBillingAddresses(Collections.singletonList(7));
        Assertions.assertThat(value.getBillingAddresses()).isEqualTo(Collections.singletonList(7));
    }

    @Test
    public void isEmailVerified() {
        CustomerDraft value = CustomerDraft.of();
        value.setIsEmailVerified(true);
        Assertions.assertThat(value.getIsEmailVerified()).isEqualTo(true);
    }

    @Test
    public void customerGroup() {
        CustomerDraft value = CustomerDraft.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }

    @Test
    public void custom() {
        CustomerDraft value = CustomerDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void locale() {
        CustomerDraft value = CustomerDraft.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }

    @Test
    public void salutation() {
        CustomerDraft value = CustomerDraft.of();
        value.setSalutation("salutation");
        Assertions.assertThat(value.getSalutation()).isEqualTo("salutation");
    }

    @Test
    public void stores() {
        CustomerDraft value = CustomerDraft.of();
        value.setStores(
            Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
    }

    @Test
    public void authenticationMode() {
        CustomerDraft value = CustomerDraft.of();
        value.setAuthenticationMode(com.commercetools.api.models.customer.AuthenticationMode.findEnum("Password"));
        Assertions.assertThat(value.getAuthenticationMode())
                .isEqualTo(com.commercetools.api.models.customer.AuthenticationMode.findEnum("Password"));
    }

    @Test
    public void customerGroupAssignments() {
        CustomerDraft value = CustomerDraft.of();
        value.setCustomerGroupAssignments(
            Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl()));
        Assertions.assertThat(value.getCustomerGroupAssignments())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl()));
    }
}
