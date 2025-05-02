
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeChangeIsSearchableActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeChangeIsSearchableActionBuilder builder) {
        ProductTypeChangeIsSearchableAction productTypeChangeIsSearchableAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeChangeIsSearchableAction)
                .isInstanceOf(ProductTypeChangeIsSearchableAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "attributeName",
                        ProductTypeChangeIsSearchableAction.builder().attributeName("attributeName") },
                new Object[] { "isSearchable", ProductTypeChangeIsSearchableAction.builder().isSearchable(true) } };
    }

    @Test
    public void attributeName() {
        ProductTypeChangeIsSearchableAction value = ProductTypeChangeIsSearchableAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void isSearchable() {
        ProductTypeChangeIsSearchableAction value = ProductTypeChangeIsSearchableAction.of();
        value.setIsSearchable(true);
        Assertions.assertThat(value.getIsSearchable()).isEqualTo(true);
    }
}
