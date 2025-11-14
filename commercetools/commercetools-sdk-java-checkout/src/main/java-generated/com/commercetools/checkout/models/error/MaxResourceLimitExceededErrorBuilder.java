
package com.commercetools.checkout.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MaxResourceLimitExceededErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MaxResourceLimitExceededError maxResourceLimitExceededError = MaxResourceLimitExceededError.builder()
 *             .message("{message}")
 *             .limit(0.3)
 *             .resourceTypeId("{resourceTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MaxResourceLimitExceededErrorBuilder implements Builder<MaxResourceLimitExceededError> {

    private String message;

    private Double limit;

    private String resourceTypeId;

    /**
     *  <p><code>"You have exceeded the limit of $limit resources of type $resourceTypeId."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public MaxResourceLimitExceededErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>The limit that was exceeded.</p>
     * @param limit value to be set
     * @return Builder
     */

    public MaxResourceLimitExceededErrorBuilder limit(final Double limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>The resource type that reached its limit.</p>
     * @param resourceTypeId value to be set
     * @return Builder
     */

    public MaxResourceLimitExceededErrorBuilder resourceTypeId(final String resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
        return this;
    }

    /**
     *  <p><code>"You have exceeded the limit of $limit resources of type $resourceTypeId."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>The limit that was exceeded.</p>
     * @return limit
     */

    public Double getLimit() {
        return this.limit;
    }

    /**
     *  <p>The resource type that reached its limit.</p>
     * @return resourceTypeId
     */

    public String getResourceTypeId() {
        return this.resourceTypeId;
    }

    /**
     * builds MaxResourceLimitExceededError with checking for non-null required values
     * @return MaxResourceLimitExceededError
     */
    public MaxResourceLimitExceededError build() {
        Objects.requireNonNull(message, MaxResourceLimitExceededError.class + ": message is missing");
        Objects.requireNonNull(limit, MaxResourceLimitExceededError.class + ": limit is missing");
        Objects.requireNonNull(resourceTypeId, MaxResourceLimitExceededError.class + ": resourceTypeId is missing");
        return new MaxResourceLimitExceededErrorImpl(message, limit, resourceTypeId);
    }

    /**
     * builds MaxResourceLimitExceededError without checking for non-null required values
     * @return MaxResourceLimitExceededError
     */
    public MaxResourceLimitExceededError buildUnchecked() {
        return new MaxResourceLimitExceededErrorImpl(message, limit, resourceTypeId);
    }

    /**
     * factory method for an instance of MaxResourceLimitExceededErrorBuilder
     * @return builder
     */
    public static MaxResourceLimitExceededErrorBuilder of() {
        return new MaxResourceLimitExceededErrorBuilder();
    }

    /**
     * create builder for MaxResourceLimitExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MaxResourceLimitExceededErrorBuilder of(final MaxResourceLimitExceededError template) {
        MaxResourceLimitExceededErrorBuilder builder = new MaxResourceLimitExceededErrorBuilder();
        builder.message = template.getMessage();
        builder.limit = template.getLimit();
        builder.resourceTypeId = template.getResourceTypeId();
        return builder;
    }

}
