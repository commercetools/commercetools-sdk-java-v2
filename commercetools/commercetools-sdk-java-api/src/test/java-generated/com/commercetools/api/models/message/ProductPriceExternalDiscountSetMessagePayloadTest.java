
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
public class ProductPriceExternalDiscountSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceExternalDiscountSetMessagePayloadBuilder builder) {
        ProductPriceExternalDiscountSetMessagePayload productPriceExternalDiscountSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productPriceExternalDiscountSetMessagePayload)
                .isInstanceOf(ProductPriceExternalDiscountSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPriceExternalDiscountSetMessagePayload.builder().variantId(5) },
                new Object[] { ProductPriceExternalDiscountSetMessagePayload.builder().variantKey("variantKey") },
                new Object[] { ProductPriceExternalDiscountSetMessagePayload.builder().sku("sku") },
                new Object[] { ProductPriceExternalDiscountSetMessagePayload.builder().priceId("priceId") },
                new Object[] { ProductPriceExternalDiscountSetMessagePayload.builder()
                        .discounted(new com.commercetools.api.models.common.DiscountedPriceImpl()) },
                new Object[] { ProductPriceExternalDiscountSetMessagePayload.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductPriceExternalDiscountSetMessagePayload value = ProductPriceExternalDiscountSetMessagePayload.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }

    @Test
    public void variantKey() {
        ProductPriceExternalDiscountSetMessagePayload value = ProductPriceExternalDiscountSetMessagePayload.of();
        value.setVariantKey("variantKey");
        Assertions.assertThat(value.getVariantKey()).isEqualTo("variantKey");
    }

    @Test
    public void sku() {
        ProductPriceExternalDiscountSetMessagePayload value = ProductPriceExternalDiscountSetMessagePayload.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void priceId() {
        ProductPriceExternalDiscountSetMessagePayload value = ProductPriceExternalDiscountSetMessagePayload.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void discounted() {
        ProductPriceExternalDiscountSetMessagePayload value = ProductPriceExternalDiscountSetMessagePayload.of();
        value.setDiscounted(new com.commercetools.api.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.api.models.common.DiscountedPriceImpl());
    }

    @Test
    public void staged() {
        ProductPriceExternalDiscountSetMessagePayload value = ProductPriceExternalDiscountSetMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
