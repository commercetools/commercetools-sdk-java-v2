
package com.commercetools.api.models.me;

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
 *  <p>Performing this action does not reserve stock. Stock is only reserved at Order creation if the InventoryMode of the Cart is <code>TrackOnly</code> or <code>ReserveOnOrder</code>.</p>
 *  <p>This action is subject to InventoryEntry min/max restrictions when applicable. For more information, see Quantity limits.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetLineItemSupplyChannelAction myCartSetLineItemSupplyChannelAction = MyCartSetLineItemSupplyChannelAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLineItemSupplyChannel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetLineItemSupplyChannelActionImpl.class)
public interface MyCartSetLineItemSupplyChannelAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartSetLineItemSupplyChannelAction
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
     * @return instance of MyCartSetLineItemSupplyChannelAction
     */
    public static MyCartSetLineItemSupplyChannelAction of() {
        return new MyCartSetLineItemSupplyChannelActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartSetLineItemSupplyChannelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartSetLineItemSupplyChannelAction of(final MyCartSetLineItemSupplyChannelAction template) {
        MyCartSetLineItemSupplyChannelActionImpl instance = new MyCartSetLineItemSupplyChannelActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public MyCartSetLineItemSupplyChannelAction copyDeep();

    /**
     * factory method to create a deep copy of MyCartSetLineItemSupplyChannelAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartSetLineItemSupplyChannelAction deepCopy(
            @Nullable final MyCartSetLineItemSupplyChannelAction template) {
        if (template == null) {
            return null;
        }
        MyCartSetLineItemSupplyChannelActionImpl instance = new MyCartSetLineItemSupplyChannelActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setSupplyChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getSupplyChannel()));
        return instance;
    }

    /**
     * builder factory method for MyCartSetLineItemSupplyChannelAction
     * @return builder
     */
    public static MyCartSetLineItemSupplyChannelActionBuilder builder() {
        return MyCartSetLineItemSupplyChannelActionBuilder.of();
    }

    /**
     * create builder for MyCartSetLineItemSupplyChannelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetLineItemSupplyChannelActionBuilder builder(
            final MyCartSetLineItemSupplyChannelAction template) {
        return MyCartSetLineItemSupplyChannelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartSetLineItemSupplyChannelAction(Function<MyCartSetLineItemSupplyChannelAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetLineItemSupplyChannelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetLineItemSupplyChannelAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetLineItemSupplyChannelAction>";
            }
        };
    }
}
