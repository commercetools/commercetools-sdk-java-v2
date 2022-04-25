
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
@JsonDeserialize(as = StagedOrderSetDeliveryCustomTypeActionImpl.class)
public interface StagedOrderSetDeliveryCustomTypeAction extends StagedOrderUpdateAction {

    String SET_DELIVERY_CUSTOM_TYPE = "setDeliveryCustomType";

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the Delivery with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the Delivery.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the Delivery.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setDeliveryId(final String deliveryId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static StagedOrderSetDeliveryCustomTypeAction of() {
        return new StagedOrderSetDeliveryCustomTypeActionImpl();
    }

    public static StagedOrderSetDeliveryCustomTypeAction of(final StagedOrderSetDeliveryCustomTypeAction template) {
        StagedOrderSetDeliveryCustomTypeActionImpl instance = new StagedOrderSetDeliveryCustomTypeActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
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

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetDeliveryCustomTypeAction>";
            }
        };
    }
}
