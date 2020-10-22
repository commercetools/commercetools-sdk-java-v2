package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomTypeActionImpl;

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
@JsonDeserialize(as = MyShoppingListSetTextLineItemCustomTypeActionImpl.class)
public interface MyShoppingListSetTextLineItemCustomTypeAction extends MyShoppingListUpdateAction {

    
    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();
    
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();
    
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setTextLineItemId(final String textLineItemId);
    
    public void setType(final TypeResourceIdentifier type);
    
    public void setFields(final FieldContainer fields);

    public static MyShoppingListSetTextLineItemCustomTypeActionImpl of(){
        return new MyShoppingListSetTextLineItemCustomTypeActionImpl();
    }
    

    public static MyShoppingListSetTextLineItemCustomTypeActionImpl of(final MyShoppingListSetTextLineItemCustomTypeAction template) {
        MyShoppingListSetTextLineItemCustomTypeActionImpl instance = new MyShoppingListSetTextLineItemCustomTypeActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    default <T extends Accessor<MyShoppingListSetTextLineItemCustomTypeAction>> T withMyShoppingListSetTextLineItemCustomTypeAction(Function<MyShoppingListSetTextLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
