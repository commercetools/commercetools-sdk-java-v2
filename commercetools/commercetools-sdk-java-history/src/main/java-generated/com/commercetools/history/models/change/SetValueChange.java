
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetValueChangeImpl.class)
public interface SetValueChange extends Change {

    String SET_VALUE_CHANGE = "SetValueChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setValue</code> on custom objects</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final Object nextValue);

    public void setPreviousValue(final Object previousValue);

    public static SetValueChange of() {
        return new SetValueChangeImpl();
    }

    public static SetValueChange of(final SetValueChange template) {
        SetValueChangeImpl instance = new SetValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetValueChangeBuilder builder() {
        return SetValueChangeBuilder.of();
    }

    public static SetValueChangeBuilder builder(final SetValueChange template) {
        return SetValueChangeBuilder.of(template);
    }

    default <T> T withSetValueChange(Function<SetValueChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetValueChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetValueChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetValueChange>";
            }
        };
    }
}
