
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
@JsonDeserialize(as = OrderSetReturnItemCustomTypeActionImpl.class)
public interface OrderSetReturnItemCustomTypeAction extends OrderUpdateAction {

    String SET_RETURN_ITEM_CUSTOM_TYPE = "setReturnItemCustomType";

    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the ReturnItem with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the ReturnItem.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the ReturnItem.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setReturnItemId(final String returnItemId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static OrderSetReturnItemCustomTypeAction of() {
        return new OrderSetReturnItemCustomTypeActionImpl();
    }

    public static OrderSetReturnItemCustomTypeAction of(final OrderSetReturnItemCustomTypeAction template) {
        OrderSetReturnItemCustomTypeActionImpl instance = new OrderSetReturnItemCustomTypeActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static OrderSetReturnItemCustomTypeActionBuilder builder() {
        return OrderSetReturnItemCustomTypeActionBuilder.of();
    }

    public static OrderSetReturnItemCustomTypeActionBuilder builder(final OrderSetReturnItemCustomTypeAction template) {
        return OrderSetReturnItemCustomTypeActionBuilder.of(template);
    }

    default <T> T withOrderSetReturnItemCustomTypeAction(Function<OrderSetReturnItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnItemCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnItemCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetReturnItemCustomTypeAction>";
            }
        };
    }
}
