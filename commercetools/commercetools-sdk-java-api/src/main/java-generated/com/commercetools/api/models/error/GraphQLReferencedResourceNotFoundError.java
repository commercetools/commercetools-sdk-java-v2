package com.commercetools.api.models.error;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLReferencedResourceNotFoundErrorImpl;

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
 *  <p>Returned when a resource referenced by a Reference or a ResourceIdentifier could not be found.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLReferencedResourceNotFoundError graphQLReferencedResourceNotFoundError = GraphQLReferencedResourceNotFoundError.builder()
 *             .typeId(ReferenceTypeId.ASSOCIATE_ROLE)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = GraphQLReferencedResourceNotFoundErrorImpl.class)
public interface GraphQLReferencedResourceNotFoundError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLReferencedResourceNotFoundError
     */
    String REFERENCED_RESOURCE_NOT_FOUND = "ReferencedResourceNotFound";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();
    /**
     *  <p>Type of referenced resource.</p>
     * @return typeId
     */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();
    /**
     *  <p>Unique identifier of the referenced resource, if known.</p>
     * @return id
     */
    
    @JsonProperty("id")
    public String getId();
    /**
     *  <p>User-defined unique identifier of the referenced resource, if known.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Type of referenced resource.</p>
     * @param typeId value to be set
     */
    
    public void setTypeId(final ReferenceTypeId typeId);
    
    
    /**
     *  <p>Unique identifier of the referenced resource, if known.</p>
     * @param id value to be set
     */
    
    public void setId(final String id);
    
    
    /**
     *  <p>User-defined unique identifier of the referenced resource, if known.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    

    /**
     * factory method
     * @return instance of GraphQLReferencedResourceNotFoundError
     */
    public static GraphQLReferencedResourceNotFoundError of(){
        return new GraphQLReferencedResourceNotFoundErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy GraphQLReferencedResourceNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLReferencedResourceNotFoundError of(final GraphQLReferencedResourceNotFoundError template) {
        GraphQLReferencedResourceNotFoundErrorImpl instance = new GraphQLReferencedResourceNotFoundErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setTypeId(template.getTypeId());
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLReferencedResourceNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLReferencedResourceNotFoundError deepCopy(@Nullable final GraphQLReferencedResourceNotFoundError template) {
        if (template == null) {
            return null;
        }
        GraphQLReferencedResourceNotFoundErrorImpl instance = new GraphQLReferencedResourceNotFoundErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setTypeId(template.getTypeId());
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for GraphQLReferencedResourceNotFoundError
     * @return builder
     */
    public static GraphQLReferencedResourceNotFoundErrorBuilder builder() {
        return GraphQLReferencedResourceNotFoundErrorBuilder.of();
    }
    
    /**
     * create builder for GraphQLReferencedResourceNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLReferencedResourceNotFoundErrorBuilder builder(final GraphQLReferencedResourceNotFoundError template) {
        return GraphQLReferencedResourceNotFoundErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLReferencedResourceNotFoundError(Function<GraphQLReferencedResourceNotFoundError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLReferencedResourceNotFoundError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLReferencedResourceNotFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLReferencedResourceNotFoundError>";
            }
        };
    }
}
