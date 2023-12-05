
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
public class ProductImageAddedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductImageAddedMessageBuilder builder) {
        ProductImageAddedMessage productImageAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(productImageAddedMessage).isInstanceOf(ProductImageAddedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductImageAddedMessage.builder().variantId(5L) },
                new Object[] {
                        ProductImageAddedMessage.builder().image(new com.commercetools.api.models.common.ImageImpl()) },
                new Object[] { ProductImageAddedMessage.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductImageAddedMessage value = ProductImageAddedMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void image() {
        ProductImageAddedMessage value = ProductImageAddedMessage.of();
        value.setImage(new com.commercetools.api.models.common.ImageImpl());
        Assertions.assertThat(value.getImage()).isEqualTo(new com.commercetools.api.models.common.ImageImpl());
    }

    @Test
    public void staged() {
        ProductImageAddedMessage value = ProductImageAddedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
