
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldExpandedValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldExpandedValue customFieldExpandedValue = CustomFieldExpandedValue.builder()
 *             .name("{name}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldExpandedValueBuilder implements Builder<CustomFieldExpandedValue> {

    private String name;

    private java.lang.Object value;

    private com.commercetools.history.models.common.LocalizedString label;

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomFieldExpandedValueBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType.</p>
     * @param value value to be set
     * @return Builder
     */

    public CustomFieldExpandedValueBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>User-defined label of the Custom Field.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public CustomFieldExpandedValueBuilder label(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined label of the Custom Field.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public CustomFieldExpandedValueBuilder withLabel(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>User-defined label of the Custom Field.</p>
     * @param label value to be set
     * @return Builder
     */

    public CustomFieldExpandedValueBuilder label(final com.commercetools.history.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p>User-defined label of the Custom Field.</p>
     * @return label
     */

    public com.commercetools.history.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
     * builds CustomFieldExpandedValue with checking for non-null required values
     * @return CustomFieldExpandedValue
     */
    public CustomFieldExpandedValue build() {
        Objects.requireNonNull(name, CustomFieldExpandedValue.class + ": name is missing");
        Objects.requireNonNull(value, CustomFieldExpandedValue.class + ": value is missing");
        Objects.requireNonNull(label, CustomFieldExpandedValue.class + ": label is missing");
        return new CustomFieldExpandedValueImpl(name, value, label);
    }

    /**
     * builds CustomFieldExpandedValue without checking for non-null required values
     * @return CustomFieldExpandedValue
     */
    public CustomFieldExpandedValue buildUnchecked() {
        return new CustomFieldExpandedValueImpl(name, value, label);
    }

    /**
     * factory method for an instance of CustomFieldExpandedValueBuilder
     * @return builder
     */
    public static CustomFieldExpandedValueBuilder of() {
        return new CustomFieldExpandedValueBuilder();
    }

    /**
     * create builder for CustomFieldExpandedValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldExpandedValueBuilder of(final CustomFieldExpandedValue template) {
        CustomFieldExpandedValueBuilder builder = new CustomFieldExpandedValueBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.label = template.getLabel();
        return builder;
    }

}
