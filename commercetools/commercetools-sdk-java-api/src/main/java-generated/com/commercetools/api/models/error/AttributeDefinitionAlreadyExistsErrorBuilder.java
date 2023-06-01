package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.AttributeDefinitionAlreadyExistsError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeDefinitionAlreadyExistsErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeDefinitionAlreadyExistsError attributeDefinitionAlreadyExistsError = AttributeDefinitionAlreadyExistsError.builder()
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
public class AttributeDefinitionAlreadyExistsErrorBuilder implements Builder<AttributeDefinitionAlreadyExistsError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private String conflictingProductTypeId;
    
    
    
    private String conflictingProductTypeName;
    
    
    
    private String conflictingAttributeName;

    
    /**
     *  <p><code>"An attribute definition with name $attributeName already exists on product type $productTypeName."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public AttributeDefinitionAlreadyExistsErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public AttributeDefinitionAlreadyExistsErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public AttributeDefinitionAlreadyExistsErrorBuilder addValue(final String key, final java.lang.Object value) {
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
    
    public AttributeDefinitionAlreadyExistsErrorBuilder conflictingProductTypeId( final String conflictingProductTypeId) {
        this.conflictingProductTypeId = conflictingProductTypeId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the Product Type containing the conflicting name.</p>
     * @param conflictingProductTypeName value to be set
     * @return Builder
     */
    
    public AttributeDefinitionAlreadyExistsErrorBuilder conflictingProductTypeName( final String conflictingProductTypeName) {
        this.conflictingProductTypeName = conflictingProductTypeName;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @param conflictingAttributeName value to be set
     * @return Builder
     */
    
    public AttributeDefinitionAlreadyExistsErrorBuilder conflictingAttributeName( final String conflictingAttributeName) {
        this.conflictingAttributeName = conflictingAttributeName;
        return this;
    }
    
    

    /**
     *  <p><code>"An attribute definition with name $attributeName already exists on product type $productTypeName."</code></p>
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
     * builds AttributeDefinitionAlreadyExistsError with checking for non-null required values
     * @return AttributeDefinitionAlreadyExistsError
     */
    public AttributeDefinitionAlreadyExistsError build() {
        Objects.requireNonNull(message, AttributeDefinitionAlreadyExistsError.class + ": message is missing");
        Objects.requireNonNull(conflictingProductTypeId, AttributeDefinitionAlreadyExistsError.class + ": conflictingProductTypeId is missing");
        Objects.requireNonNull(conflictingProductTypeName, AttributeDefinitionAlreadyExistsError.class + ": conflictingProductTypeName is missing");
        Objects.requireNonNull(conflictingAttributeName, AttributeDefinitionAlreadyExistsError.class + ": conflictingAttributeName is missing");
        return new AttributeDefinitionAlreadyExistsErrorImpl(message, values, conflictingProductTypeId, conflictingProductTypeName, conflictingAttributeName);
    }
    
    /**
     * builds AttributeDefinitionAlreadyExistsError without checking for non-null required values
     * @return AttributeDefinitionAlreadyExistsError
     */
    public AttributeDefinitionAlreadyExistsError buildUnchecked() {
        return new AttributeDefinitionAlreadyExistsErrorImpl(message, values, conflictingProductTypeId, conflictingProductTypeName, conflictingAttributeName);
    }

    /**
     * factory method for an instance of AttributeDefinitionAlreadyExistsErrorBuilder
     * @return builder 
     */
    public static AttributeDefinitionAlreadyExistsErrorBuilder of() {
        return new AttributeDefinitionAlreadyExistsErrorBuilder();
    }

    /**
     * create builder for AttributeDefinitionAlreadyExistsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeDefinitionAlreadyExistsErrorBuilder of(final AttributeDefinitionAlreadyExistsError template) {
        AttributeDefinitionAlreadyExistsErrorBuilder builder = new AttributeDefinitionAlreadyExistsErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.conflictingProductTypeId = template.getConflictingProductTypeId();
        builder.conflictingProductTypeName = template.getConflictingProductTypeName();
        builder.conflictingAttributeName = template.getConflictingAttributeName();
        return builder;
    }

}
