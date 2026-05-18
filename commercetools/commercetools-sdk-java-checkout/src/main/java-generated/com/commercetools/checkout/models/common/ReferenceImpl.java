
package com.commercetools.checkout.models.common;

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
 *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like <a href="https://docs.commercetools.com/apis/ctp:checkout:type:ApplicationReference" rel="nofollow">ApplicationReference</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReferenceImpl implements Reference, ModelBase {

    private com.commercetools.checkout.models.common.ReferenceTypeId typeId;

    private String id;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReferenceImpl(@JsonProperty("typeId") final com.commercetools.checkout.models.common.ReferenceTypeId typeId,
            @JsonProperty("id") final String id) {
        this.typeId = typeId;
        this.id = id;
    }

    /**
     * create empty instance
     */
    public ReferenceImpl() {
    }

    /**
     *  <p>Type of referenced resource.</p>
     */

    public com.commercetools.checkout.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    /**
     *  <p>Unique ID of the referenced resource.</p>
     */

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReferenceImpl that = (ReferenceImpl) o;

        return new EqualsBuilder().append(typeId, that.typeId)
                .append(id, that.id)
                .append(typeId, that.typeId)
                .append(id, that.id)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(typeId).append(id).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("typeId", typeId)
                .append("id", id)
                .build();
    }

    @Override
    public Reference copyDeep() {
        return Reference.deepCopy(this);
    }
}
