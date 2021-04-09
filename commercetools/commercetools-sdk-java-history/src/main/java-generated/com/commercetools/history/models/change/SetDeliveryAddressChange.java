
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetDeliveryAddressChangeImpl.class)
public interface SetDeliveryAddressChange extends Change {

    String SET_DELIVERY_ADDRESS_CHANGE = "SetDeliveryAddressChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setDeliveryAddress</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Address getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Address getPreviousValue();

    public void setChange(final String change);

    public void setDeliveryId(final String deliveryId);

    public void setNextValue(final Address nextValue);

    public void setPreviousValue(final Address previousValue);

    public static SetDeliveryAddressChange of() {
        return new SetDeliveryAddressChangeImpl();
    }

    public static SetDeliveryAddressChange of(final SetDeliveryAddressChange template) {
        SetDeliveryAddressChangeImpl instance = new SetDeliveryAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetDeliveryAddressChangeBuilder builder() {
        return SetDeliveryAddressChangeBuilder.of();
    }

    public static SetDeliveryAddressChangeBuilder builder(final SetDeliveryAddressChange template) {
        return SetDeliveryAddressChangeBuilder.of(template);
    }

    default <T> T withSetDeliveryAddressChange(Function<SetDeliveryAddressChange, T> helper) {
        return helper.apply(this);
    }
}
