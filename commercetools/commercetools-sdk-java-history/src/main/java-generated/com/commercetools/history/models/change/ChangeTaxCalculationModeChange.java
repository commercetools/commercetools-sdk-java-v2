
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.TaxCalculationMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeTaxCalculationModeChangeImpl.class)
public interface ChangeTaxCalculationModeChange extends Change {

    String CHANGE_TAX_CALCULATION_MODE_CHANGE = "ChangeTaxCalculationModeChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>changeTaxCalculationMode</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public TaxCalculationMode getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public TaxCalculationMode getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final TaxCalculationMode previousValue);

    public void setNextValue(final TaxCalculationMode nextValue);

    public static ChangeTaxCalculationModeChange of() {
        return new ChangeTaxCalculationModeChangeImpl();
    }

    public static ChangeTaxCalculationModeChange of(final ChangeTaxCalculationModeChange template) {
        ChangeTaxCalculationModeChangeImpl instance = new ChangeTaxCalculationModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeTaxCalculationModeChangeBuilder builder() {
        return ChangeTaxCalculationModeChangeBuilder.of();
    }

    public static ChangeTaxCalculationModeChangeBuilder builder(final ChangeTaxCalculationModeChange template) {
        return ChangeTaxCalculationModeChangeBuilder.of(template);
    }

    default <T> T withChangeTaxCalculationModeChange(Function<ChangeTaxCalculationModeChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTaxCalculationModeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTaxCalculationModeChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTaxCalculationModeChange>";
            }
        };
    }
}
