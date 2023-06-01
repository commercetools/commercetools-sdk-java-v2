package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.HttpDestinationAuthentication;
import com.commercetools.api.models.extension.AuthorizationHeaderAuthentication;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AuthorizationHeaderAuthenticationBuilder implements Builder<AuthorizationHeaderAuthentication> {

    
    
    private String headerValue;

    
    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @param headerValue value to be set
     * @return Builder
     */
    
    public AuthorizationHeaderAuthenticationBuilder headerValue( final String headerValue) {
        this.headerValue = headerValue;
        return this;
    }
    
    

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @return headerValue
     */
    
    
    public String getHeaderValue(){
        return this.headerValue;
    }

    /**
     * builds AuthorizationHeaderAuthentication with checking for non-null required values
     * @return AuthorizationHeaderAuthentication
     */
    public AuthorizationHeaderAuthentication build() {
        Objects.requireNonNull(headerValue, AuthorizationHeaderAuthentication.class + ": headerValue is missing");
        return new AuthorizationHeaderAuthenticationImpl(headerValue);
    }
    
    /**
     * builds AuthorizationHeaderAuthentication without checking for non-null required values
     * @return AuthorizationHeaderAuthentication
     */
    public AuthorizationHeaderAuthentication buildUnchecked() {
        return new AuthorizationHeaderAuthenticationImpl(headerValue);
    }

    /**
     * factory method for an instance of AuthorizationHeaderAuthenticationBuilder
     * @return builder 
     */
    public static AuthorizationHeaderAuthenticationBuilder of() {
        return new AuthorizationHeaderAuthenticationBuilder();
    }

    /**
     * create builder for AuthorizationHeaderAuthentication instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AuthorizationHeaderAuthenticationBuilder of(final AuthorizationHeaderAuthentication template) {
        AuthorizationHeaderAuthenticationBuilder builder = new AuthorizationHeaderAuthenticationBuilder();
        builder.headerValue = template.getHeaderValue();
        return builder;
    }

}
