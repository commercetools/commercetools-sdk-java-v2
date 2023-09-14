
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
        instance.setExternalId(template.getExternalId());
        instance.setChannel(template.getChannel());
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
        instance.setExternalId(template.getExternalId());
        instance.setChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getChannel()));
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
