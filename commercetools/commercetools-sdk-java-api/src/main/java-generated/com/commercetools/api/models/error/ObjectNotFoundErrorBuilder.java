
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ObjectNotFoundErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ObjectNotFoundError objectNotFoundError = ObjectNotFoundError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ObjectNotFoundErrorBuilder implements Builder<ObjectNotFoundError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"A $resourceType with identifier $id was unexpectedly not found."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ObjectNotFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public ObjectNotFoundErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ObjectNotFoundErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    /**
     * builds ObjectNotFoundError with checking for non-null required values
     * @return ObjectNotFoundError
     */
    public ObjectNotFoundError build() {
        Objects.requireNonNull(message, ObjectNotFoundError.class + ": message is missing");
        return new ObjectNotFoundErrorImpl(message, values);
    }

    /**
     * builds ObjectNotFoundError without checking for non-null required values
     * @return ObjectNotFoundError
     */
    public ObjectNotFoundError buildUnchecked() {
        return new ObjectNotFoundErrorImpl(message, values);
    }

    public static ObjectNotFoundErrorBuilder of() {
        return new ObjectNotFoundErrorBuilder();
    }

    public static ObjectNotFoundErrorBuilder of(final ObjectNotFoundError template) {
        ObjectNotFoundErrorBuilder builder = new ObjectNotFoundErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
