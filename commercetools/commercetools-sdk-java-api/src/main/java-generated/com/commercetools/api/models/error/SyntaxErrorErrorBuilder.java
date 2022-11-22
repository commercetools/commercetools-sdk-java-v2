
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SyntaxErrorErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SyntaxErrorError syntaxErrorError = SyntaxErrorError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SyntaxErrorErrorBuilder implements Builder<SyntaxErrorError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"Syntax error while parsing $fieldDefinition."</code></p>
     */

    public SyntaxErrorErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public SyntaxErrorErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public SyntaxErrorErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public SyntaxErrorError build() {
        Objects.requireNonNull(message, SyntaxErrorError.class + ": message is missing");
        Objects.requireNonNull(values, SyntaxErrorError.class + ": values are missing");
        return new SyntaxErrorErrorImpl(message, values);
    }

    /**
     * builds SyntaxErrorError without checking for non null required values
     */
    public SyntaxErrorError buildUnchecked() {
        return new SyntaxErrorErrorImpl(message, values);
    }

    public static SyntaxErrorErrorBuilder of() {
        return new SyntaxErrorErrorBuilder();
    }

    public static SyntaxErrorErrorBuilder of(final SyntaxErrorError template) {
        SyntaxErrorErrorBuilder builder = new SyntaxErrorErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
