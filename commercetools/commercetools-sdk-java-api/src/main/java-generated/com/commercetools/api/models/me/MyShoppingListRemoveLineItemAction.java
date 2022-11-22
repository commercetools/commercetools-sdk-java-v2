
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListRemoveLineItemAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListRemoveLineItemAction myShoppingListRemoveLineItemAction = MyShoppingListRemoveLineItemAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListRemoveLineItemActionImpl.class)
public interface MyShoppingListRemoveLineItemAction extends MyShoppingListUpdateAction {

    String REMOVE_LINE_ITEM = "removeLineItem";

    /**
     *  <p>The <code>id</code> of the ShoppingListLineItem to update.</p>
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Amount to remove from the <code>quantity</code> of the ShoppingListLineItem. If not set, the ShoppingListLineItem is removed from the ShoppingList. If this value matches or exceeds the current <code>quantity</code> of the ShoppingListLineItem, the ShoppingListLineItem is removed from the ShoppingList.</p>
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    public void setLineItemId(final String lineItemId);

    public void setQuantity(final Long quantity);

    public static MyShoppingListRemoveLineItemAction of() {
        return new MyShoppingListRemoveLineItemActionImpl();
    }

    public static MyShoppingListRemoveLineItemAction of(final MyShoppingListRemoveLineItemAction template) {
        MyShoppingListRemoveLineItemActionImpl instance = new MyShoppingListRemoveLineItemActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static MyShoppingListRemoveLineItemActionBuilder builder() {
        return MyShoppingListRemoveLineItemActionBuilder.of();
    }

    public static MyShoppingListRemoveLineItemActionBuilder builder(final MyShoppingListRemoveLineItemAction template) {
        return MyShoppingListRemoveLineItemActionBuilder.of(template);
    }

    default <T> T withMyShoppingListRemoveLineItemAction(Function<MyShoppingListRemoveLineItemAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListRemoveLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListRemoveLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListRemoveLineItemAction>";
            }
        };
    }
}
