
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
public class ProductVariantAddedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductVariantAddedMessageBuilder builder) {
        ProductVariantAddedMessage productVariantAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(productVariantAddedMessage).isInstanceOf(ProductVariantAddedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductVariantAddedMessage.builder()
                        .variant(new com.commercetools.api.models.product.ProductVariantImpl()) },
                new Object[] { ProductVariantAddedMessage.builder().staged(true) } };
    }

    @Test
    public void variant() {
        ProductVariantAddedMessage value = ProductVariantAddedMessage.of();
        value.setVariant(new com.commercetools.api.models.product.ProductVariantImpl());
        Assertions.assertThat(value.getVariant())
                .isEqualTo(new com.commercetools.api.models.product.ProductVariantImpl());
    }

    @Test
    public void staged() {
        ProductVariantAddedMessage value = ProductVariantAddedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
