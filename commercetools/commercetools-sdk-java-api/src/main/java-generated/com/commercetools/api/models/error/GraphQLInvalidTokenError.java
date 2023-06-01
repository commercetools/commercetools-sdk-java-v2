package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLInvalidTokenErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * GraphQLInvalidTokenError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInvalidTokenError graphQLInvalidTokenError = GraphQLInvalidTokenError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = GraphQLInvalidTokenErrorImpl.class)
public interface GraphQLInvalidTokenError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLInvalidTokenError
     */
    String INVALID_TOKEN = "invalid_token";



    /**
     * factory method
     * @return instance of GraphQLInvalidTokenError
     */
    public static GraphQLInvalidTokenError of(){
        return new GraphQLInvalidTokenErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy GraphQLInvalidTokenError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLInvalidTokenError of(final GraphQLInvalidTokenError template) {
        GraphQLInvalidTokenErrorImpl instance = new GraphQLInvalidTokenErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLInvalidTokenError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLInvalidTokenError deepCopy(@Nullable final GraphQLInvalidTokenError template) {
        if (template == null) {
            return null;
        }
        GraphQLInvalidTokenErrorImpl instance = new GraphQLInvalidTokenErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLInvalidTokenError
     * @return builder
     */
    public static GraphQLInvalidTokenErrorBuilder builder() {
        return GraphQLInvalidTokenErrorBuilder.of();
    }
    
    /**
     * create builder for GraphQLInvalidTokenError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInvalidTokenErrorBuilder builder(final GraphQLInvalidTokenError template) {
        return GraphQLInvalidTokenErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLInvalidTokenError(Function<GraphQLInvalidTokenError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLInvalidTokenError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLInvalidTokenError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLInvalidTokenError>";
            }
        };
    }
}
