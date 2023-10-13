
package com.commercetools.api.models.message;

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
public class StoreCountriesChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreCountriesChangedMessagePayloadBuilder builder) {
        StoreCountriesChangedMessagePayload storeCountriesChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(storeCountriesChangedMessagePayload)
                .isInstanceOf(StoreCountriesChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StoreCountriesChangedMessagePayload.builder()
                        .addedCountries(Collections
                                .singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl())) },
                new Object[] { StoreCountriesChangedMessagePayload.builder()
                        .removedCountries(Collections
                                .singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl())) } };
    }

    @Test
    public void addedCountries() {
        StoreCountriesChangedMessagePayload value = StoreCountriesChangedMessagePayload.of();
        value.setAddedCountries(
            Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
        Assertions.assertThat(value.getAddedCountries())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
    }

    @Test
    public void removedCountries() {
        StoreCountriesChangedMessagePayload value = StoreCountriesChangedMessagePayload.of();
        value.setRemovedCountries(
            Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
        Assertions.assertThat(value.getRemovedCountries())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
    }
}
