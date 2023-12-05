
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
public class CountryNotConfiguredInStoreErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CountryNotConfiguredInStoreErrorBuilder builder) {
        CountryNotConfiguredInStoreError countryNotConfiguredInStoreError = builder.buildUnchecked();
        Assertions.assertThat(countryNotConfiguredInStoreError).isInstanceOf(CountryNotConfiguredInStoreError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CountryNotConfiguredInStoreError.builder().message("message") },
                new Object[] { CountryNotConfiguredInStoreError.builder()
                        .storeCountries(Collections.singletonList("storeCountries")) },
                new Object[] { CountryNotConfiguredInStoreError.builder().country("country") } };
    }

    @Test
    public void message() {
        CountryNotConfiguredInStoreError value = CountryNotConfiguredInStoreError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void storeCountries() {
        CountryNotConfiguredInStoreError value = CountryNotConfiguredInStoreError.of();
        value.setStoreCountries(Collections.singletonList("storeCountries"));
        Assertions.assertThat(value.getStoreCountries()).isEqualTo(Collections.singletonList("storeCountries"));
    }

    @Test
    public void country() {
        CountryNotConfiguredInStoreError value = CountryNotConfiguredInStoreError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }
}
