
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
 * StoreRemoveSupplyChannelAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreRemoveSupplyChannelAction storeRemoveSupplyChannelAction = StoreRemoveSupplyChannelAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreRemoveSupplyChannelActionImpl.class)
public interface StoreRemoveSupplyChannelAction extends StoreUpdateAction {

    String REMOVE_SUPPLY_CHANNEL = "removeSupplyChannel";

    /**
     *
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    public static StoreRemoveSupplyChannelAction of() {
        return new StoreRemoveSupplyChannelActionImpl();
    }

    public static StoreRemoveSupplyChannelAction of(final StoreRemoveSupplyChannelAction template) {
        StoreRemoveSupplyChannelActionImpl instance = new StoreRemoveSupplyChannelActionImpl();
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public static StoreRemoveSupplyChannelActionBuilder builder() {
        return StoreRemoveSupplyChannelActionBuilder.of();
    }

    public static StoreRemoveSupplyChannelActionBuilder builder(final StoreRemoveSupplyChannelAction template) {
        return StoreRemoveSupplyChannelActionBuilder.of(template);
    }

    default <T> T withStoreRemoveSupplyChannelAction(Function<StoreRemoveSupplyChannelAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreRemoveSupplyChannelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreRemoveSupplyChannelAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreRemoveSupplyChannelAction>";
            }
        };
    }
}
