
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.SelectionMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Shape of the value for cart discounts multiBuyCustomLineItems target.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeTargetMultiBuyCustomLineItemsChangeValueImpl.class)
public interface ChangeTargetMultiBuyCustomLineItemsChangeValue extends ChangeTargetChangeValue {

    String MULTI_BUY_CUSTOM_LINE_ITEMS = "multiBuyCustomLineItems";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
    *  <p>Quantity of line items that need to be present in order to trigger an application of this discount.</p>
    */
    @NotNull
    @JsonProperty("triggerQuantity")
    public Integer getTriggerQuantity();

    /**
    *  <p>Quantity of line items that are discounted per application of this discount.</p>
    */
    @NotNull
    @JsonProperty("discountedQuantity")
    public Integer getDiscountedQuantity();

    /**
    *  <p>Maximum number of applications of this discount.</p>
    */
    @NotNull
    @JsonProperty("maxOccurrence")
    public Integer getMaxOccurrence();

    @NotNull
    @JsonProperty("selectionMode")
    public SelectionMode getSelectionMode();

    public void setPredicate(final String predicate);

    public void setTriggerQuantity(final Integer triggerQuantity);

    public void setDiscountedQuantity(final Integer discountedQuantity);

    public void setMaxOccurrence(final Integer maxOccurrence);

    public void setSelectionMode(final SelectionMode selectionMode);

    public static ChangeTargetMultiBuyCustomLineItemsChangeValue of() {
        return new ChangeTargetMultiBuyCustomLineItemsChangeValueImpl();
    }

    public static ChangeTargetMultiBuyCustomLineItemsChangeValue of(
            final ChangeTargetMultiBuyCustomLineItemsChangeValue template) {
        ChangeTargetMultiBuyCustomLineItemsChangeValueImpl instance = new ChangeTargetMultiBuyCustomLineItemsChangeValueImpl();
        instance.setPredicate(template.getPredicate());
        instance.setTriggerQuantity(template.getTriggerQuantity());
        instance.setDiscountedQuantity(template.getDiscountedQuantity());
        instance.setMaxOccurrence(template.getMaxOccurrence());
        instance.setSelectionMode(template.getSelectionMode());
        return instance;
    }

    public static ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder builder() {
        return ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder.of();
    }

    public static ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder builder(
            final ChangeTargetMultiBuyCustomLineItemsChangeValue template) {
        return ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder.of(template);
    }

    default <T> T withChangeTargetMultiBuyCustomLineItemsChangeValue(
            Function<ChangeTargetMultiBuyCustomLineItemsChangeValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTargetMultiBuyCustomLineItemsChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTargetMultiBuyCustomLineItemsChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTargetMultiBuyCustomLineItemsChangeValue>";
            }
        };
    }
}
