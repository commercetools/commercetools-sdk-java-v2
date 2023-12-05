
package com.commercetools.api.models.error;

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
public class MissingTaxRateForCountryErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MissingTaxRateForCountryErrorBuilder builder) {
        MissingTaxRateForCountryError missingTaxRateForCountryError = builder.buildUnchecked();
        Assertions.assertThat(missingTaxRateForCountryError).isInstanceOf(MissingTaxRateForCountryError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MissingTaxRateForCountryError.builder().message("message") },
                new Object[] { MissingTaxRateForCountryError.builder().taxCategoryId("taxCategoryId") },
                new Object[] { MissingTaxRateForCountryError.builder().country("country") },
                new Object[] { MissingTaxRateForCountryError.builder().state("state") } };
    }

    @Test
    public void message() {
        MissingTaxRateForCountryError value = MissingTaxRateForCountryError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void taxCategoryId() {
        MissingTaxRateForCountryError value = MissingTaxRateForCountryError.of();
        value.setTaxCategoryId("taxCategoryId");
        Assertions.assertThat(value.getTaxCategoryId()).isEqualTo("taxCategoryId");
    }

    @Test
    public void country() {
        MissingTaxRateForCountryError value = MissingTaxRateForCountryError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void state() {
        MissingTaxRateForCountryError value = MissingTaxRateForCountryError.of();
        value.setState("state");
        Assertions.assertThat(value.getState()).isEqualTo("state");
    }
}
