
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
 *  <p>Represents a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a> that is only associated with a single Cart or Order.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DirectDiscountImpl implements DirectDiscount, ModelBase {

    private String id;

    private com.commercetools.history.models.common.CartDiscountValue value;

    private com.commercetools.history.models.common.CartDiscountTarget target;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DirectDiscountImpl(@JsonProperty("id") final String id,
            @JsonProperty("value") final com.commercetools.history.models.common.CartDiscountValue value,
            @JsonProperty("target") final com.commercetools.history.models.common.CartDiscountTarget target) {
        this.id = id;
        this.value = value;
        this.target = target;
    }

    /**
     * create empty instance
     */
    public DirectDiscountImpl() {
    }

    /**
     *  <p>Unique identifier of the Direct Discount.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Effect of the Discount on the Cart.</p>
     */

    public com.commercetools.history.models.common.CartDiscountValue getValue() {
        return this.value;
    }

    /**
     *  <p>Segment of the Cart that is discounted.</p>
     *  <p>Empty when the <code>value</code> is set to <code>giftLineItem</code>.</p>
     */

    public com.commercetools.history.models.common.CartDiscountTarget getTarget() {
        return this.target;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setValue(final com.commercetools.history.models.common.CartDiscountValue value) {
        this.value = value;
    }

    public void setTarget(final com.commercetools.history.models.common.CartDiscountTarget target) {
        this.target = target;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DirectDiscountImpl that = (DirectDiscountImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(value, that.value)
                .append(target, that.target)
                .append(id, that.id)
                .append(value, that.value)
                .append(target, that.target)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(value).append(target).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("value", value)
                .append("target", target)
                .build();
    }

    @Override
    public DirectDiscount copyDeep() {
        return DirectDiscount.deepCopy(this);
    }
}
