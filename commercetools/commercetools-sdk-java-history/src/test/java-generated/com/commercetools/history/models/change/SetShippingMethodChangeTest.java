
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
public class SetShippingMethodChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetShippingMethodChangeBuilder builder) {
        SetShippingMethodChange setShippingMethodChange = builder.buildUnchecked();
        Assertions.assertThat(setShippingMethodChange).isInstanceOf(SetShippingMethodChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetShippingMethodChange.builder().change("change") },
                new Object[] { SetShippingMethodChange.builder()
                        .previousValue(
                            new com.commercetools.history.models.change_value.ShippingMethodChangeValueImpl()) },
                new Object[] { SetShippingMethodChange.builder()
                        .nextValue(
                            new com.commercetools.history.models.change_value.ShippingMethodChangeValueImpl()) } };
    }

    @Test
    public void change() {
        SetShippingMethodChange value = SetShippingMethodChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetShippingMethodChange value = SetShippingMethodChange.of();
        value.setPreviousValue(new com.commercetools.history.models.change_value.ShippingMethodChangeValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ShippingMethodChangeValueImpl());
    }

    @Test
    public void nextValue() {
        SetShippingMethodChange value = SetShippingMethodChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.ShippingMethodChangeValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ShippingMethodChangeValueImpl());
    }
}
