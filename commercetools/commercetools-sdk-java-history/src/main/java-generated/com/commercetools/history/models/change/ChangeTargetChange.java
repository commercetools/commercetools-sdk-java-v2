
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.ChangeTargetChangeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeTargetChangeImpl.class)
public interface ChangeTargetChange extends Change {

    String CHANGE_TARGET_CHANGE = "ChangeTargetChange";

    /**
    *  <p>Update action for <code>changeTarget</code> on cart discounts</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ChangeTargetChangeValue getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ChangeTargetChangeValue getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final ChangeTargetChangeValue nextValue);

    public void setPreviousValue(final ChangeTargetChangeValue previousValue);

    public static ChangeTargetChange of() {
        return new ChangeTargetChangeImpl();
    }

    public static ChangeTargetChange of(final ChangeTargetChange template) {
        ChangeTargetChangeImpl instance = new ChangeTargetChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeTargetChangeBuilder builder() {
        return ChangeTargetChangeBuilder.of();
    }

    public static ChangeTargetChangeBuilder builder(final ChangeTargetChange template) {
        return ChangeTargetChangeBuilder.of(template);
    }

    default <T> T withChangeTargetChange(Function<ChangeTargetChange, T> helper) {
        return helper.apply(this);
    }
}
