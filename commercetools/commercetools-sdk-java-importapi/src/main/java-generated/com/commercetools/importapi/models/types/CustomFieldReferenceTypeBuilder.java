package com.commercetools.importapi.models.types;

import com.commercetools.importapi.models.types.CustomFieldReferenceValue;
import com.commercetools.importapi.models.types.FieldType;
import com.commercetools.importapi.models.types.CustomFieldReferenceType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldReferenceTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldReferenceType customFieldReferenceType = CustomFieldReferenceType.builder()
 *             .referenceTypeId(CustomFieldReferenceValue.CART)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomFieldReferenceTypeBuilder implements Builder<CustomFieldReferenceType> {

    
    
    private com.commercetools.importapi.models.types.CustomFieldReferenceValue referenceTypeId;

    
    /**
     *  <p>Resource type the Custom Field can reference.</p>
     * @param referenceTypeId value to be set
     * @return Builder
     */
    
    public CustomFieldReferenceTypeBuilder referenceTypeId( final com.commercetools.importapi.models.types.CustomFieldReferenceValue referenceTypeId) {
        this.referenceTypeId = referenceTypeId;
        return this;
    }
    
    

    /**
     *  <p>Resource type the Custom Field can reference.</p>
     * @return referenceTypeId
     */
    
    
    public com.commercetools.importapi.models.types.CustomFieldReferenceValue getReferenceTypeId(){
        return this.referenceTypeId;
    }

    /**
     * builds CustomFieldReferenceType with checking for non-null required values
     * @return CustomFieldReferenceType
     */
    public CustomFieldReferenceType build() {
        Objects.requireNonNull(referenceTypeId, CustomFieldReferenceType.class + ": referenceTypeId is missing");
        return new CustomFieldReferenceTypeImpl(referenceTypeId);
    }
    
    /**
     * builds CustomFieldReferenceType without checking for non-null required values
     * @return CustomFieldReferenceType
     */
    public CustomFieldReferenceType buildUnchecked() {
        return new CustomFieldReferenceTypeImpl(referenceTypeId);
    }

    /**
     * factory method for an instance of CustomFieldReferenceTypeBuilder
     * @return builder 
     */
    public static CustomFieldReferenceTypeBuilder of() {
        return new CustomFieldReferenceTypeBuilder();
    }

    /**
     * create builder for CustomFieldReferenceType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldReferenceTypeBuilder of(final CustomFieldReferenceType template) {
        CustomFieldReferenceTypeBuilder builder = new CustomFieldReferenceTypeBuilder();
        builder.referenceTypeId = template.getReferenceTypeId();
        return builder;
    }

}
