package com.commercetools.api.models.type;

import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeRemoveFieldDefinitionAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeRemoveFieldDefinitionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeRemoveFieldDefinitionAction typeRemoveFieldDefinitionAction = TypeRemoveFieldDefinitionAction.builder()
 *             .fieldName("{fieldName}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TypeRemoveFieldDefinitionActionBuilder implements Builder<TypeRemoveFieldDefinitionAction> {

    
    
    private String fieldName;

    
    /**
     *  <p><code>name</code> of the FieldDefinition to remove. The removal of a FieldDefinition deletes asynchronously all Custom Fields using the FieldDefinition as well.</p>
     * @param fieldName value to be set
     * @return Builder
     */
    
    public TypeRemoveFieldDefinitionActionBuilder fieldName( final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    
    

    /**
     *  <p><code>name</code> of the FieldDefinition to remove. The removal of a FieldDefinition deletes asynchronously all Custom Fields using the FieldDefinition as well.</p>
     * @return fieldName
     */
    
    
    public String getFieldName(){
        return this.fieldName;
    }

    /**
     * builds TypeRemoveFieldDefinitionAction with checking for non-null required values
     * @return TypeRemoveFieldDefinitionAction
     */
    public TypeRemoveFieldDefinitionAction build() {
        Objects.requireNonNull(fieldName, TypeRemoveFieldDefinitionAction.class + ": fieldName is missing");
        return new TypeRemoveFieldDefinitionActionImpl(fieldName);
    }
    
    /**
     * builds TypeRemoveFieldDefinitionAction without checking for non-null required values
     * @return TypeRemoveFieldDefinitionAction
     */
    public TypeRemoveFieldDefinitionAction buildUnchecked() {
        return new TypeRemoveFieldDefinitionActionImpl(fieldName);
    }

    /**
     * factory method for an instance of TypeRemoveFieldDefinitionActionBuilder
     * @return builder 
     */
    public static TypeRemoveFieldDefinitionActionBuilder of() {
        return new TypeRemoveFieldDefinitionActionBuilder();
    }

    /**
     * create builder for TypeRemoveFieldDefinitionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeRemoveFieldDefinitionActionBuilder of(final TypeRemoveFieldDefinitionAction template) {
        TypeRemoveFieldDefinitionActionBuilder builder = new TypeRemoveFieldDefinitionActionBuilder();
        builder.fieldName = template.getFieldName();
        return builder;
    }

}
