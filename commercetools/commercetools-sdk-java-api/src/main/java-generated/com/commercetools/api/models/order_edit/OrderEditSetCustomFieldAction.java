package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.order_edit.OrderEditSetCustomFieldActionImpl;

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
@JsonDeserialize(as = OrderEditSetCustomFieldActionImpl.class)
public interface OrderEditSetCustomFieldAction extends OrderEditUpdateAction {

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public JsonNode getValue();

    public void setName(final String name);
    
    public void setValue(final JsonNode value);

    public static OrderEditSetCustomFieldActionImpl of(){
        return new OrderEditSetCustomFieldActionImpl();
    }
    

    public static OrderEditSetCustomFieldActionImpl of(final OrderEditSetCustomFieldAction template) {
        OrderEditSetCustomFieldActionImpl instance = new OrderEditSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    default <T extends Accessor<OrderEditSetCustomFieldAction>> T withOrderEditSetCustomFieldAction(Function<OrderEditSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
