
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

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

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
}
