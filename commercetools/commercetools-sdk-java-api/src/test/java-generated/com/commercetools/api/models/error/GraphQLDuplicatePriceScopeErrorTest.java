
package com.commercetools.api.models.error;

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
public class GraphQLDuplicatePriceScopeErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLDuplicatePriceScopeErrorBuilder builder) {
        GraphQLDuplicatePriceScopeError graphQLDuplicatePriceScopeError = builder.buildUnchecked();
        Assertions.assertThat(graphQLDuplicatePriceScopeError).isInstanceOf(GraphQLDuplicatePriceScopeError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GraphQLDuplicatePriceScopeError.builder()
                .conflictingPrice(new com.commercetools.api.models.common.PriceImpl()) } };
    }

    @Test
    public void conflictingPrice() {
        GraphQLDuplicatePriceScopeError value = GraphQLDuplicatePriceScopeError.of();
        value.setConflictingPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getConflictingPrice())
                .isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }
}
