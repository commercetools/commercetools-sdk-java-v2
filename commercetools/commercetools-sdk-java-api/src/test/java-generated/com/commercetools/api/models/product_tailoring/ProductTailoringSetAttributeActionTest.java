
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringSetAttributeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringSetAttributeActionBuilder builder) {
        ProductTailoringSetAttributeAction productTailoringSetAttributeAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetAttributeAction)
                .isInstanceOf(ProductTailoringSetAttributeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "variantId", ProductTailoringSetAttributeAction.builder().variantId(5L) },
                new Object[] { "sku", ProductTailoringSetAttributeAction.builder().sku("sku") },
                new Object[] { "name", ProductTailoringSetAttributeAction.builder().name("name") },
                new Object[] { "value", ProductTailoringSetAttributeAction.builder().value("value") },
                new Object[] { "staged", ProductTailoringSetAttributeAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductTailoringSetAttributeAction value = ProductTailoringSetAttributeAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringSetAttributeAction value = ProductTailoringSetAttributeAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void name() {
        ProductTailoringSetAttributeAction value = ProductTailoringSetAttributeAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductTailoringSetAttributeAction value = ProductTailoringSetAttributeAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void staged() {
        ProductTailoringSetAttributeAction value = ProductTailoringSetAttributeAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
