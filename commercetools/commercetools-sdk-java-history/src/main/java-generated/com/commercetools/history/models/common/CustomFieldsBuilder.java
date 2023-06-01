package com.commercetools.history.models.common;

import com.commercetools.history.models.common.Reference;
import java.lang.Object;
import com.commercetools.history.models.common.CustomFields;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFields customFields = CustomFields.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .fields(fieldsBuilder -> fieldsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomFieldsBuilder implements Builder<CustomFields> {

    
    
    private com.commercetools.history.models.common.Reference type;
    
    
    
    private java.lang.Object fields;

    
    /**
     * set the value to the type using the builder function
     * @param builder function to build the type value
     * @return Builder
     */
    
    public CustomFieldsBuilder type(Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.type = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the type using the builder function
     * @param builder function to build the type value
     * @return Builder
     */
    
    public CustomFieldsBuilder withType(Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.type = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the type
     * @param type value to be set
     * @return Builder
     */
    
    public CustomFieldsBuilder type( final com.commercetools.history.models.common.Reference type) {
        this.type = type;
        return this;
    }
    
    
    
    
    /**
     *  <p>A valid JSON object, based on FieldDefinition.</p>
     * @param fields value to be set
     * @return Builder
     */
    
    public CustomFieldsBuilder fields( final java.lang.Object fields) {
        this.fields = fields;
        return this;
    }
    
    

    /**
     * value of type}
     * @return type
     */
    
    
    public com.commercetools.history.models.common.Reference getType(){
        return this.type;
    }
    
    /**
     *  <p>A valid JSON object, based on FieldDefinition.</p>
     * @return fields
     */
    
    
    public java.lang.Object getFields(){
        return this.fields;
    }

    /**
     * builds CustomFields with checking for non-null required values
     * @return CustomFields
     */
    public CustomFields build() {
        Objects.requireNonNull(type, CustomFields.class + ": type is missing");
        Objects.requireNonNull(fields, CustomFields.class + ": fields is missing");
        return new CustomFieldsImpl(type, fields);
    }
    
    /**
     * builds CustomFields without checking for non-null required values
     * @return CustomFields
     */
    public CustomFields buildUnchecked() {
        return new CustomFieldsImpl(type, fields);
    }

    /**
     * factory method for an instance of CustomFieldsBuilder
     * @return builder 
     */
    public static CustomFieldsBuilder of() {
        return new CustomFieldsBuilder();
    }

    /**
     * create builder for CustomFields instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldsBuilder of(final CustomFields template) {
        CustomFieldsBuilder builder = new CustomFieldsBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
