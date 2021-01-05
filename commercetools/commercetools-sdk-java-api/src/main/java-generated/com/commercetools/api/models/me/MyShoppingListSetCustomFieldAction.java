package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.me.MyShoppingListSetCustomFieldActionImpl;

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
@JsonDeserialize(as = MyShoppingListSetCustomFieldActionImpl.class)
public interface MyShoppingListSetCustomFieldAction extends MyShoppingListUpdateAction {

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public JsonNode getValue();

    public void setName(final String name);
    
    public void setValue(final JsonNode value);

    public static MyShoppingListSetCustomFieldAction of(){
        return new MyShoppingListSetCustomFieldActionImpl();
    }
    

    public static MyShoppingListSetCustomFieldAction of(final MyShoppingListSetCustomFieldAction template) {
        MyShoppingListSetCustomFieldActionImpl instance = new MyShoppingListSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static MyShoppingListSetCustomFieldActionBuilder builder(){
        return MyShoppingListSetCustomFieldActionBuilder.of();
    }
    
    public static MyShoppingListSetCustomFieldActionBuilder builder(final MyShoppingListSetCustomFieldAction template){
        return MyShoppingListSetCustomFieldActionBuilder.of(template);
    }
    

    default <T> T withMyShoppingListSetCustomFieldAction(Function<MyShoppingListSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
