package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLAnonymousIdAlreadyInUseErrorImpl;

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
 *  <p>Returned when the anonymous ID is being used by another resource.</p>
 *  <p>The client application should choose another anonymous ID or retrieve an automatically generated one.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAnonymousIdAlreadyInUseError graphQLAnonymousIdAlreadyInUseError = GraphQLAnonymousIdAlreadyInUseError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = GraphQLAnonymousIdAlreadyInUseErrorImpl.class)
public interface GraphQLAnonymousIdAlreadyInUseError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAnonymousIdAlreadyInUseError
     */
    String ANONYMOUS_ID_ALREADY_IN_USE = "AnonymousIdAlreadyInUse";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();


    /**
     * factory method
     * @return instance of GraphQLAnonymousIdAlreadyInUseError
     */
    public static GraphQLAnonymousIdAlreadyInUseError of(){
        return new GraphQLAnonymousIdAlreadyInUseErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy GraphQLAnonymousIdAlreadyInUseError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAnonymousIdAlreadyInUseError of(final GraphQLAnonymousIdAlreadyInUseError template) {
        GraphQLAnonymousIdAlreadyInUseErrorImpl instance = new GraphQLAnonymousIdAlreadyInUseErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLAnonymousIdAlreadyInUseError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAnonymousIdAlreadyInUseError deepCopy(@Nullable final GraphQLAnonymousIdAlreadyInUseError template) {
        if (template == null) {
            return null;
        }
        GraphQLAnonymousIdAlreadyInUseErrorImpl instance = new GraphQLAnonymousIdAlreadyInUseErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLAnonymousIdAlreadyInUseError
     * @return builder
     */
    public static GraphQLAnonymousIdAlreadyInUseErrorBuilder builder() {
        return GraphQLAnonymousIdAlreadyInUseErrorBuilder.of();
    }
    
    /**
     * create builder for GraphQLAnonymousIdAlreadyInUseError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAnonymousIdAlreadyInUseErrorBuilder builder(final GraphQLAnonymousIdAlreadyInUseError template) {
        return GraphQLAnonymousIdAlreadyInUseErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAnonymousIdAlreadyInUseError(Function<GraphQLAnonymousIdAlreadyInUseError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLAnonymousIdAlreadyInUseError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLAnonymousIdAlreadyInUseError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAnonymousIdAlreadyInUseError>";
            }
        };
    }
}
