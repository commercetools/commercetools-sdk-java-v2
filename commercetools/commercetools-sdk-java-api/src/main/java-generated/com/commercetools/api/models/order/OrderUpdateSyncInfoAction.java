
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
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
     *  <p>Set this to identify an external order instance, file, or other resource.</p>
     * @return externalId
     */

    @JsonProperty("externalId")
    public String getExternalId();

    /**
     *  <p>The synchronization destination to set. Must not be empty. The referenced Channel must have the Channel Role <code>OrderExport</code> or <code>OrderImport</code>. Otherwise this update action returns an InvalidInput error.</p>
     * @return channel
     */
    @NotNull
    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();

    /**
     *  <p>If not set, it defaults to the current date and time.</p>
     * @return syncedAt
     */

    @JsonProperty("syncedAt")
    public ZonedDateTime getSyncedAt();

    /**
     *  <p>Set this to identify an external order instance, file, or other resource.</p>
     * @param externalId value to be set
     */

    public void setExternalId(final String externalId);

    /**
     *  <p>The synchronization destination to set. Must not be empty. The referenced Channel must have the Channel Role <code>OrderExport</code> or <code>OrderImport</code>. Otherwise this update action returns an InvalidInput error.</p>
     * @param channel value to be set
     */

    public void setChannel(final ChannelResourceIdentifier channel);

    /**
     *  <p>If not set, it defaults to the current date and time.</p>
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
        instance.setExternalId(template.getExternalId());
        instance.setChannel(template.getChannel());
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
        instance.setExternalId(template.getExternalId());
        instance.setChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getChannel()));
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
