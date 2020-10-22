package com.commercetools.api.models.me;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.me.MyShoppingListChangeTextLineItemNameActionImpl;

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
@JsonDeserialize(as = MyShoppingListChangeTextLineItemNameActionImpl.class)
public interface MyShoppingListChangeTextLineItemNameAction extends MyShoppingListUpdateAction {

    
    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();
    
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setTextLineItemId(final String textLineItemId);
    
    public void setName(final LocalizedString name);

    public static MyShoppingListChangeTextLineItemNameActionImpl of(){
        return new MyShoppingListChangeTextLineItemNameActionImpl();
    }
    

    public static MyShoppingListChangeTextLineItemNameActionImpl of(final MyShoppingListChangeTextLineItemNameAction template) {
        MyShoppingListChangeTextLineItemNameActionImpl instance = new MyShoppingListChangeTextLineItemNameActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setName(template.getName());
        return instance;
    }

    default <T extends Accessor<MyShoppingListChangeTextLineItemNameAction>> T withMyShoppingListChangeTextLineItemNameAction(Function<MyShoppingListChangeTextLineItemNameAction, T> helper) {
        return helper.apply(this);
    }
}
