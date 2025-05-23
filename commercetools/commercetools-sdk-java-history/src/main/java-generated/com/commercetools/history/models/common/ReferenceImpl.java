
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
 * Reference
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReferenceImpl implements Reference, ModelBase {

    private String id;

    private com.commercetools.history.models.common.ReferenceTypeId typeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReferenceImpl(@JsonProperty("id") final String id,
            @JsonProperty("typeId") final com.commercetools.history.models.common.ReferenceTypeId typeId) {
        this.id = id;
        this.typeId = typeId;
    }

    /**
     * create empty instance
     */
    public ReferenceImpl() {
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

    public com.commercetools.history.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    public void setId(final String id) {
        this.id = id;
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

        ReferenceImpl that = (ReferenceImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(typeId, that.typeId)
                .append(id, that.id)
                .append(typeId, that.typeId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(typeId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("typeId", typeId)
                .build();
    }

    @Override
    public Reference copyDeep() {
        return Reference.deepCopy(this);
    }
}
