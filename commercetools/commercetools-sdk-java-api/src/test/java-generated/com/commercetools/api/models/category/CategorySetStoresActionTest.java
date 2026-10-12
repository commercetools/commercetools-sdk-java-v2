
package com.commercetools.api.models.category;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategorySetStoresActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategorySetStoresActionBuilder builder) {
        CategorySetStoresAction categorySetStoresAction = builder.buildUnchecked();
        Assertions.assertThat(categorySetStoresAction).isInstanceOf(CategorySetStoresAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "stores",
                CategorySetStoresAction.builder()
                        .stores(Collections.singletonList(
                            new com.commercetools.api.models.store.StoreResourceIdentifierImpl())) } };
    }

    @Test
    public void stores() {
        CategorySetStoresAction value = CategorySetStoresAction.of();
        value.setStores(
            Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
    }
}
