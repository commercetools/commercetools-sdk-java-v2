
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * FeatureRemovedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FeatureRemovedError featureRemovedError = FeatureRemovedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FeatureRemovedErrorBuilder implements Builder<FeatureRemovedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *
     */

    public FeatureRemovedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *
     */

    public FeatureRemovedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *
     */

    public FeatureRemovedErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public FeatureRemovedError build() {
        Objects.requireNonNull(message, FeatureRemovedError.class + ": message is missing");
        Objects.requireNonNull(values, FeatureRemovedError.class + ": values are missing");
        return new FeatureRemovedErrorImpl(message, values);
    }

    /**
     * builds FeatureRemovedError without checking for non null required values
     */
    public FeatureRemovedError buildUnchecked() {
        return new FeatureRemovedErrorImpl(message, values);
    }

    public static FeatureRemovedErrorBuilder of() {
        return new FeatureRemovedErrorBuilder();
    }

    public static FeatureRemovedErrorBuilder of(final FeatureRemovedError template) {
        FeatureRemovedErrorBuilder builder = new FeatureRemovedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
