
package com.commercetools.checkout.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LocalizedUrlBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizedUrl localizedUrl = LocalizedUrl.builder()
 *             ./^https?:\/\/[^\s/$.?#].[^\s]*$/("{/^https?:\/\/[^\s/$.?#].[^\s]*$/}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LocalizedUrlBuilder implements Builder<LocalizedUrl> {

    private Map<String, String> values = new HashMap<>();

    /**
     *  <p>URL for the specific <span>locale</span>.</p>
     * @param values properties to be set
     * @return Builder
     */

    public LocalizedUrlBuilder values(final Map<String, String> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>URL for the specific <span>locale</span>.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public LocalizedUrlBuilder addValue(final String key, final String value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>URL for the specific <span>locale</span>.</p>
     * @return pattern properties
     */

    public Map<String, String> getValues() {
        return this.values;
    }

    /**
     * builds LocalizedUrl with checking for non-null required values
     * @return LocalizedUrl
     */
    public LocalizedUrl build() {
        return new LocalizedUrlImpl(values);
    }

    /**
     * builds LocalizedUrl without checking for non-null required values
     * @return LocalizedUrl
     */
    public LocalizedUrl buildUnchecked() {
        return new LocalizedUrlImpl(values);
    }

    /**
     * factory method for an instance of LocalizedUrlBuilder
     * @return builder
     */
    public static LocalizedUrlBuilder of() {
        return new LocalizedUrlBuilder();
    }

    /**
     * create builder for LocalizedUrl instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizedUrlBuilder of(final LocalizedUrl template) {
        LocalizedUrlBuilder builder = new LocalizedUrlBuilder();
        builder.values = template.values();
        return builder;
    }

}
