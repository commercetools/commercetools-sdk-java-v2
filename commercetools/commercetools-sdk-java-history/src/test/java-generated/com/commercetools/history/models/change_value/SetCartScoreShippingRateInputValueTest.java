
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
public class SetCartScoreShippingRateInputValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetCartScoreShippingRateInputValueBuilder builder) {
        SetCartScoreShippingRateInputValue setCartScoreShippingRateInputValue = builder.buildUnchecked();
        Assertions.assertThat(setCartScoreShippingRateInputValue)
                .isInstanceOf(SetCartScoreShippingRateInputValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetCartScoreShippingRateInputValue.builder().type("type") },
                new Object[] { SetCartScoreShippingRateInputValue.builder().score(9) } };
    }

    @Test
    public void type() {
        SetCartScoreShippingRateInputValue value = SetCartScoreShippingRateInputValue.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }

    @Test
    public void score() {
        SetCartScoreShippingRateInputValue value = SetCartScoreShippingRateInputValue.of();
        value.setScore(9);
        Assertions.assertThat(value.getScore()).isEqualTo(9);
    }
}
