
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategorySetExternalIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategorySetExternalIdActionBuilder builder) {
        CategorySetExternalIdAction categorySetExternalIdAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetExternalIdAction).isInstanceOf(CategorySetExternalIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "externalId", CategorySetExternalIdAction.builder().externalId("externalId") } };
    }

    @Test
    public void externalId() {
        CategorySetExternalIdAction value = CategorySetExternalIdAction.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }
}
