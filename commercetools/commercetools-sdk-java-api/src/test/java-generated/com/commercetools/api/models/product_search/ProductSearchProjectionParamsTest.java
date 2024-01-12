
package com.commercetools.api.models.product_search;

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
public class ProductSearchProjectionParamsTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchProjectionParamsBuilder builder) {
        ProductSearchProjectionParams productSearchProjectionParams = builder.buildUnchecked();
        Assertions.assertThat(productSearchProjectionParams).isInstanceOf(ProductSearchProjectionParams.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchProjectionParams.builder().expand("expand") },
                new Object[] { ProductSearchProjectionParams.builder().staged(true) },
                new Object[] { ProductSearchProjectionParams.builder().priceCurrency("priceCurrency") },
                new Object[] { ProductSearchProjectionParams.builder().priceCountry("priceCountry") },
                new Object[] { ProductSearchProjectionParams.builder().priceCustomerGroup("priceCustomerGroup") },
                new Object[] { ProductSearchProjectionParams.builder().priceChannel("priceChannel") },
                new Object[] { ProductSearchProjectionParams.builder()
                        .localeProjection(Collections.singletonList("localeProjection")) },
                new Object[] { ProductSearchProjectionParams.builder().storeProjection("storeProjection") } };
    }

    @Test
    public void expand() {
        ProductSearchProjectionParams value = ProductSearchProjectionParams.of();
        value.setExpand("expand");
        Assertions.assertThat(value.getExpand()).isEqualTo("expand");
    }

    @Test
    public void staged() {
        ProductSearchProjectionParams value = ProductSearchProjectionParams.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void priceCurrency() {
        ProductSearchProjectionParams value = ProductSearchProjectionParams.of();
        value.setPriceCurrency("priceCurrency");
        Assertions.assertThat(value.getPriceCurrency()).isEqualTo("priceCurrency");
    }

    @Test
    public void priceCountry() {
        ProductSearchProjectionParams value = ProductSearchProjectionParams.of();
        value.setPriceCountry("priceCountry");
        Assertions.assertThat(value.getPriceCountry()).isEqualTo("priceCountry");
    }

    @Test
    public void priceCustomerGroup() {
        ProductSearchProjectionParams value = ProductSearchProjectionParams.of();
        value.setPriceCustomerGroup("priceCustomerGroup");
        Assertions.assertThat(value.getPriceCustomerGroup()).isEqualTo("priceCustomerGroup");
    }

    @Test
    public void priceChannel() {
        ProductSearchProjectionParams value = ProductSearchProjectionParams.of();
        value.setPriceChannel("priceChannel");
        Assertions.assertThat(value.getPriceChannel()).isEqualTo("priceChannel");
    }

    @Test
    public void localeProjection() {
        ProductSearchProjectionParams value = ProductSearchProjectionParams.of();
        value.setLocaleProjection(Collections.singletonList("localeProjection"));
        Assertions.assertThat(value.getLocaleProjection()).isEqualTo(Collections.singletonList("localeProjection"));
    }

    @Test
    public void storeProjection() {
        ProductSearchProjectionParams value = ProductSearchProjectionParams.of();
        value.setStoreProjection("storeProjection");
        Assertions.assertThat(value.getStoreProjection()).isEqualTo("storeProjection");
    }
}
