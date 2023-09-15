
package com.commercetools.api.models.standalone_price;

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
public class StandalonePriceChangeValueActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceChangeValueActionBuilder builder) {
        StandalonePriceChangeValueAction standalonePriceChangeValueAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceChangeValueAction).isInstanceOf(StandalonePriceChangeValueAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StandalonePriceChangeValueAction.builder()
                        .value(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { StandalonePriceChangeValueAction.builder().staged(true) } };
    }

    @Test
    public void value() {
        StandalonePriceChangeValueAction value = StandalonePriceChangeValueAction.of();
        value.setValue(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void staged() {
        StandalonePriceChangeValueAction value = StandalonePriceChangeValueAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
