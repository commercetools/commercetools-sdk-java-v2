
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.ReferenceType;
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
 *     ReferencedResourceNotFound referencedResourceNotFound = ReferencedResourceNotFound.builder()
 *             .message("{message}")
 *             .typeId(ReferenceType.CART)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReferencedResourceNotFoundImpl.class)
public interface ReferencedResourceNotFound extends ErrorObject {

    /**
     * discriminator value for ReferencedResourceNotFound
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
    public ReferenceType getTypeId();

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

    public void setTypeId(final ReferenceType typeId);

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
     * @return instance of ReferencedResourceNotFound
     */
    public static ReferencedResourceNotFound of() {
        return new ReferencedResourceNotFoundImpl();
    }

    /**
     * factory method to create a shallow copy ReferencedResourceNotFound
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReferencedResourceNotFound of(final ReferencedResourceNotFound template) {
        ReferencedResourceNotFoundImpl instance = new ReferencedResourceNotFoundImpl();
        instance.setMessage(template.getMessage());
        instance.setTypeId(template.getTypeId());
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ReferencedResourceNotFound
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReferencedResourceNotFound deepCopy(@Nullable final ReferencedResourceNotFound template) {
        if (template == null) {
            return null;
        }
        ReferencedResourceNotFoundImpl instance = new ReferencedResourceNotFoundImpl();
        instance.setMessage(template.getMessage());
        instance.setTypeId(template.getTypeId());
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ReferencedResourceNotFound
     * @return builder
     */
    public static ReferencedResourceNotFoundBuilder builder() {
        return ReferencedResourceNotFoundBuilder.of();
    }

    /**
     * create builder for ReferencedResourceNotFound instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReferencedResourceNotFoundBuilder builder(final ReferencedResourceNotFound template) {
        return ReferencedResourceNotFoundBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReferencedResourceNotFound(Function<ReferencedResourceNotFound, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReferencedResourceNotFound> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReferencedResourceNotFound>() {
            @Override
            public String toString() {
                return "TypeReference<ReferencedResourceNotFound>";
            }
        };
    }
}
