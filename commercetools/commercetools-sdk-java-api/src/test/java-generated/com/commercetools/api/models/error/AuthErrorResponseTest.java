
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
public class AuthErrorResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AuthErrorResponseBuilder builder) {
        AuthErrorResponse authErrorResponse = builder.buildUnchecked();
        Assertions.assertThat(authErrorResponse).isInstanceOf(AuthErrorResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AuthErrorResponse.builder().error("error") },
                new Object[] { AuthErrorResponse.builder().error_description("error_description") },
                new Object[] { AuthErrorResponse.builder()
                        .errors(
                            Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl())) } };
    }

    @Test
    public void error() {
        AuthErrorResponse value = AuthErrorResponse.of();
        value.setError("error");
        Assertions.assertThat(value.getError()).isEqualTo("error");
    }

    @Test
    public void errorDescription() {
        AuthErrorResponse value = AuthErrorResponse.of();
        value.setErrorDescription("error_description");
        Assertions.assertThat(value.getErrorDescription()).isEqualTo("error_description");
    }

    @Test
    public void errors() {
        AuthErrorResponse value = AuthErrorResponse.of();
        value.setErrors(Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl()));
        Assertions.assertThat(value.getErrors())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl()));
    }
}
