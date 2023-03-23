
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * EnumValuesMustMatchErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EnumValuesMustMatchError enumValuesMustMatchError = EnumValuesMustMatchError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EnumValuesMustMatchErrorBuilder implements Builder<EnumValuesMustMatchError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"The given values must be equal to the existing enum values."</code></p>
     * @param message
     * @return Builder
     */

    public EnumValuesMustMatchErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public EnumValuesMustMatchErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public EnumValuesMustMatchErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public EnumValuesMustMatchError build() {
        Objects.requireNonNull(message, EnumValuesMustMatchError.class + ": message is missing");
        return new EnumValuesMustMatchErrorImpl(message, values);
    }

    /**
     * builds EnumValuesMustMatchError without checking for non null required values
     */
    public EnumValuesMustMatchError buildUnchecked() {
        return new EnumValuesMustMatchErrorImpl(message, values);
    }

    public static EnumValuesMustMatchErrorBuilder of() {
        return new EnumValuesMustMatchErrorBuilder();
    }

    public static EnumValuesMustMatchErrorBuilder of(final EnumValuesMustMatchError template) {
        EnumValuesMustMatchErrorBuilder builder = new EnumValuesMustMatchErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
