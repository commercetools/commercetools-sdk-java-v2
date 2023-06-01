package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.ChannelKeyReference;
import java.time.ZonedDateTime;
import com.commercetools.importapi.models.orders.SyncInfoImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SyncInfoImpl.class)
public interface SyncInfo  {


    /**
     *  <p>Maps to <code>SyncInfo.channel</code></p>
     * @return channel
     */
    @NotNull
    @Valid
    @JsonProperty("channel")
    public ChannelKeyReference getChannel();
    /**
     *  <p>Maps to <code>SyncInfo.externalId</code></p>
     * @return externalId
     */
    
    @JsonProperty("externalId")
    public String getExternalId();
    /**
     *  <p>Maps to <code>SyncInfo.syncedAt</code></p>
     * @return syncedAt
     */
    @NotNull
    @JsonProperty("syncedAt")
    public ZonedDateTime getSyncedAt();

    /**
     *  <p>Maps to <code>SyncInfo.channel</code></p>
     * @param channel value to be set
     */
    
    public void setChannel(final ChannelKeyReference channel);
    
    
    /**
     *  <p>Maps to <code>SyncInfo.externalId</code></p>
     * @param externalId value to be set
     */
    
    public void setExternalId(final String externalId);
    
    
    /**
     *  <p>Maps to <code>SyncInfo.syncedAt</code></p>
     * @param syncedAt value to be set
     */
    
    public void setSyncedAt(final ZonedDateTime syncedAt);
    

    /**
     * factory method
     * @return instance of SyncInfo
     */
    public static SyncInfo of(){
        return new SyncInfoImpl();
    }
    

    /**
     * factory method to create a shallow copy SyncInfo
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
     * factory method to create a deep copy of SyncInfo
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SyncInfo deepCopy(@Nullable final SyncInfo template) {
        if (template == null) {
            return null;
        }
        SyncInfoImpl instance = new SyncInfoImpl();
        instance.setChannel(com.commercetools.importapi.models.common.ChannelKeyReference.deepCopy(template.getChannel()));
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
