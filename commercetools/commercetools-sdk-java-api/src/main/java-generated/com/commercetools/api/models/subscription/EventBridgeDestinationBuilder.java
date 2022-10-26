
package com.commercetools.api.models.subscription;

import java.util.*;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EventBridgeDestinationBuilder implements Builder<EventBridgeDestination> {

    private String region;

    private String accountId;

    /**
     *  <p>AWS region that receives the events.</p>
     */

    public EventBridgeDestinationBuilder region(final String region) {
        this.region = region;
        return this;
    }

    /**
     *  <p>ID of the AWS account that receives the events.</p>
     */

    public EventBridgeDestinationBuilder accountId(final String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public EventBridgeDestination build() {
        Objects.requireNonNull(region, EventBridgeDestination.class + ": region is missing");
        Objects.requireNonNull(accountId, EventBridgeDestination.class + ": accountId is missing");
        return new EventBridgeDestinationImpl(region, accountId);
    }

    /**
     * builds EventBridgeDestination without checking for non null required values
     */
    public EventBridgeDestination buildUnchecked() {
        return new EventBridgeDestinationImpl(region, accountId);
    }

    public static EventBridgeDestinationBuilder of() {
        return new EventBridgeDestinationBuilder();
    }

    public static EventBridgeDestinationBuilder of(final EventBridgeDestination template) {
        EventBridgeDestinationBuilder builder = new EventBridgeDestinationBuilder();
        builder.region = template.getRegion();
        builder.accountId = template.getAccountId();
        return builder;
    }

}
