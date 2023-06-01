package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.MoneyOverflowError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MoneyOverflowErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MoneyOverflowError moneyOverflowError = MoneyOverflowError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MoneyOverflowErrorBuilder implements Builder<MoneyOverflowError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    
    /**
     *  <p><code>"A Money operation resulted in an overflow."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public MoneyOverflowErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public MoneyOverflowErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public MoneyOverflowErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    

    /**
     *  <p><code>"A Money operation resulted in an overflow."</code></p>
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
     * builds MoneyOverflowError with checking for non-null required values
     * @return MoneyOverflowError
     */
    public MoneyOverflowError build() {
        Objects.requireNonNull(message, MoneyOverflowError.class + ": message is missing");
        return new MoneyOverflowErrorImpl(message, values);
    }
    
    /**
     * builds MoneyOverflowError without checking for non-null required values
     * @return MoneyOverflowError
     */
    public MoneyOverflowError buildUnchecked() {
        return new MoneyOverflowErrorImpl(message, values);
    }

    /**
     * factory method for an instance of MoneyOverflowErrorBuilder
     * @return builder 
     */
    public static MoneyOverflowErrorBuilder of() {
        return new MoneyOverflowErrorBuilder();
    }

    /**
     * create builder for MoneyOverflowError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MoneyOverflowErrorBuilder of(final MoneyOverflowError template) {
        MoneyOverflowErrorBuilder builder = new MoneyOverflowErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
