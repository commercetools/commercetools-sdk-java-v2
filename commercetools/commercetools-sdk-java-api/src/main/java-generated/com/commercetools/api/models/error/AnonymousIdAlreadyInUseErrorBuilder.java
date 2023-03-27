
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AnonymousIdAlreadyInUseErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AnonymousIdAlreadyInUseError anonymousIdAlreadyInUseError = AnonymousIdAlreadyInUseError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AnonymousIdAlreadyInUseErrorBuilder implements Builder<AnonymousIdAlreadyInUseError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"The given anonymous ID is already in use."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public AnonymousIdAlreadyInUseErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AnonymousIdAlreadyInUseErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AnonymousIdAlreadyInUseErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"The given anonymous ID is already in use."</code></p>
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
     * builds AnonymousIdAlreadyInUseError with checking for non-null required values
     * @return AnonymousIdAlreadyInUseError
     */
    public AnonymousIdAlreadyInUseError build() {
        Objects.requireNonNull(message, AnonymousIdAlreadyInUseError.class + ": message is missing");
        return new AnonymousIdAlreadyInUseErrorImpl(message, values);
    }

    /**
     * builds AnonymousIdAlreadyInUseError without checking for non-null required values
     * @return AnonymousIdAlreadyInUseError
     */
    public AnonymousIdAlreadyInUseError buildUnchecked() {
        return new AnonymousIdAlreadyInUseErrorImpl(message, values);
    }

    /**
     * factory method for an instance of AnonymousIdAlreadyInUseErrorBuilder
     * @return builder
     */
    public static AnonymousIdAlreadyInUseErrorBuilder of() {
        return new AnonymousIdAlreadyInUseErrorBuilder();
    }

    /**
     * create builder for AnonymousIdAlreadyInUseError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AnonymousIdAlreadyInUseErrorBuilder of(final AnonymousIdAlreadyInUseError template) {
        AnonymousIdAlreadyInUseErrorBuilder builder = new AnonymousIdAlreadyInUseErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
