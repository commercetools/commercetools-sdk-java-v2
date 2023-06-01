package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLQueryComplexityLimitExceededErrorImpl;

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
 * GraphQLQueryComplexityLimitExceededError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLQueryComplexityLimitExceededError graphQLQueryComplexityLimitExceededError = GraphQLQueryComplexityLimitExceededError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = GraphQLQueryComplexityLimitExceededErrorImpl.class)
public interface GraphQLQueryComplexityLimitExceededError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLQueryComplexityLimitExceededError
     */
    String QUERY_COMPLEXITY_LIMIT_EXCEEDED = "QueryComplexityLimitExceeded";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();


    /**
     * factory method
     * @return instance of GraphQLQueryComplexityLimitExceededError
     */
    public static GraphQLQueryComplexityLimitExceededError of(){
        return new GraphQLQueryComplexityLimitExceededErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy GraphQLQueryComplexityLimitExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLQueryComplexityLimitExceededError of(final GraphQLQueryComplexityLimitExceededError template) {
        GraphQLQueryComplexityLimitExceededErrorImpl instance = new GraphQLQueryComplexityLimitExceededErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLQueryComplexityLimitExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLQueryComplexityLimitExceededError deepCopy(@Nullable final GraphQLQueryComplexityLimitExceededError template) {
        if (template == null) {
            return null;
        }
        GraphQLQueryComplexityLimitExceededErrorImpl instance = new GraphQLQueryComplexityLimitExceededErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLQueryComplexityLimitExceededError
     * @return builder
     */
    public static GraphQLQueryComplexityLimitExceededErrorBuilder builder() {
        return GraphQLQueryComplexityLimitExceededErrorBuilder.of();
    }
    
    /**
     * create builder for GraphQLQueryComplexityLimitExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLQueryComplexityLimitExceededErrorBuilder builder(final GraphQLQueryComplexityLimitExceededError template) {
        return GraphQLQueryComplexityLimitExceededErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLQueryComplexityLimitExceededError(Function<GraphQLQueryComplexityLimitExceededError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLQueryComplexityLimitExceededError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLQueryComplexityLimitExceededError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLQueryComplexityLimitExceededError>";
            }
        };
    }
}
