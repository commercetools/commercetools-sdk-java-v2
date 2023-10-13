
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
public class StoreCountriesChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreCountriesChangedMessageBuilder builder) {
        StoreCountriesChangedMessage storeCountriesChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(storeCountriesChangedMessage).isInstanceOf(StoreCountriesChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StoreCountriesChangedMessage.builder()
                        .addedCountries(Collections
                                .singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl())) },
                new Object[] { StoreCountriesChangedMessage.builder()
                        .removedCountries(Collections
                                .singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl())) } };
    }

    @Test
    public void addedCountries() {
        StoreCountriesChangedMessage value = StoreCountriesChangedMessage.of();
        value.setAddedCountries(
            Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
        Assertions.assertThat(value.getAddedCountries())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
    }

    @Test
    public void removedCountries() {
        StoreCountriesChangedMessage value = StoreCountriesChangedMessage.of();
        value.setRemovedCountries(
            Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
        Assertions.assertThat(value.getRemovedCountries())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
    }
}
