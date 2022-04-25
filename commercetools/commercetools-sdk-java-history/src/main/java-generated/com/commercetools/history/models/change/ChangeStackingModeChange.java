
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.StackingMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeStackingModeChangeImpl.class)
public interface ChangeStackingModeChange extends Change {

    String CHANGE_STACKING_MODE_CHANGE = "ChangeStackingModeChange";

    /**
    *  <p>Update action for <code>changeStackingMode</code> on cart discounts</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("nextValue")
    public StackingMode getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public StackingMode getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final StackingMode nextValue);

    public void setPreviousValue(final StackingMode previousValue);

    public static ChangeStackingModeChange of() {
        return new ChangeStackingModeChangeImpl();
    }

    public static ChangeStackingModeChange of(final ChangeStackingModeChange template) {
        ChangeStackingModeChangeImpl instance = new ChangeStackingModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeStackingModeChangeBuilder builder() {
        return ChangeStackingModeChangeBuilder.of();
    }

    public static ChangeStackingModeChangeBuilder builder(final ChangeStackingModeChange template) {
        return ChangeStackingModeChangeBuilder.of(template);
    }

    default <T> T withChangeStackingModeChange(Function<ChangeStackingModeChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeStackingModeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeStackingModeChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeStackingModeChange>";
            }
        };
    }
}
