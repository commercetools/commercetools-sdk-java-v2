
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Pattern targets can be used to model Buy and Get discounts.</p>
 *  <p>Unlike CartDiscountLineItemsTarget and CartDiscountCustomLineItemsTarget, it does not apply to a (Custom) Line Item as a whole, but to individual units of a (Custom) Line Item. The discounts can apply multiple times on the same cart, but each unit can be discounted only once.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountPatternTargetImpl implements CartDiscountPatternTarget, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.cart_discount.PatternComponent> triggerPattern;

    private java.util.List<com.commercetools.api.models.cart_discount.PatternComponent> targetPattern;

    private Integer maxOccurrence;

    private com.commercetools.api.models.cart_discount.SelectionMode selectionMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountPatternTargetImpl(
            @JsonProperty("triggerPattern") final java.util.List<com.commercetools.api.models.cart_discount.PatternComponent> triggerPattern,
            @JsonProperty("targetPattern") final java.util.List<com.commercetools.api.models.cart_discount.PatternComponent> targetPattern,
            @JsonProperty("maxOccurrence") final Integer maxOccurrence,
            @JsonProperty("selectionMode") final com.commercetools.api.models.cart_discount.SelectionMode selectionMode) {
        this.triggerPattern = triggerPattern;
        this.targetPattern = targetPattern;
        this.maxOccurrence = maxOccurrence;
        this.selectionMode = selectionMode;
        this.type = PATTERN;
    }

    /**
     * create empty instance
     */
    public CartDiscountPatternTargetImpl() {
        this.type = PATTERN;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that trigger a discount application.</p>
     *  <p>Based on the availability of matching units, the <code>triggerPattern</code> can match multiple times, limiting the number of maximum times the discount will be applied. The units matched in the <code>triggerPattern</code> are excluded and not considered for the <code>targetPattern</code>.</p>
     *  <p>To further limit the discount application, set the <code>maxOccurrence</code>.</p>
     */

    public java.util.List<com.commercetools.api.models.cart_discount.PatternComponent> getTriggerPattern() {
        return this.triggerPattern;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     *  <p>Based on the availability of matching units and the limits from the <code>triggerPattern</code> or <code>maxOccurrence</code>, the <code>targetPattern</code> can match multiple times.</p>
     *  <p>This array cannot be empty.</p>
     */

    public java.util.List<com.commercetools.api.models.cart_discount.PatternComponent> getTargetPattern() {
        return this.targetPattern;
    }

    /**
     *  <p>Maximum number of times the Discount can apply on a Cart.</p>
     *  <p>If empty or not set, the Discount will apply indefinitely.</p>
     */

    public Integer getMaxOccurrence() {
        return this.maxOccurrence;
    }

    /**
     *  <p>Determines which of the matching units of (Custom) Line Items are discounted.</p>
     */

    public com.commercetools.api.models.cart_discount.SelectionMode getSelectionMode() {
        return this.selectionMode;
    }

    public void setTriggerPattern(final com.commercetools.api.models.cart_discount.PatternComponent... triggerPattern) {
        this.triggerPattern = new ArrayList<>(Arrays.asList(triggerPattern));
    }

    public void setTriggerPattern(
            final java.util.List<com.commercetools.api.models.cart_discount.PatternComponent> triggerPattern) {
        this.triggerPattern = triggerPattern;
    }

    public void setTargetPattern(final com.commercetools.api.models.cart_discount.PatternComponent... targetPattern) {
        this.targetPattern = new ArrayList<>(Arrays.asList(targetPattern));
    }

    public void setTargetPattern(
            final java.util.List<com.commercetools.api.models.cart_discount.PatternComponent> targetPattern) {
        this.targetPattern = targetPattern;
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

        CartDiscountPatternTargetImpl that = (CartDiscountPatternTargetImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(triggerPattern, that.triggerPattern)
                .append(targetPattern, that.targetPattern)
                .append(maxOccurrence, that.maxOccurrence)
                .append(selectionMode, that.selectionMode)
                .append(type, that.type)
                .append(triggerPattern, that.triggerPattern)
                .append(targetPattern, that.targetPattern)
                .append(maxOccurrence, that.maxOccurrence)
                .append(selectionMode, that.selectionMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(triggerPattern)
                .append(targetPattern)
                .append(maxOccurrence)
                .append(selectionMode)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("triggerPattern", triggerPattern)
                .append("targetPattern", targetPattern)
                .append("maxOccurrence", maxOccurrence)
                .append("selectionMode", selectionMode)
                .build();
    }

    @Override
    public CartDiscountPatternTarget copyDeep() {
        return CartDiscountPatternTarget.deepCopy(this);
    }
}
