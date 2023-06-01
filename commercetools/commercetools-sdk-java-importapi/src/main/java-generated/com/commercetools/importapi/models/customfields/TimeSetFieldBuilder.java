package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import java.time.LocalTime;
import com.commercetools.importapi.models.customfields.TimeSetField;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TimeSetFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TimeSetField timeSetField = TimeSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TimeSetFieldBuilder implements Builder<TimeSetField> {

    
    
    private java.util.List<java.time.LocalTime> value;

    /**
     * set values to the value
     * @param value value to be set
     * @return Builder
     */
    
    public TimeSetFieldBuilder value( final java.time.LocalTime ...value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }
    
    /**
     * set value to the value
     * @param value value to be set
     * @return Builder
     */
    
    public TimeSetFieldBuilder value( final java.util.List<java.time.LocalTime> value) {
        this.value = value;
        return this;
    }
    
    /**
     * add values to the value
     * @param value value to be set
     * @return Builder
     */
    
    public TimeSetFieldBuilder plusValue( final java.time.LocalTime ...value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }
    
    
    

    /**
     * value of value}
     * @return value
     */
    
    
    public java.util.List<java.time.LocalTime> getValue(){
        return this.value;
    }

    /**
     * builds TimeSetField with checking for non-null required values
     * @return TimeSetField
     */
    public TimeSetField build() {
        Objects.requireNonNull(value, TimeSetField.class + ": value is missing");
        return new TimeSetFieldImpl(value);
    }
    
    /**
     * builds TimeSetField without checking for non-null required values
     * @return TimeSetField
     */
    public TimeSetField buildUnchecked() {
        return new TimeSetFieldImpl(value);
    }

    /**
     * factory method for an instance of TimeSetFieldBuilder
     * @return builder 
     */
    public static TimeSetFieldBuilder of() {
        return new TimeSetFieldBuilder();
    }

    /**
     * create builder for TimeSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TimeSetFieldBuilder of(final TimeSetField template) {
        TimeSetFieldBuilder builder = new TimeSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
