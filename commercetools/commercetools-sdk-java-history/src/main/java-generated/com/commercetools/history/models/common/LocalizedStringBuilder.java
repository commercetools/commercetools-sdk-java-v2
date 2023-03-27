
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LocalizedStringBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizedString localizedString = LocalizedString.builder()
 *             ./^[a-z]{2}(-[A-Z]{2})?$/("{/^[a-z]{2}(-[A-Z]{2})?$/}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LocalizedStringBuilder implements Builder<LocalizedString> {

    private Map<String, String> values = new HashMap<>();

    /**
     * assign pattern properties to the builder
     * @param values properties to be set
     * @return Builder
     */

    public LocalizedStringBuilder values(final Map<String, String> values) {
        this.values = values;
        return this;
    }

    /**
     * assign a pattern property to the builder
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public LocalizedStringBuilder addValue(final String key, final String value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     * values of pattern properties
     * @return pattern properties
     */

    public Map<String, String> getValues() {
        return this.values;
    }

    /**
     * builds LocalizedString with checking for non-null required values
     * @return LocalizedString
     */
    public LocalizedString build() {
        return new LocalizedStringImpl(values);
    }

    /**
     * builds LocalizedString without checking for non-null required values
     * @return LocalizedString
     */
    public LocalizedString buildUnchecked() {
        return new LocalizedStringImpl(values);
    }

    /**
     * factory method for an instance of LocalizedStringBuilder
     * @return builder
     */
    public static LocalizedStringBuilder of() {
        return new LocalizedStringBuilder();
    }

    /**
     * create builder for LocalizedString instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizedStringBuilder of(final LocalizedString template) {
        LocalizedStringBuilder builder = new LocalizedStringBuilder();
        builder.values = template.values();
        return builder;
    }

}
