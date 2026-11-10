
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Represents a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a> that is only associated with a single Cart or Order.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DirectDiscountImpl implements DirectDiscount, ModelBase {

    private String id;

    private com.commercetools.api.models.cart_discount.CartDiscountValue value;

    private com.commercetools.api.models.cart_discount.CartDiscountTarget target;

    private Boolean participateInBestDealSelection;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DirectDiscountImpl(@JsonProperty("id") final String id,
            @JsonProperty("value") final com.commercetools.api.models.cart_discount.CartDiscountValue value,
            @JsonProperty("target") final com.commercetools.api.models.cart_discount.CartDiscountTarget target,
            @JsonProperty("participateInBestDealSelection") final Boolean participateInBestDealSelection) {
        this.id = id;
        this.value = value;
        this.target = target;
        this.participateInBestDealSelection = participateInBestDealSelection;
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

    public com.commercetools.api.models.cart_discount.CartDiscountValue getValue() {
        return this.value;
    }

    /**
     *  <p>Segment of the Cart that is discounted.</p>
     *  <p>Absent if the <code>value</code> is <code>giftLineItem</code>.</p>
     */

    public com.commercetools.api.models.cart_discount.CartDiscountTarget getTarget() {
        return this.target;
    }

    /**
     *  <ul>
     *   <li>If <code>true</code>, Direct Discounts compete against Product Discounts to apply the <span>best deal</span>.</li>
     *   <li>If <code>false</code>, Direct Discounts are ignored when calculating the best deal comparison, and are applied on top of the discount type that offers the best deal.</li>
     *  </ul>
     *  <p>This applies only when the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCombinationMode" rel="nofollow">DiscountCombinationMode</a> for the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> is <code>BestDeal</code>.</p>
     */

    public Boolean getParticipateInBestDealSelection() {
        return this.participateInBestDealSelection;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setValue(final com.commercetools.api.models.cart_discount.CartDiscountValue value) {
        this.value = value;
    }

    public void setTarget(final com.commercetools.api.models.cart_discount.CartDiscountTarget target) {
        this.target = target;
    }

    public void setParticipateInBestDealSelection(final Boolean participateInBestDealSelection) {
        this.participateInBestDealSelection = participateInBestDealSelection;
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
                .append(participateInBestDealSelection, that.participateInBestDealSelection)
                .append(id, that.id)
                .append(value, that.value)
                .append(target, that.target)
                .append(participateInBestDealSelection, that.participateInBestDealSelection)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(value)
                .append(target)
                .append(participateInBestDealSelection)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("value", value)
                .append("target", target)
                .append("participateInBestDealSelection", participateInBestDealSelection)
                .build();
    }

    @Override
    public DirectDiscount copyDeep() {
        return DirectDiscount.deepCopy(this);
    }
}
