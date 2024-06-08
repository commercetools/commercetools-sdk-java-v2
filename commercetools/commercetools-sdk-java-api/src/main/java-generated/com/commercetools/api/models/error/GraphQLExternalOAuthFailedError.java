
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when an external OAuth Introspection endpoint does not return a response within the time limit, or the response isn't compliant with RFC 7662 (for example, an HTTP status code like <code>500</code>).</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLExternalOAuthFailedError graphQLExternalOAuthFailedError = GraphQLExternalOAuthFailedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLExternalOAuthFailedErrorImpl.class)
public interface GraphQLExternalOAuthFailedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLExternalOAuthFailedError
     */
    String EXTERNAL_O_AUTH_FAILED = "ExternalOAuthFailed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLExternalOAuthFailedError
     */
    public static GraphQLExternalOAuthFailedError of() {
        return new GraphQLExternalOAuthFailedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLExternalOAuthFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLExternalOAuthFailedError of(final GraphQLExternalOAuthFailedError template) {
        GraphQLExternalOAuthFailedErrorImpl instance = new GraphQLExternalOAuthFailedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLExternalOAuthFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLExternalOAuthFailedError deepCopy(@Nullable final GraphQLExternalOAuthFailedError template) {
        if (template == null) {
            return null;
        }
        GraphQLExternalOAuthFailedErrorImpl instance = new GraphQLExternalOAuthFailedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLExternalOAuthFailedError
     * @return builder
     */
    public static GraphQLExternalOAuthFailedErrorBuilder builder() {
        return GraphQLExternalOAuthFailedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLExternalOAuthFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExternalOAuthFailedErrorBuilder builder(final GraphQLExternalOAuthFailedError template) {
        return GraphQLExternalOAuthFailedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLExternalOAuthFailedError(Function<GraphQLExternalOAuthFailedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLExternalOAuthFailedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLExternalOAuthFailedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLExternalOAuthFailedError>";
            }
        };
    }
}
