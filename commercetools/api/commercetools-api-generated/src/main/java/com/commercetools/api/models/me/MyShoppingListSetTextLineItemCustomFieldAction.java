package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomFieldActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

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

    public static MyShoppingListSetTextLineItemCustomFieldActionImpl of(){
        return new MyShoppingListSetTextLineItemCustomFieldActionImpl();
    }
    

    public static MyShoppingListSetTextLineItemCustomFieldActionImpl of(final MyShoppingListSetTextLineItemCustomFieldAction template) {
        MyShoppingListSetTextLineItemCustomFieldActionImpl instance = new MyShoppingListSetTextLineItemCustomFieldActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

}
