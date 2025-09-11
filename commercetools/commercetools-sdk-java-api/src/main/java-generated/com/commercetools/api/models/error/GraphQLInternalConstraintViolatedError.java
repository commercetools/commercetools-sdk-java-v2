
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
 *  <p>Returned when certain API-specific constraints were not met. For example, the specified <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">Discount Code</a> was never applied and cannot be updated.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInternalConstraintViolatedError graphQLInternalConstraintViolatedError = GraphQLInternalConstraintViolatedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InternalConstraintViolated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLInternalConstraintViolatedErrorImpl.class)
public interface GraphQLInternalConstraintViolatedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLInternalConstraintViolatedError
     */
    String INTERNAL_CONSTRAINT_VIOLATED = "InternalConstraintViolated";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLInternalConstraintViolatedError
     */
    public static GraphQLInternalConstraintViolatedError of() {
        return new GraphQLInternalConstraintViolatedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLInternalConstraintViolatedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLInternalConstraintViolatedError of(final GraphQLInternalConstraintViolatedError template) {
        GraphQLInternalConstraintViolatedErrorImpl instance = new GraphQLInternalConstraintViolatedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLInternalConstraintViolatedError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLInternalConstraintViolatedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLInternalConstraintViolatedError deepCopy(
            @Nullable final GraphQLInternalConstraintViolatedError template) {
        if (template == null) {
            return null;
        }
        GraphQLInternalConstraintViolatedErrorImpl instance = new GraphQLInternalConstraintViolatedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLInternalConstraintViolatedError
     * @return builder
     */
    public static GraphQLInternalConstraintViolatedErrorBuilder builder() {
        return GraphQLInternalConstraintViolatedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLInternalConstraintViolatedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInternalConstraintViolatedErrorBuilder builder(
            final GraphQLInternalConstraintViolatedError template) {
        return GraphQLInternalConstraintViolatedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLInternalConstraintViolatedError(
            Function<GraphQLInternalConstraintViolatedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLInternalConstraintViolatedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLInternalConstraintViolatedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLInternalConstraintViolatedError>";
            }
        };
    }
}
