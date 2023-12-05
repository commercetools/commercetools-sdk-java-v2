
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
public class SetAddressCustomTypeChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetAddressCustomTypeChangeBuilder builder) {
        SetAddressCustomTypeChange setAddressCustomTypeChange = builder.buildUnchecked();
        Assertions.assertThat(setAddressCustomTypeChange).isInstanceOf(SetAddressCustomTypeChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetAddressCustomTypeChange.builder().change("change") },
                new Object[] { SetAddressCustomTypeChange.builder()
                        .address(new com.commercetools.history.models.common.AddressImpl()) },
                new Object[] { SetAddressCustomTypeChange.builder()
                        .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { SetAddressCustomTypeChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) } };
    }

    @Test
    public void change() {
        SetAddressCustomTypeChange value = SetAddressCustomTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void address() {
        SetAddressCustomTypeChange value = SetAddressCustomTypeChange.of();
        value.setAddress(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }

    @Test
    public void previousValue() {
        SetAddressCustomTypeChange value = SetAddressCustomTypeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetAddressCustomTypeChange value = SetAddressCustomTypeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }
}
