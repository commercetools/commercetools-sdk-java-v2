package com.commercetools.history.models.common;

import com.commercetools.history.models.common.FieldType;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.TextInputHint;
import com.commercetools.history.models.common.FieldDefinition;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * FieldDefinitionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FieldDefinition fieldDefinition = FieldDefinition.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .name("{name}")
 *             .label(labelBuilder -> labelBuilder)
 *             .inputHint(TextInputHint.SINGLE_LINE)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class FieldDefinitionBuilder implements Builder<FieldDefinition> {

    
    
    private com.commercetools.history.models.common.FieldType type;
    
    
    
    private String name;
    
    
    
    private com.commercetools.history.models.common.LocalizedString label;
    
    
    
    private com.commercetools.history.models.common.TextInputHint inputHint;

    
    /**
     * set the value to the type using the builder function
     * @param builder function to build the type value
     * @return Builder
     */
    
    public FieldDefinitionBuilder type(Function<com.commercetools.history.models.common.FieldTypeBuilder, com.commercetools.history.models.common.FieldTypeBuilder> builder) {
        this.type = builder.apply(com.commercetools.history.models.common.FieldTypeBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the type using the builder function
     * @param builder function to build the type value
     * @return Builder
     */
    
    public FieldDefinitionBuilder withType(Function<com.commercetools.history.models.common.FieldTypeBuilder, com.commercetools.history.models.common.FieldType> builder) {
        this.type = builder.apply(com.commercetools.history.models.common.FieldTypeBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the type
     * @param type value to be set
     * @return Builder
     */
    
    public FieldDefinitionBuilder type( final com.commercetools.history.models.common.FieldType type) {
        this.type = type;
        return this;
    }
    
    
    
    
    /**
     *  <p>The name of the field. The name must be between two and 36 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>). The name must be unique for a given resource type ID. In case there is a field with the same name in another type it has to have the same FieldType also.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public FieldDefinitionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     * set the value to the label using the builder function
     * @param builder function to build the label value
     * @return Builder
     */
    
    public FieldDefinitionBuilder label(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the label using the builder function
     * @param builder function to build the label value
     * @return Builder
     */
    
    public FieldDefinitionBuilder withLabel(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the label
     * @param label value to be set
     * @return Builder
     */
    
    public FieldDefinitionBuilder label( final com.commercetools.history.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }
    
    
    
    
    /**
     * set the value to the inputHint
     * @param inputHint value to be set
     * @return Builder
     */
    
    public FieldDefinitionBuilder inputHint( final com.commercetools.history.models.common.TextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }
    
    

    /**
     * value of type}
     * @return type
     */
    
    
    public com.commercetools.history.models.common.FieldType getType(){
        return this.type;
    }
    
    /**
     *  <p>The name of the field. The name must be between two and 36 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>). The name must be unique for a given resource type ID. In case there is a field with the same name in another type it has to have the same FieldType also.</p>
     * @return name
     */
    
    
    public String getName(){
        return this.name;
    }
    
    /**
     * value of label}
     * @return label
     */
    
    
    public com.commercetools.history.models.common.LocalizedString getLabel(){
        return this.label;
    }
    
    /**
     * value of inputHint}
     * @return inputHint
     */
    
    
    public com.commercetools.history.models.common.TextInputHint getInputHint(){
        return this.inputHint;
    }

    /**
     * builds FieldDefinition with checking for non-null required values
     * @return FieldDefinition
     */
    public FieldDefinition build() {
        Objects.requireNonNull(type, FieldDefinition.class + ": type is missing");
        Objects.requireNonNull(name, FieldDefinition.class + ": name is missing");
        Objects.requireNonNull(label, FieldDefinition.class + ": label is missing");
        Objects.requireNonNull(inputHint, FieldDefinition.class + ": inputHint is missing");
        return new FieldDefinitionImpl(type, name, label, inputHint);
    }
    
    /**
     * builds FieldDefinition without checking for non-null required values
     * @return FieldDefinition
     */
    public FieldDefinition buildUnchecked() {
        return new FieldDefinitionImpl(type, name, label, inputHint);
    }

    /**
     * factory method for an instance of FieldDefinitionBuilder
     * @return builder 
     */
    public static FieldDefinitionBuilder of() {
        return new FieldDefinitionBuilder();
    }

    /**
     * create builder for FieldDefinition instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FieldDefinitionBuilder of(final FieldDefinition template) {
        FieldDefinitionBuilder builder = new FieldDefinitionBuilder();
        builder.type = template.getType();
        builder.name = template.getName();
        builder.label = template.getLabel();
        builder.inputHint = template.getInputHint();
        return builder;
    }

}
