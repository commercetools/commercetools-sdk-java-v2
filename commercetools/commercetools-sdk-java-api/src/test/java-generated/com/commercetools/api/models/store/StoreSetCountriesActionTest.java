
package com.commercetools.api.models.store;

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
public class StoreSetCountriesActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreSetCountriesActionBuilder builder) {
        StoreSetCountriesAction storeSetCountriesAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetCountriesAction).isInstanceOf(StoreSetCountriesAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StoreSetCountriesAction.builder()
                .countries(
                    Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl())) } };
    }

    @Test
    public void countries() {
        StoreSetCountriesAction value = StoreSetCountriesAction.of();
        value.setCountries(
            Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
        Assertions.assertThat(value.getCountries())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
    }
}
