
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.DeliveryItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetDeliveryItemsChangeImpl.class)
public interface SetDeliveryItemsChange extends Change {

    String SET_DELIVERY_ITEMS_CHANGE = "SetDeliveryItemsChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setDeliveryItems</code></p>
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
    public List<DeliveryItem> getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<DeliveryItem> getPreviousValue();

    public void setChange(final String change);

    public void setDeliveryId(final String deliveryId);

    @JsonIgnore
    public void setNextValue(final DeliveryItem... nextValue);

    public void setNextValue(final List<DeliveryItem> nextValue);

    @JsonIgnore
    public void setPreviousValue(final DeliveryItem... previousValue);

    public void setPreviousValue(final List<DeliveryItem> previousValue);

    public static SetDeliveryItemsChange of() {
        return new SetDeliveryItemsChangeImpl();
    }

    public static SetDeliveryItemsChange of(final SetDeliveryItemsChange template) {
        SetDeliveryItemsChangeImpl instance = new SetDeliveryItemsChangeImpl();
        instance.setChange(template.getChange());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetDeliveryItemsChangeBuilder builder() {
        return SetDeliveryItemsChangeBuilder.of();
    }

    public static SetDeliveryItemsChangeBuilder builder(final SetDeliveryItemsChange template) {
        return SetDeliveryItemsChangeBuilder.of(template);
    }

    default <T> T withSetDeliveryItemsChange(Function<SetDeliveryItemsChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetDeliveryItemsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDeliveryItemsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDeliveryItemsChange>";
            }
        };
    }
}
