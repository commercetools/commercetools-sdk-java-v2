
package com.commercetools.api.models.store;

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
public class StoreRemoveCountryActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreRemoveCountryActionBuilder builder) {
        StoreRemoveCountryAction storeRemoveCountryAction = builder.buildUnchecked();
        Assertions.assertThat(storeRemoveCountryAction).isInstanceOf(StoreRemoveCountryAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StoreRemoveCountryAction.builder()
                .country(new com.commercetools.api.models.store_country.StoreCountryImpl()) } };
    }

    @Test
    public void country() {
        StoreRemoveCountryAction value = StoreRemoveCountryAction.of();
        value.setCountry(new com.commercetools.api.models.store_country.StoreCountryImpl());
        Assertions.assertThat(value.getCountry())
                .isEqualTo(new com.commercetools.api.models.store_country.StoreCountryImpl());
    }
}
