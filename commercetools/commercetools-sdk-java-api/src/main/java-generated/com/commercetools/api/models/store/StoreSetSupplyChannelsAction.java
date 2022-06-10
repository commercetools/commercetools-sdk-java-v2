
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetSupplyChannelsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetSupplyChannelsAction storeSetSupplyChannelsAction = StoreSetSupplyChannelsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetSupplyChannelsActionImpl.class)
public interface StoreSetSupplyChannelsAction extends StoreUpdateAction {

    String SET_SUPPLY_CHANNELS = "setSupplyChannels";

    /**
     *  <p>Value to set. If not defined, the Store's <code>supplyChannels</code> are unset. Any attempt to use Channel without the <code>InventorySupply</code> ChannelRoleEnum will fail with a MissingRoleOnChannel error.</p>
     */
    @Valid
    @JsonProperty("supplyChannels")
    public List<ChannelResourceIdentifier> getSupplyChannels();

    @JsonIgnore
    public void setSupplyChannels(final ChannelResourceIdentifier... supplyChannels);

    public void setSupplyChannels(final List<ChannelResourceIdentifier> supplyChannels);

    public static StoreSetSupplyChannelsAction of() {
        return new StoreSetSupplyChannelsActionImpl();
    }

    public static StoreSetSupplyChannelsAction of(final StoreSetSupplyChannelsAction template) {
        StoreSetSupplyChannelsActionImpl instance = new StoreSetSupplyChannelsActionImpl();
        instance.setSupplyChannels(template.getSupplyChannels());
        return instance;
    }

    public static StoreSetSupplyChannelsActionBuilder builder() {
        return StoreSetSupplyChannelsActionBuilder.of();
    }

    public static StoreSetSupplyChannelsActionBuilder builder(final StoreSetSupplyChannelsAction template) {
        return StoreSetSupplyChannelsActionBuilder.of(template);
    }

    default <T> T withStoreSetSupplyChannelsAction(Function<StoreSetSupplyChannelsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreSetSupplyChannelsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSetSupplyChannelsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetSupplyChannelsAction>";
            }
        };
    }
}
