
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetProductPriceCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetProductPriceCustomFieldActionBuilder builder) {
        ProductSetProductPriceCustomFieldAction productSetProductPriceCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(productSetProductPriceCustomFieldAction)
                .isInstanceOf(ProductSetProductPriceCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "priceId", ProductSetProductPriceCustomFieldAction.builder().priceId("priceId") },
                new Object[] { "staged", ProductSetProductPriceCustomFieldAction.builder().staged(true) },
                new Object[] { "name", ProductSetProductPriceCustomFieldAction.builder().name("name") },
                new Object[] { "value", ProductSetProductPriceCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void priceId() {
        ProductSetProductPriceCustomFieldAction value = ProductSetProductPriceCustomFieldAction.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void staged() {
        ProductSetProductPriceCustomFieldAction value = ProductSetProductPriceCustomFieldAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void name() {
        ProductSetProductPriceCustomFieldAction value = ProductSetProductPriceCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductSetProductPriceCustomFieldAction value = ProductSetProductPriceCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
