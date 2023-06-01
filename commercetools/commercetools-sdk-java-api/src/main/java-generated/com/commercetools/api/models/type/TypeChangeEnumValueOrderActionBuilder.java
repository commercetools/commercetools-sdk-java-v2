package com.commercetools.api.models.type;

import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeChangeEnumValueOrderAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeChangeEnumValueOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeChangeEnumValueOrderAction typeChangeEnumValueOrderAction = TypeChangeEnumValueOrderAction.builder()
 *             .fieldName("{fieldName}")
 *             .plusKeys(keysBuilder -> keysBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TypeChangeEnumValueOrderActionBuilder implements Builder<TypeChangeEnumValueOrderAction> {

    
    
    private String fieldName;
    
    
    
    private java.util.List<String> keys;

    
    /**
     *  <p><code>name</code> of the FieldDefinition to update.</p>
     * @param fieldName value to be set
     * @return Builder
     */
    
    public TypeChangeEnumValueOrderActionBuilder fieldName( final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    
    
    
    /**
     *  <p>Must match the set of <code>key</code>s of the EnumValues in the FieldDefinition (apart from their order).</p>
     * @param keys value to be set
     * @return Builder
     */
    
    public TypeChangeEnumValueOrderActionBuilder keys( final String ...keys) {
        this.keys = new ArrayList<>(Arrays.asList(keys));
        return this;
    }
    
    /**
     *  <p>Must match the set of <code>key</code>s of the EnumValues in the FieldDefinition (apart from their order).</p>
     * @param keys value to be set
     * @return Builder
     */
    
    public TypeChangeEnumValueOrderActionBuilder keys( final java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }
    
    /**
     *  <p>Must match the set of <code>key</code>s of the EnumValues in the FieldDefinition (apart from their order).</p>
     * @param keys value to be set
     * @return Builder
     */
    
    public TypeChangeEnumValueOrderActionBuilder plusKeys( final String ...keys) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        this.keys.addAll(Arrays.asList(keys));
        return this;
    }
    
    
    

    /**
     *  <p><code>name</code> of the FieldDefinition to update.</p>
     * @return fieldName
     */
    
    
    public String getFieldName(){
        return this.fieldName;
    }
    
    /**
     *  <p>Must match the set of <code>key</code>s of the EnumValues in the FieldDefinition (apart from their order).</p>
     * @return keys
     */
    
    
    public java.util.List<String> getKeys(){
        return this.keys;
    }

    /**
     * builds TypeChangeEnumValueOrderAction with checking for non-null required values
     * @return TypeChangeEnumValueOrderAction
     */
    public TypeChangeEnumValueOrderAction build() {
        Objects.requireNonNull(fieldName, TypeChangeEnumValueOrderAction.class + ": fieldName is missing");
        Objects.requireNonNull(keys, TypeChangeEnumValueOrderAction.class + ": keys is missing");
        return new TypeChangeEnumValueOrderActionImpl(fieldName, keys);
    }
    
    /**
     * builds TypeChangeEnumValueOrderAction without checking for non-null required values
     * @return TypeChangeEnumValueOrderAction
     */
    public TypeChangeEnumValueOrderAction buildUnchecked() {
        return new TypeChangeEnumValueOrderActionImpl(fieldName, keys);
    }

    /**
     * factory method for an instance of TypeChangeEnumValueOrderActionBuilder
     * @return builder 
     */
    public static TypeChangeEnumValueOrderActionBuilder of() {
        return new TypeChangeEnumValueOrderActionBuilder();
    }

    /**
     * create builder for TypeChangeEnumValueOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeChangeEnumValueOrderActionBuilder of(final TypeChangeEnumValueOrderAction template) {
        TypeChangeEnumValueOrderActionBuilder builder = new TypeChangeEnumValueOrderActionBuilder();
        builder.fieldName = template.getFieldName();
        builder.keys = template.getKeys();
        return builder;
    }

}
