
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetDeliveryCustomTypeActionImpl.class)
public interface StagedOrderSetDeliveryCustomTypeAction extends StagedOrderUpdateAction {

    String SET_DELIVERY_CUSTOM_TYPE = "setDeliveryCustomType";

    /**
    *  <p>If set, the custom type is set to this new value.
    *  If absent, the custom type and any existing custom fields are removed.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>If set, the custom fields are set to this new value.</p>
    */
    @Valid
    @JsonProperty("fields")
    public Object getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final Object fields);

    public static StagedOrderSetDeliveryCustomTypeAction of() {
        return new StagedOrderSetDeliveryCustomTypeActionImpl();
    }

    public static StagedOrderSetDeliveryCustomTypeAction of(final StagedOrderSetDeliveryCustomTypeAction template) {
        StagedOrderSetDeliveryCustomTypeActionImpl instance = new StagedOrderSetDeliveryCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static StagedOrderSetDeliveryCustomTypeActionBuilder builder() {
        return StagedOrderSetDeliveryCustomTypeActionBuilder.of();
    }

    public static StagedOrderSetDeliveryCustomTypeActionBuilder builder(
            final StagedOrderSetDeliveryCustomTypeAction template) {
        return StagedOrderSetDeliveryCustomTypeActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetDeliveryCustomTypeAction(
            Function<StagedOrderSetDeliveryCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
