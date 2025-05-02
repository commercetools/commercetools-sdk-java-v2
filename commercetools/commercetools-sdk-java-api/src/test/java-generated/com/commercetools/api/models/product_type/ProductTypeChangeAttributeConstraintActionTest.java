
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeChangeAttributeConstraintActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeChangeAttributeConstraintActionBuilder builder) {
        ProductTypeChangeAttributeConstraintAction productTypeChangeAttributeConstraintAction = builder
                .buildUnchecked();
        Assertions.assertThat(productTypeChangeAttributeConstraintAction)
                .isInstanceOf(ProductTypeChangeAttributeConstraintAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "attributeName",
                        ProductTypeChangeAttributeConstraintAction.builder().attributeName("attributeName") },
                new Object[] { "newValue",
                        ProductTypeChangeAttributeConstraintAction.builder()
                                .newValue(com.commercetools.api.models.product_type.AttributeConstraintEnumDraft
                                        .findEnum("None")) } };
    }

    @Test
    public void attributeName() {
        ProductTypeChangeAttributeConstraintAction value = ProductTypeChangeAttributeConstraintAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void newValue() {
        ProductTypeChangeAttributeConstraintAction value = ProductTypeChangeAttributeConstraintAction.of();
        value.setNewValue(com.commercetools.api.models.product_type.AttributeConstraintEnumDraft.findEnum("None"));
        Assertions.assertThat(value.getNewValue())
                .isEqualTo(com.commercetools.api.models.product_type.AttributeConstraintEnumDraft.findEnum("None"));
    }
}
