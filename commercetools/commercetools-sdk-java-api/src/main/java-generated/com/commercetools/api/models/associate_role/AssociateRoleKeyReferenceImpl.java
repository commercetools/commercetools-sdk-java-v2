
package com.commercetools.api.models.associate_role;

import java.time.*;
import java.util.*;

import com.commercetools.api.models.common.ReferenceTypeId;
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
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:KeyReference" rel="nofollow">KeyReference</a> to an <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleKeyReferenceImpl implements AssociateRoleKeyReference, ModelBase {

    private com.commercetools.api.models.common.ReferenceTypeId typeId;

    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRoleKeyReferenceImpl(@JsonProperty("key") final String key) {
        this.key = key;
        this.typeId = ReferenceTypeId.findEnum("associate-role");
    }

    /**
     * create empty instance
     */
    public AssociateRoleKeyReferenceImpl() {
        this.typeId = ReferenceTypeId.findEnum("associate-role");
    }

    /**
     *  <p>Type of referenced resource.</p>
     */

    public com.commercetools.api.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    /**
     *  <p>Unique and immutable key of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a>.</p>
     */

    public String getKey() {
        return this.key;
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

        AssociateRoleKeyReferenceImpl that = (AssociateRoleKeyReferenceImpl) o;

        return new EqualsBuilder().append(typeId, that.typeId)
                .append(key, that.key)
                .append(typeId, that.typeId)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(typeId).append(key).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("typeId", typeId)
                .append("key", key)
                .build();
    }

    @Override
    public AssociateRoleKeyReference copyDeep() {
        return AssociateRoleKeyReference.deepCopy(this);
    }
}
