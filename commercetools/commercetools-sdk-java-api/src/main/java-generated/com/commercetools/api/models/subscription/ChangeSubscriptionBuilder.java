package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.ChangeSubscriptionResourceTypeId;
import com.commercetools.api.models.subscription.ChangeSubscription;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeSubscriptionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeSubscription changeSubscription = ChangeSubscription.builder()
 *             .resourceTypeId(ChangeSubscriptionResourceTypeId.BUSINESS_UNIT)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeSubscriptionBuilder implements Builder<ChangeSubscription> {

    
    
    private com.commercetools.api.models.subscription.ChangeSubscriptionResourceTypeId resourceTypeId;

    
    /**
     *  <p>Unique identifier for the type of resource, for example, <code>cart</code>.</p>
     * @param resourceTypeId value to be set
     * @return Builder
     */
    
    public ChangeSubscriptionBuilder resourceTypeId( final com.commercetools.api.models.subscription.ChangeSubscriptionResourceTypeId resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier for the type of resource, for example, <code>cart</code>.</p>
     * @return resourceTypeId
     */
    
    
    public com.commercetools.api.models.subscription.ChangeSubscriptionResourceTypeId getResourceTypeId(){
        return this.resourceTypeId;
    }

    /**
     * builds ChangeSubscription with checking for non-null required values
     * @return ChangeSubscription
     */
    public ChangeSubscription build() {
        Objects.requireNonNull(resourceTypeId, ChangeSubscription.class + ": resourceTypeId is missing");
        return new ChangeSubscriptionImpl(resourceTypeId);
    }
    
    /**
     * builds ChangeSubscription without checking for non-null required values
     * @return ChangeSubscription
     */
    public ChangeSubscription buildUnchecked() {
        return new ChangeSubscriptionImpl(resourceTypeId);
    }

    /**
     * factory method for an instance of ChangeSubscriptionBuilder
     * @return builder 
     */
    public static ChangeSubscriptionBuilder of() {
        return new ChangeSubscriptionBuilder();
    }

    /**
     * create builder for ChangeSubscription instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeSubscriptionBuilder of(final ChangeSubscription template) {
        ChangeSubscriptionBuilder builder = new ChangeSubscriptionBuilder();
        builder.resourceTypeId = template.getResourceTypeId();
        return builder;
    }

}
