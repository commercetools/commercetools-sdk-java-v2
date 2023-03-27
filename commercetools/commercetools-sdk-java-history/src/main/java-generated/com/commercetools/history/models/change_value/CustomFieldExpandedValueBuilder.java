
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
     *  <p>Name of a custom field.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomFieldExpandedValueBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */

    public CustomFieldExpandedValueBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     * set the value to the label using the builder function
     * @param builder function to build the label value
     * @return Builder
     */

    public CustomFieldExpandedValueBuilder label(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the label
     * @param label value to be set
     * @return Builder
     */

    public CustomFieldExpandedValueBuilder label(final com.commercetools.history.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    /**
     *  <p>Name of a custom field.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * value of value}
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * value of label}
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
