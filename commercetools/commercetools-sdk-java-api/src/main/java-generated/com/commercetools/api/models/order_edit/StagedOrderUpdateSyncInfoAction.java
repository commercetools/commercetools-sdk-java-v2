
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderUpdateSyncInfoAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderUpdateSyncInfoAction stagedOrderUpdateSyncInfoAction = StagedOrderUpdateSyncInfoAction.builder()
 *             .channel(channelBuilder -> channelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderUpdateSyncInfoActionImpl.class)
public interface StagedOrderUpdateSyncInfoAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderUpdateSyncInfoAction
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
     * @return instance of StagedOrderUpdateSyncInfoAction
     */
    public static StagedOrderUpdateSyncInfoAction of() {
        return new StagedOrderUpdateSyncInfoActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderUpdateSyncInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderUpdateSyncInfoAction of(final StagedOrderUpdateSyncInfoAction template) {
        StagedOrderUpdateSyncInfoActionImpl instance = new StagedOrderUpdateSyncInfoActionImpl();
        instance.setChannel(template.getChannel());
        instance.setExternalId(template.getExternalId());
        instance.setSyncedAt(template.getSyncedAt());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderUpdateSyncInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderUpdateSyncInfoAction deepCopy(@Nullable final StagedOrderUpdateSyncInfoAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderUpdateSyncInfoActionImpl instance = new StagedOrderUpdateSyncInfoActionImpl();
        instance.setChannel(Optional.ofNullable(template.getChannel())
                .map(com.commercetools.api.models.channel.ChannelResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setExternalId(template.getExternalId());
        instance.setSyncedAt(template.getSyncedAt());
        return instance;
    }

    /**
     * builder factory method for StagedOrderUpdateSyncInfoAction
     * @return builder
     */
    public static StagedOrderUpdateSyncInfoActionBuilder builder() {
        return StagedOrderUpdateSyncInfoActionBuilder.of();
    }

    /**
     * create builder for StagedOrderUpdateSyncInfoAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderUpdateSyncInfoActionBuilder builder(final StagedOrderUpdateSyncInfoAction template) {
        return StagedOrderUpdateSyncInfoActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderUpdateSyncInfoAction(Function<StagedOrderUpdateSyncInfoAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderUpdateSyncInfoAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderUpdateSyncInfoAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderUpdateSyncInfoAction>";
            }
        };
    }
}
