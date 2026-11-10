
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExternalOAuthTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExternalOAuthBuilder builder) {
        ExternalOAuth externalOAuth = builder.buildUnchecked();
        Assertions.assertThat(externalOAuth).isInstanceOf(ExternalOAuth.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "url", ExternalOAuth.builder().url("url") }, new Object[] {
                "authorizationHeader", ExternalOAuth.builder().authorizationHeader("authorizationHeader") } };
    }

    @Test
    public void url() {
        ExternalOAuth value = ExternalOAuth.of();
        value.setUrl("url");
        Assertions.assertThat(value.getUrl()).isEqualTo("url");
    }

    @Test
    public void authorizationHeader() {
        ExternalOAuth value = ExternalOAuth.of();
        value.setAuthorizationHeader("authorizationHeader");
        Assertions.assertThat(value.getAuthorizationHeader()).isEqualTo("authorizationHeader");
    }
}
