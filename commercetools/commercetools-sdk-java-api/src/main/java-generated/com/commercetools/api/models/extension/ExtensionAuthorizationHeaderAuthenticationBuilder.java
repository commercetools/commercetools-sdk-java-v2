
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExtensionAuthorizationHeaderAuthenticationBuilder
        implements Builder<ExtensionAuthorizationHeaderAuthentication> {

    private String headerValue;

    public ExtensionAuthorizationHeaderAuthenticationBuilder headerValue(final String headerValue) {
        this.headerValue = headerValue;
        return this;
    }

    public String getHeaderValue() {
        return this.headerValue;
    }

    public ExtensionAuthorizationHeaderAuthentication build() {
        Objects.requireNonNull(headerValue,
            ExtensionAuthorizationHeaderAuthentication.class + ": headerValue is missing");
        return new ExtensionAuthorizationHeaderAuthenticationImpl(headerValue);
    }

    /**
     * builds ExtensionAuthorizationHeaderAuthentication without checking for non null required values
     */
    public ExtensionAuthorizationHeaderAuthentication buildUnchecked() {
        return new ExtensionAuthorizationHeaderAuthenticationImpl(headerValue);
    }

    public static ExtensionAuthorizationHeaderAuthenticationBuilder of() {
        return new ExtensionAuthorizationHeaderAuthenticationBuilder();
    }

    public static ExtensionAuthorizationHeaderAuthenticationBuilder of(
            final ExtensionAuthorizationHeaderAuthentication template) {
        ExtensionAuthorizationHeaderAuthenticationBuilder builder = new ExtensionAuthorizationHeaderAuthenticationBuilder();
        builder.headerValue = template.getHeaderValue();
        return builder;
    }

}
