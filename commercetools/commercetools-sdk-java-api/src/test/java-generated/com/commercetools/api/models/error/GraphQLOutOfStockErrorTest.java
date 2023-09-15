
package com.commercetools.api.models.error;

import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class GraphQLOutOfStockErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLOutOfStockErrorBuilder builder) {
        GraphQLOutOfStockError graphQLOutOfStockError = builder.buildUnchecked();
        Assertions.assertThat(graphQLOutOfStockError).isInstanceOf(GraphQLOutOfStockError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { GraphQLOutOfStockError.builder().lineItems(Collections.singletonList("lineItems")) },
                new Object[] { GraphQLOutOfStockError.builder().skus(Collections.singletonList("skus")) } };
    }

    @Test
    public void lineItems() {
        GraphQLOutOfStockError value = GraphQLOutOfStockError.of();
        value.setLineItems(Collections.singletonList("lineItems"));
        Assertions.assertThat(value.getLineItems()).isEqualTo(Collections.singletonList("lineItems"));
    }

    @Test
    public void skus() {
        GraphQLOutOfStockError value = GraphQLOutOfStockError.of();
        value.setSkus(Collections.singletonList("skus"));
        Assertions.assertThat(value.getSkus()).isEqualTo(Collections.singletonList("skus"));
    }
}
