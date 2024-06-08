
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
 *  <p>Returned when a Discount predicate or API Extension predicate is not semantically correct.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLSemanticErrorError graphQLSemanticErrorError = GraphQLSemanticErrorError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLSemanticErrorErrorImpl.class)
public interface GraphQLSemanticErrorError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLSemanticErrorError
     */
    String SEMANTIC_ERROR = "SemanticError";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLSemanticErrorError
     */
    public static GraphQLSemanticErrorError of() {
        return new GraphQLSemanticErrorErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLSemanticErrorError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLSemanticErrorError of(final GraphQLSemanticErrorError template) {
        GraphQLSemanticErrorErrorImpl instance = new GraphQLSemanticErrorErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLSemanticErrorError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLSemanticErrorError deepCopy(@Nullable final GraphQLSemanticErrorError template) {
        if (template == null) {
            return null;
        }
        GraphQLSemanticErrorErrorImpl instance = new GraphQLSemanticErrorErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLSemanticErrorError
     * @return builder
     */
    public static GraphQLSemanticErrorErrorBuilder builder() {
        return GraphQLSemanticErrorErrorBuilder.of();
    }

    /**
     * create builder for GraphQLSemanticErrorError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLSemanticErrorErrorBuilder builder(final GraphQLSemanticErrorError template) {
        return GraphQLSemanticErrorErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLSemanticErrorError(Function<GraphQLSemanticErrorError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLSemanticErrorError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLSemanticErrorError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLSemanticErrorError>";
            }
        };
    }
}
