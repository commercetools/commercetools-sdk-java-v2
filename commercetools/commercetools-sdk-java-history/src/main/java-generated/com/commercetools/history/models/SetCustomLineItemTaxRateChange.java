
package com.commercetools.history.models;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetCustomLineItemTaxRateChangeImpl.class)
public interface SetCustomLineItemTaxRateChange extends Change {

    String SET_CUSTOM_LINE_ITEM_TAX_RATE_CHANGE = "SetCustomLineItemTaxRateChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setCustomLineItemTaxRate</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public LocalizedString getCustomLineItem();

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
    *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
    */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TaxRate getNextValue();

    /**
    *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
    */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public TaxRate getPreviousValue();

    public void setChange(final String change);

    public void setCustomLineItem(final LocalizedString customLineItem);

    public void setCustomLineItemId(final String customLineItemId);

    public void setNextValue(final TaxRate nextValue);

    public void setPreviousValue(final TaxRate previousValue);

    public static SetCustomLineItemTaxRateChange of() {
        return new SetCustomLineItemTaxRateChangeImpl();
    }

    public static SetCustomLineItemTaxRateChange of(final SetCustomLineItemTaxRateChange template) {
        SetCustomLineItemTaxRateChangeImpl instance = new SetCustomLineItemTaxRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetCustomLineItemTaxRateChangeBuilder builder() {
        return SetCustomLineItemTaxRateChangeBuilder.of();
    }

    public static SetCustomLineItemTaxRateChangeBuilder builder(final SetCustomLineItemTaxRateChange template) {
        return SetCustomLineItemTaxRateChangeBuilder.of(template);
    }

    default <T> T withSetCustomLineItemTaxRateChange(Function<SetCustomLineItemTaxRateChange, T> helper) {
        return helper.apply(this);
    }
}
