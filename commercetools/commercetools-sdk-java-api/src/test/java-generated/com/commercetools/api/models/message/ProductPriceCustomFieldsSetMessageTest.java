
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceCustomFieldsSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceCustomFieldsSetMessageBuilder builder) {
        ProductPriceCustomFieldsSetMessage productPriceCustomFieldsSetMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldsSetMessage)
                .isInstanceOf(ProductPriceCustomFieldsSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "priceId", ProductPriceCustomFieldsSetMessage.builder().priceId("priceId") },
                new Object[] { "variantId", ProductPriceCustomFieldsSetMessage.builder().variantId(5L) },
                new Object[] { "staged", ProductPriceCustomFieldsSetMessage.builder().staged(true) },
                new Object[] { "customField",
                        ProductPriceCustomFieldsSetMessage.builder()
                                .customField(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "oldTypeId", ProductPriceCustomFieldsSetMessage.builder().oldTypeId("oldTypeId") } };
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
