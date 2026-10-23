
package com.commercetools.api.models.category;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategorySetStoresWithDescendantsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategorySetStoresWithDescendantsActionBuilder builder) {
        CategorySetStoresWithDescendantsAction categorySetStoresWithDescendantsAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetStoresWithDescendantsAction)
                .isInstanceOf(CategorySetStoresWithDescendantsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "stores",
                CategorySetStoresWithDescendantsAction.builder()
                        .stores(Collections.singletonList(
                            new com.commercetools.api.models.store.StoreResourceIdentifierImpl())) } };
    }

    @Test
    public void stores() {
        CategorySetStoresWithDescendantsAction value = CategorySetStoresWithDescendantsAction.of();
        value.setStores(
            Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
    }
}
