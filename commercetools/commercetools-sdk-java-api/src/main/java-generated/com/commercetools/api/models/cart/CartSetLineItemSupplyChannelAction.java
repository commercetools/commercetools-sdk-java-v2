
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Performing this action has no impact on inventory that should be reserved.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLineItemSupplyChannelAction cartSetLineItemSupplyChannelAction = CartSetLineItemSupplyChannelAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetLineItemSupplyChannelActionImpl.class)
public interface CartSetLineItemSupplyChannelAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetLineItemSupplyChannelAction
     */
    String SET_LINE_ITEM_SUPPLY_CHANNEL = "setLineItemSupplyChannel";

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @JsonProperty("lineItemKey")
    public String getLineItemKey();

    /**
     *  <ul>
     *   <li>If present, a Reference to the Channel is set for the LineItem specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current Reference to a supply channel will be removed from the LineItem specified by <code>lineItemId</code>. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</li>
     *  </ul>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     */

    public void setLineItemKey(final String lineItemKey);

    /**
     *  <ul>
     *   <li>If present, a Reference to the Channel is set for the LineItem specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current Reference to a supply channel will be removed from the LineItem specified by <code>lineItemId</code>. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</li>
     *  </ul>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    /**
     * factory method
     * @return instance of CartSetLineItemSupplyChannelAction
     */
    public static CartSetLineItemSupplyChannelAction of() {
        return new CartSetLineItemSupplyChannelActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetLineItemSupplyChannelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetLineItemSupplyChannelAction of(final CartSetLineItemSupplyChannelAction template) {
        CartSetLineItemSupplyChannelActionImpl instance = new CartSetLineItemSupplyChannelActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetLineItemSupplyChannelAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetLineItemSupplyChannelAction deepCopy(
            @Nullable final CartSetLineItemSupplyChannelAction template) {
        if (template == null) {
            return null;
        }
        CartSetLineItemSupplyChannelActionImpl instance = new CartSetLineItemSupplyChannelActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setSupplyChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getSupplyChannel()));
        return instance;
    }

    /**
     * builder factory method for CartSetLineItemSupplyChannelAction
     * @return builder
     */
    public static CartSetLineItemSupplyChannelActionBuilder builder() {
        return CartSetLineItemSupplyChannelActionBuilder.of();
    }

    /**
     * create builder for CartSetLineItemSupplyChannelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetLineItemSupplyChannelActionBuilder builder(final CartSetLineItemSupplyChannelAction template) {
        return CartSetLineItemSupplyChannelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetLineItemSupplyChannelAction(Function<CartSetLineItemSupplyChannelAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemSupplyChannelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemSupplyChannelAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetLineItemSupplyChannelAction>";
            }
        };
    }
}
