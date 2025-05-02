
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeRemoveAttributeDefinitionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeRemoveAttributeDefinitionActionBuilder builder) {
        ProductTypeRemoveAttributeDefinitionAction productTypeRemoveAttributeDefinitionAction = builder
                .buildUnchecked();
        Assertions.assertThat(productTypeRemoveAttributeDefinitionAction)
                .isInstanceOf(ProductTypeRemoveAttributeDefinitionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", ProductTypeRemoveAttributeDefinitionAction.builder().name("name") } };
    }

    @Test
    public void name() {
        ProductTypeRemoveAttributeDefinitionAction value = ProductTypeRemoveAttributeDefinitionAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
