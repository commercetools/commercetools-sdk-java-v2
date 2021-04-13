
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetStatusInterfaceTextChangeImpl.class)
public interface SetStatusInterfaceTextChange extends Change {

    String SET_STATUS_INTERFACE_TEXT_CHANGE = "SetStatusInterfaceTextChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setStatusInterfaceText</code></p>
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

    public static SetStatusInterfaceTextChange of() {
        return new SetStatusInterfaceTextChangeImpl();
    }

    public static SetStatusInterfaceTextChange of(final SetStatusInterfaceTextChange template) {
        SetStatusInterfaceTextChangeImpl instance = new SetStatusInterfaceTextChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetStatusInterfaceTextChangeBuilder builder() {
        return SetStatusInterfaceTextChangeBuilder.of();
    }

    public static SetStatusInterfaceTextChangeBuilder builder(final SetStatusInterfaceTextChange template) {
        return SetStatusInterfaceTextChangeBuilder.of(template);
    }

    default <T> T withSetStatusInterfaceTextChange(Function<SetStatusInterfaceTextChange, T> helper) {
        return helper.apply(this);
    }
}
