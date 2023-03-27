
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetLineItemDistributionChannelAction
 *
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
@JsonDeserialize(as = StagedOrderSetLineItemDistributionChannelActionImpl.class)
public interface StagedOrderSetLineItemDistributionChannelAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetLineItemDistributionChannelAction
     */
    String SET_LINE_ITEM_DISTRIBUTION_CHANNEL = "setLineItemDistributionChannel";

    /**
     *
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @return distributionChannel
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    /**
     * set lineItemId
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @param distributionChannel value to be set
     */

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    /**
     * factory method
     * @return instance of StagedOrderSetLineItemDistributionChannelAction
     */
    public static StagedOrderSetLineItemDistributionChannelAction of() {
        return new StagedOrderSetLineItemDistributionChannelActionImpl();
    }

    /**
     * factory method to copy an instance of StagedOrderSetLineItemDistributionChannelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetLineItemDistributionChannelAction of(
            final StagedOrderSetLineItemDistributionChannelAction template) {
        StagedOrderSetLineItemDistributionChannelActionImpl instance = new StagedOrderSetLineItemDistributionChannelActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetLineItemDistributionChannelAction
     * @return builder
     */
    public static StagedOrderSetLineItemDistributionChannelActionBuilder builder() {
        return StagedOrderSetLineItemDistributionChannelActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetLineItemDistributionChannelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetLineItemDistributionChannelActionBuilder builder(
            final StagedOrderSetLineItemDistributionChannelAction template) {
        return StagedOrderSetLineItemDistributionChannelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetLineItemDistributionChannelAction(
            Function<StagedOrderSetLineItemDistributionChannelAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemDistributionChannelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemDistributionChannelAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetLineItemDistributionChannelAction>";
            }
        };
    }
}
