
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
public class ProductPriceCustomFieldsRemovedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceCustomFieldsRemovedMessageBuilder builder) {
        ProductPriceCustomFieldsRemovedMessage productPriceCustomFieldsRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldsRemovedMessage)
                .isInstanceOf(ProductPriceCustomFieldsRemovedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPriceCustomFieldsRemovedMessage.builder().priceId("priceId") },
                new Object[] { ProductPriceCustomFieldsRemovedMessage.builder().variantId(5L) },
                new Object[] { ProductPriceCustomFieldsRemovedMessage.builder().staged(true) } };
    }

    @Test
    public void priceId() {
        ProductPriceCustomFieldsRemovedMessage value = ProductPriceCustomFieldsRemovedMessage.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variantId() {
        ProductPriceCustomFieldsRemovedMessage value = ProductPriceCustomFieldsRemovedMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void staged() {
        ProductPriceCustomFieldsRemovedMessage value = ProductPriceCustomFieldsRemovedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
