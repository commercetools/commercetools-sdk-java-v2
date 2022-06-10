
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreRemoveDistributionChannelAction
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreRemoveDistributionChannelActionImpl.class)
public interface StoreRemoveDistributionChannelAction extends StoreUpdateAction {

    String REMOVE_DISTRIBUTION_CHANNEL = "removeDistributionChannel";

    /**
     *  <p>Value to remove. ResourceIdentifier of a Channel with the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    public static StoreRemoveDistributionChannelAction of() {
        return new StoreRemoveDistributionChannelActionImpl();
    }

    public static StoreRemoveDistributionChannelAction of(final StoreRemoveDistributionChannelAction template) {
        StoreRemoveDistributionChannelActionImpl instance = new StoreRemoveDistributionChannelActionImpl();
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public static StoreRemoveDistributionChannelActionBuilder builder() {
        return StoreRemoveDistributionChannelActionBuilder.of();
    }

    public static StoreRemoveDistributionChannelActionBuilder builder(
            final StoreRemoveDistributionChannelAction template) {
        return StoreRemoveDistributionChannelActionBuilder.of(template);
    }

    default <T> T withStoreRemoveDistributionChannelAction(Function<StoreRemoveDistributionChannelAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreRemoveDistributionChannelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreRemoveDistributionChannelAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreRemoveDistributionChannelAction>";
            }
        };
    }
}
