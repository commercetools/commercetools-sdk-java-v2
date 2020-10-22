package com.commercetools.api.models.me;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.me.MyShoppingListSetDescriptionActionImpl;

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
@JsonDeserialize(as = MyShoppingListSetDescriptionActionImpl.class)
public interface MyShoppingListSetDescriptionAction extends MyShoppingListUpdateAction {

    
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setDescription(final LocalizedString description);

    public static MyShoppingListSetDescriptionActionImpl of(){
        return new MyShoppingListSetDescriptionActionImpl();
    }
    

    public static MyShoppingListSetDescriptionActionImpl of(final MyShoppingListSetDescriptionAction template) {
        MyShoppingListSetDescriptionActionImpl instance = new MyShoppingListSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    default <T extends Accessor<MyShoppingListSetDescriptionAction>> T withMyShoppingListSetDescriptionAction(Function<MyShoppingListSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
