
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetLineItemSupplyChannelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetLineItemSupplyChannelAction myCartSetLineItemSupplyChannelAction = MyCartSetLineItemSupplyChannelAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartSetLineItemSupplyChannelActionBuilder implements Builder<MyCartSetLineItemSupplyChannelAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @param lineItemId
     * @return Builder
     */

    public MyCartSetLineItemSupplyChannelActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <ul>
     *   <li>If present, a Reference to the Channel is set for the LineItem specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current Reference to a supply channel will be removed from the LineItem specified by <code>lineItemId</code>. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</li>
     *  </ul>
     * @return Builder
     */

    public MyCartSetLineItemSupplyChannelActionBuilder supplyChannel(
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
     * @param supplyChannel
     * @return Builder
     */

    public MyCartSetLineItemSupplyChannelActionBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    public MyCartSetLineItemSupplyChannelAction build() {
        Objects.requireNonNull(lineItemId, MyCartSetLineItemSupplyChannelAction.class + ": lineItemId is missing");
        return new MyCartSetLineItemSupplyChannelActionImpl(lineItemId, supplyChannel);
    }

    /**
     * builds MyCartSetLineItemSupplyChannelAction without checking for non null required values
     */
    public MyCartSetLineItemSupplyChannelAction buildUnchecked() {
        return new MyCartSetLineItemSupplyChannelActionImpl(lineItemId, supplyChannel);
    }

    public static MyCartSetLineItemSupplyChannelActionBuilder of() {
        return new MyCartSetLineItemSupplyChannelActionBuilder();
    }

    public static MyCartSetLineItemSupplyChannelActionBuilder of(final MyCartSetLineItemSupplyChannelAction template) {
        MyCartSetLineItemSupplyChannelActionBuilder builder = new MyCartSetLineItemSupplyChannelActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
