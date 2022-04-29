
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetLastNameChangeImpl.class)
public interface SetLastNameChange extends Change {

    String SET_LAST_NAME_CHANGE = "SetLastNameChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setLastName</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final String previousValue);

    public void setNextValue(final String nextValue);

    public static SetLastNameChange of() {
        return new SetLastNameChangeImpl();
    }

    public static SetLastNameChange of(final SetLastNameChange template) {
        SetLastNameChangeImpl instance = new SetLastNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetLastNameChangeBuilder builder() {
        return SetLastNameChangeBuilder.of();
    }

    public static SetLastNameChangeBuilder builder(final SetLastNameChange template) {
        return SetLastNameChangeBuilder.of(template);
    }

    default <T> T withSetLastNameChange(Function<SetLastNameChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetLastNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLastNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLastNameChange>";
            }
        };
    }
}
