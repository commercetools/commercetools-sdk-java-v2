
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.RoundingMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeTaxRoundingModeChangeImpl.class)
public interface ChangeTaxRoundingModeChange extends Change {

    String CHANGE_TAX_ROUNDING_MODE_CHANGE = "ChangeTaxRoundingModeChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>changeTaxRoundingMode</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public RoundingMode getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public RoundingMode getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final RoundingMode previousValue);

    public void setNextValue(final RoundingMode nextValue);

    public static ChangeTaxRoundingModeChange of() {
        return new ChangeTaxRoundingModeChangeImpl();
    }

    public static ChangeTaxRoundingModeChange of(final ChangeTaxRoundingModeChange template) {
        ChangeTaxRoundingModeChangeImpl instance = new ChangeTaxRoundingModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeTaxRoundingModeChangeBuilder builder() {
        return ChangeTaxRoundingModeChangeBuilder.of();
    }

    public static ChangeTaxRoundingModeChangeBuilder builder(final ChangeTaxRoundingModeChange template) {
        return ChangeTaxRoundingModeChangeBuilder.of(template);
    }

    default <T> T withChangeTaxRoundingModeChange(Function<ChangeTaxRoundingModeChange, T> helper) {
        return helper.apply(this);
    }
}
