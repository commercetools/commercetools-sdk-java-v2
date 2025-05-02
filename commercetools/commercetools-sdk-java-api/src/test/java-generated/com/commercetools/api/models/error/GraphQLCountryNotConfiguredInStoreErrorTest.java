
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLCountryNotConfiguredInStoreErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLCountryNotConfiguredInStoreErrorBuilder builder) {
        GraphQLCountryNotConfiguredInStoreError graphQLCountryNotConfiguredInStoreError = builder.buildUnchecked();
        Assertions.assertThat(graphQLCountryNotConfiguredInStoreError)
                .isInstanceOf(GraphQLCountryNotConfiguredInStoreError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "storeCountries",
                        GraphQLCountryNotConfiguredInStoreError.builder()
                                .storeCountries(Collections.singletonList("storeCountries")) },
                new Object[] { "country", GraphQLCountryNotConfiguredInStoreError.builder().country("country") } };
    }

    @Test
    public void storeCountries() {
        GraphQLCountryNotConfiguredInStoreError value = GraphQLCountryNotConfiguredInStoreError.of();
        value.setStoreCountries(Collections.singletonList("storeCountries"));
        Assertions.assertThat(value.getStoreCountries()).isEqualTo(Collections.singletonList("storeCountries"));
    }

    @Test
    public void country() {
        GraphQLCountryNotConfiguredInStoreError value = GraphQLCountryNotConfiguredInStoreError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }
}
