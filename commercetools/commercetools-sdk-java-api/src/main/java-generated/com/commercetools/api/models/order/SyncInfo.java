
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SyncInfo
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SyncInfo syncInfo = SyncInfo.builder()
 *             .channel(channelBuilder -> channelBuilder)
 *             .syncedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SyncInfoImpl.class)
public interface SyncInfo {

    /**
     *  <p>Connection to a particular synchronization destination.</p>
     * @return channel
     */
    @NotNull
    @Valid
    @JsonProperty("channel")
    public ChannelReference getChannel();

    /**
     *  <p>Can be used to reference an external order instance, file etc.</p>
     * @return externalId
     */

    @JsonProperty("externalId")
    public String getExternalId();

    /**
     *
     * @return syncedAt
     */
    @NotNull
    @JsonProperty("syncedAt")
    public ZonedDateTime getSyncedAt();

    /**
     *  <p>Connection to a particular synchronization destination.</p>
     * @param channel value to be set
     */

    public void setChannel(final ChannelReference channel);

    /**
     *  <p>Can be used to reference an external order instance, file etc.</p>
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
     * @return instance of SyncInfo
     */
    public static SyncInfo of() {
        return new SyncInfoImpl();
    }

    /**
     * factory method to copy an instance of SyncInfo
     * @param template instance to be copied
     * @return copy instance
     */
    public static SyncInfo of(final SyncInfo template) {
        SyncInfoImpl instance = new SyncInfoImpl();
        instance.setChannel(template.getChannel());
        instance.setExternalId(template.getExternalId());
        instance.setSyncedAt(template.getSyncedAt());
        return instance;
    }

    /**
     * builder factory method for SyncInfo
     * @return builder
     */
    public static SyncInfoBuilder builder() {
        return SyncInfoBuilder.of();
    }

    /**
     * create builder for SyncInfo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SyncInfoBuilder builder(final SyncInfo template) {
        return SyncInfoBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSyncInfo(Function<SyncInfo, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SyncInfo> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SyncInfo>() {
            @Override
            public String toString() {
                return "TypeReference<SyncInfo>";
            }
        };
    }
}
