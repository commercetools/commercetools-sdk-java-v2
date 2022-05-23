
package com.commercetools.importapi.models.common;

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
     <>
     */

    public LocalizedStringBuilder values(final Map<String, String> values) {
        this.values = values;
        return this;
    }

    /**
     <>
     */

    public LocalizedStringBuilder addValue(final String key, final String value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, String> getValues() {
        return this.values;
    }

    public LocalizedString build() {
        Objects.requireNonNull(values, LocalizedString.class + ": values are missing");
        return new LocalizedStringImpl(values);
    }

    /**
     * builds LocalizedString without checking for non null required values
     */
    public LocalizedString buildUnchecked() {
        return new LocalizedStringImpl(values);
    }

    public static LocalizedStringBuilder of() {
        return new LocalizedStringBuilder();
    }

    public static LocalizedStringBuilder of(final LocalizedString template) {
        LocalizedStringBuilder builder = new LocalizedStringBuilder();
        builder.values = template.values();
        return builder;
    }

}
