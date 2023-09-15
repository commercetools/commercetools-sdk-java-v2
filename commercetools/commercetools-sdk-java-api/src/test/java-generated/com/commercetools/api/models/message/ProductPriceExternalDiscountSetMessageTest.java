
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
public class ProductPriceExternalDiscountSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceExternalDiscountSetMessageBuilder builder) {
        ProductPriceExternalDiscountSetMessage productPriceExternalDiscountSetMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceExternalDiscountSetMessage)
                .isInstanceOf(ProductPriceExternalDiscountSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPriceExternalDiscountSetMessage.builder().variantId(5) },
                new Object[] { ProductPriceExternalDiscountSetMessage.builder().variantKey("variantKey") },
                new Object[] { ProductPriceExternalDiscountSetMessage.builder().sku("sku") },
                new Object[] { ProductPriceExternalDiscountSetMessage.builder().priceId("priceId") },
                new Object[] { ProductPriceExternalDiscountSetMessage.builder()
                        .discounted(new com.commercetools.api.models.common.DiscountedPriceImpl()) },
                new Object[] { ProductPriceExternalDiscountSetMessage.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductPriceExternalDiscountSetMessage value = ProductPriceExternalDiscountSetMessage.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }

    @Test
    public void variantKey() {
        ProductPriceExternalDiscountSetMessage value = ProductPriceExternalDiscountSetMessage.of();
        value.setVariantKey("variantKey");
        Assertions.assertThat(value.getVariantKey()).isEqualTo("variantKey");
    }

    @Test
    public void sku() {
        ProductPriceExternalDiscountSetMessage value = ProductPriceExternalDiscountSetMessage.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void priceId() {
        ProductPriceExternalDiscountSetMessage value = ProductPriceExternalDiscountSetMessage.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void discounted() {
        ProductPriceExternalDiscountSetMessage value = ProductPriceExternalDiscountSetMessage.of();
        value.setDiscounted(new com.commercetools.api.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.api.models.common.DiscountedPriceImpl());
    }

    @Test
    public void staged() {
        ProductPriceExternalDiscountSetMessage value = ProductPriceExternalDiscountSetMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
