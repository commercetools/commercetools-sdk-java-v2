
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
public class GraphQLInvalidItemShippingDetailsErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLInvalidItemShippingDetailsErrorBuilder builder) {
        GraphQLInvalidItemShippingDetailsError graphQLInvalidItemShippingDetailsError = builder.buildUnchecked();
        Assertions.assertThat(graphQLInvalidItemShippingDetailsError)
                .isInstanceOf(GraphQLInvalidItemShippingDetailsError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GraphQLInvalidItemShippingDetailsError.builder().subject("subject") },
                new Object[] { GraphQLInvalidItemShippingDetailsError.builder().itemId("itemId") } };
    }

    @Test
    public void subject() {
        GraphQLInvalidItemShippingDetailsError value = GraphQLInvalidItemShippingDetailsError.of();
        value.setSubject("subject");
        Assertions.assertThat(value.getSubject()).isEqualTo("subject");
    }

    @Test
    public void itemId() {
        GraphQLInvalidItemShippingDetailsError value = GraphQLInvalidItemShippingDetailsError.of();
        value.setItemId("itemId");
        Assertions.assertThat(value.getItemId()).isEqualTo("itemId");
    }
}
