
package com.commercetools.api.models.message;

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
public class StandalonePriceValueChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceValueChangedMessagePayloadBuilder builder) {
        StandalonePriceValueChangedMessagePayload standalonePriceValueChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceValueChangedMessagePayload)
                .isInstanceOf(StandalonePriceValueChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StandalonePriceValueChangedMessagePayload.builder()
                        .value(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { StandalonePriceValueChangedMessagePayload.builder().staged(true) },
                new Object[] { StandalonePriceValueChangedMessagePayload.builder()
                        .oldValue(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void value() {
        StandalonePriceValueChangedMessagePayload value = StandalonePriceValueChangedMessagePayload.of();
        value.setValue(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void staged() {
        StandalonePriceValueChangedMessagePayload value = StandalonePriceValueChangedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void oldValue() {
        StandalonePriceValueChangedMessagePayload value = StandalonePriceValueChangedMessagePayload.of();
        value.setOldValue(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getOldValue()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
