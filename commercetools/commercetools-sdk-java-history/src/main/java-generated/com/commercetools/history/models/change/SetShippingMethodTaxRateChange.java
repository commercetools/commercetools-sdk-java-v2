
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.TaxMode;
import com.commercetools.history.models.common.TaxRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetShippingMethodTaxRateChangeImpl.class)
public interface SetShippingMethodTaxRateChange extends Change {

    String SET_SHIPPING_METHOD_TAX_RATE_CHANGE = "SetShippingMethodTaxRateChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setShippingMethodTaxRate</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

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

    public void setTaxMode(final TaxMode taxMode);

    public void setNextValue(final TaxRate nextValue);

    public void setPreviousValue(final TaxRate previousValue);

    public static SetShippingMethodTaxRateChange of() {
        return new SetShippingMethodTaxRateChangeImpl();
    }

    public static SetShippingMethodTaxRateChange of(final SetShippingMethodTaxRateChange template) {
        SetShippingMethodTaxRateChangeImpl instance = new SetShippingMethodTaxRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setTaxMode(template.getTaxMode());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetShippingMethodTaxRateChangeBuilder builder() {
        return SetShippingMethodTaxRateChangeBuilder.of();
    }

    public static SetShippingMethodTaxRateChangeBuilder builder(final SetShippingMethodTaxRateChange template) {
        return SetShippingMethodTaxRateChangeBuilder.of(template);
    }

    default <T> T withSetShippingMethodTaxRateChange(Function<SetShippingMethodTaxRateChange, T> helper) {
        return helper.apply(this);
    }
}
