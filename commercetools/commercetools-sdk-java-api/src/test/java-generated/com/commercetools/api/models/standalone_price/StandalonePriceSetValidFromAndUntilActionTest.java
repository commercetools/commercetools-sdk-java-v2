
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
public class StandalonePriceSetValidFromAndUntilActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceSetValidFromAndUntilActionBuilder builder) {
        StandalonePriceSetValidFromAndUntilAction standalonePriceSetValidFromAndUntilAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceSetValidFromAndUntilAction)
                .isInstanceOf(StandalonePriceSetValidFromAndUntilAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StandalonePriceSetValidFromAndUntilAction.builder()
                        .validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { StandalonePriceSetValidFromAndUntilAction.builder()
                        .validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validFrom() {
        StandalonePriceSetValidFromAndUntilAction value = StandalonePriceSetValidFromAndUntilAction.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        StandalonePriceSetValidFromAndUntilAction value = StandalonePriceSetValidFromAndUntilAction.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
