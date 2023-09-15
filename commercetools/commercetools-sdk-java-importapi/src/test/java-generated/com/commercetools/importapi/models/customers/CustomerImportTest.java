
package com.commercetools.importapi.models.customers;

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
public class CustomerImportTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerImportBuilder builder) {
        CustomerImport customerImport = builder.buildUnchecked();
        Assertions.assertThat(customerImport).isInstanceOf(CustomerImport.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerImport.builder().customerNumber("customerNumber") },
                new Object[] { CustomerImport.builder().email("email") },
                new Object[] { CustomerImport.builder().password("password") },
                new Object[] { CustomerImport.builder()
                        .stores(Collections.singletonList(
                            new com.commercetools.importapi.models.common.StoreKeyReferenceImpl())) },
                new Object[] { CustomerImport.builder().firstName("firstName") },
                new Object[] { CustomerImport.builder().lastName("lastName") },
                new Object[] { CustomerImport.builder().middleName("middleName") },
                new Object[] { CustomerImport.builder().title("title") },
                new Object[] { CustomerImport.builder().salutation("salutation") },
                new Object[] { CustomerImport.builder().externalId("externalId") },
                new Object[] { CustomerImport.builder().dateOfBirth(LocalDate.parse("2023-06-01")) },
                new Object[] { CustomerImport.builder().companyName("companyName") },
                new Object[] { CustomerImport.builder().vatId("vatId") },
                new Object[] { CustomerImport.builder().isEmailVerified(true) },
                new Object[] { CustomerImport.builder()
                        .customerGroup(new com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl()) },
                new Object[] { CustomerImport.builder()
                        .addresses(Collections.singletonList(
                            new com.commercetools.importapi.models.customers.CustomerAddressImpl())) },
                new Object[] { CustomerImport.builder().defaultBillingAddress(3) },
                new Object[] { CustomerImport.builder().billingAddresses(Collections.singletonList(7)) },
                new Object[] { CustomerImport.builder().defaultShippingAddress(4) },
                new Object[] { CustomerImport.builder().shippingAddresses(Collections.singletonList(5)) },
                new Object[] { CustomerImport.builder().locale("locale") },
                new Object[] { CustomerImport.builder()
                        .custom(new com.commercetools.importapi.models.customfields.CustomImpl()) },
                new Object[] { CustomerImport.builder()
                        .authenticationMode(
                            com.commercetools.importapi.models.customers.AuthenticationMode.findEnum("Password")) } };
    }

    @Test
    public void customerNumber() {
        CustomerImport value = CustomerImport.of();
        value.setCustomerNumber("customerNumber");
        Assertions.assertThat(value.getCustomerNumber()).isEqualTo("customerNumber");
    }

    @Test
    public void email() {
        CustomerImport value = CustomerImport.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }

    @Test
    public void password() {
        CustomerImport value = CustomerImport.of();
        value.setPassword("password");
        Assertions.assertThat(value.getPassword()).isEqualTo("password");
    }

    @Test
    public void stores() {
        CustomerImport value = CustomerImport.of();
        value.setStores(
            Collections.singletonList(new com.commercetools.importapi.models.common.StoreKeyReferenceImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.common.StoreKeyReferenceImpl()));
    }

    @Test
    public void firstName() {
        CustomerImport value = CustomerImport.of();
        value.setFirstName("firstName");
        Assertions.assertThat(value.getFirstName()).isEqualTo("firstName");
    }

    @Test
    public void lastName() {
        CustomerImport value = CustomerImport.of();
        value.setLastName("lastName");
        Assertions.assertThat(value.getLastName()).isEqualTo("lastName");
    }

    @Test
    public void middleName() {
        CustomerImport value = CustomerImport.of();
        value.setMiddleName("middleName");
        Assertions.assertThat(value.getMiddleName()).isEqualTo("middleName");
    }

    @Test
    public void title() {
        CustomerImport value = CustomerImport.of();
        value.setTitle("title");
        Assertions.assertThat(value.getTitle()).isEqualTo("title");
    }

    @Test
    public void salutation() {
        CustomerImport value = CustomerImport.of();
        value.setSalutation("salutation");
        Assertions.assertThat(value.getSalutation()).isEqualTo("salutation");
    }

    @Test
    public void externalId() {
        CustomerImport value = CustomerImport.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }

    @Test
    public void dateOfBirth() {
        CustomerImport value = CustomerImport.of();
        value.setDateOfBirth(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getDateOfBirth()).isEqualTo(LocalDate.parse("2023-06-01"));
    }

    @Test
    public void companyName() {
        CustomerImport value = CustomerImport.of();
        value.setCompanyName("companyName");
        Assertions.assertThat(value.getCompanyName()).isEqualTo("companyName");
    }

    @Test
    public void vatId() {
        CustomerImport value = CustomerImport.of();
        value.setVatId("vatId");
        Assertions.assertThat(value.getVatId()).isEqualTo("vatId");
    }

    @Test
    public void isEmailVerified() {
        CustomerImport value = CustomerImport.of();
        value.setIsEmailVerified(true);
        Assertions.assertThat(value.getIsEmailVerified()).isEqualTo(true);
    }

    @Test
    public void customerGroup() {
        CustomerImport value = CustomerImport.of();
        value.setCustomerGroup(new com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.importapi.models.common.CustomerGroupKeyReferenceImpl());
    }

    @Test
    public void addresses() {
        CustomerImport value = CustomerImport.of();
        value.setAddresses(
            Collections.singletonList(new com.commercetools.importapi.models.customers.CustomerAddressImpl()));
        Assertions.assertThat(value.getAddresses())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.customers.CustomerAddressImpl()));
    }

    @Test
    public void defaultBillingAddress() {
        CustomerImport value = CustomerImport.of();
        value.setDefaultBillingAddress(3);
        Assertions.assertThat(value.getDefaultBillingAddress()).isEqualTo(3);
    }

    @Test
    public void billingAddresses() {
        CustomerImport value = CustomerImport.of();
        value.setBillingAddresses(Collections.singletonList(7));
        Assertions.assertThat(value.getBillingAddresses()).isEqualTo(Collections.singletonList(7));
    }

    @Test
    public void defaultShippingAddress() {
        CustomerImport value = CustomerImport.of();
        value.setDefaultShippingAddress(4);
        Assertions.assertThat(value.getDefaultShippingAddress()).isEqualTo(4);
    }

    @Test
    public void shippingAddresses() {
        CustomerImport value = CustomerImport.of();
        value.setShippingAddresses(Collections.singletonList(5));
        Assertions.assertThat(value.getShippingAddresses()).isEqualTo(Collections.singletonList(5));
    }

    @Test
    public void locale() {
        CustomerImport value = CustomerImport.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }

    @Test
    public void custom() {
        CustomerImport value = CustomerImport.of();
        value.setCustom(new com.commercetools.importapi.models.customfields.CustomImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.importapi.models.customfields.CustomImpl());
    }

    @Test
    public void authenticationMode() {
        CustomerImport value = CustomerImport.of();
        value.setAuthenticationMode(
            com.commercetools.importapi.models.customers.AuthenticationMode.findEnum("Password"));
        Assertions.assertThat(value.getAuthenticationMode())
                .isEqualTo(com.commercetools.importapi.models.customers.AuthenticationMode.findEnum("Password"));
    }
}
