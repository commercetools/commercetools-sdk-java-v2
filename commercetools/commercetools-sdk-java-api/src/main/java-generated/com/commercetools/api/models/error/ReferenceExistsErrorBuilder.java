package com.commercetools.api.models.error;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.ReferenceExistsError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReferenceExistsErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReferenceExistsError referenceExistsError = ReferenceExistsError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReferenceExistsErrorBuilder implements Builder<ReferenceExistsError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    @Nullable
    private com.commercetools.api.models.common.ReferenceTypeId referencedBy;

    
    /**
     *  <p><code>"Can not delete a $resource while it is referenced by at least one $referencedBy."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public ReferenceExistsErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public ReferenceExistsErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public ReferenceExistsErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>Type of referenced resource.</p>
     * @param referencedBy value to be set
     * @return Builder
     */
    
    public ReferenceExistsErrorBuilder referencedBy(@Nullable final com.commercetools.api.models.common.ReferenceTypeId referencedBy) {
        this.referencedBy = referencedBy;
        return this;
    }
    
    

    /**
     *  <p><code>"Can not delete a $resource while it is referenced by at least one $referencedBy."</code></p>
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
     *  <p>Type of referenced resource.</p>
     * @return referencedBy
     */
    
    @Nullable
    public com.commercetools.api.models.common.ReferenceTypeId getReferencedBy(){
        return this.referencedBy;
    }

    /**
     * builds ReferenceExistsError with checking for non-null required values
     * @return ReferenceExistsError
     */
    public ReferenceExistsError build() {
        Objects.requireNonNull(message, ReferenceExistsError.class + ": message is missing");
        return new ReferenceExistsErrorImpl(message, values, referencedBy);
    }
    
    /**
     * builds ReferenceExistsError without checking for non-null required values
     * @return ReferenceExistsError
     */
    public ReferenceExistsError buildUnchecked() {
        return new ReferenceExistsErrorImpl(message, values, referencedBy);
    }

    /**
     * factory method for an instance of ReferenceExistsErrorBuilder
     * @return builder 
     */
    public static ReferenceExistsErrorBuilder of() {
        return new ReferenceExistsErrorBuilder();
    }

    /**
     * create builder for ReferenceExistsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReferenceExistsErrorBuilder of(final ReferenceExistsError template) {
        ReferenceExistsErrorBuilder builder = new ReferenceExistsErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.referencedBy = template.getReferencedBy();
        return builder;
    }

}
