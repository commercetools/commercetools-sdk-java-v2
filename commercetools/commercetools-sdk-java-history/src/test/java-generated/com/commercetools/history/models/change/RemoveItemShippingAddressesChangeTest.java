
package com.commercetools.history.models.change;

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
public class RemoveItemShippingAddressesChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveItemShippingAddressesChangeBuilder builder) {
        RemoveItemShippingAddressesChange removeItemShippingAddressesChange = builder.buildUnchecked();
        Assertions.assertThat(removeItemShippingAddressesChange).isInstanceOf(RemoveItemShippingAddressesChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveItemShippingAddressesChange.builder().change("change") },
                new Object[] { RemoveItemShippingAddressesChange.builder()
                        .previousValue(new com.commercetools.history.models.common.AddressImpl()) },
                new Object[] { RemoveItemShippingAddressesChange.builder()
                        .nextValue(new com.commercetools.history.models.common.AddressImpl()) } };
    }

    @Test
    public void change() {
        RemoveItemShippingAddressesChange value = RemoveItemShippingAddressesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveItemShippingAddressesChange value = RemoveItemShippingAddressesChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }

    @Test
    public void nextValue() {
        RemoveItemShippingAddressesChange value = RemoveItemShippingAddressesChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }
}
