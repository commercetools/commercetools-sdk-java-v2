
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AuthorizationHeaderAuthenticationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AuthorizationHeaderAuthentication authorizationHeaderAuthentication = AuthorizationHeaderAuthentication.builder()
 *             .headerValue("{headerValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AuthorizationHeaderAuthenticationBuilder implements Builder<AuthorizationHeaderAuthentication> {

    private String headerValue;

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @param headerValue
     * @return Builder
     */

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
