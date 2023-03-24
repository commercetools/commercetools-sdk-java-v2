
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
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetLineItemDistributionChannelActionBuilder
        implements Builder<StagedOrderSetLineItemDistributionChannelAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    /**
     *
     * @param lineItemId value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemDistributionChannelActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
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
     *  <p>ResourceIdentifier to a Channel.</p>
     * @param distributionChannel value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemDistributionChannelActionBuilder distributionChannel(
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

    /**
     * builds StagedOrderSetLineItemDistributionChannelAction with checking for non-null required values
     * @return StagedOrderSetLineItemDistributionChannelAction
     */
    public StagedOrderSetLineItemDistributionChannelAction build() {
        Objects.requireNonNull(lineItemId,
            StagedOrderSetLineItemDistributionChannelAction.class + ": lineItemId is missing");
        return new StagedOrderSetLineItemDistributionChannelActionImpl(lineItemId, distributionChannel);
    }

    /**
     * builds StagedOrderSetLineItemDistributionChannelAction without checking for non-null required values
     * @return StagedOrderSetLineItemDistributionChannelAction
     */
    public StagedOrderSetLineItemDistributionChannelAction buildUnchecked() {
        return new StagedOrderSetLineItemDistributionChannelActionImpl(lineItemId, distributionChannel);
    }

    public static StagedOrderSetLineItemDistributionChannelActionBuilder of() {
        return new StagedOrderSetLineItemDistributionChannelActionBuilder();
    }

    public static StagedOrderSetLineItemDistributionChannelActionBuilder of(
            final StagedOrderSetLineItemDistributionChannelAction template) {
        StagedOrderSetLineItemDistributionChannelActionBuilder builder = new StagedOrderSetLineItemDistributionChannelActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
