package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.order.OrderSetCustomLineItemCustomTypeActionImpl;

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
@JsonDeserialize(as = OrderSetCustomLineItemCustomTypeActionImpl.class)
public interface OrderSetCustomLineItemCustomTypeAction extends OrderUpdateAction {

    
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

    public static OrderSetCustomLineItemCustomTypeActionImpl of(){
        return new OrderSetCustomLineItemCustomTypeActionImpl();
    }
    

    public static OrderSetCustomLineItemCustomTypeActionImpl of(final OrderSetCustomLineItemCustomTypeAction template) {
        OrderSetCustomLineItemCustomTypeActionImpl instance = new OrderSetCustomLineItemCustomTypeActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    default <T extends Accessor<OrderSetCustomLineItemCustomTypeAction>> T withOrderSetCustomLineItemCustomTypeAction(Function<OrderSetCustomLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
