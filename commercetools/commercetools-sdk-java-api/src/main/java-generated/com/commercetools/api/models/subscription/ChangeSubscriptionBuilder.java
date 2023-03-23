
package com.commercetools.api.models.subscription;

import java.util.*;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeSubscriptionBuilder implements Builder<ChangeSubscription> {

    private com.commercetools.api.models.subscription.ChangeSubscriptionResourceTypeId resourceTypeId;

    /**
     *  <p>Unique identifier for the type of resource, for example, <code>cart</code>.</p>
     * @param resourceTypeId
     * @return Builder
     */

    public ChangeSubscriptionBuilder resourceTypeId(
            final com.commercetools.api.models.subscription.ChangeSubscriptionResourceTypeId resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
        return this;
    }

    public com.commercetools.api.models.subscription.ChangeSubscriptionResourceTypeId getResourceTypeId() {
        return this.resourceTypeId;
    }

    public ChangeSubscription build() {
        Objects.requireNonNull(resourceTypeId, ChangeSubscription.class + ": resourceTypeId is missing");
        return new ChangeSubscriptionImpl(resourceTypeId);
    }

    /**
     * builds ChangeSubscription without checking for non null required values
     */
    public ChangeSubscription buildUnchecked() {
        return new ChangeSubscriptionImpl(resourceTypeId);
    }

    public static ChangeSubscriptionBuilder of() {
        return new ChangeSubscriptionBuilder();
    }

    public static ChangeSubscriptionBuilder of(final ChangeSubscription template) {
        ChangeSubscriptionBuilder builder = new ChangeSubscriptionBuilder();
        builder.resourceTypeId = template.getResourceTypeId();
        return builder;
    }

}
