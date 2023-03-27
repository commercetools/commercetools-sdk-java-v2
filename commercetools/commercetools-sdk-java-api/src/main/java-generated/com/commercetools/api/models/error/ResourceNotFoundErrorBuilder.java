
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceNotFoundErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceNotFoundError resourceNotFoundError = ResourceNotFoundError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResourceNotFoundErrorBuilder implements Builder<ResourceNotFoundError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"The Resource with ID $resourceId was not found."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ResourceNotFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public ResourceNotFoundErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ResourceNotFoundErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"The Resource with ID $resourceId was not found."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     * builds ResourceNotFoundError with checking for non-null required values
     * @return ResourceNotFoundError
     */
    public ResourceNotFoundError build() {
        Objects.requireNonNull(message, ResourceNotFoundError.class + ": message is missing");
        return new ResourceNotFoundErrorImpl(message, values);
    }

    /**
     * builds ResourceNotFoundError without checking for non-null required values
     * @return ResourceNotFoundError
     */
    public ResourceNotFoundError buildUnchecked() {
        return new ResourceNotFoundErrorImpl(message, values);
    }

    /**
     * factory method for an instance of ResourceNotFoundErrorBuilder
     * @return builder
     */
    public static ResourceNotFoundErrorBuilder of() {
        return new ResourceNotFoundErrorBuilder();
    }

    /**
     * create builder for ResourceNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ResourceNotFoundErrorBuilder of(final ResourceNotFoundError template) {
        ResourceNotFoundErrorBuilder builder = new ResourceNotFoundErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
