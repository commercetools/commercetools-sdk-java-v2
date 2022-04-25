
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.DeliveryChangeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AddDeliveryChangeImpl.class)
public interface AddDeliveryChange extends Change {

    String ADD_DELIVERY_CHANGE = "AddDeliveryChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>addDelivery</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public DeliveryChangeValue getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public DeliveryChangeValue getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final DeliveryChangeValue nextValue);

    public void setPreviousValue(final DeliveryChangeValue previousValue);

    public static AddDeliveryChange of() {
        return new AddDeliveryChangeImpl();
    }

    public static AddDeliveryChange of(final AddDeliveryChange template) {
        AddDeliveryChangeImpl instance = new AddDeliveryChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static AddDeliveryChangeBuilder builder() {
        return AddDeliveryChangeBuilder.of();
    }

    public static AddDeliveryChangeBuilder builder(final AddDeliveryChange template) {
        return AddDeliveryChangeBuilder.of(template);
    }

    default <T> T withAddDeliveryChange(Function<AddDeliveryChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddDeliveryChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddDeliveryChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddDeliveryChange>";
            }
        };
    }
}
