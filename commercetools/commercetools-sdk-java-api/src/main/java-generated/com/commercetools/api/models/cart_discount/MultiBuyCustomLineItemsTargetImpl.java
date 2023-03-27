
package com.commercetools.api.models.cart_discount;

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
 *  <p>This Discount target is similar to <code>MultiBuyLineItems</code>, but is applied on Custom Line Items instead of Line Items.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MultiBuyCustomLineItemsTargetImpl implements MultiBuyCustomLineItemsTarget, ModelBase {

    private String type;

    private String predicate;

    private Integer triggerQuantity;

    private Integer discountedQuantity;

    private Integer maxOccurrence;

    private com.commercetools.api.models.cart_discount.SelectionMode selectionMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MultiBuyCustomLineItemsTargetImpl(@JsonProperty("predicate") final String predicate,
            @JsonProperty("triggerQuantity") final Integer triggerQuantity,
            @JsonProperty("discountedQuantity") final Integer discountedQuantity,
            @JsonProperty("maxOccurrence") final Integer maxOccurrence,
            @JsonProperty("selectionMode") final com.commercetools.api.models.cart_discount.SelectionMode selectionMode) {
        this.predicate = predicate;
        this.triggerQuantity = triggerQuantity;
        this.discountedQuantity = discountedQuantity;
        this.maxOccurrence = maxOccurrence;
        this.selectionMode = selectionMode;
        this.type = MULTI_BUY_CUSTOM_LINE_ITEMS;
    }

    /**
     * create empty instance
     */
    public MultiBuyCustomLineItemsTargetImpl() {
        this.type = MULTI_BUY_CUSTOM_LINE_ITEMS;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Valid CustomLineItems target predicate. The Discount will be applied to Custom Line Items that are matched by the predicate.</p>
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     *  <p>Number of Custom Line Items to be present in order to trigger an application of this Discount.</p>
     */

    public Integer getTriggerQuantity() {
        return this.triggerQuantity;
    }

    /**
     *  <p>Number of Custom Line Items that are discounted per application of this Discount.</p>
     */

    public Integer getDiscountedQuantity() {
        return this.discountedQuantity;
    }

    /**
     *  <p>Maximum number of times this Discount can be applied.</p>
     */

    public Integer getMaxOccurrence() {
        return this.maxOccurrence;
    }

    /**
     *  <p>Discounts particular Line Items only according to the SelectionMode.</p>
     */

    public com.commercetools.api.models.cart_discount.SelectionMode getSelectionMode() {
        return this.selectionMode;
    }

    public void setPredicate(final String predicate) {
        this.predicate = predicate;
    }

    public void setTriggerQuantity(final Integer triggerQuantity) {
        this.triggerQuantity = triggerQuantity;
    }

    public void setDiscountedQuantity(final Integer discountedQuantity) {
        this.discountedQuantity = discountedQuantity;
    }

    public void setMaxOccurrence(final Integer maxOccurrence) {
        this.maxOccurrence = maxOccurrence;
    }

    public void setSelectionMode(final com.commercetools.api.models.cart_discount.SelectionMode selectionMode) {
        this.selectionMode = selectionMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MultiBuyCustomLineItemsTargetImpl that = (MultiBuyCustomLineItemsTargetImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(predicate, that.predicate)
                .append(triggerQuantity, that.triggerQuantity)
                .append(discountedQuantity, that.discountedQuantity)
                .append(maxOccurrence, that.maxOccurrence)
                .append(selectionMode, that.selectionMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(predicate)
                .append(triggerQuantity)
                .append(discountedQuantity)
                .append(maxOccurrence)
                .append(selectionMode)
                .toHashCode();
    }

}
