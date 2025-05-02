
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetProductPriceCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetProductPriceCustomTypeActionBuilder builder) {
        ProductSetProductPriceCustomTypeAction productSetProductPriceCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(productSetProductPriceCustomTypeAction)
                .isInstanceOf(ProductSetProductPriceCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "priceId", ProductSetProductPriceCustomTypeAction.builder().priceId("priceId") },
                new Object[] { "staged", ProductSetProductPriceCustomTypeAction.builder().staged(true) },
                new Object[] { "type",
                        ProductSetProductPriceCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", ProductSetProductPriceCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void priceId() {
        ProductSetProductPriceCustomTypeAction value = ProductSetProductPriceCustomTypeAction.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void staged() {
        ProductSetProductPriceCustomTypeAction value = ProductSetProductPriceCustomTypeAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void type() {
        ProductSetProductPriceCustomTypeAction value = ProductSetProductPriceCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        ProductSetProductPriceCustomTypeAction value = ProductSetProductPriceCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
