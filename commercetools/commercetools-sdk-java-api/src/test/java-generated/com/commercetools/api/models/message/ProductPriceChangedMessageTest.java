
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
public class ProductPriceChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceChangedMessageBuilder builder) {
        ProductPriceChangedMessage productPriceChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceChangedMessage).isInstanceOf(ProductPriceChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPriceChangedMessage.builder().variantId(5L) },
                new Object[] { ProductPriceChangedMessage.builder()
                        .oldPrice(new com.commercetools.api.models.common.PriceImpl()) },
                new Object[] { ProductPriceChangedMessage.builder()
                        .newPrice(new com.commercetools.api.models.common.PriceImpl()) },
                new Object[] { ProductPriceChangedMessage.builder().staged(true) },
                new Object[] { ProductPriceChangedMessage.builder()
                        .oldStagedPrice(new com.commercetools.api.models.common.PriceImpl()) } };
    }

    @Test
    public void variantId() {
        ProductPriceChangedMessage value = ProductPriceChangedMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void oldPrice() {
        ProductPriceChangedMessage value = ProductPriceChangedMessage.of();
        value.setOldPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getOldPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }

    @Test
    public void newPrice() {
        ProductPriceChangedMessage value = ProductPriceChangedMessage.of();
        value.setNewPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getNewPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }

    @Test
    public void staged() {
        ProductPriceChangedMessage value = ProductPriceChangedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void oldStagedPrice() {
        ProductPriceChangedMessage value = ProductPriceChangedMessage.of();
        value.setOldStagedPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getOldStagedPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }
}
