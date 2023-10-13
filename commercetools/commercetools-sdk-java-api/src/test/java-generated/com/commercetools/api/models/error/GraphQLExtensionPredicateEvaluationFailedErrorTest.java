
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
public class GraphQLExtensionPredicateEvaluationFailedErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLExtensionPredicateEvaluationFailedErrorBuilder builder) {
        GraphQLExtensionPredicateEvaluationFailedError graphQLExtensionPredicateEvaluationFailedError = builder
                .buildUnchecked();
        Assertions.assertThat(graphQLExtensionPredicateEvaluationFailedError)
                .isInstanceOf(GraphQLExtensionPredicateEvaluationFailedError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GraphQLExtensionPredicateEvaluationFailedError.builder()
                .errorByExtension(new com.commercetools.api.models.error.ErrorByExtensionImpl()) } };
    }

    @Test
    public void errorByExtension() {
        GraphQLExtensionPredicateEvaluationFailedError value = GraphQLExtensionPredicateEvaluationFailedError.of();
        value.setErrorByExtension(new com.commercetools.api.models.error.ErrorByExtensionImpl());
        Assertions.assertThat(value.getErrorByExtension())
                .isEqualTo(new com.commercetools.api.models.error.ErrorByExtensionImpl());
    }
}
