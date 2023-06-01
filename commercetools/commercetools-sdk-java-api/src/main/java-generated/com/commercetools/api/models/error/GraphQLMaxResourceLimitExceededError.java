package com.commercetools.api.models.error;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLMaxResourceLimitExceededErrorImpl;

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
 *  <p>Returned when a resource type cannot be created as it has reached its limits.</p>
 *  <p>The limits must be adjusted for this resource before sending the request again.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLMaxResourceLimitExceededError graphQLMaxResourceLimitExceededError = GraphQLMaxResourceLimitExceededError.builder()
 *             .exceededResource(ReferenceTypeId.ASSOCIATE_ROLE)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = GraphQLMaxResourceLimitExceededErrorImpl.class)
public interface GraphQLMaxResourceLimitExceededError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLMaxResourceLimitExceededError
     */
    String MAX_RESOURCE_LIMIT_EXCEEDED = "MaxResourceLimitExceeded";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();
    /**
     *  <p>Resource type that reached its maximum limit of configured elements (for example, 100 Zones per Project).</p>
     * @return exceededResource
     */
    @NotNull
    @JsonProperty("exceededResource")
    public ReferenceTypeId getExceededResource();

    /**
     *  <p>Resource type that reached its maximum limit of configured elements (for example, 100 Zones per Project).</p>
     * @param exceededResource value to be set
     */
    
    public void setExceededResource(final ReferenceTypeId exceededResource);
    

    /**
     * factory method
     * @return instance of GraphQLMaxResourceLimitExceededError
     */
    public static GraphQLMaxResourceLimitExceededError of(){
        return new GraphQLMaxResourceLimitExceededErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy GraphQLMaxResourceLimitExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLMaxResourceLimitExceededError of(final GraphQLMaxResourceLimitExceededError template) {
        GraphQLMaxResourceLimitExceededErrorImpl instance = new GraphQLMaxResourceLimitExceededErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setExceededResource(template.getExceededResource());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLMaxResourceLimitExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLMaxResourceLimitExceededError deepCopy(@Nullable final GraphQLMaxResourceLimitExceededError template) {
        if (template == null) {
            return null;
        }
        GraphQLMaxResourceLimitExceededErrorImpl instance = new GraphQLMaxResourceLimitExceededErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setExceededResource(template.getExceededResource());
        return instance;
    }

    /**
     * builder factory method for GraphQLMaxResourceLimitExceededError
     * @return builder
     */
    public static GraphQLMaxResourceLimitExceededErrorBuilder builder() {
        return GraphQLMaxResourceLimitExceededErrorBuilder.of();
    }
    
    /**
     * create builder for GraphQLMaxResourceLimitExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLMaxResourceLimitExceededErrorBuilder builder(final GraphQLMaxResourceLimitExceededError template) {
        return GraphQLMaxResourceLimitExceededErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLMaxResourceLimitExceededError(Function<GraphQLMaxResourceLimitExceededError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLMaxResourceLimitExceededError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLMaxResourceLimitExceededError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLMaxResourceLimitExceededError>";
            }
        };
    }
}
