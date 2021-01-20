
package com.commercetools.api.models.me;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.me.MyShoppingListChangeLineItemQuantityActionImpl;
import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyShoppingListChangeLineItemQuantityActionImpl.class)
public interface MyShoppingListChangeLineItemQuantityAction extends MyShoppingListUpdateAction {

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    public void setLineItemId(final String lineItemId);

    public void setQuantity(final Long quantity);

    public static MyShoppingListChangeLineItemQuantityAction of() {
        return new MyShoppingListChangeLineItemQuantityActionImpl();
    }

    public static MyShoppingListChangeLineItemQuantityAction of(
            final MyShoppingListChangeLineItemQuantityAction template) {
        MyShoppingListChangeLineItemQuantityActionImpl instance = new MyShoppingListChangeLineItemQuantityActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static MyShoppingListChangeLineItemQuantityActionBuilder builder() {
        return MyShoppingListChangeLineItemQuantityActionBuilder.of();
    }

    public static MyShoppingListChangeLineItemQuantityActionBuilder builder(
            final MyShoppingListChangeLineItemQuantityAction template) {
        return MyShoppingListChangeLineItemQuantityActionBuilder.of(template);
    }

    default <T> T withMyShoppingListChangeLineItemQuantityAction(
            Function<MyShoppingListChangeLineItemQuantityAction, T> helper) {
        return helper.apply(this);
    }
}
