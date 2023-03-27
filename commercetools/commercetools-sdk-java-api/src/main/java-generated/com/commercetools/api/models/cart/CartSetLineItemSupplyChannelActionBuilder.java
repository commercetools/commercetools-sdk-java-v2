
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetLineItemSupplyChannelActionBuilder
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
public class CartSetLineItemSupplyChannelActionBuilder implements Builder<CartSetLineItemSupplyChannelAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public CartSetLineItemSupplyChannelActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <ul>
     *   <li>If present, a Reference to the Channel is set for the LineItem specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current Reference to a supply channel will be removed from the LineItem specified by <code>lineItemId</code>. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</li>
     *  </ul>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public CartSetLineItemSupplyChannelActionBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <ul>
     *   <li>If present, a Reference to the Channel is set for the LineItem specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current Reference to a supply channel will be removed from the LineItem specified by <code>lineItemId</code>. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</li>
     *  </ul>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public CartSetLineItemSupplyChannelActionBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <ul>
     *   <li>If present, a Reference to the Channel is set for the LineItem specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current Reference to a supply channel will be removed from the LineItem specified by <code>lineItemId</code>. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</li>
     *  </ul>
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     * builds CartSetLineItemSupplyChannelAction with checking for non-null required values
     * @return CartSetLineItemSupplyChannelAction
     */
    public CartSetLineItemSupplyChannelAction build() {
        Objects.requireNonNull(lineItemId, CartSetLineItemSupplyChannelAction.class + ": lineItemId is missing");
        return new CartSetLineItemSupplyChannelActionImpl(lineItemId, supplyChannel);
    }

    /**
     * builds CartSetLineItemSupplyChannelAction without checking for non-null required values
     * @return CartSetLineItemSupplyChannelAction
     */
    public CartSetLineItemSupplyChannelAction buildUnchecked() {
        return new CartSetLineItemSupplyChannelActionImpl(lineItemId, supplyChannel);
    }

    /**
     * factory method for an instance of CartSetLineItemSupplyChannelActionBuilder
     * @return builder
     */
    public static CartSetLineItemSupplyChannelActionBuilder of() {
        return new CartSetLineItemSupplyChannelActionBuilder();
    }

    /**
     * create builder for CartSetLineItemSupplyChannelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetLineItemSupplyChannelActionBuilder of(final CartSetLineItemSupplyChannelAction template) {
        CartSetLineItemSupplyChannelActionBuilder builder = new CartSetLineItemSupplyChannelActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
