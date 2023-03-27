
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * FieldDefinitionOrderValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FieldDefinitionOrderValue fieldDefinitionOrderValue = FieldDefinitionOrderValue.builder()
 *             .name("{name}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FieldDefinitionOrderValueBuilder implements Builder<FieldDefinitionOrderValue> {

    private String name;

    private com.commercetools.history.models.common.LocalizedString label;

    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */

    public FieldDefinitionOrderValueBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     * set the value to the label using the builder function
     * @param builder function to build the label value
     * @return Builder
     */

    public FieldDefinitionOrderValueBuilder label(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the label
     * @param label value to be set
     * @return Builder
     */

    public FieldDefinitionOrderValueBuilder label(final com.commercetools.history.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    /**
     * value of name}
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * value of label}
     * @return label
     */

    public com.commercetools.history.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
     * builds FieldDefinitionOrderValue with checking for non-null required values
     * @return FieldDefinitionOrderValue
     */
    public FieldDefinitionOrderValue build() {
        Objects.requireNonNull(name, FieldDefinitionOrderValue.class + ": name is missing");
        Objects.requireNonNull(label, FieldDefinitionOrderValue.class + ": label is missing");
        return new FieldDefinitionOrderValueImpl(name, label);
    }

    /**
     * builds FieldDefinitionOrderValue without checking for non-null required values
     * @return FieldDefinitionOrderValue
     */
    public FieldDefinitionOrderValue buildUnchecked() {
        return new FieldDefinitionOrderValueImpl(name, label);
    }

    /**
     * factory method for an instance of FieldDefinitionOrderValueBuilder
     * @return builder
     */
    public static FieldDefinitionOrderValueBuilder of() {
        return new FieldDefinitionOrderValueBuilder();
    }

    /**
     * create builder for FieldDefinitionOrderValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FieldDefinitionOrderValueBuilder of(final FieldDefinitionOrderValue template) {
        FieldDefinitionOrderValueBuilder builder = new FieldDefinitionOrderValueBuilder();
        builder.name = template.getName();
        builder.label = template.getLabel();
        return builder;
    }

}
