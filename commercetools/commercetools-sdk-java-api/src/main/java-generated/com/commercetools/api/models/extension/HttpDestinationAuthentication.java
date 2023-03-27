
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * HttpDestinationAuthentication
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     HttpDestinationAuthentication httpDestinationAuthentication = HttpDestinationAuthentication.authorizationHeaderBuilder()
 *             headerValue("{headerValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.extension.AuthorizationHeaderAuthenticationImpl.class, name = AuthorizationHeaderAuthentication.AUTHORIZATION_HEADER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.extension.AzureFunctionsAuthenticationImpl.class, name = AzureFunctionsAuthentication.AZURE_FUNCTIONS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = HttpDestinationAuthenticationImpl.class, visible = true)
@JsonDeserialize(as = HttpDestinationAuthenticationImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface HttpDestinationAuthentication {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     * builder for authorizationHeader subtype
     * @return builder
     */
    public static com.commercetools.api.models.extension.AuthorizationHeaderAuthenticationBuilder authorizationHeaderBuilder() {
        return com.commercetools.api.models.extension.AuthorizationHeaderAuthenticationBuilder.of();
    }

    /**
     * builder for azureFunctions subtype
     * @return builder
     */
    public static com.commercetools.api.models.extension.AzureFunctionsAuthenticationBuilder azureFunctionsBuilder() {
        return com.commercetools.api.models.extension.AzureFunctionsAuthenticationBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withHttpDestinationAuthentication(Function<HttpDestinationAuthentication, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<HttpDestinationAuthentication> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<HttpDestinationAuthentication>() {
            @Override
            public String toString() {
                return "TypeReference<HttpDestinationAuthentication>";
            }
        };
    }
}
