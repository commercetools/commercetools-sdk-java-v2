
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
public class ProductPriceKeySetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceKeySetMessageBuilder builder) {
        ProductPriceKeySetMessage productPriceKeySetMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceKeySetMessage).isInstanceOf(ProductPriceKeySetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPriceKeySetMessage.builder().variantId(5L) },
                new Object[] { ProductPriceKeySetMessage.builder().priceId("priceId") },
                new Object[] { ProductPriceKeySetMessage.builder().oldKey("oldKey") },
                new Object[] { ProductPriceKeySetMessage.builder().key("key") },
                new Object[] { ProductPriceKeySetMessage.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductPriceKeySetMessage value = ProductPriceKeySetMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void priceId() {
        ProductPriceKeySetMessage value = ProductPriceKeySetMessage.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void oldKey() {
        ProductPriceKeySetMessage value = ProductPriceKeySetMessage.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }

    @Test
    public void key() {
        ProductPriceKeySetMessage value = ProductPriceKeySetMessage.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void staged() {
        ProductPriceKeySetMessage value = ProductPriceKeySetMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
