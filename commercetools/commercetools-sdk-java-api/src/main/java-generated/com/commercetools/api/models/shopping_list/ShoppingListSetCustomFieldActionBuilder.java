package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.shopping_list.ShoppingListSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListSetCustomFieldActionBuilder {

    
    private String name;
    
    @Nullable
    private com.fasterxml.jackson.databind.JsonNode value;

    public ShoppingListSetCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    public ShoppingListSetCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
        this.value = value;
        return this;
    }

    
    public String getName(){
        return this.name;
    }
    
    @Nullable
    public com.fasterxml.jackson.databind.JsonNode getValue(){
        return this.value;
    }

    public ShoppingListSetCustomFieldAction build() {
        return new ShoppingListSetCustomFieldActionImpl(name, value);
    }

    public static ShoppingListSetCustomFieldActionBuilder of() {
        return new ShoppingListSetCustomFieldActionBuilder();
    }

    public static ShoppingListSetCustomFieldActionBuilder of(final ShoppingListSetCustomFieldAction template) {
        ShoppingListSetCustomFieldActionBuilder builder = new ShoppingListSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
