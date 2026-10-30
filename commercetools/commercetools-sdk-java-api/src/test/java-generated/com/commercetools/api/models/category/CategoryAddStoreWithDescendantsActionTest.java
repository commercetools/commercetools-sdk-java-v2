
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategoryAddStoreWithDescendantsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategoryAddStoreWithDescendantsActionBuilder builder) {
        CategoryAddStoreWithDescendantsAction categoryAddStoreWithDescendantsAction = builder.buildUnchecked();
        Assertions.assertThat(categoryAddStoreWithDescendantsAction)
                .isInstanceOf(CategoryAddStoreWithDescendantsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "store", CategoryAddStoreWithDescendantsAction.builder()
                .store(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()) } };
    }

    @Test
    public void store() {
        CategoryAddStoreWithDescendantsAction value = CategoryAddStoreWithDescendantsAction.of();
        value.setStore(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
    }
}
