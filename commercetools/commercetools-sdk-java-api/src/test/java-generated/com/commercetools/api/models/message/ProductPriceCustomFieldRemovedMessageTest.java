
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
public class ProductPriceCustomFieldRemovedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceCustomFieldRemovedMessageBuilder builder) {
        ProductPriceCustomFieldRemovedMessage productPriceCustomFieldRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldRemovedMessage)
                .isInstanceOf(ProductPriceCustomFieldRemovedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPriceCustomFieldRemovedMessage.builder().priceId("priceId") },
                new Object[] { ProductPriceCustomFieldRemovedMessage.builder().variantId(5L) },
                new Object[] { ProductPriceCustomFieldRemovedMessage.builder().staged(true) },
                new Object[] { ProductPriceCustomFieldRemovedMessage.builder().name("name") } };
    }

    @Test
    public void priceId() {
        ProductPriceCustomFieldRemovedMessage value = ProductPriceCustomFieldRemovedMessage.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variantId() {
        ProductPriceCustomFieldRemovedMessage value = ProductPriceCustomFieldRemovedMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void staged() {
        ProductPriceCustomFieldRemovedMessage value = ProductPriceCustomFieldRemovedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void name() {
        ProductPriceCustomFieldRemovedMessage value = ProductPriceCustomFieldRemovedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
