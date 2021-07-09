
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetDeliveryAddressCustomTypeActionImpl.class)
public interface StagedOrderSetDeliveryAddressCustomTypeAction extends StagedOrderUpdateAction {

    String SET_DELIVERY_ADDRESS_CUSTOM_TYPE = "setDeliveryAddressCustomType";

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setDeliveryId(final String deliveryId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static StagedOrderSetDeliveryAddressCustomTypeAction of() {
        return new StagedOrderSetDeliveryAddressCustomTypeActionImpl();
    }

    public static StagedOrderSetDeliveryAddressCustomTypeAction of(
            final StagedOrderSetDeliveryAddressCustomTypeAction template) {
        StagedOrderSetDeliveryAddressCustomTypeActionImpl instance = new StagedOrderSetDeliveryAddressCustomTypeActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static StagedOrderSetDeliveryAddressCustomTypeActionBuilder builder() {
        return StagedOrderSetDeliveryAddressCustomTypeActionBuilder.of();
    }

    public static StagedOrderSetDeliveryAddressCustomTypeActionBuilder builder(
            final StagedOrderSetDeliveryAddressCustomTypeAction template) {
        return StagedOrderSetDeliveryAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetDeliveryAddressCustomTypeAction(
            Function<StagedOrderSetDeliveryAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
