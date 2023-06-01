package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.DuplicateEnumValuesError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DuplicateEnumValuesErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicateEnumValuesError duplicateEnumValuesError = DuplicateEnumValuesError.builder()
 *             .message("{message}")
 *             .plusDuplicates(duplicatesBuilder -> duplicatesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DuplicateEnumValuesErrorBuilder implements Builder<DuplicateEnumValuesError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private java.util.List<String> duplicates;

    
    /**
     *  <p><code>"The enum values contain duplicate keys: $listOfDuplicateKeys."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public DuplicateEnumValuesErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public DuplicateEnumValuesErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public DuplicateEnumValuesErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    /**
     *  <p>Duplicate keys.</p>
     * @param duplicates value to be set
     * @return Builder
     */
    
    public DuplicateEnumValuesErrorBuilder duplicates( final String ...duplicates) {
        this.duplicates = new ArrayList<>(Arrays.asList(duplicates));
        return this;
    }
    
    /**
     *  <p>Duplicate keys.</p>
     * @param duplicates value to be set
     * @return Builder
     */
    
    public DuplicateEnumValuesErrorBuilder duplicates( final java.util.List<String> duplicates) {
        this.duplicates = duplicates;
        return this;
    }
    
    /**
     *  <p>Duplicate keys.</p>
     * @param duplicates value to be set
     * @return Builder
     */
    
    public DuplicateEnumValuesErrorBuilder plusDuplicates( final String ...duplicates) {
        if (this.duplicates == null) {
            this.duplicates = new ArrayList<>();
        }
        this.duplicates.addAll(Arrays.asList(duplicates));
        return this;
    }
    
    
    

    /**
     *  <p><code>"The enum values contain duplicate keys: $listOfDuplicateKeys."</code></p>
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
     *  <p>Duplicate keys.</p>
     * @return duplicates
     */
    
    
    public java.util.List<String> getDuplicates(){
        return this.duplicates;
    }

    /**
     * builds DuplicateEnumValuesError with checking for non-null required values
     * @return DuplicateEnumValuesError
     */
    public DuplicateEnumValuesError build() {
        Objects.requireNonNull(message, DuplicateEnumValuesError.class + ": message is missing");
        Objects.requireNonNull(duplicates, DuplicateEnumValuesError.class + ": duplicates is missing");
        return new DuplicateEnumValuesErrorImpl(message, values, duplicates);
    }
    
    /**
     * builds DuplicateEnumValuesError without checking for non-null required values
     * @return DuplicateEnumValuesError
     */
    public DuplicateEnumValuesError buildUnchecked() {
        return new DuplicateEnumValuesErrorImpl(message, values, duplicates);
    }

    /**
     * factory method for an instance of DuplicateEnumValuesErrorBuilder
     * @return builder 
     */
    public static DuplicateEnumValuesErrorBuilder of() {
        return new DuplicateEnumValuesErrorBuilder();
    }

    /**
     * create builder for DuplicateEnumValuesError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DuplicateEnumValuesErrorBuilder of(final DuplicateEnumValuesError template) {
        DuplicateEnumValuesErrorBuilder builder = new DuplicateEnumValuesErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.duplicates = template.getDuplicates();
        return builder;
    }

}
