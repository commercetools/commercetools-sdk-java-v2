package com.commercetools.api.models.type;

import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeChangeFieldDefinitionOrderAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeChangeFieldDefinitionOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeChangeFieldDefinitionOrderAction typeChangeFieldDefinitionOrderAction = TypeChangeFieldDefinitionOrderAction.builder()
 *             .plusFieldNames(fieldNamesBuilder -> fieldNamesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TypeChangeFieldDefinitionOrderActionBuilder implements Builder<TypeChangeFieldDefinitionOrderAction> {

    
    
    private java.util.List<String> fieldNames;

    /**
     *  <p>Must match the set of <code>name</code>s of FieldDefinitions (up to order).</p>
     * @param fieldNames value to be set
     * @return Builder
     */
    
    public TypeChangeFieldDefinitionOrderActionBuilder fieldNames( final String ...fieldNames) {
        this.fieldNames = new ArrayList<>(Arrays.asList(fieldNames));
        return this;
    }
    
    /**
     *  <p>Must match the set of <code>name</code>s of FieldDefinitions (up to order).</p>
     * @param fieldNames value to be set
     * @return Builder
     */
    
    public TypeChangeFieldDefinitionOrderActionBuilder fieldNames( final java.util.List<String> fieldNames) {
        this.fieldNames = fieldNames;
        return this;
    }
    
    /**
     *  <p>Must match the set of <code>name</code>s of FieldDefinitions (up to order).</p>
     * @param fieldNames value to be set
     * @return Builder
     */
    
    public TypeChangeFieldDefinitionOrderActionBuilder plusFieldNames( final String ...fieldNames) {
        if (this.fieldNames == null) {
            this.fieldNames = new ArrayList<>();
        }
        this.fieldNames.addAll(Arrays.asList(fieldNames));
        return this;
    }
    
    
    

    /**
     *  <p>Must match the set of <code>name</code>s of FieldDefinitions (up to order).</p>
     * @return fieldNames
     */
    
    
    public java.util.List<String> getFieldNames(){
        return this.fieldNames;
    }

    /**
     * builds TypeChangeFieldDefinitionOrderAction with checking for non-null required values
     * @return TypeChangeFieldDefinitionOrderAction
     */
    public TypeChangeFieldDefinitionOrderAction build() {
        Objects.requireNonNull(fieldNames, TypeChangeFieldDefinitionOrderAction.class + ": fieldNames is missing");
        return new TypeChangeFieldDefinitionOrderActionImpl(fieldNames);
    }
    
    /**
     * builds TypeChangeFieldDefinitionOrderAction without checking for non-null required values
     * @return TypeChangeFieldDefinitionOrderAction
     */
    public TypeChangeFieldDefinitionOrderAction buildUnchecked() {
        return new TypeChangeFieldDefinitionOrderActionImpl(fieldNames);
    }

    /**
     * factory method for an instance of TypeChangeFieldDefinitionOrderActionBuilder
     * @return builder 
     */
    public static TypeChangeFieldDefinitionOrderActionBuilder of() {
        return new TypeChangeFieldDefinitionOrderActionBuilder();
    }

    /**
     * create builder for TypeChangeFieldDefinitionOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeChangeFieldDefinitionOrderActionBuilder of(final TypeChangeFieldDefinitionOrderAction template) {
        TypeChangeFieldDefinitionOrderActionBuilder builder = new TypeChangeFieldDefinitionOrderActionBuilder();
        builder.fieldNames = template.getFieldNames();
        return builder;
    }

}
