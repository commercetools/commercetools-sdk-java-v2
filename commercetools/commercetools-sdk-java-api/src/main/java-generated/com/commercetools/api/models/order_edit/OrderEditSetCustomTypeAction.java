package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.order_edit.OrderEditSetCustomTypeActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderEditSetCustomTypeActionImpl.class)
public interface OrderEditSetCustomTypeAction extends OrderEditUpdateAction {

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
    public JsonNode getFields();

    public void setType(final TypeResourceIdentifier type);
    
    public void setFields(final JsonNode fields);

    public static OrderEditSetCustomTypeActionImpl of(){
        return new OrderEditSetCustomTypeActionImpl();
    }
    

    public static OrderEditSetCustomTypeActionImpl of(final OrderEditSetCustomTypeAction template) {
        OrderEditSetCustomTypeActionImpl instance = new OrderEditSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    default <T extends Accessor<OrderEditSetCustomTypeAction>> T withOrderEditSetCustomTypeAction(Function<OrderEditSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
