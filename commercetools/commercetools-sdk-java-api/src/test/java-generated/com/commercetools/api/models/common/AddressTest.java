
package com.commercetools.api.models.common;

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
public class AddressTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddressBuilder builder) {
        Address address = builder.buildUnchecked();
        Assertions.assertThat(address).isInstanceOf(Address.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { Address.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { Address.builder().id("id") } };
    }

    @Test
    public void custom() {
        Address value = Address.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void id() {
        Address value = Address.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
