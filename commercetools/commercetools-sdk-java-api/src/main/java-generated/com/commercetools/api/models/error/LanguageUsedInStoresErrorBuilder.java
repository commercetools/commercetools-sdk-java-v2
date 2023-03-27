
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LanguageUsedInStoresErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LanguageUsedInStoresError languageUsedInStoresError = LanguageUsedInStoresError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LanguageUsedInStoresErrorBuilder implements Builder<LanguageUsedInStoresError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"Language(s) in use by a store cannot be deleted. Remove them in all the stores of this project first."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public LanguageUsedInStoresErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public LanguageUsedInStoresErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public LanguageUsedInStoresErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"Language(s) in use by a store cannot be deleted. Remove them in all the stores of this project first."</code></p>
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
     * builds LanguageUsedInStoresError with checking for non-null required values
     * @return LanguageUsedInStoresError
     */
    public LanguageUsedInStoresError build() {
        Objects.requireNonNull(message, LanguageUsedInStoresError.class + ": message is missing");
        return new LanguageUsedInStoresErrorImpl(message, values);
    }

    /**
     * builds LanguageUsedInStoresError without checking for non-null required values
     * @return LanguageUsedInStoresError
     */
    public LanguageUsedInStoresError buildUnchecked() {
        return new LanguageUsedInStoresErrorImpl(message, values);
    }

    /**
     * factory method for an instance of LanguageUsedInStoresErrorBuilder
     * @return builder
     */
    public static LanguageUsedInStoresErrorBuilder of() {
        return new LanguageUsedInStoresErrorBuilder();
    }

    /**
     * create builder for LanguageUsedInStoresError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LanguageUsedInStoresErrorBuilder of(final LanguageUsedInStoresError template) {
        LanguageUsedInStoresErrorBuilder builder = new LanguageUsedInStoresErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
