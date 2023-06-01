package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLNotEnabledErrorImpl;

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
 *  <p>Returned when the Project-specific category recommendations feature is not enabled for the Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLNotEnabledError graphQLNotEnabledError = GraphQLNotEnabledError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = GraphQLNotEnabledErrorImpl.class)
public interface GraphQLNotEnabledError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLNotEnabledError
     */
    String NOT_ENABLED = "NotEnabled";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();


    /**
     * factory method
     * @return instance of GraphQLNotEnabledError
     */
    public static GraphQLNotEnabledError of(){
        return new GraphQLNotEnabledErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy GraphQLNotEnabledError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLNotEnabledError of(final GraphQLNotEnabledError template) {
        GraphQLNotEnabledErrorImpl instance = new GraphQLNotEnabledErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLNotEnabledError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLNotEnabledError deepCopy(@Nullable final GraphQLNotEnabledError template) {
        if (template == null) {
            return null;
        }
        GraphQLNotEnabledErrorImpl instance = new GraphQLNotEnabledErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLNotEnabledError
     * @return builder
     */
    public static GraphQLNotEnabledErrorBuilder builder() {
        return GraphQLNotEnabledErrorBuilder.of();
    }
    
    /**
     * create builder for GraphQLNotEnabledError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLNotEnabledErrorBuilder builder(final GraphQLNotEnabledError template) {
        return GraphQLNotEnabledErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLNotEnabledError(Function<GraphQLNotEnabledError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLNotEnabledError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLNotEnabledError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLNotEnabledError>";
            }
        };
    }
}
