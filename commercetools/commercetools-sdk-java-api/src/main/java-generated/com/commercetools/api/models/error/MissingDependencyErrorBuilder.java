
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingDependencyErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingDependencyError missingDependencyError = MissingDependencyError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MissingDependencyErrorBuilder implements Builder<MissingDependencyError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"The extensions '[ext-1, ext-2]' referenced in 'dependencies' do not exist."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public MissingDependencyErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public MissingDependencyErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public MissingDependencyErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"The extensions '[ext-1, ext-2]' referenced in 'dependencies' do not exist."</code></p>
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
     * builds MissingDependencyError with checking for non-null required values
     * @return MissingDependencyError
     */
    public MissingDependencyError build() {
        Objects.requireNonNull(message, MissingDependencyError.class + ": message is missing");
        return new MissingDependencyErrorImpl(message, values);
    }

    /**
     * builds MissingDependencyError without checking for non-null required values
     * @return MissingDependencyError
     */
    public MissingDependencyError buildUnchecked() {
        return new MissingDependencyErrorImpl(message, values);
    }

    /**
     * factory method for an instance of MissingDependencyErrorBuilder
     * @return builder
     */
    public static MissingDependencyErrorBuilder of() {
        return new MissingDependencyErrorBuilder();
    }

    /**
     * create builder for MissingDependencyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MissingDependencyErrorBuilder of(final MissingDependencyError template) {
        MissingDependencyErrorBuilder builder = new MissingDependencyErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
