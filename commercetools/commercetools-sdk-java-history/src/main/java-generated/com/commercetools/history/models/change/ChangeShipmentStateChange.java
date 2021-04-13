
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.ShipmentState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeShipmentStateChangeImpl.class)
public interface ChangeShipmentStateChange extends Change {

    String CHANGE_SHIPMENT_STATE_CHANGE = "ChangeShipmentStateChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>changeShipmentState</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("nextValue")
    public ShipmentState getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public ShipmentState getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final ShipmentState nextValue);

    public void setPreviousValue(final ShipmentState previousValue);

    public static ChangeShipmentStateChange of() {
        return new ChangeShipmentStateChangeImpl();
    }

    public static ChangeShipmentStateChange of(final ChangeShipmentStateChange template) {
        ChangeShipmentStateChangeImpl instance = new ChangeShipmentStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeShipmentStateChangeBuilder builder() {
        return ChangeShipmentStateChangeBuilder.of();
    }

    public static ChangeShipmentStateChangeBuilder builder(final ChangeShipmentStateChange template) {
        return ChangeShipmentStateChangeBuilder.of(template);
    }

    default <T> T withChangeShipmentStateChange(Function<ChangeShipmentStateChange, T> helper) {
        return helper.apply(this);
    }
}
