
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
public class SetCustomShippingMethodChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetCustomShippingMethodChangeBuilder builder) {
        SetCustomShippingMethodChange setCustomShippingMethodChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomShippingMethodChange).isInstanceOf(SetCustomShippingMethodChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetCustomShippingMethodChange.builder().change("change") },
                new Object[] { SetCustomShippingMethodChange.builder()
                        .previousValue(
                            new com.commercetools.history.models.change_value.CustomShippingMethodChangeValueImpl()) },
                new Object[] { SetCustomShippingMethodChange.builder()
                        .nextValue(
                            new com.commercetools.history.models.change_value.CustomShippingMethodChangeValueImpl()) } };
    }

    @Test
    public void change() {
        SetCustomShippingMethodChange value = SetCustomShippingMethodChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomShippingMethodChange value = SetCustomShippingMethodChange.of();
        value.setPreviousValue(new com.commercetools.history.models.change_value.CustomShippingMethodChangeValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.CustomShippingMethodChangeValueImpl());
    }

    @Test
    public void nextValue() {
        SetCustomShippingMethodChange value = SetCustomShippingMethodChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.CustomShippingMethodChangeValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.CustomShippingMethodChangeValueImpl());
    }
}
