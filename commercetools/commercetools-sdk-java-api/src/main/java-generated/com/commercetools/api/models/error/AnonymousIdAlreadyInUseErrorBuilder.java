
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
     */

    public AnonymousIdAlreadyInUseErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public AnonymousIdAlreadyInUseErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public AnonymousIdAlreadyInUseErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public AnonymousIdAlreadyInUseError build() {
        Objects.requireNonNull(message, AnonymousIdAlreadyInUseError.class + ": message is missing");
        Objects.requireNonNull(values, AnonymousIdAlreadyInUseError.class + ": values are missing");
        return new AnonymousIdAlreadyInUseErrorImpl(message, values);
    }

    /**
     * builds AnonymousIdAlreadyInUseError without checking for non null required values
     */
    public AnonymousIdAlreadyInUseError buildUnchecked() {
        return new AnonymousIdAlreadyInUseErrorImpl(message, values);
    }

    public static AnonymousIdAlreadyInUseErrorBuilder of() {
        return new AnonymousIdAlreadyInUseErrorBuilder();
    }

    public static AnonymousIdAlreadyInUseErrorBuilder of(final AnonymousIdAlreadyInUseError template) {
        AnonymousIdAlreadyInUseErrorBuilder builder = new AnonymousIdAlreadyInUseErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
