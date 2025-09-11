
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Setting a distribution channel for a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> can lead to an updated <code>price</code> as described in <span>Line Item price selection</span>.</p>
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderLineItemDistributionChannelSetMessage" rel="nofollow">OrderLineItemDistributionChannelSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetLineItemDistributionChannelAction stagedOrderSetLineItemDistributionChannelAction = StagedOrderSetLineItemDistributionChannelAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLineItemDistributionChannel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetLineItemDistributionChannelActionImpl.class)
public interface StagedOrderSetLineItemDistributionChannelAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetLineItemDistributionChannelAction
     */
    String SET_LINE_ITEM_DISTRIBUTION_CHANNEL = "setLineItemDistributionChannel";

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
     *   <li>If not present, the current <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a distribution channel is removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> specified by <code>lineItemId</code>. The Channel must have the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</li>
     *  </ul>
     * @return distributionChannel
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

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
     *   <li>If not present, the current <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a distribution channel is removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> specified by <code>lineItemId</code>. The Channel must have the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</li>
     *  </ul>
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
     * factory method to create a shallow copy StagedOrderSetLineItemDistributionChannelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetLineItemDistributionChannelAction of(
            final StagedOrderSetLineItemDistributionChannelAction template) {
        StagedOrderSetLineItemDistributionChannelActionImpl instance = new StagedOrderSetLineItemDistributionChannelActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public StagedOrderSetLineItemDistributionChannelAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderSetLineItemDistributionChannelAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetLineItemDistributionChannelAction deepCopy(
            @Nullable final StagedOrderSetLineItemDistributionChannelAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetLineItemDistributionChannelActionImpl instance = new StagedOrderSetLineItemDistributionChannelActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setDistributionChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getDistributionChannel()));
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
