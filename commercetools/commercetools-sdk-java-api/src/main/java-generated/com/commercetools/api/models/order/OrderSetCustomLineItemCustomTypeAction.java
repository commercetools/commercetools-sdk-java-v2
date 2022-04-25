
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetCustomLineItemCustomTypeActionImpl.class)
public interface OrderSetCustomLineItemCustomTypeAction extends OrderUpdateAction {

    String SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE = "setCustomLineItemCustomType";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the CustomLineItem with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the CustomLineItem.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the CustomLineItem.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setCustomLineItemId(final String customLineItemId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static OrderSetCustomLineItemCustomTypeAction of() {
        return new OrderSetCustomLineItemCustomTypeActionImpl();
    }

    public static OrderSetCustomLineItemCustomTypeAction of(final OrderSetCustomLineItemCustomTypeAction template) {
        OrderSetCustomLineItemCustomTypeActionImpl instance = new OrderSetCustomLineItemCustomTypeActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static OrderSetCustomLineItemCustomTypeActionBuilder builder() {
        return OrderSetCustomLineItemCustomTypeActionBuilder.of();
    }

    public static OrderSetCustomLineItemCustomTypeActionBuilder builder(
            final OrderSetCustomLineItemCustomTypeAction template) {
        return OrderSetCustomLineItemCustomTypeActionBuilder.of(template);
    }

    default <T> T withOrderSetCustomLineItemCustomTypeAction(
            Function<OrderSetCustomLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomLineItemCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomLineItemCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetCustomLineItemCustomTypeAction>";
            }
        };
    }
}
