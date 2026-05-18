
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
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeReferenceImpl implements DiscountCodeReference, ModelBase {

    private com.commercetools.history.models.common.ReferenceTypeId typeId;

    private String id;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountCodeReferenceImpl(@JsonProperty("id") final String id) {
        this.id = id;
        this.typeId = ReferenceTypeId.findEnum("discount-code");
    }

    /**
     * create empty instance
     */
    public DiscountCodeReferenceImpl() {
        this.typeId = ReferenceTypeId.findEnum("discount-code");
    }

    /**
     *  <p>Type of referenced resource.</p>
     */

    public com.commercetools.history.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a>.</p>
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

        DiscountCodeReferenceImpl that = (DiscountCodeReferenceImpl) o;

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
    public DiscountCodeReference copyDeep() {
        return DiscountCodeReference.deepCopy(this);
    }
}
