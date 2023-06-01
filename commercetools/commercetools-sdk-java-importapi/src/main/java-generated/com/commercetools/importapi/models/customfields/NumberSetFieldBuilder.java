package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.NumberSetField;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * NumberSetFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NumberSetField numberSetField = NumberSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class NumberSetFieldBuilder implements Builder<NumberSetField> {

    
    
    private java.util.List<Double> value;

    /**
     * set values to the value
     * @param value value to be set
     * @return Builder
     */
    
    public NumberSetFieldBuilder value( final Double ...value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }
    
    /**
     * set value to the value
     * @param value value to be set
     * @return Builder
     */
    
    public NumberSetFieldBuilder value( final java.util.List<Double> value) {
        this.value = value;
        return this;
    }
    
    /**
     * add values to the value
     * @param value value to be set
     * @return Builder
     */
    
    public NumberSetFieldBuilder plusValue( final Double ...value) {
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
    
    
    public java.util.List<Double> getValue(){
        return this.value;
    }

    /**
     * builds NumberSetField with checking for non-null required values
     * @return NumberSetField
     */
    public NumberSetField build() {
        Objects.requireNonNull(value, NumberSetField.class + ": value is missing");
        return new NumberSetFieldImpl(value);
    }
    
    /**
     * builds NumberSetField without checking for non-null required values
     * @return NumberSetField
     */
    public NumberSetField buildUnchecked() {
        return new NumberSetFieldImpl(value);
    }

    /**
     * factory method for an instance of NumberSetFieldBuilder
     * @return builder 
     */
    public static NumberSetFieldBuilder of() {
        return new NumberSetFieldBuilder();
    }

    /**
     * create builder for NumberSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NumberSetFieldBuilder of(final NumberSetField template) {
        NumberSetFieldBuilder builder = new NumberSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
