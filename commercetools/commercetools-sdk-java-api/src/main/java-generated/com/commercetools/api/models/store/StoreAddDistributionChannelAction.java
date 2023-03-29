
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action produces the StoreDistributionChannelsChanged Message. It has no effect if a given distribution channel is already present in a Store.</p>
 *  <p>Adding a Channel without the <code>ProductDistribution</code> ChannelRoleEnum returns a MissingRoleOnChannel error.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreAddDistributionChannelAction storeAddDistributionChannelAction = StoreAddDistributionChannelAction.builder()
 *             .distributionChannel(distributionChannelBuilder -> distributionChannelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreAddDistributionChannelActionImpl.class)
public interface StoreAddDistributionChannelAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreAddDistributionChannelAction
     */
    String ADD_DISTRIBUTION_CHANNEL = "addDistributionChannel";

    /**
     *  <p>Value to append.</p>
     * @return distributionChannel
     */
    @NotNull
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    /**
     *  <p>Value to append.</p>
     * @param distributionChannel value to be set
     */

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    /**
     * factory method
     * @return instance of StoreAddDistributionChannelAction
     */
    public static StoreAddDistributionChannelAction of() {
        return new StoreAddDistributionChannelActionImpl();
    }

    /**
     * factory method to create a shallow copy StoreAddDistributionChannelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreAddDistributionChannelAction of(final StoreAddDistributionChannelAction template) {
        StoreAddDistributionChannelActionImpl instance = new StoreAddDistributionChannelActionImpl();
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    /**
     * factory method to create a deep copy of StoreAddDistributionChannelAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreAddDistributionChannelAction deepCopy(
            @Nullable final StoreAddDistributionChannelAction template) {
        if (template == null) {
            return null;
        }
        StoreAddDistributionChannelActionImpl instance = new StoreAddDistributionChannelActionImpl();
        instance.setDistributionChannel(Optional.ofNullable(template.getDistributionChannel())
                .map(com.commercetools.api.models.channel.ChannelResourceIdentifier::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StoreAddDistributionChannelAction
     * @return builder
     */
    public static StoreAddDistributionChannelActionBuilder builder() {
        return StoreAddDistributionChannelActionBuilder.of();
    }

    /**
     * create builder for StoreAddDistributionChannelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreAddDistributionChannelActionBuilder builder(final StoreAddDistributionChannelAction template) {
        return StoreAddDistributionChannelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreAddDistributionChannelAction(Function<StoreAddDistributionChannelAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreAddDistributionChannelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreAddDistributionChannelAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreAddDistributionChannelAction>";
            }
        };
    }
}
