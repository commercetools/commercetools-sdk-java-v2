
package com.commercetools.history.models.change_history;

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
public class ErrorResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ErrorResponseBuilder builder) {
        ErrorResponse errorResponse = builder.buildUnchecked();
        Assertions.assertThat(errorResponse).isInstanceOf(ErrorResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ErrorResponse.builder().statusCode(8) },
                new Object[] { ErrorResponse.builder().message("message") },
                new Object[] { ErrorResponse.builder().error("error") },
                new Object[] { ErrorResponse.builder().error_description("error_description") },
                new Object[] { ErrorResponse.builder()
                        .errors(Collections.singletonList(
                            new com.commercetools.history.models.change_history.ErrorObjectImpl())) } };
    }

    @Test
    public void statusCode() {
        ErrorResponse value = ErrorResponse.of();
        value.setStatusCode(8);
        Assertions.assertThat(value.getStatusCode()).isEqualTo(8);
    }

    @Test
    public void message() {
        ErrorResponse value = ErrorResponse.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void error() {
        ErrorResponse value = ErrorResponse.of();
        value.setError("error");
        Assertions.assertThat(value.getError()).isEqualTo("error");
    }

    @Test
    public void errorDescription() {
        ErrorResponse value = ErrorResponse.of();
        value.setErrorDescription("error_description");
        Assertions.assertThat(value.getErrorDescription()).isEqualTo("error_description");
    }

    @Test
    public void errors() {
        ErrorResponse value = ErrorResponse.of();
        value.setErrors(
            Collections.singletonList(new com.commercetools.history.models.change_history.ErrorObjectImpl()));
        Assertions.assertThat(value.getErrors())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.history.models.change_history.ErrorObjectImpl()));
    }
}
