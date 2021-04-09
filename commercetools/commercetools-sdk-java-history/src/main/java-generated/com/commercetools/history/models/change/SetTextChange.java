
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetTextChangeImpl.class)
public interface SetTextChange extends Change {

    String SET_TEXT_CHANGE = "SetTextChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setText</code></p>
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

    public static SetTextChange of() {
        return new SetTextChangeImpl();
    }

    public static SetTextChange of(final SetTextChange template) {
        SetTextChangeImpl instance = new SetTextChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetTextChangeBuilder builder() {
        return SetTextChangeBuilder.of();
    }

    public static SetTextChangeBuilder builder(final SetTextChange template) {
        return SetTextChangeBuilder.of(template);
    }

    default <T> T withSetTextChange(Function<SetTextChange, T> helper) {
        return helper.apply(this);
    }
}
