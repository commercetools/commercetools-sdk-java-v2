
package com.commercetools.history.models.change;

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
public class RemoveShippingAddressIdChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveShippingAddressIdChangeBuilder builder) {
        RemoveShippingAddressIdChange removeShippingAddressIdChange = builder.buildUnchecked();
        Assertions.assertThat(removeShippingAddressIdChange).isInstanceOf(RemoveShippingAddressIdChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveShippingAddressIdChange.builder().change("change") },
                new Object[] { RemoveShippingAddressIdChange.builder()
                        .previousValue(Collections.singletonList("previousValue")) },
                new Object[] {
                        RemoveShippingAddressIdChange.builder().nextValue(Collections.singletonList("nextValue")) },
                new Object[] { RemoveShippingAddressIdChange.builder()
                        .address(new com.commercetools.history.models.common.AddressImpl()) } };
    }

    @Test
    public void change() {
        RemoveShippingAddressIdChange value = RemoveShippingAddressIdChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveShippingAddressIdChange value = RemoveShippingAddressIdChange.of();
        value.setPreviousValue(Collections.singletonList("previousValue"));
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(Collections.singletonList("previousValue"));
    }

    @Test
    public void nextValue() {
        RemoveShippingAddressIdChange value = RemoveShippingAddressIdChange.of();
        value.setNextValue(Collections.singletonList("nextValue"));
        Assertions.assertThat(value.getNextValue()).isEqualTo(Collections.singletonList("nextValue"));
    }

    @Test
    public void address() {
        RemoveShippingAddressIdChange value = RemoveShippingAddressIdChange.of();
        value.setAddress(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }
}
