
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceSizeLimitExceededErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceSizeLimitExceededError resourceSizeLimitExceededError = ResourceSizeLimitExceededError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResourceSizeLimitExceededErrorBuilder implements Builder<ResourceSizeLimitExceededError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"The resource size exceeds the maximal allowed size of 16 MB."</code></p>
     */

    public ResourceSizeLimitExceededErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public ResourceSizeLimitExceededErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public ResourceSizeLimitExceededErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public ResourceSizeLimitExceededError build() {
        Objects.requireNonNull(message, ResourceSizeLimitExceededError.class + ": message is missing");
        return new ResourceSizeLimitExceededErrorImpl(message, values);
    }

    /**
     * builds ResourceSizeLimitExceededError without checking for non null required values
     */
    public ResourceSizeLimitExceededError buildUnchecked() {
        return new ResourceSizeLimitExceededErrorImpl(message, values);
    }

    public static ResourceSizeLimitExceededErrorBuilder of() {
        return new ResourceSizeLimitExceededErrorBuilder();
    }

    public static ResourceSizeLimitExceededErrorBuilder of(final ResourceSizeLimitExceededError template) {
        ResourceSizeLimitExceededErrorBuilder builder = new ResourceSizeLimitExceededErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
