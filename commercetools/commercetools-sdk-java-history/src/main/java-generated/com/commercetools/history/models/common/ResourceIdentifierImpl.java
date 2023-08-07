
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ResourceIdentifier
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResourceIdentifierImpl implements ResourceIdentifier, ModelBase {

    private String id;

    private String key;

    private com.commercetools.history.models.common.ReferenceTypeId typeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ResourceIdentifierImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("typeId") final com.commercetools.history.models.common.ReferenceTypeId typeId) {
        this.id = id;
        this.key = key;
        this.typeId = typeId;
    }

    /**
     * create empty instance
     */
    public ResourceIdentifierImpl() {
    }

    /**
     *
     */

    public String getId() {
        return this.id;
    }

    /**
     *
     */

    public String getKey() {
        return this.key;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setTypeId(final com.commercetools.history.models.common.ReferenceTypeId typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ResourceIdentifierImpl that = (ResourceIdentifierImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(key, that.key)
                .append(typeId, that.typeId)
                .append(id, that.id)
                .append(key, that.key)
                .append(typeId, that.typeId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(key).append(typeId).toHashCode();
    }

}
