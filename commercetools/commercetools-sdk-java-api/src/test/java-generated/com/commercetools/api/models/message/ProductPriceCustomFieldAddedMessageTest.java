
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
public class ProductPriceCustomFieldAddedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceCustomFieldAddedMessageBuilder builder) {
        ProductPriceCustomFieldAddedMessage productPriceCustomFieldAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldAddedMessage)
                .isInstanceOf(ProductPriceCustomFieldAddedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPriceCustomFieldAddedMessage.builder().priceId("priceId") },
                new Object[] { ProductPriceCustomFieldAddedMessage.builder().variantId(5L) },
                new Object[] { ProductPriceCustomFieldAddedMessage.builder().staged(true) },
                new Object[] { ProductPriceCustomFieldAddedMessage.builder().name("name") },
                new Object[] { ProductPriceCustomFieldAddedMessage.builder().value("value") } };
    }

    @Test
    public void priceId() {
        ProductPriceCustomFieldAddedMessage value = ProductPriceCustomFieldAddedMessage.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variantId() {
        ProductPriceCustomFieldAddedMessage value = ProductPriceCustomFieldAddedMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void staged() {
        ProductPriceCustomFieldAddedMessage value = ProductPriceCustomFieldAddedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void name() {
        ProductPriceCustomFieldAddedMessage value = ProductPriceCustomFieldAddedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductPriceCustomFieldAddedMessage value = ProductPriceCustomFieldAddedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
