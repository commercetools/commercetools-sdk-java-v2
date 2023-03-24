
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * EnumKeyAlreadyExistsErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EnumKeyAlreadyExistsError enumKeyAlreadyExistsError = EnumKeyAlreadyExistsError.builder()
 *             .message("{message}")
 *             .conflictingEnumKey("{conflictingEnumKey}")
 *             .conflictingAttributeName("{conflictingAttributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EnumKeyAlreadyExistsErrorBuilder implements Builder<EnumKeyAlreadyExistsError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String conflictingEnumKey;

    private String conflictingAttributeName;

    /**
     *  <p><code>"The $attributeName attribute definition already contains an enum value with the key $enumKey."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public EnumKeyAlreadyExistsErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public EnumKeyAlreadyExistsErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public EnumKeyAlreadyExistsErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Conflicting enum key.</p>
     * @param conflictingEnumKey value to be set
     * @return Builder
     */

    public EnumKeyAlreadyExistsErrorBuilder conflictingEnumKey(final String conflictingEnumKey) {
        this.conflictingEnumKey = conflictingEnumKey;
        return this;
    }

    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @param conflictingAttributeName value to be set
     * @return Builder
     */

    public EnumKeyAlreadyExistsErrorBuilder conflictingAttributeName(final String conflictingAttributeName) {
        this.conflictingAttributeName = conflictingAttributeName;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public String getConflictingEnumKey() {
        return this.conflictingEnumKey;
    }

    public String getConflictingAttributeName() {
        return this.conflictingAttributeName;
    }

    /**
     * builds EnumKeyAlreadyExistsError with checking for non-null required values
     * @return EnumKeyAlreadyExistsError
     */
    public EnumKeyAlreadyExistsError build() {
        Objects.requireNonNull(message, EnumKeyAlreadyExistsError.class + ": message is missing");
        Objects.requireNonNull(conflictingEnumKey, EnumKeyAlreadyExistsError.class + ": conflictingEnumKey is missing");
        Objects.requireNonNull(conflictingAttributeName,
            EnumKeyAlreadyExistsError.class + ": conflictingAttributeName is missing");
        return new EnumKeyAlreadyExistsErrorImpl(message, values, conflictingEnumKey, conflictingAttributeName);
    }

    /**
     * builds EnumKeyAlreadyExistsError without checking for non-null required values
     * @return EnumKeyAlreadyExistsError
     */
    public EnumKeyAlreadyExistsError buildUnchecked() {
        return new EnumKeyAlreadyExistsErrorImpl(message, values, conflictingEnumKey, conflictingAttributeName);
    }

    public static EnumKeyAlreadyExistsErrorBuilder of() {
        return new EnumKeyAlreadyExistsErrorBuilder();
    }

    public static EnumKeyAlreadyExistsErrorBuilder of(final EnumKeyAlreadyExistsError template) {
        EnumKeyAlreadyExistsErrorBuilder builder = new EnumKeyAlreadyExistsErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.conflictingEnumKey = template.getConflictingEnumKey();
        builder.conflictingAttributeName = template.getConflictingAttributeName();
        return builder;
    }

}
