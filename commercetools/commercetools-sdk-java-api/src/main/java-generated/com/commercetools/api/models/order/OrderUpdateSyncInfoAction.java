
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
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
 * OrderUpdateSyncInfoAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderUpdateSyncInfoAction orderUpdateSyncInfoAction = OrderUpdateSyncInfoAction.builder()
 *             .channel(channelBuilder -> channelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderUpdateSyncInfoActionImpl.class)
public interface OrderUpdateSyncInfoAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderUpdateSyncInfoAction
     */
    String UPDATE_SYNC_INFO = "updateSyncInfo";

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @return channel
     */
    @NotNull
    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();

    /**
     *
     * @return externalId
     */

    @JsonProperty("externalId")
    public String getExternalId();

    /**
     *
     * @return syncedAt
     */

    @JsonProperty("syncedAt")
    public ZonedDateTime getSyncedAt();

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @param channel value to be set
     */

    public void setChannel(final ChannelResourceIdentifier channel);

    /**
     * set externalId
     * @param externalId value to be set
     */

    public void setExternalId(final String externalId);

    /**
     * set syncedAt
     * @param syncedAt value to be set
     */

    public void setSyncedAt(final ZonedDateTime syncedAt);

    /**
     * factory method
     * @return instance of OrderUpdateSyncInfoAction
     */
    public static OrderUpdateSyncInfoAction of() {
        return new OrderUpdateSyncInfoActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderUpdateSyncInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderUpdateSyncInfoAction of(final OrderUpdateSyncInfoAction template) {
        OrderUpdateSyncInfoActionImpl instance = new OrderUpdateSyncInfoActionImpl();
        instance.setChannel(template.getChannel());
        instance.setExternalId(template.getExternalId());
        instance.setSyncedAt(template.getSyncedAt());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderUpdateSyncInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderUpdateSyncInfoAction deepCopy(@Nullable final OrderUpdateSyncInfoAction template) {
        if (template == null) {
            return null;
        }
        OrderUpdateSyncInfoActionImpl instance = new OrderUpdateSyncInfoActionImpl();
        instance.setChannel(Optional.ofNullable(template.getChannel())
                .map(com.commercetools.api.models.channel.ChannelResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setExternalId(template.getExternalId());
        instance.setSyncedAt(template.getSyncedAt());
        return instance;
    }

    /**
     * builder factory method for OrderUpdateSyncInfoAction
     * @return builder
     */
    public static OrderUpdateSyncInfoActionBuilder builder() {
        return OrderUpdateSyncInfoActionBuilder.of();
    }

    /**
     * create builder for OrderUpdateSyncInfoAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderUpdateSyncInfoActionBuilder builder(final OrderUpdateSyncInfoAction template) {
        return OrderUpdateSyncInfoActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderUpdateSyncInfoAction(Function<OrderUpdateSyncInfoAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderUpdateSyncInfoAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderUpdateSyncInfoAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderUpdateSyncInfoAction>";
            }
        };
    }
}
