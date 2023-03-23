
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Performing this action has no impact on inventory that should be reserved.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLineItemSupplyChannelAction cartSetLineItemSupplyChannelAction = CartSetLineItemSupplyChannelAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetLineItemSupplyChannelActionImpl.class)
public interface CartSetLineItemSupplyChannelAction extends CartUpdateAction {

    String SET_LINE_ITEM_SUPPLY_CHANNEL = "setLineItemSupplyChannel";

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

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

    public void setLineItemId(final String lineItemId);

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    public static CartSetLineItemSupplyChannelAction of() {
        return new CartSetLineItemSupplyChannelActionImpl();
    }

    public static CartSetLineItemSupplyChannelAction of(final CartSetLineItemSupplyChannelAction template) {
        CartSetLineItemSupplyChannelActionImpl instance = new CartSetLineItemSupplyChannelActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public static CartSetLineItemSupplyChannelActionBuilder builder() {
        return CartSetLineItemSupplyChannelActionBuilder.of();
    }

    public static CartSetLineItemSupplyChannelActionBuilder builder(final CartSetLineItemSupplyChannelAction template) {
        return CartSetLineItemSupplyChannelActionBuilder.of(template);
    }

    default <T> T withCartSetLineItemSupplyChannelAction(Function<CartSetLineItemSupplyChannelAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemSupplyChannelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemSupplyChannelAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetLineItemSupplyChannelAction>";
            }
        };
    }
}
