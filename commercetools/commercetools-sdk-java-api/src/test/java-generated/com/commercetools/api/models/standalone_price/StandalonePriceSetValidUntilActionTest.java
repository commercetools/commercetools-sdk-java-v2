
package com.commercetools.api.models.standalone_price;

import java.time.ZonedDateTime;

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
public class StandalonePriceSetValidUntilActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceSetValidUntilActionBuilder builder) {
        StandalonePriceSetValidUntilAction standalonePriceSetValidUntilAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceSetValidUntilAction)
                .isInstanceOf(StandalonePriceSetValidUntilAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                StandalonePriceSetValidUntilAction.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validUntil() {
        StandalonePriceSetValidUntilAction value = StandalonePriceSetValidUntilAction.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
