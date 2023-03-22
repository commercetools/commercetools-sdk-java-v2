
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when a resource referenced by a Reference or a ResourceIdentifier could not be found.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReferencedResourceNotFoundError referencedResourceNotFoundError = ReferencedResourceNotFoundError.builder()
 *             .message("{message}")
 *             .typeId(ReferenceTypeId.ATTRIBUTE_GROUP)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReferencedResourceNotFoundErrorImpl.class)
public interface ReferencedResourceNotFoundError extends ErrorObject {

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

    public void setMessage(final String message);

    public void setTypeId(final ReferenceTypeId typeId);

    public void setId(final String id);

    public void setKey(final String key);

    public static ReferencedResourceNotFoundError of() {
        return new ReferencedResourceNotFoundErrorImpl();
    }

    public static ReferencedResourceNotFoundError of(final ReferencedResourceNotFoundError template) {
        ReferencedResourceNotFoundErrorImpl instance = new ReferencedResourceNotFoundErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setTypeId(template.getTypeId());
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ReferencedResourceNotFoundErrorBuilder builder() {
        return ReferencedResourceNotFoundErrorBuilder.of();
    }

    public static ReferencedResourceNotFoundErrorBuilder builder(final ReferencedResourceNotFoundError template) {
        return ReferencedResourceNotFoundErrorBuilder.of(template);
    }

    default <T> T withReferencedResourceNotFoundError(Function<ReferencedResourceNotFoundError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReferencedResourceNotFoundError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReferencedResourceNotFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<ReferencedResourceNotFoundError>";
            }
        };
    }
}
