
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CartSetLineItemDistributionChannelAction cartSetLineItemDistributionChannelAction = CartSetLineItemDistributionChannelAction.builder()
           .lineItemId("{lineItemId}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetLineItemDistributionChannelActionBuilder
        implements Builder<CartSetLineItemDistributionChannelAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    public CartSetLineItemDistributionChannelActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     */

    public CartSetLineItemDistributionChannelActionBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     */

    public CartSetLineItemDistributionChannelActionBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    public CartSetLineItemDistributionChannelAction build() {
        Objects.requireNonNull(lineItemId, CartSetLineItemDistributionChannelAction.class + ": lineItemId is missing");
        return new CartSetLineItemDistributionChannelActionImpl(lineItemId, distributionChannel);
    }

    /**
     * builds CartSetLineItemDistributionChannelAction without checking for non null required values
     */
    public CartSetLineItemDistributionChannelAction buildUnchecked() {
        return new CartSetLineItemDistributionChannelActionImpl(lineItemId, distributionChannel);
    }

    public static CartSetLineItemDistributionChannelActionBuilder of() {
        return new CartSetLineItemDistributionChannelActionBuilder();
    }

    public static CartSetLineItemDistributionChannelActionBuilder of(
            final CartSetLineItemDistributionChannelAction template) {
        CartSetLineItemDistributionChannelActionBuilder builder = new CartSetLineItemDistributionChannelActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
