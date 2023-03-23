
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
     * @param message
     * @return Builder
     */

    public ObjectNotFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public ObjectNotFoundErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
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

    public ObjectNotFoundError build() {
        Objects.requireNonNull(message, ObjectNotFoundError.class + ": message is missing");
        return new ObjectNotFoundErrorImpl(message, values);
    }

    /**
     * builds ObjectNotFoundError without checking for non null required values
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
