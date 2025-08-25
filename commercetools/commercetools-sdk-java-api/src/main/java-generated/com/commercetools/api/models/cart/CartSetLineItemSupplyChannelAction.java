
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
 *  <p>Performing this action does not reserve stock. Stock is only reserved at Order creation if the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">InventoryMode</a> of the Cart is <code>TrackOnly</code> or <code>ReserveOnOrder</code>.</p>
 *  <p>This action is subject to <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> min/max restrictions when applicable. For more information, see <span>Quantity limits</span>.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("setLineItemSupplyChannel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetLineItemSupplyChannelActionImpl.class)
public interface CartSetLineItemSupplyChannelAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetLineItemSupplyChannelAction
     */
    String SET_LINE_ITEM_SUPPLY_CHANNEL = "setLineItemSupplyChannel";

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @JsonProperty("lineItemKey")
    public String getLineItemKey();

    /**
     *  <ul>
     *   <li>If present, a <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the Channel is set for the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a supply channel will be removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> specified by <code>lineItemId</code>. The Channel must have the <code>InventorySupply</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</li>
     *  </ul>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     */

    public void setLineItemKey(final String lineItemKey);

    /**
     *  <ul>
     *   <li>If present, a <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the Channel is set for the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a supply channel will be removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> specified by <code>lineItemId</code>. The Channel must have the <code>InventorySupply</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</li>
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

    public CartSetLineItemSupplyChannelAction copyDeep();

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
