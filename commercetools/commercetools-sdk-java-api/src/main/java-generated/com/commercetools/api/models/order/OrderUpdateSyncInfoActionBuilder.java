package com.commercetools.api.models.order;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.order.OrderUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.order.OrderUpdateSyncInfoAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderUpdateSyncInfoActionBuilder
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderUpdateSyncInfoActionBuilder implements Builder<OrderUpdateSyncInfoAction> {

    
    
    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;
    
    
    @Nullable
    private String externalId;
    
    
    @Nullable
    private java.time.ZonedDateTime syncedAt;

    
    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @param builder function to build the channel value
     * @return Builder
     */
    
    public OrderUpdateSyncInfoActionBuilder channel(Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @param builder function to build the channel value
     * @return Builder
     */
    
    public OrderUpdateSyncInfoActionBuilder withChannel(Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @param channel value to be set
     * @return Builder
     */
    
    public OrderUpdateSyncInfoActionBuilder channel( final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }
    
    
    
    
    /**
     * set the value to the externalId
     * @param externalId value to be set
     * @return Builder
     */
    
    public OrderUpdateSyncInfoActionBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }
    
    
    
    
    /**
     * set the value to the syncedAt
     * @param syncedAt value to be set
     * @return Builder
     */
    
    public OrderUpdateSyncInfoActionBuilder syncedAt(@Nullable final java.time.ZonedDateTime syncedAt) {
        this.syncedAt = syncedAt;
        return this;
    }
    
    

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @return channel
     */
    
    
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel(){
        return this.channel;
    }
    
    /**
     * value of externalId}
     * @return externalId
     */
    
    @Nullable
    public String getExternalId(){
        return this.externalId;
    }
    
    /**
     * value of syncedAt}
     * @return syncedAt
     */
    
    @Nullable
    public java.time.ZonedDateTime getSyncedAt(){
        return this.syncedAt;
    }

    /**
     * builds OrderUpdateSyncInfoAction with checking for non-null required values
     * @return OrderUpdateSyncInfoAction
     */
    public OrderUpdateSyncInfoAction build() {
        Objects.requireNonNull(channel, OrderUpdateSyncInfoAction.class + ": channel is missing");
        return new OrderUpdateSyncInfoActionImpl(channel, externalId, syncedAt);
    }
    
    /**
     * builds OrderUpdateSyncInfoAction without checking for non-null required values
     * @return OrderUpdateSyncInfoAction
     */
    public OrderUpdateSyncInfoAction buildUnchecked() {
        return new OrderUpdateSyncInfoActionImpl(channel, externalId, syncedAt);
    }

    /**
     * factory method for an instance of OrderUpdateSyncInfoActionBuilder
     * @return builder 
     */
    public static OrderUpdateSyncInfoActionBuilder of() {
        return new OrderUpdateSyncInfoActionBuilder();
    }

    /**
     * create builder for OrderUpdateSyncInfoAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderUpdateSyncInfoActionBuilder of(final OrderUpdateSyncInfoAction template) {
        OrderUpdateSyncInfoActionBuilder builder = new OrderUpdateSyncInfoActionBuilder();
        builder.channel = template.getChannel();
        builder.externalId = template.getExternalId();
        builder.syncedAt = template.getSyncedAt();
        return builder;
    }

}
