
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeAmountPlannedChangeImpl.class)
public interface ChangeAmountPlannedChange extends Change {

    String CHANGE_AMOUNT_PLANNED_CHANGE = "ChangeAmountPlannedChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Money getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Money getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Money previousValue);

    public void setNextValue(final Money nextValue);

    public static ChangeAmountPlannedChange of() {
        return new ChangeAmountPlannedChangeImpl();
    }

    public static ChangeAmountPlannedChange of(final ChangeAmountPlannedChange template) {
        ChangeAmountPlannedChangeImpl instance = new ChangeAmountPlannedChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeAmountPlannedChangeBuilder builder() {
        return ChangeAmountPlannedChangeBuilder.of();
    }

    public static ChangeAmountPlannedChangeBuilder builder(final ChangeAmountPlannedChange template) {
        return ChangeAmountPlannedChangeBuilder.of(template);
    }

    default <T> T withChangeAmountPlannedChange(Function<ChangeAmountPlannedChange, T> helper) {
        return helper.apply(this);
    }
}
