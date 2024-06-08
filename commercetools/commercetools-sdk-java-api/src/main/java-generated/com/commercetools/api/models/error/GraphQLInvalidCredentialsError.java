
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
 *  <p>Returned when a Customer with the given credentials (matching the given email/password pair) is not found and authentication fails.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Authenticate a global Customer (Sign-in) and Authenticate Customer (Sign-in) in a Store requests on Customers.</li>
 *   <li>Authenticating Customer (Sign-in) and Authenticate Customer (Sign-in) in a Store requests on My Customer Profile.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInvalidCredentialsError graphQLInvalidCredentialsError = GraphQLInvalidCredentialsError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLInvalidCredentialsErrorImpl.class)
public interface GraphQLInvalidCredentialsError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLInvalidCredentialsError
     */
    String INVALID_CREDENTIALS = "InvalidCredentials";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLInvalidCredentialsError
     */
    public static GraphQLInvalidCredentialsError of() {
        return new GraphQLInvalidCredentialsErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLInvalidCredentialsError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLInvalidCredentialsError of(final GraphQLInvalidCredentialsError template) {
        GraphQLInvalidCredentialsErrorImpl instance = new GraphQLInvalidCredentialsErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLInvalidCredentialsError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLInvalidCredentialsError deepCopy(@Nullable final GraphQLInvalidCredentialsError template) {
        if (template == null) {
            return null;
        }
        GraphQLInvalidCredentialsErrorImpl instance = new GraphQLInvalidCredentialsErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLInvalidCredentialsError
     * @return builder
     */
    public static GraphQLInvalidCredentialsErrorBuilder builder() {
        return GraphQLInvalidCredentialsErrorBuilder.of();
    }

    /**
     * create builder for GraphQLInvalidCredentialsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInvalidCredentialsErrorBuilder builder(final GraphQLInvalidCredentialsError template) {
        return GraphQLInvalidCredentialsErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLInvalidCredentialsError(Function<GraphQLInvalidCredentialsError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLInvalidCredentialsError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLInvalidCredentialsError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLInvalidCredentialsError>";
            }
        };
    }
}
