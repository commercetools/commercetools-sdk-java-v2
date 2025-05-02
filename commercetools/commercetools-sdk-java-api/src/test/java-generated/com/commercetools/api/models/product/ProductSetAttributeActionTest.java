
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetAttributeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetAttributeActionBuilder builder) {
        ProductSetAttributeAction productSetAttributeAction = builder.buildUnchecked();
        Assertions.assertThat(productSetAttributeAction).isInstanceOf(ProductSetAttributeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductSetAttributeAction.builder().variantId(5L) },
                new Object[] { "sku", ProductSetAttributeAction.builder().sku("sku") },
                new Object[] { "name", ProductSetAttributeAction.builder().name("name") },
                new Object[] { "value", ProductSetAttributeAction.builder().value("value") },
                new Object[] { "staged", ProductSetAttributeAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductSetAttributeAction value = ProductSetAttributeAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductSetAttributeAction value = ProductSetAttributeAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void name() {
        ProductSetAttributeAction value = ProductSetAttributeAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductSetAttributeAction value = ProductSetAttributeAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void staged() {
        ProductSetAttributeAction value = ProductSetAttributeAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
