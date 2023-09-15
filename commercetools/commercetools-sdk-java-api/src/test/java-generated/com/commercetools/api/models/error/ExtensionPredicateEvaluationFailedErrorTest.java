
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
public class ExtensionPredicateEvaluationFailedErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ExtensionPredicateEvaluationFailedErrorBuilder builder) {
        ExtensionPredicateEvaluationFailedError extensionPredicateEvaluationFailedError = builder.buildUnchecked();
        Assertions.assertThat(extensionPredicateEvaluationFailedError)
                .isInstanceOf(ExtensionPredicateEvaluationFailedError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ExtensionPredicateEvaluationFailedError.builder().message("message") },
                new Object[] { ExtensionPredicateEvaluationFailedError.builder()
                        .errorByExtension(new com.commercetools.api.models.error.ErrorByExtensionImpl()) } };
    }

    @Test
    public void message() {
        ExtensionPredicateEvaluationFailedError value = ExtensionPredicateEvaluationFailedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void errorByExtension() {
        ExtensionPredicateEvaluationFailedError value = ExtensionPredicateEvaluationFailedError.of();
        value.setErrorByExtension(new com.commercetools.api.models.error.ErrorByExtensionImpl());
        Assertions.assertThat(value.getErrorByExtension())
                .isEqualTo(new com.commercetools.api.models.error.ErrorByExtensionImpl());
    }
}
