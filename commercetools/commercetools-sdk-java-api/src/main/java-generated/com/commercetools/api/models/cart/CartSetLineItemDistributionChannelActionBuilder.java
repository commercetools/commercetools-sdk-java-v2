
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetLineItemDistributionChannelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLineItemDistributionChannelAction cartSetLineItemDistributionChannelAction = CartSetLineItemDistributionChannelAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetLineItemDistributionChannelActionBuilder
        implements Builder<CartSetLineItemDistributionChannelAction> {

    @Nullable
    private String lineItemId;

    @Nullable
    private String lineItemKey;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public CartSetLineItemDistributionChannelActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public CartSetLineItemDistributionChannelActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <ul>
     *   <li>If present, a <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the Channel is set for the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a distribution channel is removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> specified by <code>lineItemId</code>. The Channel must have the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</li>
     *  </ul>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public CartSetLineItemDistributionChannelActionBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <ul>
     *   <li>If present, a <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the Channel is set for the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a distribution channel is removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> specified by <code>lineItemId</code>. The Channel must have the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</li>
     *  </ul>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public CartSetLineItemDistributionChannelActionBuilder withDistributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <ul>
     *   <li>If present, a <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the Channel is set for the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a distribution channel is removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> specified by <code>lineItemId</code>. The Channel must have the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</li>
     *  </ul>
     * @param distributionChannel value to be set
     * @return Builder
     */

    public CartSetLineItemDistributionChannelActionBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @Nullable
    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <ul>
     *   <li>If present, a <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the Channel is set for the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a distribution channel is removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> specified by <code>lineItemId</code>. The Channel must have the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</li>
     *  </ul>
     * @return distributionChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     * builds CartSetLineItemDistributionChannelAction with checking for non-null required values
     * @return CartSetLineItemDistributionChannelAction
     */
    public CartSetLineItemDistributionChannelAction build() {
        return new CartSetLineItemDistributionChannelActionImpl(lineItemId, lineItemKey, distributionChannel);
    }

    /**
     * builds CartSetLineItemDistributionChannelAction without checking for non-null required values
     * @return CartSetLineItemDistributionChannelAction
     */
    public CartSetLineItemDistributionChannelAction buildUnchecked() {
        return new CartSetLineItemDistributionChannelActionImpl(lineItemId, lineItemKey, distributionChannel);
    }

    /**
     * factory method for an instance of CartSetLineItemDistributionChannelActionBuilder
     * @return builder
     */
    public static CartSetLineItemDistributionChannelActionBuilder of() {
        return new CartSetLineItemDistributionChannelActionBuilder();
    }

    /**
     * create builder for CartSetLineItemDistributionChannelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetLineItemDistributionChannelActionBuilder of(
            final CartSetLineItemDistributionChannelAction template) {
        CartSetLineItemDistributionChannelActionBuilder builder = new CartSetLineItemDistributionChannelActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
