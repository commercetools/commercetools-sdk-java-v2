
package com.commercetools.api.models.error;

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
 *             .exceededResource(ReferenceTypeId.ATTRIBUTE_GROUP)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MaxResourceLimitExceededErrorBuilder implements Builder<MaxResourceLimitExceededError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.common.ReferenceTypeId exceededResource;

    /**
     *  <p><code>"You have exceeded the limit of $limit resources of type $resourceTypeId."</code></p>
     * @param message
     * @return Builder
     */

    public MaxResourceLimitExceededErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public MaxResourceLimitExceededErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public MaxResourceLimitExceededErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Resource type that reached its maximum limit of configured elements (for example, 100 Zones per Project).</p>
     * @param exceededResource
     * @return Builder
     */

    public MaxResourceLimitExceededErrorBuilder exceededResource(
            final com.commercetools.api.models.common.ReferenceTypeId exceededResource) {
        this.exceededResource = exceededResource;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public com.commercetools.api.models.common.ReferenceTypeId getExceededResource() {
        return this.exceededResource;
    }

    public MaxResourceLimitExceededError build() {
        Objects.requireNonNull(message, MaxResourceLimitExceededError.class + ": message is missing");
        Objects.requireNonNull(exceededResource, MaxResourceLimitExceededError.class + ": exceededResource is missing");
        return new MaxResourceLimitExceededErrorImpl(message, values, exceededResource);
    }

    /**
     * builds MaxResourceLimitExceededError without checking for non null required values
     */
    public MaxResourceLimitExceededError buildUnchecked() {
        return new MaxResourceLimitExceededErrorImpl(message, values, exceededResource);
    }

    public static MaxResourceLimitExceededErrorBuilder of() {
        return new MaxResourceLimitExceededErrorBuilder();
    }

    public static MaxResourceLimitExceededErrorBuilder of(final MaxResourceLimitExceededError template) {
        MaxResourceLimitExceededErrorBuilder builder = new MaxResourceLimitExceededErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.exceededResource = template.getExceededResource();
        return builder;
    }

}
