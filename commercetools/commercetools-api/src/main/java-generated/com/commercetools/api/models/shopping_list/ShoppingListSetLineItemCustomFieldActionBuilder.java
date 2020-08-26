package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListSetLineItemCustomFieldActionBuilder {

    
    private String lineItemId;
    
    
    private String name;
    
    @Nullable
    private com.fasterxml.jackson.databind.JsonNode value;

    public ShoppingListSetLineItemCustomFieldActionBuilder lineItemId( final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }
    
    public ShoppingListSetLineItemCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    public ShoppingListSetLineItemCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
        this.value = value;
        return this;
    }

    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    @Nullable
    public com.fasterxml.jackson.databind.JsonNode getValue(){
        return this.value;
    }

    public ShoppingListSetLineItemCustomFieldAction build() {
        return new ShoppingListSetLineItemCustomFieldActionImpl(lineItemId, name, value);
    }

    public static ShoppingListSetLineItemCustomFieldActionBuilder of() {
        return new ShoppingListSetLineItemCustomFieldActionBuilder();
    }

    public static ShoppingListSetLineItemCustomFieldActionBuilder of(final ShoppingListSetLineItemCustomFieldAction template) {
        ShoppingListSetLineItemCustomFieldActionBuilder builder = new ShoppingListSetLineItemCustomFieldActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
