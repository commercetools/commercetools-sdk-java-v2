package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLResourceSizeLimitExceededErrorImpl;

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
 *  <p>Returned when the resource exceeds the maximum allowed size of 16 MB.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLResourceSizeLimitExceededError graphQLResourceSizeLimitExceededError = GraphQLResourceSizeLimitExceededError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = GraphQLResourceSizeLimitExceededErrorImpl.class)
public interface GraphQLResourceSizeLimitExceededError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLResourceSizeLimitExceededError
     */
    String RESOURCE_SIZE_LIMIT_EXCEEDED = "ResourceSizeLimitExceeded";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();


    /**
     * factory method
     * @return instance of GraphQLResourceSizeLimitExceededError
     */
    public static GraphQLResourceSizeLimitExceededError of(){
        return new GraphQLResourceSizeLimitExceededErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy GraphQLResourceSizeLimitExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLResourceSizeLimitExceededError of(final GraphQLResourceSizeLimitExceededError template) {
        GraphQLResourceSizeLimitExceededErrorImpl instance = new GraphQLResourceSizeLimitExceededErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLResourceSizeLimitExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLResourceSizeLimitExceededError deepCopy(@Nullable final GraphQLResourceSizeLimitExceededError template) {
        if (template == null) {
            return null;
        }
        GraphQLResourceSizeLimitExceededErrorImpl instance = new GraphQLResourceSizeLimitExceededErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLResourceSizeLimitExceededError
     * @return builder
     */
    public static GraphQLResourceSizeLimitExceededErrorBuilder builder() {
        return GraphQLResourceSizeLimitExceededErrorBuilder.of();
    }
    
    /**
     * create builder for GraphQLResourceSizeLimitExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLResourceSizeLimitExceededErrorBuilder builder(final GraphQLResourceSizeLimitExceededError template) {
        return GraphQLResourceSizeLimitExceededErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLResourceSizeLimitExceededError(Function<GraphQLResourceSizeLimitExceededError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLResourceSizeLimitExceededError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLResourceSizeLimitExceededError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLResourceSizeLimitExceededError>";
            }
        };
    }
}
