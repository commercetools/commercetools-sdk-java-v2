
package com.commercetools.api.models.category;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategoryChangeAssetOrderActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategoryChangeAssetOrderActionBuilder builder) {
        CategoryChangeAssetOrderAction categoryChangeAssetOrderAction = builder.buildUnchecked();
        Assertions.assertThat(categoryChangeAssetOrderAction).isInstanceOf(CategoryChangeAssetOrderAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "assetOrder",
                CategoryChangeAssetOrderAction.builder().assetOrder(Collections.singletonList("assetOrder")) } };
    }

    @Test
    public void assetOrder() {
        CategoryChangeAssetOrderAction value = CategoryChangeAssetOrderAction.of();
        value.setAssetOrder(Collections.singletonList("assetOrder"));
        Assertions.assertThat(value.getAssetOrder()).isEqualTo(Collections.singletonList("assetOrder"));
    }
}
