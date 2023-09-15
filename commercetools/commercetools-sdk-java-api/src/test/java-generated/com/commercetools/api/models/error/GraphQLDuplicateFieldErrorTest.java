
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
public class GraphQLDuplicateFieldErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLDuplicateFieldErrorBuilder builder) {
        GraphQLDuplicateFieldError graphQLDuplicateFieldError = builder.buildUnchecked();
        Assertions.assertThat(graphQLDuplicateFieldError).isInstanceOf(GraphQLDuplicateFieldError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GraphQLDuplicateFieldError.builder().field("field") },
                new Object[] { GraphQLDuplicateFieldError.builder().duplicateValue("duplicateValue") } };
    }

    @Test
    public void field() {
        GraphQLDuplicateFieldError value = GraphQLDuplicateFieldError.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void duplicateValue() {
        GraphQLDuplicateFieldError value = GraphQLDuplicateFieldError.of();
        value.setDuplicateValue("duplicateValue");
        Assertions.assertThat(value.getDuplicateValue()).isEqualTo("duplicateValue");
    }
}
