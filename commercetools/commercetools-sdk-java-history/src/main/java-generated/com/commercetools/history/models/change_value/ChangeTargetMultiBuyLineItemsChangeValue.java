
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
*  <p>Shape of the value for cart discounts multiBuyLineItems target.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeTargetMultiBuyLineItemsChangeValueImpl.class)
public interface ChangeTargetMultiBuyLineItemsChangeValue extends ChangeTargetChangeValue {

    String MULTI_BUY_LINE_ITEMS = "multiBuyLineItems";

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

    public static ChangeTargetMultiBuyLineItemsChangeValue of() {
        return new ChangeTargetMultiBuyLineItemsChangeValueImpl();
    }

    public static ChangeTargetMultiBuyLineItemsChangeValue of(final ChangeTargetMultiBuyLineItemsChangeValue template) {
        ChangeTargetMultiBuyLineItemsChangeValueImpl instance = new ChangeTargetMultiBuyLineItemsChangeValueImpl();
        instance.setPredicate(template.getPredicate());
        instance.setTriggerQuantity(template.getTriggerQuantity());
        instance.setDiscountedQuantity(template.getDiscountedQuantity());
        instance.setMaxOccurrence(template.getMaxOccurrence());
        instance.setSelectionMode(template.getSelectionMode());
        return instance;
    }

    public static ChangeTargetMultiBuyLineItemsChangeValueBuilder builder() {
        return ChangeTargetMultiBuyLineItemsChangeValueBuilder.of();
    }

    public static ChangeTargetMultiBuyLineItemsChangeValueBuilder builder(
            final ChangeTargetMultiBuyLineItemsChangeValue template) {
        return ChangeTargetMultiBuyLineItemsChangeValueBuilder.of(template);
    }

    default <T> T withChangeTargetMultiBuyLineItemsChangeValue(
            Function<ChangeTargetMultiBuyLineItemsChangeValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTargetMultiBuyLineItemsChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTargetMultiBuyLineItemsChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTargetMultiBuyLineItemsChangeValue>";
            }
        };
    }
}
