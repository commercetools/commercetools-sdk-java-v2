
package com.commercetools.api.models.me;

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
public class MyCustomerDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCustomerDraftBuilder builder) {
        MyCustomerDraft myCustomerDraft = builder.buildUnchecked();
        Assertions.assertThat(myCustomerDraft).isInstanceOf(MyCustomerDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCustomerDraft.builder().email("email") },
                new Object[] { MyCustomerDraft.builder().password("password") },
                new Object[] { MyCustomerDraft.builder().firstName("firstName") },
                new Object[] { MyCustomerDraft.builder().lastName("lastName") },
                new Object[] { MyCustomerDraft.builder().middleName("middleName") },
                new Object[] { MyCustomerDraft.builder().title("title") },
                new Object[] { MyCustomerDraft.builder().salutation("salutation") },
                new Object[] { MyCustomerDraft.builder().dateOfBirth(LocalDate.parse("2023-06-01")) },
                new Object[] { MyCustomerDraft.builder().companyName("companyName") },
                new Object[] { MyCustomerDraft.builder().vatId("vatId") },
                new Object[] {
                        MyCustomerDraft.builder()
                                .addresses(Collections
                                        .singletonList(new com.commercetools.api.models.common.BaseAddressImpl())) },
                new Object[] { MyCustomerDraft.builder().defaultShippingAddress(4L) },
                new Object[] { MyCustomerDraft.builder().defaultBillingAddress(3L) },
                new Object[] { MyCustomerDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { MyCustomerDraft.builder().locale("locale") },
                new Object[] { MyCustomerDraft.builder()
                        .stores(Collections.singletonList(
                            new com.commercetools.api.models.store.StoreResourceIdentifierImpl())) } };
    }

    @Test
    public void email() {
        MyCustomerDraft value = MyCustomerDraft.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }

    @Test
    public void password() {
        MyCustomerDraft value = MyCustomerDraft.of();
        value.setPassword("password");
        Assertions.assertThat(value.getPassword()).isEqualTo("password");
    }

    @Test
    public void firstName() {
        MyCustomerDraft value = MyCustomerDraft.of();
        value.setFirstName("firstName");
        Assertions.assertThat(value.getFirstName()).isEqualTo("firstName");
    }

    @Test
    public void lastName() {
        MyCustomerDraft value = MyCustomerDraft.of();
        value.setLastName("lastName");
        Assertions.assertThat(value.getLastName()).isEqualTo("lastName");
    }

    @Test
    public void middleName() {
        MyCustomerDraft value = MyCustomerDraft.of();
        value.setMiddleName("middleName");
        Assertions.assertThat(value.getMiddleName()).isEqualTo("middleName");
    }

    @Test
    public void title() {
        MyCustomerDraft value = MyCustomerDraft.of();
        value.setTitle("title");
        Assertions.assertThat(value.getTitle()).isEqualTo("title");
    }

    @Test
    public void salutation() {
        MyCustomerDraft value = MyCustomerDraft.of();
        value.setSalutation("salutation");
        Assertions.assertThat(value.getSalutation()).isEqualTo("salutation");
    }

    @Test
    public void dateOfBirth() {
        MyCustomerDraft value = MyCustomerDraft.of();
        value.setDateOfBirth(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getDateOfBirth()).isEqualTo(LocalDate.parse("2023-06-01"));
    }

    @Test
    public void companyName() {
        MyCustomerDraft value = MyCustomerDraft.of();
        value.setCompanyName("companyName");
        Assertions.assertThat(value.getCompanyName()).isEqualTo("companyName");
    }

    @Test
    public void vatId() {
        MyCustomerDraft value = MyCustomerDraft.of();
        value.setVatId("vatId");
        Assertions.assertThat(value.getVatId()).isEqualTo("vatId");
    }

    @Test
    public void addresses() {
        MyCustomerDraft value = MyCustomerDraft.of();
        value.setAddresses(Collections.singletonList(new com.commercetools.api.models.common.BaseAddressImpl()));
        Assertions.assertThat(value.getAddresses())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.BaseAddressImpl()));
    }

    @Test
    public void defaultShippingAddress() {
        MyCustomerDraft value = MyCustomerDraft.of();
        value.setDefaultShippingAddress(4L);
        Assertions.assertThat(value.getDefaultShippingAddress()).isEqualTo(4L);
    }

    @Test
    public void defaultBillingAddress() {
        MyCustomerDraft value = MyCustomerDraft.of();
        value.setDefaultBillingAddress(3L);
        Assertions.assertThat(value.getDefaultBillingAddress()).isEqualTo(3L);
    }

    @Test
    public void custom() {
        MyCustomerDraft value = MyCustomerDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void locale() {
        MyCustomerDraft value = MyCustomerDraft.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }

    @Test
    public void stores() {
        MyCustomerDraft value = MyCustomerDraft.of();
        value.setStores(
            Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
    }
}
