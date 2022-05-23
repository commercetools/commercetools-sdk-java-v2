
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   TypeChangeFieldDefinitionLabelAction typeChangeFieldDefinitionLabelAction = TypeChangeFieldDefinitionLabelAction.builder()
           .fieldName("{fieldName}")
           .label(labelBuilder -> labelBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeChangeFieldDefinitionLabelActionBuilder implements Builder<TypeChangeFieldDefinitionLabelAction> {

    private String fieldName;

    private com.commercetools.api.models.common.LocalizedString label;

    /**
     *  <p><code>name</code> of the FieldDefinition to update.</p>
     */

    public TypeChangeFieldDefinitionLabelActionBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public TypeChangeFieldDefinitionLabelActionBuilder label(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public TypeChangeFieldDefinitionLabelActionBuilder label(
            final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public TypeChangeFieldDefinitionLabelAction build() {
        Objects.requireNonNull(fieldName, TypeChangeFieldDefinitionLabelAction.class + ": fieldName is missing");
        Objects.requireNonNull(label, TypeChangeFieldDefinitionLabelAction.class + ": label is missing");
        return new TypeChangeFieldDefinitionLabelActionImpl(fieldName, label);
    }

    /**
     * builds TypeChangeFieldDefinitionLabelAction without checking for non null required values
     */
    public TypeChangeFieldDefinitionLabelAction buildUnchecked() {
        return new TypeChangeFieldDefinitionLabelActionImpl(fieldName, label);
    }

    public static TypeChangeFieldDefinitionLabelActionBuilder of() {
        return new TypeChangeFieldDefinitionLabelActionBuilder();
    }

    public static TypeChangeFieldDefinitionLabelActionBuilder of(final TypeChangeFieldDefinitionLabelAction template) {
        TypeChangeFieldDefinitionLabelActionBuilder builder = new TypeChangeFieldDefinitionLabelActionBuilder();
        builder.fieldName = template.getFieldName();
        builder.label = template.getLabel();
        return builder;
    }

}
