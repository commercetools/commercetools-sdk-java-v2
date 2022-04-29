
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.ParcelChangeValue;
import com.commercetools.history.models.common.DeliveryItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetParcelItemsChangeImpl.class)
public interface SetParcelItemsChange extends Change {

    String SET_PARCEL_ITEMS_CHANGE = "SetParcelItemsChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setParcelItems</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("parcel")
    public ParcelChangeValue getParcel();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<DeliveryItem> getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<DeliveryItem> getPreviousValue();

    public void setChange(final String change);

    public void setParcel(final ParcelChangeValue parcel);

    @JsonIgnore
    public void setNextValue(final DeliveryItem... nextValue);

    public void setNextValue(final List<DeliveryItem> nextValue);

    @JsonIgnore
    public void setPreviousValue(final DeliveryItem... previousValue);

    public void setPreviousValue(final List<DeliveryItem> previousValue);

    public static SetParcelItemsChange of() {
        return new SetParcelItemsChangeImpl();
    }

    public static SetParcelItemsChange of(final SetParcelItemsChange template) {
        SetParcelItemsChangeImpl instance = new SetParcelItemsChangeImpl();
        instance.setChange(template.getChange());
        instance.setParcel(template.getParcel());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetParcelItemsChangeBuilder builder() {
        return SetParcelItemsChangeBuilder.of();
    }

    public static SetParcelItemsChangeBuilder builder(final SetParcelItemsChange template) {
        return SetParcelItemsChangeBuilder.of(template);
    }

    default <T> T withSetParcelItemsChange(Function<SetParcelItemsChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetParcelItemsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetParcelItemsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetParcelItemsChange>";
            }
        };
    }
}
