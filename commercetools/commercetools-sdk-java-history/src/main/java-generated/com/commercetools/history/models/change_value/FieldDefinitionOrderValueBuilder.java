
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
     *
     */

    public FieldDefinitionOrderValueBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *
     */

    public FieldDefinitionOrderValueBuilder label(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public FieldDefinitionOrderValueBuilder label(final com.commercetools.history.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public com.commercetools.history.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public FieldDefinitionOrderValue build() {
        Objects.requireNonNull(name, FieldDefinitionOrderValue.class + ": name is missing");
        Objects.requireNonNull(label, FieldDefinitionOrderValue.class + ": label is missing");
        return new FieldDefinitionOrderValueImpl(name, label);
    }

    /**
     * builds FieldDefinitionOrderValue without checking for non null required values
     */
    public FieldDefinitionOrderValue buildUnchecked() {
        return new FieldDefinitionOrderValueImpl(name, label);
    }

    public static FieldDefinitionOrderValueBuilder of() {
        return new FieldDefinitionOrderValueBuilder();
    }

    public static FieldDefinitionOrderValueBuilder of(final FieldDefinitionOrderValue template) {
        FieldDefinitionOrderValueBuilder builder = new FieldDefinitionOrderValueBuilder();
        builder.name = template.getName();
        builder.label = template.getLabel();
        return builder;
    }

}
