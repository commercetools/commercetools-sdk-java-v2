
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
public class AddAddressChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddAddressChangeBuilder builder) {
        AddAddressChange addAddressChange = builder.buildUnchecked();
        Assertions.assertThat(addAddressChange).isInstanceOf(AddAddressChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddAddressChange.builder().change("change") }, new Object[] {
                AddAddressChange.builder().nextValue(new com.commercetools.history.models.common.AddressImpl()) } };
    }

    @Test
    public void change() {
        AddAddressChange value = AddAddressChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddAddressChange value = AddAddressChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }
}
