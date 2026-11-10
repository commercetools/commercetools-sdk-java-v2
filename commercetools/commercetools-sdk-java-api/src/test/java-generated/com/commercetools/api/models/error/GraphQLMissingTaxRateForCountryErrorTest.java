
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLMissingTaxRateForCountryErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLMissingTaxRateForCountryErrorBuilder builder) {
        GraphQLMissingTaxRateForCountryError graphQLMissingTaxRateForCountryError = builder.buildUnchecked();
        Assertions.assertThat(graphQLMissingTaxRateForCountryError)
                .isInstanceOf(GraphQLMissingTaxRateForCountryError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "taxCategoryId",
                        GraphQLMissingTaxRateForCountryError.builder().taxCategoryId("taxCategoryId") },
                new Object[] { "country", GraphQLMissingTaxRateForCountryError.builder().country("country") },
                new Object[] { "state", GraphQLMissingTaxRateForCountryError.builder().state("state") } };
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
