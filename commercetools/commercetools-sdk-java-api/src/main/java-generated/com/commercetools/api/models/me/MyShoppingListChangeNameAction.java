package com.commercetools.api.models.me;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.me.MyShoppingListChangeNameActionImpl;

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
@JsonDeserialize(as = MyShoppingListChangeNameActionImpl.class)
public interface MyShoppingListChangeNameAction extends MyShoppingListUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static MyShoppingListChangeNameAction of(){
        return new MyShoppingListChangeNameActionImpl();
    }
    

    public static MyShoppingListChangeNameAction of(final MyShoppingListChangeNameAction template) {
        MyShoppingListChangeNameActionImpl instance = new MyShoppingListChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static MyShoppingListChangeNameActionBuilder builder(){
        return MyShoppingListChangeNameActionBuilder.of();
    }
    
    public static MyShoppingListChangeNameActionBuilder builder(final MyShoppingListChangeNameAction template){
        return MyShoppingListChangeNameActionBuilder.of(template);
    }
    

    default <T> T withMyShoppingListChangeNameAction(Function<MyShoppingListChangeNameAction, T> helper) {
        return helper.apply(this);
    }
}
