
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetInterfaceIdChangeImpl.class)
public interface SetInterfaceIdChange extends Change {

    String SET_INTERFACE_ID_CHANGE = "SetInterfaceIdChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setInterfaceId</code></p>
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

    public static SetInterfaceIdChange of() {
        return new SetInterfaceIdChangeImpl();
    }

    public static SetInterfaceIdChange of(final SetInterfaceIdChange template) {
        SetInterfaceIdChangeImpl instance = new SetInterfaceIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetInterfaceIdChangeBuilder builder() {
        return SetInterfaceIdChangeBuilder.of();
    }

    public static SetInterfaceIdChangeBuilder builder(final SetInterfaceIdChange template) {
        return SetInterfaceIdChangeBuilder.of(template);
    }

    default <T> T withSetInterfaceIdChange(Function<SetInterfaceIdChange, T> helper) {
        return helper.apply(this);
    }
}
