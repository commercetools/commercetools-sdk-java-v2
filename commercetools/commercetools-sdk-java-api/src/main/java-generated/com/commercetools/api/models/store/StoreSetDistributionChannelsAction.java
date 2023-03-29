
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action produces the StoreDistributionChannelsChanged Message.</p>
 *  <p>Setting a Channel without the <code>ProductDistribution</code> ChannelRoleEnum returns a MissingRoleOnChannel error.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetDistributionChannelsAction storeSetDistributionChannelsAction = StoreSetDistributionChannelsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetDistributionChannelsActionImpl.class)
public interface StoreSetDistributionChannelsAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreSetDistributionChannelsAction
     */
    String SET_DISTRIBUTION_CHANNELS = "setDistributionChannels";

    /**
     *  <p>Value to set. If not defined, the Store's <code>distributionChannels</code> are unset.</p>
     * @return distributionChannels
     */
    @Valid
    @JsonProperty("distributionChannels")
    public List<ChannelResourceIdentifier> getDistributionChannels();

    /**
     *  <p>Value to set. If not defined, the Store's <code>distributionChannels</code> are unset.</p>
     * @param distributionChannels values to be set
     */

    @JsonIgnore
    public void setDistributionChannels(final ChannelResourceIdentifier... distributionChannels);

    /**
     *  <p>Value to set. If not defined, the Store's <code>distributionChannels</code> are unset.</p>
     * @param distributionChannels values to be set
     */

    public void setDistributionChannels(final List<ChannelResourceIdentifier> distributionChannels);

    /**
     * factory method
     * @return instance of StoreSetDistributionChannelsAction
     */
    public static StoreSetDistributionChannelsAction of() {
        return new StoreSetDistributionChannelsActionImpl();
    }

    /**
     * factory method to create a shallow copy StoreSetDistributionChannelsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSetDistributionChannelsAction of(final StoreSetDistributionChannelsAction template) {
        StoreSetDistributionChannelsActionImpl instance = new StoreSetDistributionChannelsActionImpl();
        instance.setDistributionChannels(template.getDistributionChannels());
        return instance;
    }

    /**
     * factory method to create a deep copy of StoreSetDistributionChannelsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreSetDistributionChannelsAction deepCopy(
            @Nullable final StoreSetDistributionChannelsAction template) {
        if (template == null) {
            return null;
        }
        StoreSetDistributionChannelsActionImpl instance = new StoreSetDistributionChannelsActionImpl();
        instance.setDistributionChannels(Optional.ofNullable(template.getDistributionChannels())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.channel.ChannelResourceIdentifier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StoreSetDistributionChannelsAction
     * @return builder
     */
    public static StoreSetDistributionChannelsActionBuilder builder() {
        return StoreSetDistributionChannelsActionBuilder.of();
    }

    /**
     * create builder for StoreSetDistributionChannelsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetDistributionChannelsActionBuilder builder(final StoreSetDistributionChannelsAction template) {
        return StoreSetDistributionChannelsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSetDistributionChannelsAction(Function<StoreSetDistributionChannelsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreSetDistributionChannelsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSetDistributionChannelsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetDistributionChannelsAction>";
            }
        };
    }
}
