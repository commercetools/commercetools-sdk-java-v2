package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomFieldActionImpl;

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
@JsonDeserialize(as = MyShoppingListSetTextLineItemCustomFieldActionImpl.class)
public interface MyShoppingListSetTextLineItemCustomFieldAction extends MyShoppingListUpdateAction {

    
    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();
    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public JsonNode getValue();

    public void setTextLineItemId(final String textLineItemId);
    
    public void setName(final String name);
    
    public void setValue(final JsonNode value);

    public static MyShoppingListSetTextLineItemCustomFieldAction of(){
        return new MyShoppingListSetTextLineItemCustomFieldActionImpl();
    }
    

    public static MyShoppingListSetTextLineItemCustomFieldAction of(final MyShoppingListSetTextLineItemCustomFieldAction template) {
        MyShoppingListSetTextLineItemCustomFieldActionImpl instance = new MyShoppingListSetTextLineItemCustomFieldActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static MyShoppingListSetTextLineItemCustomFieldActionBuilder builder(){
        return MyShoppingListSetTextLineItemCustomFieldActionBuilder.of();
    }
    
    public static MyShoppingListSetTextLineItemCustomFieldActionBuilder builder(final MyShoppingListSetTextLineItemCustomFieldAction template){
        return MyShoppingListSetTextLineItemCustomFieldActionBuilder.of(template);
    }
    

    default <T> T withMyShoppingListSetTextLineItemCustomFieldAction(Function<MyShoppingListSetTextLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
