
package com.commercetools.api.models.extension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AuthorizationHeaderAuthenticationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AuthorizationHeaderAuthenticationBuilder builder) {
        AuthorizationHeaderAuthentication authorizationHeaderAuthentication = builder.buildUnchecked();
        Assertions.assertThat(authorizationHeaderAuthentication).isInstanceOf(AuthorizationHeaderAuthentication.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "headerValue",
                AuthorizationHeaderAuthentication.builder().headerValue("headerValue") } };
    }

    @Test
    public void headerValue() {
        AuthorizationHeaderAuthentication value = AuthorizationHeaderAuthentication.of();
        value.setHeaderValue("headerValue");
        Assertions.assertThat(value.getHeaderValue()).isEqualTo("headerValue");
    }
}
