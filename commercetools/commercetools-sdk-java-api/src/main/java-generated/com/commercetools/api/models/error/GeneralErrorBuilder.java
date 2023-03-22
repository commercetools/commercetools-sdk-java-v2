
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GeneralErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GeneralError generalError = GeneralError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GeneralErrorBuilder implements Builder<GeneralError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Description about any known details of the problem, for example, <code>"Write operations are temporarily unavailable"</code>.</p>
     * @param message
     * @return Builder
     */

    public GeneralErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public GeneralErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public GeneralErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public GeneralError build() {
        Objects.requireNonNull(message, GeneralError.class + ": message is missing");
        return new GeneralErrorImpl(message, values);
    }

    /**
     * builds GeneralError without checking for non null required values
     */
    public GeneralError buildUnchecked() {
        return new GeneralErrorImpl(message, values);
    }

    public static GeneralErrorBuilder of() {
        return new GeneralErrorBuilder();
    }

    public static GeneralErrorBuilder of(final GeneralError template) {
        GeneralErrorBuilder builder = new GeneralErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
