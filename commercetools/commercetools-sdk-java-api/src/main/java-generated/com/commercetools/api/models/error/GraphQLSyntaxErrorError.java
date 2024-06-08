
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
 *  <p>Returned when a Discount predicate, API Extension predicate, or search query does not have the correct syntax.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLSyntaxErrorError graphQLSyntaxErrorError = GraphQLSyntaxErrorError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLSyntaxErrorErrorImpl.class)
public interface GraphQLSyntaxErrorError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLSyntaxErrorError
     */
    String SYNTAX_ERROR = "SyntaxError";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLSyntaxErrorError
     */
    public static GraphQLSyntaxErrorError of() {
        return new GraphQLSyntaxErrorErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLSyntaxErrorError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLSyntaxErrorError of(final GraphQLSyntaxErrorError template) {
        GraphQLSyntaxErrorErrorImpl instance = new GraphQLSyntaxErrorErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLSyntaxErrorError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLSyntaxErrorError deepCopy(@Nullable final GraphQLSyntaxErrorError template) {
        if (template == null) {
            return null;
        }
        GraphQLSyntaxErrorErrorImpl instance = new GraphQLSyntaxErrorErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLSyntaxErrorError
     * @return builder
     */
    public static GraphQLSyntaxErrorErrorBuilder builder() {
        return GraphQLSyntaxErrorErrorBuilder.of();
    }

    /**
     * create builder for GraphQLSyntaxErrorError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLSyntaxErrorErrorBuilder builder(final GraphQLSyntaxErrorError template) {
        return GraphQLSyntaxErrorErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLSyntaxErrorError(Function<GraphQLSyntaxErrorError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLSyntaxErrorError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLSyntaxErrorError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLSyntaxErrorError>";
            }
        };
    }
}
