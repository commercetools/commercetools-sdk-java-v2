
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AuthorizationHeaderAuthenticationBuilder implements Builder<AuthorizationHeaderAuthentication> {

    private String headerValue;

    public AuthorizationHeaderAuthenticationBuilder headerValue(final String headerValue) {
        this.headerValue = headerValue;
        return this;
    }

    public String getHeaderValue() {
        return this.headerValue;
    }

    public AuthorizationHeaderAuthentication build() {
        Objects.requireNonNull(headerValue, AuthorizationHeaderAuthentication.class + ": headerValue is missing");
        return new AuthorizationHeaderAuthenticationImpl(headerValue);
    }

    /**
     * builds AuthorizationHeaderAuthentication without checking for non null required values
     */
    public AuthorizationHeaderAuthentication buildUnchecked() {
        return new AuthorizationHeaderAuthenticationImpl(headerValue);
    }

    public static AuthorizationHeaderAuthenticationBuilder of() {
        return new AuthorizationHeaderAuthenticationBuilder();
    }

    public static AuthorizationHeaderAuthenticationBuilder of(final AuthorizationHeaderAuthentication template) {
        AuthorizationHeaderAuthenticationBuilder builder = new AuthorizationHeaderAuthenticationBuilder();
        builder.headerValue = template.getHeaderValue();
        return builder;
    }

}
