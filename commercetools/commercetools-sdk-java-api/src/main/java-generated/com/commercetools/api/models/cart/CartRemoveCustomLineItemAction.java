
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action does not support specifying quantities, unlike the Remove LineItem update action.</p>
 *  <p>If <code>shippingDetails</code> must be partially removed, use the Change CustomLineItem Quantity update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartRemoveCustomLineItemAction cartRemoveCustomLineItemAction = CartRemoveCustomLineItemAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartRemoveCustomLineItemActionImpl.class)
public interface CartRemoveCustomLineItemAction extends CartUpdateAction {

    String REMOVE_CUSTOM_LINE_ITEM = "removeCustomLineItem";

    /**
     *  <p><code>id</code> of the Custom Line Item to remove.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    public void setCustomLineItemId(final String customLineItemId);

    public static CartRemoveCustomLineItemAction of() {
        return new CartRemoveCustomLineItemActionImpl();
    }

    public static CartRemoveCustomLineItemAction of(final CartRemoveCustomLineItemAction template) {
        CartRemoveCustomLineItemActionImpl instance = new CartRemoveCustomLineItemActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        return instance;
    }

    public static CartRemoveCustomLineItemActionBuilder builder() {
        return CartRemoveCustomLineItemActionBuilder.of();
    }

    public static CartRemoveCustomLineItemActionBuilder builder(final CartRemoveCustomLineItemAction template) {
        return CartRemoveCustomLineItemActionBuilder.of(template);
    }

    default <T> T withCartRemoveCustomLineItemAction(Function<CartRemoveCustomLineItemAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartRemoveCustomLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartRemoveCustomLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartRemoveCustomLineItemAction>";
            }
        };
    }
}
