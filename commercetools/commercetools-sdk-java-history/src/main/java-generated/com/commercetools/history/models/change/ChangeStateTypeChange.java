
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.StateType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeStateTypeChangeImpl.class)
public interface ChangeStateTypeChange extends Change {

    String CHANGE_STATE_TYPE_CHANGE = "ChangeStateTypeChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>changeType</code> on state</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public StateType getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public StateType getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final StateType previousValue);

    public void setNextValue(final StateType nextValue);

    public static ChangeStateTypeChange of() {
        return new ChangeStateTypeChangeImpl();
    }

    public static ChangeStateTypeChange of(final ChangeStateTypeChange template) {
        ChangeStateTypeChangeImpl instance = new ChangeStateTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeStateTypeChangeBuilder builder() {
        return ChangeStateTypeChangeBuilder.of();
    }

    public static ChangeStateTypeChangeBuilder builder(final ChangeStateTypeChange template) {
        return ChangeStateTypeChangeBuilder.of(template);
    }

    default <T> T withChangeStateTypeChange(Function<ChangeStateTypeChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeStateTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeStateTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeStateTypeChange>";
            }
        };
    }
}
