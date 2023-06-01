package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLObjectNotFoundErrorImpl;

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
 *  <p>Returned when the requested resource was not found.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLObjectNotFoundError graphQLObjectNotFoundError = GraphQLObjectNotFoundError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = GraphQLObjectNotFoundErrorImpl.class)
public interface GraphQLObjectNotFoundError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLObjectNotFoundError
     */
    String OBJECT_NOT_FOUND = "ObjectNotFound";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();


    /**
     * factory method
     * @return instance of GraphQLObjectNotFoundError
     */
    public static GraphQLObjectNotFoundError of(){
        return new GraphQLObjectNotFoundErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy GraphQLObjectNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLObjectNotFoundError of(final GraphQLObjectNotFoundError template) {
        GraphQLObjectNotFoundErrorImpl instance = new GraphQLObjectNotFoundErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLObjectNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLObjectNotFoundError deepCopy(@Nullable final GraphQLObjectNotFoundError template) {
        if (template == null) {
            return null;
        }
        GraphQLObjectNotFoundErrorImpl instance = new GraphQLObjectNotFoundErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLObjectNotFoundError
     * @return builder
     */
    public static GraphQLObjectNotFoundErrorBuilder builder() {
        return GraphQLObjectNotFoundErrorBuilder.of();
    }
    
    /**
     * create builder for GraphQLObjectNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLObjectNotFoundErrorBuilder builder(final GraphQLObjectNotFoundError template) {
        return GraphQLObjectNotFoundErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLObjectNotFoundError(Function<GraphQLObjectNotFoundError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLObjectNotFoundError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLObjectNotFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLObjectNotFoundError>";
            }
        };
    }
}
