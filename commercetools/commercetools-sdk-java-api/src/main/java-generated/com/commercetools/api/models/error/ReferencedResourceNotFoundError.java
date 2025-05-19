
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a resource referenced by a Reference or a ResourceIdentifier could not be found.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReferencedResourceNotFoundError referencedResourceNotFoundError = ReferencedResourceNotFoundError.builder()
 *             .message("{message}")
 *             .typeId(ReferenceTypeId.APPROVAL_FLOW)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ReferencedResourceNotFound")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReferencedResourceNotFoundErrorImpl.class)
public interface ReferencedResourceNotFoundError extends ErrorObject {

    /**
     * discriminator value for ReferencedResourceNotFoundError
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
     *  <p><code>"The referenced object of type $typeId $predicate was not found. It either doesn't exist, or it can't be accessed from this endpoint (e.g., if the endpoint filters by store or customer account)."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

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
     *  <p><code>"The referenced object of type $typeId $predicate was not found. It either doesn't exist, or it can't be accessed from this endpoint (e.g., if the endpoint filters by store or customer account)."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

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
     * @return instance of ReferencedResourceNotFoundError
     */
    public static ReferencedResourceNotFoundError of() {
        return new ReferencedResourceNotFoundErrorImpl();
    }

    /**
     * factory method to create a shallow copy ReferencedResourceNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReferencedResourceNotFoundError of(final ReferencedResourceNotFoundError template) {
        ReferencedResourceNotFoundErrorImpl instance = new ReferencedResourceNotFoundErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setTypeId(template.getTypeId());
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public ReferencedResourceNotFoundError copyDeep();

    /**
     * factory method to create a deep copy of ReferencedResourceNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReferencedResourceNotFoundError deepCopy(@Nullable final ReferencedResourceNotFoundError template) {
        if (template == null) {
            return null;
        }
        ReferencedResourceNotFoundErrorImpl instance = new ReferencedResourceNotFoundErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setTypeId(template.getTypeId());
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ReferencedResourceNotFoundError
     * @return builder
     */
    public static ReferencedResourceNotFoundErrorBuilder builder() {
        return ReferencedResourceNotFoundErrorBuilder.of();
    }

    /**
     * create builder for ReferencedResourceNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReferencedResourceNotFoundErrorBuilder builder(final ReferencedResourceNotFoundError template) {
        return ReferencedResourceNotFoundErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReferencedResourceNotFoundError(Function<ReferencedResourceNotFoundError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReferencedResourceNotFoundError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReferencedResourceNotFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<ReferencedResourceNotFoundError>";
            }
        };
    }
}
