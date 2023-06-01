package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldSetType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldSetTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldSetType customFieldSetType = CustomFieldSetType.builder()
 *             .elementType(elementTypeBuilder -> elementTypeBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomFieldSetTypeBuilder implements Builder<CustomFieldSetType> {

    
    
    private com.commercetools.api.models.type.FieldType elementType;

    
    /**
     *  <p>Field type of the elements in the set.</p>
     * @param elementType value to be set
     * @return Builder
     */
    
    public CustomFieldSetTypeBuilder elementType( final com.commercetools.api.models.type.FieldType elementType) {
        this.elementType = elementType;
        return this;
    }
    
    
    /**
     *  <p>Field type of the elements in the set.</p>
     * @param builder function to build the elementType value
     * @return Builder
     */
    
    public CustomFieldSetTypeBuilder elementType(Function<com.commercetools.api.models.type.FieldTypeBuilder, Builder<? extends com.commercetools.api.models.type.FieldType>> builder) {
        this.elementType = builder.apply(com.commercetools.api.models.type.FieldTypeBuilder.of()).build();
        return this;
    }
                    

    /**
     *  <p>Field type of the elements in the set.</p>
     * @return elementType
     */
    
    
    public com.commercetools.api.models.type.FieldType getElementType(){
        return this.elementType;
    }

    /**
     * builds CustomFieldSetType with checking for non-null required values
     * @return CustomFieldSetType
     */
    public CustomFieldSetType build() {
        Objects.requireNonNull(elementType, CustomFieldSetType.class + ": elementType is missing");
        return new CustomFieldSetTypeImpl(elementType);
    }
    
    /**
     * builds CustomFieldSetType without checking for non-null required values
     * @return CustomFieldSetType
     */
    public CustomFieldSetType buildUnchecked() {
        return new CustomFieldSetTypeImpl(elementType);
    }

    /**
     * factory method for an instance of CustomFieldSetTypeBuilder
     * @return builder 
     */
    public static CustomFieldSetTypeBuilder of() {
        return new CustomFieldSetTypeBuilder();
    }

    /**
     * create builder for CustomFieldSetType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldSetTypeBuilder of(final CustomFieldSetType template) {
        CustomFieldSetTypeBuilder builder = new CustomFieldSetTypeBuilder();
        builder.elementType = template.getElementType();
        return builder;
    }

}
