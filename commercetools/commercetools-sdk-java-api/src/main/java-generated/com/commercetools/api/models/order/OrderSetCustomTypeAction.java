package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.order.OrderSetCustomTypeActionImpl;

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
@JsonDeserialize(as = OrderSetCustomTypeActionImpl.class)
public interface OrderSetCustomTypeAction extends OrderUpdateAction {

    
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();
    
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);
    
    public void setFields(final FieldContainer fields);

    public static OrderSetCustomTypeActionImpl of(){
        return new OrderSetCustomTypeActionImpl();
    }
    

    public static OrderSetCustomTypeActionImpl of(final OrderSetCustomTypeAction template) {
        OrderSetCustomTypeActionImpl instance = new OrderSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    default <T extends Accessor<OrderSetCustomTypeAction>> T withOrderSetCustomTypeAction(Function<OrderSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
