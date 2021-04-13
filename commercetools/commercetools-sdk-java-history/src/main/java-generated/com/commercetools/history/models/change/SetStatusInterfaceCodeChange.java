
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetStatusInterfaceCodeChangeImpl.class)
public interface SetStatusInterfaceCodeChange extends Change {

    String SET_STATUS_INTERFACE_CODE_CHANGE = "SetStatusInterfaceCodeChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setStatusInterfaceCode</code></p>
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

    public static SetStatusInterfaceCodeChange of() {
        return new SetStatusInterfaceCodeChangeImpl();
    }

    public static SetStatusInterfaceCodeChange of(final SetStatusInterfaceCodeChange template) {
        SetStatusInterfaceCodeChangeImpl instance = new SetStatusInterfaceCodeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetStatusInterfaceCodeChangeBuilder builder() {
        return SetStatusInterfaceCodeChangeBuilder.of();
    }

    public static SetStatusInterfaceCodeChangeBuilder builder(final SetStatusInterfaceCodeChange template) {
        return SetStatusInterfaceCodeChangeBuilder.of(template);
    }

    default <T> T withSetStatusInterfaceCodeChange(Function<SetStatusInterfaceCodeChange, T> helper) {
        return helper.apply(this);
    }
}
