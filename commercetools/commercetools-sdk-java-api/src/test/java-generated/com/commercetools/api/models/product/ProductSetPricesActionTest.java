
package com.commercetools.api.models.product;

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
public class ProductSetPricesActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSetPricesActionBuilder builder) {
        ProductSetPricesAction productSetPricesAction = builder.buildUnchecked();
        Assertions.assertThat(productSetPricesAction).isInstanceOf(ProductSetPricesAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSetPricesAction.builder().variantId(5L) },
                new Object[] { ProductSetPricesAction.builder().sku("sku") },
                new Object[] { ProductSetPricesAction.builder()
                        .prices(Collections.singletonList(new com.commercetools.api.models.common.PriceDraftImpl())) },
                new Object[] { ProductSetPricesAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductSetPricesAction value = ProductSetPricesAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductSetPricesAction value = ProductSetPricesAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void prices() {
        ProductSetPricesAction value = ProductSetPricesAction.of();
        value.setPrices(Collections.singletonList(new com.commercetools.api.models.common.PriceDraftImpl()));
        Assertions.assertThat(value.getPrices())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceDraftImpl()));
    }

    @Test
    public void staged() {
        ProductSetPricesAction value = ProductSetPricesAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
