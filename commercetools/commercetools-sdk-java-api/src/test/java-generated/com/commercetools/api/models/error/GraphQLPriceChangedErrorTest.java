
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
public class GraphQLPriceChangedErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLPriceChangedErrorBuilder builder) {
        GraphQLPriceChangedError graphQLPriceChangedError = builder.buildUnchecked();
        Assertions.assertThat(graphQLPriceChangedError).isInstanceOf(GraphQLPriceChangedError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { GraphQLPriceChangedError.builder().lineItems(Collections.singletonList("lineItems")) },
                new Object[] { GraphQLPriceChangedError.builder().shipping(true) } };
    }

    @Test
    public void lineItems() {
        GraphQLPriceChangedError value = GraphQLPriceChangedError.of();
        value.setLineItems(Collections.singletonList("lineItems"));
        Assertions.assertThat(value.getLineItems()).isEqualTo(Collections.singletonList("lineItems"));
    }

    @Test
    public void shipping() {
        GraphQLPriceChangedError value = GraphQLPriceChangedError.of();
        value.setShipping(true);
        Assertions.assertThat(value.getShipping()).isEqualTo(true);
    }
}
