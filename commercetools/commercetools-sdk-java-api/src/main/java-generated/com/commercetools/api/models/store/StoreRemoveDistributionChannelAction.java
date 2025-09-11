
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreDistributionChannelsChangedMessage" rel="nofollow">StoreDistributionChannelsChanged</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreRemoveDistributionChannelAction storeRemoveDistributionChannelAction = StoreRemoveDistributionChannelAction.builder()
 *             .distributionChannel(distributionChannelBuilder -> distributionChannelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeDistributionChannel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreRemoveDistributionChannelActionImpl.class)
public interface StoreRemoveDistributionChannelAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreRemoveDistributionChannelAction
     */
    String REMOVE_DISTRIBUTION_CHANNEL = "removeDistributionChannel";

    /**
     *  <p>Value to remove. ResourceIdentifier of a Channel with the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @return distributionChannel
     */
    @NotNull
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    /**
     *  <p>Value to remove. ResourceIdentifier of a Channel with the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @param distributionChannel value to be set
     */

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    /**
     * factory method
     * @return instance of StoreRemoveDistributionChannelAction
     */
    public static StoreRemoveDistributionChannelAction of() {
        return new StoreRemoveDistributionChannelActionImpl();
    }

    /**
     * factory method to create a shallow copy StoreRemoveDistributionChannelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreRemoveDistributionChannelAction of(final StoreRemoveDistributionChannelAction template) {
        StoreRemoveDistributionChannelActionImpl instance = new StoreRemoveDistributionChannelActionImpl();
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public StoreRemoveDistributionChannelAction copyDeep();

    /**
     * factory method to create a deep copy of StoreRemoveDistributionChannelAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreRemoveDistributionChannelAction deepCopy(
            @Nullable final StoreRemoveDistributionChannelAction template) {
        if (template == null) {
            return null;
        }
        StoreRemoveDistributionChannelActionImpl instance = new StoreRemoveDistributionChannelActionImpl();
        instance.setDistributionChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getDistributionChannel()));
        return instance;
    }

    /**
     * builder factory method for StoreRemoveDistributionChannelAction
     * @return builder
     */
    public static StoreRemoveDistributionChannelActionBuilder builder() {
        return StoreRemoveDistributionChannelActionBuilder.of();
    }

    /**
     * create builder for StoreRemoveDistributionChannelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreRemoveDistributionChannelActionBuilder builder(
            final StoreRemoveDistributionChannelAction template) {
        return StoreRemoveDistributionChannelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreRemoveDistributionChannelAction(Function<StoreRemoveDistributionChannelAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreRemoveDistributionChannelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreRemoveDistributionChannelAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreRemoveDistributionChannelAction>";
            }
        };
    }
}
