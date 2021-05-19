
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.TaxMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeTaxModeChangeImpl.class)
public interface ChangeTaxModeChange extends Change {

    String CHANGE_TAX_MODE_CHANGE = "ChangeTaxModeChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>changeTaxMode</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public TaxMode getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public TaxMode getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final TaxMode previousValue);

    public void setNextValue(final TaxMode nextValue);

    public static ChangeTaxModeChange of() {
        return new ChangeTaxModeChangeImpl();
    }

    public static ChangeTaxModeChange of(final ChangeTaxModeChange template) {
        ChangeTaxModeChangeImpl instance = new ChangeTaxModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeTaxModeChangeBuilder builder() {
        return ChangeTaxModeChangeBuilder.of();
    }

    public static ChangeTaxModeChangeBuilder builder(final ChangeTaxModeChange template) {
        return ChangeTaxModeChangeBuilder.of(template);
    }

    default <T> T withChangeTaxModeChange(Function<ChangeTaxModeChange, T> helper) {
        return helper.apply(this);
    }
}
