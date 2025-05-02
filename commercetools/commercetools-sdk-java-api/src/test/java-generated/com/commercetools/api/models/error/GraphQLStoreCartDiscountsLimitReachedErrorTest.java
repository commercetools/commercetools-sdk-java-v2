
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLStoreCartDiscountsLimitReachedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLStoreCartDiscountsLimitReachedErrorBuilder builder) {
        GraphQLStoreCartDiscountsLimitReachedError graphQLStoreCartDiscountsLimitReachedError = builder
                .buildUnchecked();
        Assertions.assertThat(graphQLStoreCartDiscountsLimitReachedError)
                .isInstanceOf(GraphQLStoreCartDiscountsLimitReachedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "stores", GraphQLStoreCartDiscountsLimitReachedError.builder()
                .stores(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl())) } };
    }

    @Test
    public void stores() {
        GraphQLStoreCartDiscountsLimitReachedError value = GraphQLStoreCartDiscountsLimitReachedError.of();
        value.setStores(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
    }
}
