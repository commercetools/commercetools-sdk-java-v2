
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>We recommend an encrypted <code>HTTPS</code> connection for production setups. However, we also accept unencrypted <code>HTTP</code> connections for development purposes. HTTP redirects will not be followed and cache headers will be ignored.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     HttpDestination httpDestination = HttpDestination.builder()
 *             .url("{url}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = HttpDestinationImpl.class)
public interface HttpDestination extends ExtensionDestination {

    /**
     * discriminator value for HttpDestination
     */
    String HTTP = "HTTP";

    /**
     *  <p>URL to the target destination.</p>
     * @return url
     */
    @NotNull
    @JsonProperty("url")
    public String getUrl();

    /**
     *  <p>Authentication methods (such as <code>Basic</code> or <code>Bearer</code>).</p>
     * @return authentication
     */
    @Valid
    @JsonProperty("authentication")
    public HttpDestinationAuthentication getAuthentication();

    /**
     *  <p>URL to the target destination.</p>
     * @param url value to be set
     */

    public void setUrl(final String url);

    /**
     *  <p>Authentication methods (such as <code>Basic</code> or <code>Bearer</code>).</p>
     * @param authentication value to be set
     */

    public void setAuthentication(final HttpDestinationAuthentication authentication);

    /**
     * factory method
     * @return instance of HttpDestination
     */
    public static HttpDestination of() {
        return new HttpDestinationImpl();
    }

    /**
     * factory method to create a shallow copy HttpDestination
     * @param template instance to be copied
     * @return copy instance
     */
    public static HttpDestination of(final HttpDestination template) {
        HttpDestinationImpl instance = new HttpDestinationImpl();
        instance.setUrl(template.getUrl());
        instance.setAuthentication(template.getAuthentication());
        return instance;
    }

    /**
     * factory method to create a deep copy of HttpDestination
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static HttpDestination deepCopy(@Nullable final HttpDestination template) {
        if (template == null) {
            return null;
        }
        HttpDestinationImpl instance = new HttpDestinationImpl();
        instance.setUrl(template.getUrl());
        instance.setAuthentication(Optional.ofNullable(template.getAuthentication())
                .map(com.commercetools.api.models.extension.HttpDestinationAuthentication::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for HttpDestination
     * @return builder
     */
    public static HttpDestinationBuilder builder() {
        return HttpDestinationBuilder.of();
    }

    /**
     * create builder for HttpDestination instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static HttpDestinationBuilder builder(final HttpDestination template) {
        return HttpDestinationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withHttpDestination(Function<HttpDestination, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<HttpDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<HttpDestination>() {
            @Override
            public String toString() {
                return "TypeReference<HttpDestination>";
            }
        };
    }
}
