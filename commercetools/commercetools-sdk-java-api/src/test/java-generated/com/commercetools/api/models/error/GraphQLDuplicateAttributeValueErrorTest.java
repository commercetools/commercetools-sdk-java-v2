
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
public class GraphQLDuplicateAttributeValueErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLDuplicateAttributeValueErrorBuilder builder) {
        GraphQLDuplicateAttributeValueError graphQLDuplicateAttributeValueError = builder.buildUnchecked();
        Assertions.assertThat(graphQLDuplicateAttributeValueError)
                .isInstanceOf(GraphQLDuplicateAttributeValueError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GraphQLDuplicateAttributeValueError.builder()
                .attribute(new com.commercetools.api.models.product.AttributeImpl()) } };
    }

    @Test
    public void attribute() {
        GraphQLDuplicateAttributeValueError value = GraphQLDuplicateAttributeValueError.of();
        value.setAttribute(new com.commercetools.api.models.product.AttributeImpl());
        Assertions.assertThat(value.getAttribute()).isEqualTo(new com.commercetools.api.models.product.AttributeImpl());
    }
}
