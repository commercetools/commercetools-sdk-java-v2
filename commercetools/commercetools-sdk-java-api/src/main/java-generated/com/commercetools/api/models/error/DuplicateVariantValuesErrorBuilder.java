
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DuplicateVariantValuesErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicateVariantValuesError duplicateVariantValuesError = DuplicateVariantValuesError.builder()
 *             .message("{message}")
 *             .variantValues(variantValuesBuilder -> variantValuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DuplicateVariantValuesErrorBuilder implements Builder<DuplicateVariantValuesError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.error.VariantValues variantValues;

    /**
     *  <p><code>"A duplicate combination of the variant values (sku, key, images, prices, attributes) exists."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public DuplicateVariantValuesErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public DuplicateVariantValuesErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public DuplicateVariantValuesErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Every Product Variant must have a distinct combination of SKU, prices, and custom Attribute values.</p>
     * @param builder function to build the variantValues value
     * @return Builder
     */

    public DuplicateVariantValuesErrorBuilder variantValues(
            Function<com.commercetools.api.models.error.VariantValuesBuilder, com.commercetools.api.models.error.VariantValuesBuilder> builder) {
        this.variantValues = builder.apply(com.commercetools.api.models.error.VariantValuesBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Every Product Variant must have a distinct combination of SKU, prices, and custom Attribute values.</p>
     * @param variantValues value to be set
     * @return Builder
     */

    public DuplicateVariantValuesErrorBuilder variantValues(
            final com.commercetools.api.models.error.VariantValues variantValues) {
        this.variantValues = variantValues;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public com.commercetools.api.models.error.VariantValues getVariantValues() {
        return this.variantValues;
    }

    /**
     * builds DuplicateVariantValuesError with checking for non-null required values
     * @return DuplicateVariantValuesError
     */
    public DuplicateVariantValuesError build() {
        Objects.requireNonNull(message, DuplicateVariantValuesError.class + ": message is missing");
        Objects.requireNonNull(variantValues, DuplicateVariantValuesError.class + ": variantValues is missing");
        return new DuplicateVariantValuesErrorImpl(message, values, variantValues);
    }

    /**
     * builds DuplicateVariantValuesError without checking for non-null required values
     * @return DuplicateVariantValuesError
     */
    public DuplicateVariantValuesError buildUnchecked() {
        return new DuplicateVariantValuesErrorImpl(message, values, variantValues);
    }

    public static DuplicateVariantValuesErrorBuilder of() {
        return new DuplicateVariantValuesErrorBuilder();
    }

    public static DuplicateVariantValuesErrorBuilder of(final DuplicateVariantValuesError template) {
        DuplicateVariantValuesErrorBuilder builder = new DuplicateVariantValuesErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.variantValues = template.getVariantValues();
        return builder;
    }

}
