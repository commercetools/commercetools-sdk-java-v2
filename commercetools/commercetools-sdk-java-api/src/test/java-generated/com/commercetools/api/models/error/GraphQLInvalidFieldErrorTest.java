
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
public class GraphQLInvalidFieldErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLInvalidFieldErrorBuilder builder) {
        GraphQLInvalidFieldError graphQLInvalidFieldError = builder.buildUnchecked();
        Assertions.assertThat(graphQLInvalidFieldError).isInstanceOf(GraphQLInvalidFieldError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GraphQLInvalidFieldError.builder().field("field") },
                new Object[] { GraphQLInvalidFieldError.builder().invalidValue("invalidValue") },
                new Object[] { GraphQLInvalidFieldError.builder()
                        .allowedValues(Collections.singletonList("allowedValues")) } };
    }

    @Test
    public void field() {
        GraphQLInvalidFieldError value = GraphQLInvalidFieldError.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void invalidValue() {
        GraphQLInvalidFieldError value = GraphQLInvalidFieldError.of();
        value.setInvalidValue("invalidValue");
        Assertions.assertThat(value.getInvalidValue()).isEqualTo("invalidValue");
    }

    @Test
    public void allowedValues() {
        GraphQLInvalidFieldError value = GraphQLInvalidFieldError.of();
        value.setAllowedValues(Collections.singletonList("allowedValues"));
        Assertions.assertThat(value.getAllowedValues()).isEqualTo(Collections.singletonList("allowedValues"));
    }
}
