
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
 * StoreAddDistributionChannelAction
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

    String ADD_DISTRIBUTION_CHANNEL = "addDistributionChannel";

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    public static StoreAddDistributionChannelAction of() {
        return new StoreAddDistributionChannelActionImpl();
    }

    public static StoreAddDistributionChannelAction of(final StoreAddDistributionChannelAction template) {
        StoreAddDistributionChannelActionImpl instance = new StoreAddDistributionChannelActionImpl();
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public static StoreAddDistributionChannelActionBuilder builder() {
        return StoreAddDistributionChannelActionBuilder.of();
    }

    public static StoreAddDistributionChannelActionBuilder builder(final StoreAddDistributionChannelAction template) {
        return StoreAddDistributionChannelActionBuilder.of(template);
    }

    default <T> T withStoreAddDistributionChannelAction(Function<StoreAddDistributionChannelAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreAddDistributionChannelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreAddDistributionChannelAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreAddDistributionChannelAction>";
            }
        };
    }
}
