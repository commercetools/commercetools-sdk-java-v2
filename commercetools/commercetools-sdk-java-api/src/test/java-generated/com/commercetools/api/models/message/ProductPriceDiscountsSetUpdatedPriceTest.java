
package com.commercetools.api.models.message;

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
public class ProductPriceDiscountsSetUpdatedPriceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceDiscountsSetUpdatedPriceBuilder builder) {
        ProductPriceDiscountsSetUpdatedPrice productPriceDiscountsSetUpdatedPrice = builder.buildUnchecked();
        Assertions.assertThat(productPriceDiscountsSetUpdatedPrice)
                .isInstanceOf(ProductPriceDiscountsSetUpdatedPrice.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPriceDiscountsSetUpdatedPrice.builder().variantId(5) },
                new Object[] { ProductPriceDiscountsSetUpdatedPrice.builder().variantKey("variantKey") },
                new Object[] { ProductPriceDiscountsSetUpdatedPrice.builder().sku("sku") },
                new Object[] { ProductPriceDiscountsSetUpdatedPrice.builder().priceId("priceId") },
                new Object[] { ProductPriceDiscountsSetUpdatedPrice.builder()
                        .discounted(new com.commercetools.api.models.common.DiscountedPriceImpl()) },
                new Object[] { ProductPriceDiscountsSetUpdatedPrice.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductPriceDiscountsSetUpdatedPrice value = ProductPriceDiscountsSetUpdatedPrice.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }

    @Test
    public void variantKey() {
        ProductPriceDiscountsSetUpdatedPrice value = ProductPriceDiscountsSetUpdatedPrice.of();
        value.setVariantKey("variantKey");
        Assertions.assertThat(value.getVariantKey()).isEqualTo("variantKey");
    }

    @Test
    public void sku() {
        ProductPriceDiscountsSetUpdatedPrice value = ProductPriceDiscountsSetUpdatedPrice.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void priceId() {
        ProductPriceDiscountsSetUpdatedPrice value = ProductPriceDiscountsSetUpdatedPrice.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void discounted() {
        ProductPriceDiscountsSetUpdatedPrice value = ProductPriceDiscountsSetUpdatedPrice.of();
        value.setDiscounted(new com.commercetools.api.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.api.models.common.DiscountedPriceImpl());
    }

    @Test
    public void staged() {
        ProductPriceDiscountsSetUpdatedPrice value = ProductPriceDiscountsSetUpdatedPrice.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
