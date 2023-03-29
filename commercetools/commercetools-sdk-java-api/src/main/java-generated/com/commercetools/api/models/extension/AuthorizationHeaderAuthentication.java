
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The <code>Authorization</code> header will be set to the content of <code>headerValue</code>. The authentication scheme (such as <code>Basic</code> or <code>Bearer</code>) should be included in the <code>headerValue</code>.</p>
 *  <p>For example, the <code>headerValue</code> for Basic Authentication should be set to <code>Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ==</code>.</p>
 *
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
@JsonDeserialize(as = AuthorizationHeaderAuthenticationImpl.class)
public interface AuthorizationHeaderAuthentication extends HttpDestinationAuthentication {

    /**
     * discriminator value for AuthorizationHeaderAuthentication
     */
    String AUTHORIZATION_HEADER = "AuthorizationHeader";

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @return headerValue
     */
    @NotNull
    @JsonProperty("headerValue")
    public String getHeaderValue();

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @param headerValue value to be set
     */

    public void setHeaderValue(final String headerValue);

    /**
     * factory method
     * @return instance of AuthorizationHeaderAuthentication
     */
    public static AuthorizationHeaderAuthentication of() {
        return new AuthorizationHeaderAuthenticationImpl();
    }

    /**
     * factory method to create a shallow copy AuthorizationHeaderAuthentication
     * @param template instance to be copied
     * @return copy instance
     */
    public static AuthorizationHeaderAuthentication of(final AuthorizationHeaderAuthentication template) {
        AuthorizationHeaderAuthenticationImpl instance = new AuthorizationHeaderAuthenticationImpl();
        instance.setHeaderValue(template.getHeaderValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of AuthorizationHeaderAuthentication
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AuthorizationHeaderAuthentication deepCopy(
            @Nullable final AuthorizationHeaderAuthentication template) {
        if (template == null) {
            return null;
        }
        AuthorizationHeaderAuthenticationImpl instance = new AuthorizationHeaderAuthenticationImpl();
        instance.setHeaderValue(template.getHeaderValue());
        return instance;
    }

    /**
     * builder factory method for AuthorizationHeaderAuthentication
     * @return builder
     */
    public static AuthorizationHeaderAuthenticationBuilder builder() {
        return AuthorizationHeaderAuthenticationBuilder.of();
    }

    /**
     * create builder for AuthorizationHeaderAuthentication instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AuthorizationHeaderAuthenticationBuilder builder(final AuthorizationHeaderAuthentication template) {
        return AuthorizationHeaderAuthenticationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAuthorizationHeaderAuthentication(Function<AuthorizationHeaderAuthentication, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AuthorizationHeaderAuthentication> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AuthorizationHeaderAuthentication>() {
            @Override
            public String toString() {
                return "TypeReference<AuthorizationHeaderAuthentication>";
            }
        };
    }
}
