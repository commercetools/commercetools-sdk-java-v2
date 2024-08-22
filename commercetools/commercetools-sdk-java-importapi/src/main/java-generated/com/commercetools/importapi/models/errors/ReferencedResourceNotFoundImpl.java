
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Returned when a resource referenced by a Reference or a ResourceIdentifier could not be found.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReferencedResourceNotFoundImpl implements ReferencedResourceNotFound, ModelBase {

    private String code;

    private String message;

    private com.commercetools.importapi.models.common.ReferenceType typeId;

    private String id;

    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReferencedResourceNotFoundImpl(@JsonProperty("message") final String message,
            @JsonProperty("typeId") final com.commercetools.importapi.models.common.ReferenceType typeId,
            @JsonProperty("id") final String id, @JsonProperty("key") final String key) {
        this.message = message;
        this.typeId = typeId;
        this.id = id;
        this.key = key;
        this.code = REFERENCED_RESOURCE_NOT_FOUND;
    }

    /**
     * create empty instance
     */
    public ReferencedResourceNotFoundImpl() {
        this.code = REFERENCED_RESOURCE_NOT_FOUND;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"The referenced object of type $typeId $predicate was not found. It either doesn't exist, or it can't be accessed from this endpoint (e.g., if the endpoint filters by store or customer account)."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Type of referenced resource.</p>
     */

    public com.commercetools.importapi.models.common.ReferenceType getTypeId() {
        return this.typeId;
    }

    /**
     *  <p>Unique identifier of the referenced resource, if known.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced resource, if known.</p>
     */

    public String getKey() {
        return this.key;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setTypeId(final com.commercetools.importapi.models.common.ReferenceType typeId) {
        this.typeId = typeId;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReferencedResourceNotFoundImpl that = (ReferencedResourceNotFoundImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(typeId, that.typeId)
                .append(id, that.id)
                .append(key, that.key)
                .append(code, that.code)
                .append(message, that.message)
                .append(typeId, that.typeId)
                .append(id, that.id)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(typeId)
                .append(id)
                .append(key)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("typeId", typeId)
                .append("id", id)
                .append("key", key)
                .build();
    }

}
