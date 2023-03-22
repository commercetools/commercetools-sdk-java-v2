
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListChangeLineItemQuantityAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListChangeLineItemQuantityAction myShoppingListChangeLineItemQuantityAction = MyShoppingListChangeLineItemQuantityAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListChangeLineItemQuantityActionImpl.class)
public interface MyShoppingListChangeLineItemQuantityAction extends MyShoppingListUpdateAction {

    String CHANGE_LINE_ITEM_QUANTITY = "changeLineItemQuantity";

    /**
     *  <p>The <code>id</code> of the ShoppingListLineItem to update.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>New value to set. If <code>0</code>, the ShoppingListLineItem is removed from the ShoppingList.</p>
     * @return quantity
     */
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

    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListChangeLineItemQuantityAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListChangeLineItemQuantityAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListChangeLineItemQuantityAction>";
            }
        };
    }
}
