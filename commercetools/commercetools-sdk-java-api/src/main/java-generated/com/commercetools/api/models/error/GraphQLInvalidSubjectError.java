
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLInvalidSubjectError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInvalidSubjectError graphQLInvalidSubjectError = GraphQLInvalidSubjectError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLInvalidSubjectErrorImpl.class)
public interface GraphQLInvalidSubjectError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLInvalidSubjectError
     */
    String INVALID_SUBJECT = "InvalidSubject";

    /**
     * factory method
     * @return instance of GraphQLInvalidSubjectError
     */
    public static GraphQLInvalidSubjectError of() {
        return new GraphQLInvalidSubjectErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLInvalidSubjectError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLInvalidSubjectError of(final GraphQLInvalidSubjectError template) {
        GraphQLInvalidSubjectErrorImpl instance = new GraphQLInvalidSubjectErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLInvalidSubjectError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLInvalidSubjectError deepCopy(@Nullable final GraphQLInvalidSubjectError template) {
        if (template == null) {
            return null;
        }
        GraphQLInvalidSubjectErrorImpl instance = new GraphQLInvalidSubjectErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLInvalidSubjectError
     * @return builder
     */
    public static GraphQLInvalidSubjectErrorBuilder builder() {
        return GraphQLInvalidSubjectErrorBuilder.of();
    }

    /**
     * create builder for GraphQLInvalidSubjectError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInvalidSubjectErrorBuilder builder(final GraphQLInvalidSubjectError template) {
        return GraphQLInvalidSubjectErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLInvalidSubjectError(Function<GraphQLInvalidSubjectError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLInvalidSubjectError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLInvalidSubjectError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLInvalidSubjectError>";
            }
        };
    }
}
