
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
public class StandalonePriceValueChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceValueChangedMessageBuilder builder) {
        StandalonePriceValueChangedMessage standalonePriceValueChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceValueChangedMessage)
                .isInstanceOf(StandalonePriceValueChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StandalonePriceValueChangedMessage.builder()
                        .value(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { StandalonePriceValueChangedMessage.builder().staged(true) },
                new Object[] { StandalonePriceValueChangedMessage.builder()
                        .oldValue(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void value() {
        StandalonePriceValueChangedMessage value = StandalonePriceValueChangedMessage.of();
        value.setValue(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void staged() {
        StandalonePriceValueChangedMessage value = StandalonePriceValueChangedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void oldValue() {
        StandalonePriceValueChangedMessage value = StandalonePriceValueChangedMessage.of();
        value.setOldValue(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getOldValue()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
