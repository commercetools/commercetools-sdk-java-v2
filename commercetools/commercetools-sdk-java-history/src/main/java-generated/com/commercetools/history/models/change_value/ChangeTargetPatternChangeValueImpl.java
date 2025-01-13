
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
 * ChangeTargetPatternChangeValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTargetPatternChangeValueImpl implements ChangeTargetPatternChangeValue, ModelBase {

    private String type;

    private java.util.List<com.commercetools.history.models.cart_discount.PatternComponent> triggerPattern;

    private java.util.List<com.commercetools.history.models.cart_discount.PatternComponent> targetPattern;

    private Integer maxOccurrence;

    private com.commercetools.history.models.common.SelectionMode selectionMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeTargetPatternChangeValueImpl(
            @JsonProperty("triggerPattern") final java.util.List<com.commercetools.history.models.cart_discount.PatternComponent> triggerPattern,
            @JsonProperty("targetPattern") final java.util.List<com.commercetools.history.models.cart_discount.PatternComponent> targetPattern,
            @JsonProperty("maxOccurrence") final Integer maxOccurrence,
            @JsonProperty("selectionMode") final com.commercetools.history.models.common.SelectionMode selectionMode) {
        this.triggerPattern = triggerPattern;
        this.targetPattern = targetPattern;
        this.maxOccurrence = maxOccurrence;
        this.selectionMode = selectionMode;
        this.type = PATTERN;
    }

    /**
     * create empty instance
     */
    public ChangeTargetPatternChangeValueImpl() {
        this.type = PATTERN;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that triggered the discount application.</p>
     */

    public java.util.List<com.commercetools.history.models.cart_discount.PatternComponent> getTriggerPattern() {
        return this.triggerPattern;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     */

    public java.util.List<com.commercetools.history.models.cart_discount.PatternComponent> getTargetPattern() {
        return this.targetPattern;
    }

    /**
     *  <p>Maximum number of times the Discount applies on a Cart.</p>
     *  <p>If empty, the Discount applies indefinitely.</p>
     */

    public Integer getMaxOccurrence() {
        return this.maxOccurrence;
    }

    /**
     *  <p>Indicates which of the matching units of (Custom) Line Items were discounted.</p>
     */

    public com.commercetools.history.models.common.SelectionMode getSelectionMode() {
        return this.selectionMode;
    }

    public void setTriggerPattern(
            final com.commercetools.history.models.cart_discount.PatternComponent... triggerPattern) {
        this.triggerPattern = new ArrayList<>(Arrays.asList(triggerPattern));
    }

    public void setTriggerPattern(
            final java.util.List<com.commercetools.history.models.cart_discount.PatternComponent> triggerPattern) {
        this.triggerPattern = triggerPattern;
    }

    public void setTargetPattern(
            final com.commercetools.history.models.cart_discount.PatternComponent... targetPattern) {
        this.targetPattern = new ArrayList<>(Arrays.asList(targetPattern));
    }

    public void setTargetPattern(
            final java.util.List<com.commercetools.history.models.cart_discount.PatternComponent> targetPattern) {
        this.targetPattern = targetPattern;
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

        ChangeTargetPatternChangeValueImpl that = (ChangeTargetPatternChangeValueImpl) o;

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

}
