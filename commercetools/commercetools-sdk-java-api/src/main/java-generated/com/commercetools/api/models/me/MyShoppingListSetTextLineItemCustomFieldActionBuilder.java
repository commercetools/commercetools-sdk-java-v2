package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyShoppingListSetTextLineItemCustomFieldActionBuilder {

    
    private String textLineItemId;
    
    
    private String name;
    
    @Nullable
    private com.fasterxml.jackson.databind.JsonNode value;

    public MyShoppingListSetTextLineItemCustomFieldActionBuilder textLineItemId( final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }
    
    public MyShoppingListSetTextLineItemCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    public MyShoppingListSetTextLineItemCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
        this.value = value;
        return this;
    }

    
    public String getTextLineItemId(){
        return this.textLineItemId;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    @Nullable
    public com.fasterxml.jackson.databind.JsonNode getValue(){
        return this.value;
    }

    public MyShoppingListSetTextLineItemCustomFieldAction build() {
        return new MyShoppingListSetTextLineItemCustomFieldActionImpl(textLineItemId, name, value);
    }

    public static MyShoppingListSetTextLineItemCustomFieldActionBuilder of() {
        return new MyShoppingListSetTextLineItemCustomFieldActionBuilder();
    }

    public static MyShoppingListSetTextLineItemCustomFieldActionBuilder of(final MyShoppingListSetTextLineItemCustomFieldAction template) {
        MyShoppingListSetTextLineItemCustomFieldActionBuilder builder = new MyShoppingListSetTextLineItemCustomFieldActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
