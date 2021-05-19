
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.TaxMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetShippingMethodTaxAmountChangeImpl.class)
public interface SetShippingMethodTaxAmountChange extends Change {

    String SET_SHIPPING_METHOD_TAX_AMOUNT_CHANGE = "SetShippingMethodTaxAmountChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setShippingMethodTaxAmount</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Object getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    public void setChange(final String change);

    public void setTaxMode(final TaxMode taxMode);

    public void setNextValue(final Object nextValue);

    public void setPreviousValue(final Object previousValue);

    public static SetShippingMethodTaxAmountChange of() {
        return new SetShippingMethodTaxAmountChangeImpl();
    }

    public static SetShippingMethodTaxAmountChange of(final SetShippingMethodTaxAmountChange template) {
        SetShippingMethodTaxAmountChangeImpl instance = new SetShippingMethodTaxAmountChangeImpl();
        instance.setChange(template.getChange());
        instance.setTaxMode(template.getTaxMode());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetShippingMethodTaxAmountChangeBuilder builder() {
        return SetShippingMethodTaxAmountChangeBuilder.of();
    }

    public static SetShippingMethodTaxAmountChangeBuilder builder(final SetShippingMethodTaxAmountChange template) {
        return SetShippingMethodTaxAmountChangeBuilder.of(template);
    }

    default <T> T withSetShippingMethodTaxAmountChange(Function<SetShippingMethodTaxAmountChange, T> helper) {
        return helper.apply(this);
    }
}
