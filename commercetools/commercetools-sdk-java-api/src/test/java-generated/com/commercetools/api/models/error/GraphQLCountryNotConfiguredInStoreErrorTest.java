
package com.commercetools.api.models.error;

import java.util.Collections;

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
public class GraphQLCountryNotConfiguredInStoreErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLCountryNotConfiguredInStoreErrorBuilder builder) {
        GraphQLCountryNotConfiguredInStoreError graphQLCountryNotConfiguredInStoreError = builder.buildUnchecked();
        Assertions.assertThat(graphQLCountryNotConfiguredInStoreError)
                .isInstanceOf(GraphQLCountryNotConfiguredInStoreError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { GraphQLCountryNotConfiguredInStoreError.builder()
                        .storeCountries(Collections.singletonList("storeCountries")) },
                new Object[] { GraphQLCountryNotConfiguredInStoreError.builder().country("country") } };
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
