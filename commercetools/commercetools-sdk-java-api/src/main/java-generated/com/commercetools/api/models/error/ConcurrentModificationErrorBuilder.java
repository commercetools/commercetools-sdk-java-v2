
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ConcurrentModificationErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ConcurrentModificationError concurrentModificationError = ConcurrentModificationError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ConcurrentModificationErrorBuilder implements Builder<ConcurrentModificationError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    @Nullable
    private Long currentVersion;

    /**
     *  <p><code>"Object $resourceId has a different version than expected. Expected: $expectedVersion - Actual: $currentVersion."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ConcurrentModificationErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public ConcurrentModificationErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ConcurrentModificationErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Current version of the resource.</p>
     * @param currentVersion value to be set
     * @return Builder
     */

    public ConcurrentModificationErrorBuilder currentVersion(@Nullable final Long currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /**
     *  <p><code>"Object $resourceId has a different version than expected. Expected: $expectedVersion - Actual: $currentVersion."</code></p>
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
     *  <p>Current version of the resource.</p>
     * @return currentVersion
     */

    @Nullable
    public Long getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * builds ConcurrentModificationError with checking for non-null required values
     * @return ConcurrentModificationError
     */
    public ConcurrentModificationError build() {
        Objects.requireNonNull(message, ConcurrentModificationError.class + ": message is missing");
        return new ConcurrentModificationErrorImpl(message, values, currentVersion);
    }

    /**
     * builds ConcurrentModificationError without checking for non-null required values
     * @return ConcurrentModificationError
     */
    public ConcurrentModificationError buildUnchecked() {
        return new ConcurrentModificationErrorImpl(message, values, currentVersion);
    }

    /**
     * factory method for an instance of ConcurrentModificationErrorBuilder
     * @return builder
     */
    public static ConcurrentModificationErrorBuilder of() {
        return new ConcurrentModificationErrorBuilder();
    }

    /**
     * create builder for ConcurrentModificationError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ConcurrentModificationErrorBuilder of(final ConcurrentModificationError template) {
        ConcurrentModificationErrorBuilder builder = new ConcurrentModificationErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.currentVersion = template.getCurrentVersion();
        return builder;
    }

}
