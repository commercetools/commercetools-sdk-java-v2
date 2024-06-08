
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
 *  <p>Returned when an invalid JSON input has been sent. Either the JSON is syntactically incorrect or does not conform to the expected shape (for example is missing a required field).</p>
 *  <p>The client application should validate the input according to the constraints described in the error message before sending the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInvalidJsonInputError graphQLInvalidJsonInputError = GraphQLInvalidJsonInputError.builder()
 *             .detailedErrorMessage("{detailedErrorMessage}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLInvalidJsonInputErrorImpl.class)
public interface GraphQLInvalidJsonInputError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLInvalidJsonInputError
     */
    String INVALID_JSON_INPUT = "InvalidJsonInput";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Further explanation about why the JSON is invalid.</p>
     * @return detailedErrorMessage
     */
    @NotNull
    @JsonProperty("detailedErrorMessage")
    public String getDetailedErrorMessage();

    /**
     *  <p>Further explanation about why the JSON is invalid.</p>
     * @param detailedErrorMessage value to be set
     */

    public void setDetailedErrorMessage(final String detailedErrorMessage);

    /**
     * factory method
     * @return instance of GraphQLInvalidJsonInputError
     */
    public static GraphQLInvalidJsonInputError of() {
        return new GraphQLInvalidJsonInputErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLInvalidJsonInputError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLInvalidJsonInputError of(final GraphQLInvalidJsonInputError template) {
        GraphQLInvalidJsonInputErrorImpl instance = new GraphQLInvalidJsonInputErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setDetailedErrorMessage(template.getDetailedErrorMessage());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLInvalidJsonInputError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLInvalidJsonInputError deepCopy(@Nullable final GraphQLInvalidJsonInputError template) {
        if (template == null) {
            return null;
        }
        GraphQLInvalidJsonInputErrorImpl instance = new GraphQLInvalidJsonInputErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setDetailedErrorMessage(template.getDetailedErrorMessage());
        return instance;
    }

    /**
     * builder factory method for GraphQLInvalidJsonInputError
     * @return builder
     */
    public static GraphQLInvalidJsonInputErrorBuilder builder() {
        return GraphQLInvalidJsonInputErrorBuilder.of();
    }

    /**
     * create builder for GraphQLInvalidJsonInputError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInvalidJsonInputErrorBuilder builder(final GraphQLInvalidJsonInputError template) {
        return GraphQLInvalidJsonInputErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLInvalidJsonInputError(Function<GraphQLInvalidJsonInputError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLInvalidJsonInputError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLInvalidJsonInputError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLInvalidJsonInputError>";
            }
        };
    }
}
