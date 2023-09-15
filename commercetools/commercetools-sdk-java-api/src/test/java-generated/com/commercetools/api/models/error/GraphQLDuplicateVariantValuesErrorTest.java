
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
public class GraphQLDuplicateVariantValuesErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLDuplicateVariantValuesErrorBuilder builder) {
        GraphQLDuplicateVariantValuesError graphQLDuplicateVariantValuesError = builder.buildUnchecked();
        Assertions.assertThat(graphQLDuplicateVariantValuesError)
                .isInstanceOf(GraphQLDuplicateVariantValuesError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GraphQLDuplicateVariantValuesError.builder()
                .variantValues(new com.commercetools.api.models.error.VariantValuesImpl()) } };
    }

    @Test
    public void variantValues() {
        GraphQLDuplicateVariantValuesError value = GraphQLDuplicateVariantValuesError.of();
        value.setVariantValues(new com.commercetools.api.models.error.VariantValuesImpl());
        Assertions.assertThat(value.getVariantValues())
                .isEqualTo(new com.commercetools.api.models.error.VariantValuesImpl());
    }
}
