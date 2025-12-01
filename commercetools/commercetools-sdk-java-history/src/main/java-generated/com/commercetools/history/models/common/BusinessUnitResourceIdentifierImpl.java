
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>. Either <code>id</code> or <code>key</code> is required. If both are set, an <span>InvalidJsonInput</span> error is returned.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitResourceIdentifierImpl implements BusinessUnitResourceIdentifier, ModelBase {

    private String id;

    private String key;

    private com.commercetools.history.models.common.ReferenceTypeId typeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitResourceIdentifierImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("typeId") final com.commercetools.history.models.common.ReferenceTypeId typeId) {
        this.id = id;
        this.key = key;
        this.typeId = typeId;
    }

    /**
     * create empty instance
     */
    public BusinessUnitResourceIdentifierImpl() {
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>. Required if <code>key</code> is absent.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Unique key of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>. Required if <code>id</code> is absent.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Type of resource the value should reference. Supported resource type identifiers are:</p>
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

        BusinessUnitResourceIdentifierImpl that = (BusinessUnitResourceIdentifierImpl) o;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("key", key)
                .append("typeId", typeId)
                .build();
    }

    @Override
    public BusinessUnitResourceIdentifier copyDeep() {
        return BusinessUnitResourceIdentifier.deepCopy(this);
    }
}
