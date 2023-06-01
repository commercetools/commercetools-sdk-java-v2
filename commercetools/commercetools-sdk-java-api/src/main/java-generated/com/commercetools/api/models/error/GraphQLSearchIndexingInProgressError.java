package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLSearchIndexingInProgressErrorImpl;

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
 *  <p>Returned when the indexing of Product information is still in progress for Projects that have indexing activated.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLSearchIndexingInProgressError graphQLSearchIndexingInProgressError = GraphQLSearchIndexingInProgressError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = GraphQLSearchIndexingInProgressErrorImpl.class)
public interface GraphQLSearchIndexingInProgressError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLSearchIndexingInProgressError
     */
    String SEARCH_INDEXING_IN_PROGRESS = "SearchIndexingInProgress";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();


    /**
     * factory method
     * @return instance of GraphQLSearchIndexingInProgressError
     */
    public static GraphQLSearchIndexingInProgressError of(){
        return new GraphQLSearchIndexingInProgressErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy GraphQLSearchIndexingInProgressError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLSearchIndexingInProgressError of(final GraphQLSearchIndexingInProgressError template) {
        GraphQLSearchIndexingInProgressErrorImpl instance = new GraphQLSearchIndexingInProgressErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLSearchIndexingInProgressError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLSearchIndexingInProgressError deepCopy(@Nullable final GraphQLSearchIndexingInProgressError template) {
        if (template == null) {
            return null;
        }
        GraphQLSearchIndexingInProgressErrorImpl instance = new GraphQLSearchIndexingInProgressErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLSearchIndexingInProgressError
     * @return builder
     */
    public static GraphQLSearchIndexingInProgressErrorBuilder builder() {
        return GraphQLSearchIndexingInProgressErrorBuilder.of();
    }
    
    /**
     * create builder for GraphQLSearchIndexingInProgressError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLSearchIndexingInProgressErrorBuilder builder(final GraphQLSearchIndexingInProgressError template) {
        return GraphQLSearchIndexingInProgressErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLSearchIndexingInProgressError(Function<GraphQLSearchIndexingInProgressError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLSearchIndexingInProgressError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLSearchIndexingInProgressError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLSearchIndexingInProgressError>";
            }
        };
    }
}
