package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.me.MyShoppingListSetLineItemCustomFieldActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MyShoppingListSetLineItemCustomFieldActionImpl.class)
public interface MyShoppingListSetLineItemCustomFieldAction extends MyShoppingListUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public JsonNode getValue();

    public void setLineItemId(final String lineItemId);
    
    public void setName(final String name);
    
    public void setValue(final JsonNode value);

    public static MyShoppingListSetLineItemCustomFieldActionImpl of(){
        return new MyShoppingListSetLineItemCustomFieldActionImpl();
    }
    

    public static MyShoppingListSetLineItemCustomFieldActionImpl of(final MyShoppingListSetLineItemCustomFieldAction template) {
        MyShoppingListSetLineItemCustomFieldActionImpl instance = new MyShoppingListSetLineItemCustomFieldActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    default <T> T withMyShoppingListSetLineItemCustomFieldAction(Function<MyShoppingListSetLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
