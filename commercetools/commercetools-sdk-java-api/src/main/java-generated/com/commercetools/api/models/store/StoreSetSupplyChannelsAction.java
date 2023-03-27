
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
 *  <p>Setting a supply channel produces the StoreSupplyChannelsChanged Message.</p>
 *  <p>Setting a Channel without the <code>InventorySupply</code> ChannelRoleEnum returns a MissingRoleOnChannel error.</p>
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

    /**
     * discriminator value for StoreSetSupplyChannelsAction
     */
    String SET_SUPPLY_CHANNELS = "setSupplyChannels";

    /**
     *  <p>Value to set. If not defined, the Store's <code>supplyChannels</code> are unset.</p>
     * @return supplyChannels
     */
    @Valid
    @JsonProperty("supplyChannels")
    public List<ChannelResourceIdentifier> getSupplyChannels();

    /**
     *  <p>Value to set. If not defined, the Store's <code>supplyChannels</code> are unset.</p>
     * @param supplyChannels values to be set
     */

    @JsonIgnore
    public void setSupplyChannels(final ChannelResourceIdentifier... supplyChannels);

    /**
     *  <p>Value to set. If not defined, the Store's <code>supplyChannels</code> are unset.</p>
     * @param supplyChannels values to be set
     */

    public void setSupplyChannels(final List<ChannelResourceIdentifier> supplyChannels);

    /**
     * factory method
     * @return instance of StoreSetSupplyChannelsAction
     */
    public static StoreSetSupplyChannelsAction of() {
        return new StoreSetSupplyChannelsActionImpl();
    }

    /**
     * factory method to copy an instance of StoreSetSupplyChannelsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSetSupplyChannelsAction of(final StoreSetSupplyChannelsAction template) {
        StoreSetSupplyChannelsActionImpl instance = new StoreSetSupplyChannelsActionImpl();
        instance.setSupplyChannels(template.getSupplyChannels());
        return instance;
    }

    /**
     * builder factory method for StoreSetSupplyChannelsAction
     * @return builder
     */
    public static StoreSetSupplyChannelsActionBuilder builder() {
        return StoreSetSupplyChannelsActionBuilder.of();
    }

    /**
     * create builder for StoreSetSupplyChannelsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetSupplyChannelsActionBuilder builder(final StoreSetSupplyChannelsAction template) {
        return StoreSetSupplyChannelsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSetSupplyChannelsAction(Function<StoreSetSupplyChannelsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreSetSupplyChannelsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSetSupplyChannelsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetSupplyChannelsAction>";
            }
        };
    }
}
