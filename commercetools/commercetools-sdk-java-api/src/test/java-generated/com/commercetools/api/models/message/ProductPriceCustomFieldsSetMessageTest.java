
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
public class ProductPriceCustomFieldsSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceCustomFieldsSetMessageBuilder builder) {
        ProductPriceCustomFieldsSetMessage productPriceCustomFieldsSetMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldsSetMessage)
                .isInstanceOf(ProductPriceCustomFieldsSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPriceCustomFieldsSetMessage.builder().priceId("priceId") },
                new Object[] { ProductPriceCustomFieldsSetMessage.builder().variantId(5L) },
                new Object[] { ProductPriceCustomFieldsSetMessage.builder().staged(true) },
                new Object[] { ProductPriceCustomFieldsSetMessage.builder()
                        .customField(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { ProductPriceCustomFieldsSetMessage.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void priceId() {
        ProductPriceCustomFieldsSetMessage value = ProductPriceCustomFieldsSetMessage.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variantId() {
        ProductPriceCustomFieldsSetMessage value = ProductPriceCustomFieldsSetMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void staged() {
        ProductPriceCustomFieldsSetMessage value = ProductPriceCustomFieldsSetMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void customField() {
        ProductPriceCustomFieldsSetMessage value = ProductPriceCustomFieldsSetMessage.of();
        value.setCustomField(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomField())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void oldTypeId() {
        ProductPriceCustomFieldsSetMessage value = ProductPriceCustomFieldsSetMessage.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
