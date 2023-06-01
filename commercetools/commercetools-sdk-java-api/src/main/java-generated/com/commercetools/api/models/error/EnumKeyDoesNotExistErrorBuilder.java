package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.EnumKeyDoesNotExistError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * EnumKeyDoesNotExistErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EnumKeyDoesNotExistError enumKeyDoesNotExistError = EnumKeyDoesNotExistError.builder()
 *             .message("{message}")
 *             .conflictingEnumKey("{conflictingEnumKey}")
 *             .conflictingAttributeName("{conflictingAttributeName}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class EnumKeyDoesNotExistErrorBuilder implements Builder<EnumKeyDoesNotExistError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private String conflictingEnumKey;
    
    
    
    private String conflictingAttributeName;

    
    /**
     *  <p><code>"The $fieldName field definition does not contain an enum value with the key $enumKey."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public EnumKeyDoesNotExistErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public EnumKeyDoesNotExistErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public EnumKeyDoesNotExistErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>Conflicting enum key.</p>
     * @param conflictingEnumKey value to be set
     * @return Builder
     */
    
    public EnumKeyDoesNotExistErrorBuilder conflictingEnumKey( final String conflictingEnumKey) {
        this.conflictingEnumKey = conflictingEnumKey;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @param conflictingAttributeName value to be set
     * @return Builder
     */
    
    public EnumKeyDoesNotExistErrorBuilder conflictingAttributeName( final String conflictingAttributeName) {
        this.conflictingAttributeName = conflictingAttributeName;
        return this;
    }
    
    

    /**
     *  <p><code>"The $fieldName field definition does not contain an enum value with the key $enumKey."</code></p>
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
     *  <p>Conflicting enum key.</p>
     * @return conflictingEnumKey
     */
    
    
    public String getConflictingEnumKey(){
        return this.conflictingEnumKey;
    }
    
    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @return conflictingAttributeName
     */
    
    
    public String getConflictingAttributeName(){
        return this.conflictingAttributeName;
    }

    /**
     * builds EnumKeyDoesNotExistError with checking for non-null required values
     * @return EnumKeyDoesNotExistError
     */
    public EnumKeyDoesNotExistError build() {
        Objects.requireNonNull(message, EnumKeyDoesNotExistError.class + ": message is missing");
        Objects.requireNonNull(conflictingEnumKey, EnumKeyDoesNotExistError.class + ": conflictingEnumKey is missing");
        Objects.requireNonNull(conflictingAttributeName, EnumKeyDoesNotExistError.class + ": conflictingAttributeName is missing");
        return new EnumKeyDoesNotExistErrorImpl(message, values, conflictingEnumKey, conflictingAttributeName);
    }
    
    /**
     * builds EnumKeyDoesNotExistError without checking for non-null required values
     * @return EnumKeyDoesNotExistError
     */
    public EnumKeyDoesNotExistError buildUnchecked() {
        return new EnumKeyDoesNotExistErrorImpl(message, values, conflictingEnumKey, conflictingAttributeName);
    }

    /**
     * factory method for an instance of EnumKeyDoesNotExistErrorBuilder
     * @return builder 
     */
    public static EnumKeyDoesNotExistErrorBuilder of() {
        return new EnumKeyDoesNotExistErrorBuilder();
    }

    /**
     * create builder for EnumKeyDoesNotExistError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EnumKeyDoesNotExistErrorBuilder of(final EnumKeyDoesNotExistError template) {
        EnumKeyDoesNotExistErrorBuilder builder = new EnumKeyDoesNotExistErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.conflictingEnumKey = template.getConflictingEnumKey();
        builder.conflictingAttributeName = template.getConflictingAttributeName();
        return builder;
    }

}
