
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
public class StandalonePriceSetValidFromActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceSetValidFromActionBuilder builder) {
        StandalonePriceSetValidFromAction standalonePriceSetValidFromAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceSetValidFromAction).isInstanceOf(StandalonePriceSetValidFromAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                StandalonePriceSetValidFromAction.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validFrom() {
        StandalonePriceSetValidFromAction value = StandalonePriceSetValidFromAction.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
