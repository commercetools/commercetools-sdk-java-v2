
package com.commercetools.history.models.change_value;

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
public class SetCartClassificationShippingRateInputValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetCartClassificationShippingRateInputValueBuilder builder) {
        SetCartClassificationShippingRateInputValue setCartClassificationShippingRateInputValue = builder
                .buildUnchecked();
        Assertions.assertThat(setCartClassificationShippingRateInputValue)
                .isInstanceOf(SetCartClassificationShippingRateInputValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetCartClassificationShippingRateInputValue.builder().type("type") },
                new Object[] { SetCartClassificationShippingRateInputValue.builder().key("key") },
                new Object[] { SetCartClassificationShippingRateInputValue.builder()
                        .label(new com.commercetools.history.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void type() {
        SetCartClassificationShippingRateInputValue value = SetCartClassificationShippingRateInputValue.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }

    @Test
    public void key() {
        SetCartClassificationShippingRateInputValue value = SetCartClassificationShippingRateInputValue.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void label() {
        SetCartClassificationShippingRateInputValue value = SetCartClassificationShippingRateInputValue.of();
        value.setLabel(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }
}
