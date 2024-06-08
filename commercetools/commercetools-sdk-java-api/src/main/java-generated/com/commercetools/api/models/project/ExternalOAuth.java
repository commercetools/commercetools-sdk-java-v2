
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents a RFC 7662 compliant OAuth 2.0 Token Introspection endpoint. For more information, see Requesting an access token using an external OAuth 2.0 server.</p>
 *  <p>You can only configure <strong>one</strong> external OAuth 2.0 endpoint per Project. To authenticate using multiple external services (such as social network logins), use a middle layer authentication service.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExternalOAuth externalOAuth = ExternalOAuth.builder()
 *             .url("{url}")
 *             .authorizationHeader("{authorizationHeader}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExternalOAuthImpl.class)
public interface ExternalOAuth {

    /**
     *  <p>URL with authorization header. If the Project is hosted in the China (AWS, Ningxia) Region, verify that the URL is not blocked due to firewall restrictions.</p>
     * @return url
     */
    @NotNull
    @JsonProperty("url")
    public String getUrl();

    /**
     *  <p>Must not contain any leading or trailing whitespaces. Partially hidden on retrieval.</p>
     * @return authorizationHeader
     */
    @NotNull
    @JsonProperty("authorizationHeader")
    public String getAuthorizationHeader();

    /**
     *  <p>URL with authorization header. If the Project is hosted in the China (AWS, Ningxia) Region, verify that the URL is not blocked due to firewall restrictions.</p>
     * @param url value to be set
     */

    public void setUrl(final String url);

    /**
     *  <p>Must not contain any leading or trailing whitespaces. Partially hidden on retrieval.</p>
     * @param authorizationHeader value to be set
     */

    public void setAuthorizationHeader(final String authorizationHeader);

    /**
     * factory method
     * @return instance of ExternalOAuth
     */
    public static ExternalOAuth of() {
        return new ExternalOAuthImpl();
    }

    /**
     * factory method to create a shallow copy ExternalOAuth
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExternalOAuth of(final ExternalOAuth template) {
        ExternalOAuthImpl instance = new ExternalOAuthImpl();
        instance.setUrl(template.getUrl());
        instance.setAuthorizationHeader(template.getAuthorizationHeader());
        return instance;
    }

    /**
     * factory method to create a deep copy of ExternalOAuth
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExternalOAuth deepCopy(@Nullable final ExternalOAuth template) {
        if (template == null) {
            return null;
        }
        ExternalOAuthImpl instance = new ExternalOAuthImpl();
        instance.setUrl(template.getUrl());
        instance.setAuthorizationHeader(template.getAuthorizationHeader());
        return instance;
    }

    /**
     * builder factory method for ExternalOAuth
     * @return builder
     */
    public static ExternalOAuthBuilder builder() {
        return ExternalOAuthBuilder.of();
    }

    /**
     * create builder for ExternalOAuth instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExternalOAuthBuilder builder(final ExternalOAuth template) {
        return ExternalOAuthBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExternalOAuth(Function<ExternalOAuth, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExternalOAuth> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExternalOAuth>() {
            @Override
            public String toString() {
                return "TypeReference<ExternalOAuth>";
            }
        };
    }
}
