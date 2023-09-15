
package com.commercetools.api.models.project;

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
public class CartsConfigurationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartsConfigurationBuilder builder) {
        CartsConfiguration cartsConfiguration = builder.buildUnchecked();
        Assertions.assertThat(cartsConfiguration).isInstanceOf(CartsConfiguration.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartsConfiguration.builder().deleteDaysAfterLastModification(3L) },
                new Object[] { CartsConfiguration.builder().countryTaxRateFallbackEnabled(true) } };
    }

    @Test
    public void deleteDaysAfterLastModification() {
        CartsConfiguration value = CartsConfiguration.of();
        value.setDeleteDaysAfterLastModification(3L);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3L);
    }

    @Test
    public void countryTaxRateFallbackEnabled() {
        CartsConfiguration value = CartsConfiguration.of();
        value.setCountryTaxRateFallbackEnabled(true);
        Assertions.assertThat(value.getCountryTaxRateFallbackEnabled()).isEqualTo(true);
    }
}
