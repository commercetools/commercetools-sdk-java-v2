
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeLineItemQuantityChangeImpl.class)
public interface ChangeLineItemQuantityChange extends Change {

    String CHANGE_LINE_ITEM_QUANTITY_CHANGE = "ChangeLineItemQuantityChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>changeLineItemQuantity</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
    *  <p>The amount of a LineItem in the cart. Must be a positive integer.</p>
    */
    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    /**
    *  <p>The amount of a LineItem in the cart. Must be a positive integer.</p>
    */
    @NotNull
    @JsonProperty("previousValue")
    public Integer getPreviousValue();

    public void setChange(final String change);

    public void setLineItem(final LocalizedString lineItem);

    public void setLineItemId(final String lineItemId);

    public void setNextValue(final Integer nextValue);

    public void setPreviousValue(final Integer previousValue);

    public static ChangeLineItemQuantityChange of() {
        return new ChangeLineItemQuantityChangeImpl();
    }

    public static ChangeLineItemQuantityChange of(final ChangeLineItemQuantityChange template) {
        ChangeLineItemQuantityChangeImpl instance = new ChangeLineItemQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setLineItemId(template.getLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeLineItemQuantityChangeBuilder builder() {
        return ChangeLineItemQuantityChangeBuilder.of();
    }

    public static ChangeLineItemQuantityChangeBuilder builder(final ChangeLineItemQuantityChange template) {
        return ChangeLineItemQuantityChangeBuilder.of(template);
    }

    default <T> T withChangeLineItemQuantityChange(Function<ChangeLineItemQuantityChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeLineItemQuantityChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeLineItemQuantityChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeLineItemQuantityChange>";
            }
        };
    }
}
