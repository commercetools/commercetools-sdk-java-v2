
package com.commercetools.history.models.change_value;

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
 * ChangeTargetMultiBuyCustomLineItemsChangeValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTargetMultiBuyCustomLineItemsChangeValueImpl
        implements ChangeTargetMultiBuyCustomLineItemsChangeValue, ModelBase {

    private String type;

    private String predicate;

    private Integer triggerQuantity;

    private Integer discountedQuantity;

    private Integer maxOccurrence;

    private com.commercetools.history.models.common.SelectionMode selectionMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeTargetMultiBuyCustomLineItemsChangeValueImpl(@JsonProperty("predicate") final String predicate,
            @JsonProperty("triggerQuantity") final Integer triggerQuantity,
            @JsonProperty("discountedQuantity") final Integer discountedQuantity,
            @JsonProperty("maxOccurrence") final Integer maxOccurrence,
            @JsonProperty("selectionMode") final com.commercetools.history.models.common.SelectionMode selectionMode) {
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
    public ChangeTargetMultiBuyCustomLineItemsChangeValueImpl() {
        this.type = MULTI_BUY_CUSTOM_LINE_ITEMS;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Valid CustomLineItem target predicate.</p>
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     *  <p>Quantity of Custom Line Items that triggered the application of the discount.</p>
     */

    public Integer getTriggerQuantity() {
        return this.triggerQuantity;
    }

    /**
     *  <p>Quantity of Custom Line Items discounted per application of this discount.</p>
     */

    public Integer getDiscountedQuantity() {
        return this.discountedQuantity;
    }

    /**
     *  <p>Maximum number of times the discount is applicable.</p>
     */

    public Integer getMaxOccurrence() {
        return this.maxOccurrence;
    }

    /**
     *  <p>SelectionMode based on which particular Custom Line Items were discounted.</p>
     */

    public com.commercetools.history.models.common.SelectionMode getSelectionMode() {
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

    public void setSelectionMode(final com.commercetools.history.models.common.SelectionMode selectionMode) {
        this.selectionMode = selectionMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeTargetMultiBuyCustomLineItemsChangeValueImpl that = (ChangeTargetMultiBuyCustomLineItemsChangeValueImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(predicate, that.predicate)
                .append(triggerQuantity, that.triggerQuantity)
                .append(discountedQuantity, that.discountedQuantity)
                .append(maxOccurrence, that.maxOccurrence)
                .append(selectionMode, that.selectionMode)
                .append(type, that.type)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("predicate", predicate)
                .append("triggerQuantity", triggerQuantity)
                .append("discountedQuantity", discountedQuantity)
                .append("maxOccurrence", maxOccurrence)
                .append("selectionMode", selectionMode)
                .build();
    }

    @Override
    public ChangeTargetMultiBuyCustomLineItemsChangeValue copyDeep() {
        return ChangeTargetMultiBuyCustomLineItemsChangeValue.deepCopy(this);
    }
}
