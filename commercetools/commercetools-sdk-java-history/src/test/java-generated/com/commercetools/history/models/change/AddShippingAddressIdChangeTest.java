
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
public class AddShippingAddressIdChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddShippingAddressIdChangeBuilder builder) {
        AddShippingAddressIdChange addShippingAddressIdChange = builder.buildUnchecked();
        Assertions.assertThat(addShippingAddressIdChange).isInstanceOf(AddShippingAddressIdChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddShippingAddressIdChange.builder().change("change") },
                new Object[] { AddShippingAddressIdChange.builder()
                        .previousValue(Collections.singletonList("previousValue")) },
                new Object[] { AddShippingAddressIdChange.builder().nextValue(Collections.singletonList("nextValue")) },
                new Object[] { AddShippingAddressIdChange.builder()
                        .address(new com.commercetools.history.models.common.AddressImpl()) } };
    }

    @Test
    public void change() {
        AddShippingAddressIdChange value = AddShippingAddressIdChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddShippingAddressIdChange value = AddShippingAddressIdChange.of();
        value.setPreviousValue(Collections.singletonList("previousValue"));
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(Collections.singletonList("previousValue"));
    }

    @Test
    public void nextValue() {
        AddShippingAddressIdChange value = AddShippingAddressIdChange.of();
        value.setNextValue(Collections.singletonList("nextValue"));
        Assertions.assertThat(value.getNextValue()).isEqualTo(Collections.singletonList("nextValue"));
    }

    @Test
    public void address() {
        AddShippingAddressIdChange value = AddShippingAddressIdChange.of();
        value.setAddress(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }
}
