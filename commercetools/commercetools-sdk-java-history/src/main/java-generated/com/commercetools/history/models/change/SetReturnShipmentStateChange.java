
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.ReturnShipmentState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetReturnShipmentStateChangeImpl.class)
public interface SetReturnShipmentStateChange extends Change {

    String SET_RETURN_SHIPMENT_STATE_CHANGE = "SetReturnShipmentStateChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setReturnShipmentState</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("nextValue")
    public ReturnShipmentState getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public ReturnShipmentState getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final ReturnShipmentState nextValue);

    public void setPreviousValue(final ReturnShipmentState previousValue);

    public static SetReturnShipmentStateChange of() {
        return new SetReturnShipmentStateChangeImpl();
    }

    public static SetReturnShipmentStateChange of(final SetReturnShipmentStateChange template) {
        SetReturnShipmentStateChangeImpl instance = new SetReturnShipmentStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetReturnShipmentStateChangeBuilder builder() {
        return SetReturnShipmentStateChangeBuilder.of();
    }

    public static SetReturnShipmentStateChangeBuilder builder(final SetReturnShipmentStateChange template) {
        return SetReturnShipmentStateChangeBuilder.of(template);
    }

    default <T> T withSetReturnShipmentStateChange(Function<SetReturnShipmentStateChange, T> helper) {
        return helper.apply(this);
    }
}
