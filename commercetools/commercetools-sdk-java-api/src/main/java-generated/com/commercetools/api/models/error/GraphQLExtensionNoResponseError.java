package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLExtensionNoResponseErrorImpl;

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
 *  <p>Returned when the API Extension does not respond within the time limit, or could not be reached.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLExtensionNoResponseError graphQLExtensionNoResponseError = GraphQLExtensionNoResponseError.builder()
 *             .extensionId("{extensionId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = GraphQLExtensionNoResponseErrorImpl.class)
public interface GraphQLExtensionNoResponseError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLExtensionNoResponseError
     */
    String EXTENSION_NO_RESPONSE = "ExtensionNoResponse";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();
    /**
     *  <p>Unique identifier of the API Extension.</p>
     * @return extensionId
     */
    @NotNull
    @JsonProperty("extensionId")
    public String getExtensionId();
    /**
     *  <p>User-defined unique identifier of the API Extension, if available.</p>
     * @return extensionKey
     */
    
    @JsonProperty("extensionKey")
    public String getExtensionKey();

    /**
     *  <p>Unique identifier of the API Extension.</p>
     * @param extensionId value to be set
     */
    
    public void setExtensionId(final String extensionId);
    
    
    /**
     *  <p>User-defined unique identifier of the API Extension, if available.</p>
     * @param extensionKey value to be set
     */
    
    public void setExtensionKey(final String extensionKey);
    

    /**
     * factory method
     * @return instance of GraphQLExtensionNoResponseError
     */
    public static GraphQLExtensionNoResponseError of(){
        return new GraphQLExtensionNoResponseErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy GraphQLExtensionNoResponseError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLExtensionNoResponseError of(final GraphQLExtensionNoResponseError template) {
        GraphQLExtensionNoResponseErrorImpl instance = new GraphQLExtensionNoResponseErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setExtensionId(template.getExtensionId());
        instance.setExtensionKey(template.getExtensionKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLExtensionNoResponseError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLExtensionNoResponseError deepCopy(@Nullable final GraphQLExtensionNoResponseError template) {
        if (template == null) {
            return null;
        }
        GraphQLExtensionNoResponseErrorImpl instance = new GraphQLExtensionNoResponseErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setExtensionId(template.getExtensionId());
        instance.setExtensionKey(template.getExtensionKey());
        return instance;
    }

    /**
     * builder factory method for GraphQLExtensionNoResponseError
     * @return builder
     */
    public static GraphQLExtensionNoResponseErrorBuilder builder() {
        return GraphQLExtensionNoResponseErrorBuilder.of();
    }
    
    /**
     * create builder for GraphQLExtensionNoResponseError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExtensionNoResponseErrorBuilder builder(final GraphQLExtensionNoResponseError template) {
        return GraphQLExtensionNoResponseErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLExtensionNoResponseError(Function<GraphQLExtensionNoResponseError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLExtensionNoResponseError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLExtensionNoResponseError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLExtensionNoResponseError>";
            }
        };
    }
}
