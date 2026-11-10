
package com.commercetools.api.models.product_search;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchProjectionParamsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchProjectionParamsBuilder builder) {
        ProductSearchProjectionParams productSearchProjectionParams = builder.buildUnchecked();
        Assertions.assertThat(productSearchProjectionParams).isInstanceOf(ProductSearchProjectionParams.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "expand",
                        ProductSearchProjectionParams.builder().expand(Collections.singletonList("expand")) },
                new Object[] { "staged", ProductSearchProjectionParams.builder().staged(true) },
                new Object[] { "priceCurrency",
                        ProductSearchProjectionParams.builder().priceCurrency("priceCurrency") },
                new Object[] { "priceCountry", ProductSearchProjectionParams.builder().priceCountry("priceCountry") },
                new Object[] { "priceCustomerGroup",
                        ProductSearchProjectionParams.builder().priceCustomerGroup("priceCustomerGroup") },
                new Object[] { "priceCustomerGroupAssignments", ProductSearchProjectionParams.builder()
                        .priceCustomerGroupAssignments(Collections.singletonList("priceCustomerGroupAssignments")) },
                new Object[] { "priceChannel", ProductSearchProjectionParams.builder().priceChannel("priceChannel") },
                new Object[] { "localeProjection",
                        ProductSearchProjectionParams.builder()
                                .localeProjection(Collections.singletonList("localeProjection")) },
                new Object[] { "storeProjection",
                        ProductSearchProjectionParams.builder().storeProjection("storeProjection") } };
    }

    @Test
    public void expand() {
        ProductSearchProjectionParams value = ProductSearchProjectionParams.of();
        value.setExpand(Collections.singletonList("expand"));
        Assertions.assertThat(value.getExpand()).isEqualTo(Collections.singletonList("expand"));
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
    public void priceCustomerGroupAssignments() {
        ProductSearchProjectionParams value = ProductSearchProjectionParams.of();
        value.setPriceCustomerGroupAssignments(Collections.singletonList("priceCustomerGroupAssignments"));
        Assertions.assertThat(value.getPriceCustomerGroupAssignments())
                .isEqualTo(Collections.singletonList("priceCustomerGroupAssignments"));
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
