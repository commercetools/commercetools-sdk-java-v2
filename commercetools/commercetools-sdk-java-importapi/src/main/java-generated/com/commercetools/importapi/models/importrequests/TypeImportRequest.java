package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.types.TypeImport;
import com.commercetools.importapi.models.importrequests.TypeImportRequestImpl;

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
 *  <p>The request body to import Types. Contains data for Types to be created or updated in a Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeImportRequest typeImportRequest = TypeImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = TypeImportRequestImpl.class)
public interface TypeImportRequest extends ImportRequest {

    /**
     * discriminator value for TypeImportRequest
     */
    String TYPE = "type";

    /**
     *  <p>The type import resources of this request.</p>
     * @return resources
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<TypeImport> getResources();

    /**
     *  <p>The type import resources of this request.</p>
     * @param resources values to be set
     */
    
    @JsonIgnore
    public void setResources(final TypeImport ...resources);
    /**
     *  <p>The type import resources of this request.</p>
     * @param resources values to be set
     */
    
    public void setResources(final List<TypeImport> resources);

    /**
     * factory method
     * @return instance of TypeImportRequest
     */
    public static TypeImportRequest of(){
        return new TypeImportRequestImpl();
    }
    

    /**
     * factory method to create a shallow copy TypeImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeImportRequest of(final TypeImportRequest template) {
        TypeImportRequestImpl instance = new TypeImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    /**
     * factory method to create a deep copy of TypeImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeImportRequest deepCopy(@Nullable final TypeImportRequest template) {
        if (template == null) {
            return null;
        }
        TypeImportRequestImpl instance = new TypeImportRequestImpl();
        instance.setResources(Optional.ofNullable(template.getResources())
                .map(t -> t.stream().map(com.commercetools.importapi.models.types.TypeImport::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for TypeImportRequest
     * @return builder
     */
    public static TypeImportRequestBuilder builder() {
        return TypeImportRequestBuilder.of();
    }
    
    /**
     * create builder for TypeImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeImportRequestBuilder builder(final TypeImportRequest template) {
        return TypeImportRequestBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeImportRequest(Function<TypeImportRequest, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<TypeImportRequest>";
            }
        };
    }
}
