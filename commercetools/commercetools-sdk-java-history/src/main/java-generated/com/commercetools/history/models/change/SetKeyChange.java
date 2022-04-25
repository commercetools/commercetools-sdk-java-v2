
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetKeyChangeImpl.class)
public interface SetKeyChange extends Change {

    String SET_KEY_CHANGE = "SetKeyChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setKey</code></p>
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

    public static SetKeyChange of() {
        return new SetKeyChangeImpl();
    }

    public static SetKeyChange of(final SetKeyChange template) {
        SetKeyChangeImpl instance = new SetKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetKeyChangeBuilder builder() {
        return SetKeyChangeBuilder.of();
    }

    public static SetKeyChangeBuilder builder(final SetKeyChange template) {
        return SetKeyChangeBuilder.of(template);
    }

    default <T> T withSetKeyChange(Function<SetKeyChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetKeyChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetKeyChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetKeyChange>";
            }
        };
    }
}
