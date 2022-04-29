
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.TaxMode;
import com.commercetools.history.models.common.TaxRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetLineItemTaxAmountChangeImpl.class)
public interface SetLineItemTaxAmountChange extends Change {

    String SET_LINE_ITEM_TAX_AMOUNT_CHANGE = "SetLineItemTaxAmountChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setLineItemTaxAmount</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

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

    public void setLineItem(final LocalizedString lineItem);

    public void setVariant(final String variant);

    public void setTaxMode(final TaxMode taxMode);

    public void setNextValue(final TaxRate nextValue);

    public void setPreviousValue(final TaxRate previousValue);

    public static SetLineItemTaxAmountChange of() {
        return new SetLineItemTaxAmountChangeImpl();
    }

    public static SetLineItemTaxAmountChange of(final SetLineItemTaxAmountChange template) {
        SetLineItemTaxAmountChangeImpl instance = new SetLineItemTaxAmountChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setVariant(template.getVariant());
        instance.setTaxMode(template.getTaxMode());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetLineItemTaxAmountChangeBuilder builder() {
        return SetLineItemTaxAmountChangeBuilder.of();
    }

    public static SetLineItemTaxAmountChangeBuilder builder(final SetLineItemTaxAmountChange template) {
        return SetLineItemTaxAmountChangeBuilder.of(template);
    }

    default <T> T withSetLineItemTaxAmountChange(Function<SetLineItemTaxAmountChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemTaxAmountChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemTaxAmountChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemTaxAmountChange>";
            }
        };
    }
}
