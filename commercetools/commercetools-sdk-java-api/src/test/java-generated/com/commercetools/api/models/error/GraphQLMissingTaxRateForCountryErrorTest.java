
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
public class GraphQLMissingTaxRateForCountryErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLMissingTaxRateForCountryErrorBuilder builder) {
        GraphQLMissingTaxRateForCountryError graphQLMissingTaxRateForCountryError = builder.buildUnchecked();
        Assertions.assertThat(graphQLMissingTaxRateForCountryError)
                .isInstanceOf(GraphQLMissingTaxRateForCountryError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { GraphQLMissingTaxRateForCountryError.builder().taxCategoryId("taxCategoryId") },
                new Object[] { GraphQLMissingTaxRateForCountryError.builder().country("country") },
                new Object[] { GraphQLMissingTaxRateForCountryError.builder().state("state") } };
    }

    @Test
    public void taxCategoryId() {
        GraphQLMissingTaxRateForCountryError value = GraphQLMissingTaxRateForCountryError.of();
        value.setTaxCategoryId("taxCategoryId");
        Assertions.assertThat(value.getTaxCategoryId()).isEqualTo("taxCategoryId");
    }

    @Test
    public void country() {
        GraphQLMissingTaxRateForCountryError value = GraphQLMissingTaxRateForCountryError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void state() {
        GraphQLMissingTaxRateForCountryError value = GraphQLMissingTaxRateForCountryError.of();
        value.setState("state");
        Assertions.assertThat(value.getState()).isEqualTo("state");
    }
}
