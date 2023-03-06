
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The LineItem price is updated as described in LineItem Price selection.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartRemoveLineItemAction myCartRemoveLineItemAction = MyCartRemoveLineItemAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartRemoveLineItemActionImpl.class)
public interface MyCartRemoveLineItemAction extends MyCartUpdateAction {

    String REMOVE_LINE_ITEM = "removeLineItem";

    /**
     *  <p><code>id</code> of the Line Item to remove.</p>
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>New value to set.</p>
     *  <p>If <code>0</code>, the Line Item is removed from the Cart.</p>
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Sets the LineItem <code>price</code> to the given value when decreasing the quantity of a Line Item with the <code>ExternalPrice</code> LineItemPriceMode.</p>
     */
    @Valid
    @JsonProperty("externalPrice")
    public Money getExternalPrice();

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> to the given value when decreasing the quantity of a Line Item with the <code>ExternalTotal</code> LineItemPriceMode.</p>
     */
    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    /**
     *  <p>Container for Line Item-specific addresses to remove.</p>
     */
    @Valid
    @JsonProperty("shippingDetailsToRemove")
    public ItemShippingDetailsDraft getShippingDetailsToRemove();

    public void setLineItemId(final String lineItemId);

    public void setQuantity(final Long quantity);

    public void setExternalPrice(final Money externalPrice);

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    public void setShippingDetailsToRemove(final ItemShippingDetailsDraft shippingDetailsToRemove);

    public static MyCartRemoveLineItemAction of() {
        return new MyCartRemoveLineItemActionImpl();
    }

    public static MyCartRemoveLineItemAction of(final MyCartRemoveLineItemAction template) {
        MyCartRemoveLineItemActionImpl instance = new MyCartRemoveLineItemActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setExternalPrice(template.getExternalPrice());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        instance.setShippingDetailsToRemove(template.getShippingDetailsToRemove());
        return instance;
    }

    public static MyCartRemoveLineItemActionBuilder builder() {
        return MyCartRemoveLineItemActionBuilder.of();
    }

    public static MyCartRemoveLineItemActionBuilder builder(final MyCartRemoveLineItemAction template) {
        return MyCartRemoveLineItemActionBuilder.of(template);
    }

    default <T> T withMyCartRemoveLineItemAction(Function<MyCartRemoveLineItemAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartRemoveLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartRemoveLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartRemoveLineItemAction>";
            }
        };
    }
}
