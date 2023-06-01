package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.AttributeDefinitionTypeConflictError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeDefinitionTypeConflictErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeDefinitionTypeConflictError attributeDefinitionTypeConflictError = AttributeDefinitionTypeConflictError.builder()
 *             .message("{message}")
 *             .conflictingProductTypeId("{conflictingProductTypeId}")
 *             .conflictingProductTypeName("{conflictingProductTypeName}")
 *             .conflictingAttributeName("{conflictingAttributeName}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeDefinitionTypeConflictErrorBuilder implements Builder<AttributeDefinitionTypeConflictError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private String conflictingProductTypeId;
    
    
    
    private String conflictingProductTypeName;
    
    
    
    private String conflictingAttributeName;

    
    /**
     *  <p><code>"The attribute with name $attributeName has a different type on product type $productTypeName."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public AttributeDefinitionTypeConflictErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public AttributeDefinitionTypeConflictErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public AttributeDefinitionTypeConflictErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>Unique identifier of the Product Type containing the conflicting name.</p>
     * @param conflictingProductTypeId value to be set
     * @return Builder
     */
    
    public AttributeDefinitionTypeConflictErrorBuilder conflictingProductTypeId( final String conflictingProductTypeId) {
        this.conflictingProductTypeId = conflictingProductTypeId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the Product Type containing the conflicting name.</p>
     * @param conflictingProductTypeName value to be set
     * @return Builder
     */
    
    public AttributeDefinitionTypeConflictErrorBuilder conflictingProductTypeName( final String conflictingProductTypeName) {
        this.conflictingProductTypeName = conflictingProductTypeName;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @param conflictingAttributeName value to be set
     * @return Builder
     */
    
    public AttributeDefinitionTypeConflictErrorBuilder conflictingAttributeName( final String conflictingAttributeName) {
        this.conflictingAttributeName = conflictingAttributeName;
        return this;
    }
    
    

    /**
     *  <p><code>"The attribute with name $attributeName has a different type on product type $productTypeName."</code></p>
     * @return message
     */
    
    
    public String getMessage(){
        return this.message;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */
    
    
    public Map<String, java.lang.Object> getValues(){
        return this.values;
    }
    
    /**
     *  <p>Unique identifier of the Product Type containing the conflicting name.</p>
     * @return conflictingProductTypeId
     */
    
    
    public String getConflictingProductTypeId(){
        return this.conflictingProductTypeId;
    }
    
    /**
     *  <p>Name of the Product Type containing the conflicting name.</p>
     * @return conflictingProductTypeName
     */
    
    
    public String getConflictingProductTypeName(){
        return this.conflictingProductTypeName;
    }
    
    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @return conflictingAttributeName
     */
    
    
    public String getConflictingAttributeName(){
        return this.conflictingAttributeName;
    }

    /**
     * builds AttributeDefinitionTypeConflictError with checking for non-null required values
     * @return AttributeDefinitionTypeConflictError
     */
    public AttributeDefinitionTypeConflictError build() {
        Objects.requireNonNull(message, AttributeDefinitionTypeConflictError.class + ": message is missing");
        Objects.requireNonNull(conflictingProductTypeId, AttributeDefinitionTypeConflictError.class + ": conflictingProductTypeId is missing");
        Objects.requireNonNull(conflictingProductTypeName, AttributeDefinitionTypeConflictError.class + ": conflictingProductTypeName is missing");
        Objects.requireNonNull(conflictingAttributeName, AttributeDefinitionTypeConflictError.class + ": conflictingAttributeName is missing");
        return new AttributeDefinitionTypeConflictErrorImpl(message, values, conflictingProductTypeId, conflictingProductTypeName, conflictingAttributeName);
    }
    
    /**
     * builds AttributeDefinitionTypeConflictError without checking for non-null required values
     * @return AttributeDefinitionTypeConflictError
     */
    public AttributeDefinitionTypeConflictError buildUnchecked() {
        return new AttributeDefinitionTypeConflictErrorImpl(message, values, conflictingProductTypeId, conflictingProductTypeName, conflictingAttributeName);
    }

    /**
     * factory method for an instance of AttributeDefinitionTypeConflictErrorBuilder
     * @return builder 
     */
    public static AttributeDefinitionTypeConflictErrorBuilder of() {
        return new AttributeDefinitionTypeConflictErrorBuilder();
    }

    /**
     * create builder for AttributeDefinitionTypeConflictError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeDefinitionTypeConflictErrorBuilder of(final AttributeDefinitionTypeConflictError template) {
        AttributeDefinitionTypeConflictErrorBuilder builder = new AttributeDefinitionTypeConflictErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.conflictingProductTypeId = template.getConflictingProductTypeId();
        builder.conflictingProductTypeName = template.getConflictingProductTypeName();
        builder.conflictingAttributeName = template.getConflictingAttributeName();
        return builder;
    }

}
