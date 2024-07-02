
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
public class ProductPriceCustomFieldChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceCustomFieldChangedMessageBuilder builder) {
        ProductPriceCustomFieldChangedMessage productPriceCustomFieldChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldChangedMessage)
                .isInstanceOf(ProductPriceCustomFieldChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPriceCustomFieldChangedMessage.builder().priceId("priceId") },
                new Object[] { ProductPriceCustomFieldChangedMessage.builder().variantId(5L) },
                new Object[] { ProductPriceCustomFieldChangedMessage.builder().staged(true) },
                new Object[] { ProductPriceCustomFieldChangedMessage.builder().name("name") },
                new Object[] { ProductPriceCustomFieldChangedMessage.builder().value("value") } };
    }

    @Test
    public void priceId() {
        ProductPriceCustomFieldChangedMessage value = ProductPriceCustomFieldChangedMessage.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variantId() {
        ProductPriceCustomFieldChangedMessage value = ProductPriceCustomFieldChangedMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void staged() {
        ProductPriceCustomFieldChangedMessage value = ProductPriceCustomFieldChangedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void name() {
        ProductPriceCustomFieldChangedMessage value = ProductPriceCustomFieldChangedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductPriceCustomFieldChangedMessage value = ProductPriceCustomFieldChangedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
