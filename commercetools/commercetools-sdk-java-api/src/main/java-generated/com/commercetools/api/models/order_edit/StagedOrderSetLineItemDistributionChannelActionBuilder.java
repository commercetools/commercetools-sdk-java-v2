
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetLineItemDistributionChannelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetLineItemDistributionChannelAction stagedOrderSetLineItemDistributionChannelAction = StagedOrderSetLineItemDistributionChannelAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetLineItemDistributionChannelActionBuilder
        implements Builder<StagedOrderSetLineItemDistributionChannelAction> {

    @Nullable
    private String lineItemId;

    @Nullable
    private String lineItemKey;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemDistributionChannelActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemDistributionChannelActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <ul>
     *   <li>If present, a Reference to the Channel is set for the LineItem specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current Reference to a distribution channel is removed from the LineItem specified by <code>lineItemId</code>. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</li>
     *  </ul>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public StagedOrderSetLineItemDistributionChannelActionBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <ul>
     *   <li>If present, a Reference to the Channel is set for the LineItem specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current Reference to a distribution channel is removed from the LineItem specified by <code>lineItemId</code>. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</li>
     *  </ul>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public StagedOrderSetLineItemDistributionChannelActionBuilder withDistributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <ul>
     *   <li>If present, a Reference to the Channel is set for the LineItem specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current Reference to a distribution channel is removed from the LineItem specified by <code>lineItemId</code>. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</li>
     *  </ul>
     * @param distributionChannel value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemDistributionChannelActionBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @Nullable
    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <ul>
     *   <li>If present, a Reference to the Channel is set for the LineItem specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current Reference to a distribution channel is removed from the LineItem specified by <code>lineItemId</code>. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</li>
     *  </ul>
     * @return distributionChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     * builds StagedOrderSetLineItemDistributionChannelAction with checking for non-null required values
     * @return StagedOrderSetLineItemDistributionChannelAction
     */
    public StagedOrderSetLineItemDistributionChannelAction build() {
        return new StagedOrderSetLineItemDistributionChannelActionImpl(lineItemId, lineItemKey, distributionChannel);
    }

    /**
     * builds StagedOrderSetLineItemDistributionChannelAction without checking for non-null required values
     * @return StagedOrderSetLineItemDistributionChannelAction
     */
    public StagedOrderSetLineItemDistributionChannelAction buildUnchecked() {
        return new StagedOrderSetLineItemDistributionChannelActionImpl(lineItemId, lineItemKey, distributionChannel);
    }

    /**
     * factory method for an instance of StagedOrderSetLineItemDistributionChannelActionBuilder
     * @return builder
     */
    public static StagedOrderSetLineItemDistributionChannelActionBuilder of() {
        return new StagedOrderSetLineItemDistributionChannelActionBuilder();
    }

    /**
     * create builder for StagedOrderSetLineItemDistributionChannelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetLineItemDistributionChannelActionBuilder of(
            final StagedOrderSetLineItemDistributionChannelAction template) {
        StagedOrderSetLineItemDistributionChannelActionBuilder builder = new StagedOrderSetLineItemDistributionChannelActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
