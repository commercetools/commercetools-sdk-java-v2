package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
import com.commercetools.api.models.subscription.EventBridgeDestination;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * EventBridgeDestinationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EventBridgeDestination eventBridgeDestination = EventBridgeDestination.builder()
 *             .region("{region}")
 *             .accountId("{accountId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class EventBridgeDestinationBuilder implements Builder<EventBridgeDestination> {

    
    
    private String region;
    
    
    
    private String accountId;

    
    /**
     *  <p>AWS region that receives the events.</p>
     * @param region value to be set
     * @return Builder
     */
    
    public EventBridgeDestinationBuilder region( final String region) {
        this.region = region;
        return this;
    }
    
    
    
    
    /**
     *  <p>ID of the AWS account that receives the events.</p>
     * @param accountId value to be set
     * @return Builder
     */
    
    public EventBridgeDestinationBuilder accountId( final String accountId) {
        this.accountId = accountId;
        return this;
    }
    
    

    /**
     *  <p>AWS region that receives the events.</p>
     * @return region
     */
    
    
    public String getRegion(){
        return this.region;
    }
    
    /**
     *  <p>ID of the AWS account that receives the events.</p>
     * @return accountId
     */
    
    
    public String getAccountId(){
        return this.accountId;
    }

    /**
     * builds EventBridgeDestination with checking for non-null required values
     * @return EventBridgeDestination
     */
    public EventBridgeDestination build() {
        Objects.requireNonNull(region, EventBridgeDestination.class + ": region is missing");
        Objects.requireNonNull(accountId, EventBridgeDestination.class + ": accountId is missing");
        return new EventBridgeDestinationImpl(region, accountId);
    }
    
    /**
     * builds EventBridgeDestination without checking for non-null required values
     * @return EventBridgeDestination
     */
    public EventBridgeDestination buildUnchecked() {
        return new EventBridgeDestinationImpl(region, accountId);
    }

    /**
     * factory method for an instance of EventBridgeDestinationBuilder
     * @return builder 
     */
    public static EventBridgeDestinationBuilder of() {
        return new EventBridgeDestinationBuilder();
    }

    /**
     * create builder for EventBridgeDestination instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EventBridgeDestinationBuilder of(final EventBridgeDestination template) {
        EventBridgeDestinationBuilder builder = new EventBridgeDestinationBuilder();
        builder.region = template.getRegion();
        builder.accountId = template.getAccountId();
        return builder;
    }

}
