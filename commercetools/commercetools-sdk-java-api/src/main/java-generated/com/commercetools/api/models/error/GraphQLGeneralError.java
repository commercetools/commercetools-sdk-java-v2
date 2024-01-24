
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when a server-side problem occurs before or after data persistence. In some cases, the requested action may successfully complete after the error is returned. Therefore, it is recommended to verify the status of the requested resource after receiving a 500 error.</p>
 *  <p>If you encounter this error, report it using the Support Portal.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLGeneralError graphQLGeneralError = GraphQLGeneralError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLGeneralErrorImpl.class)
public interface GraphQLGeneralError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLGeneralError
     */
    String GENERAL = "General";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLGeneralError
     */
    public static GraphQLGeneralError of() {
        return new GraphQLGeneralErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLGeneralError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLGeneralError of(final GraphQLGeneralError template) {
        GraphQLGeneralErrorImpl instance = new GraphQLGeneralErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLGeneralError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLGeneralError deepCopy(@Nullable final GraphQLGeneralError template) {
        if (template == null) {
            return null;
        }
        GraphQLGeneralErrorImpl instance = new GraphQLGeneralErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLGeneralError
     * @return builder
     */
    public static GraphQLGeneralErrorBuilder builder() {
        return GraphQLGeneralErrorBuilder.of();
    }

    /**
     * create builder for GraphQLGeneralError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLGeneralErrorBuilder builder(final GraphQLGeneralError template) {
        return GraphQLGeneralErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLGeneralError(Function<GraphQLGeneralError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLGeneralError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLGeneralError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLGeneralError>";
            }
        };
    }
}
