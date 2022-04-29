
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetCustomTypeActionImpl.class)
public interface OrderSetCustomTypeAction extends OrderUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the Order with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the Order.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the Order.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static OrderSetCustomTypeAction of() {
        return new OrderSetCustomTypeActionImpl();
    }

    public static OrderSetCustomTypeAction of(final OrderSetCustomTypeAction template) {
        OrderSetCustomTypeActionImpl instance = new OrderSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static OrderSetCustomTypeActionBuilder builder() {
        return OrderSetCustomTypeActionBuilder.of();
    }

    public static OrderSetCustomTypeActionBuilder builder(final OrderSetCustomTypeAction template) {
        return OrderSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withOrderSetCustomTypeAction(Function<OrderSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetCustomTypeAction>";
            }
        };
    }
}
