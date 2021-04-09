
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetExpectedDeliveryChangeImpl.class)
public interface SetExpectedDeliveryChange extends Change {

    String SET_EXPECTED_DELIVERY_CHANGE = "SetExpectedDeliveryChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setExpectedDelivery</code></p>
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

    public static SetExpectedDeliveryChange of() {
        return new SetExpectedDeliveryChangeImpl();
    }

    public static SetExpectedDeliveryChange of(final SetExpectedDeliveryChange template) {
        SetExpectedDeliveryChangeImpl instance = new SetExpectedDeliveryChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetExpectedDeliveryChangeBuilder builder() {
        return SetExpectedDeliveryChangeBuilder.of();
    }

    public static SetExpectedDeliveryChangeBuilder builder(final SetExpectedDeliveryChange template) {
        return SetExpectedDeliveryChangeBuilder.of(template);
    }

    default <T> T withSetExpectedDeliveryChange(Function<SetExpectedDeliveryChange, T> helper) {
        return helper.apply(this);
    }
}
