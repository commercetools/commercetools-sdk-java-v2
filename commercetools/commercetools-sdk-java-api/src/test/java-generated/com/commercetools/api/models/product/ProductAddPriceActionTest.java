
package com.commercetools.api.models.product;

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
public class ProductAddPriceActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductAddPriceActionBuilder builder) {
        ProductAddPriceAction productAddPriceAction = builder.buildUnchecked();
        Assertions.assertThat(productAddPriceAction).isInstanceOf(ProductAddPriceAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductAddPriceAction.builder().variantId(5L) },
                new Object[] { ProductAddPriceAction.builder().sku("sku") },
                new Object[] { ProductAddPriceAction.builder()
                        .price(new com.commercetools.api.models.common.PriceDraftImpl()) },
                new Object[] { ProductAddPriceAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductAddPriceAction value = ProductAddPriceAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductAddPriceAction value = ProductAddPriceAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void price() {
        ProductAddPriceAction value = ProductAddPriceAction.of();
        value.setPrice(new com.commercetools.api.models.common.PriceDraftImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.PriceDraftImpl());
    }

    @Test
    public void staged() {
        ProductAddPriceAction value = ProductAddPriceAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
