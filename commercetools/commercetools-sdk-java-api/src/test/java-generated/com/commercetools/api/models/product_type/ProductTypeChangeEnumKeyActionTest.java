
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeChangeEnumKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeChangeEnumKeyActionBuilder builder) {
        ProductTypeChangeEnumKeyAction productTypeChangeEnumKeyAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeChangeEnumKeyAction).isInstanceOf(ProductTypeChangeEnumKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "attributeName",
                        ProductTypeChangeEnumKeyAction.builder().attributeName("attributeName") },
                new Object[] { "key", ProductTypeChangeEnumKeyAction.builder().key("key") },
                new Object[] { "newKey", ProductTypeChangeEnumKeyAction.builder().newKey("newKey") } };
    }

    @Test
    public void attributeName() {
        ProductTypeChangeEnumKeyAction value = ProductTypeChangeEnumKeyAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void key() {
        ProductTypeChangeEnumKeyAction value = ProductTypeChangeEnumKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void newKey() {
        ProductTypeChangeEnumKeyAction value = ProductTypeChangeEnumKeyAction.of();
        value.setNewKey("newKey");
        Assertions.assertThat(value.getNewKey()).isEqualTo("newKey");
    }
}
