package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.VariantValues;
import com.commercetools.importapi.models.errors.DuplicateVariantValuesError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DuplicateVariantValuesErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicateVariantValuesError duplicateVariantValuesError = DuplicateVariantValuesError.builder()
 *             .message("{message}")
 *             .variantValues(variantValuesBuilder -> variantValuesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DuplicateVariantValuesErrorBuilder implements Builder<DuplicateVariantValuesError> {

    
    
    private String message;
    
    
    
    private com.commercetools.importapi.models.errors.VariantValues variantValues;

    
    /**
     * set the value to the message
     * @param message value to be set
     * @return Builder
     */
    
    public DuplicateVariantValuesErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    
    /**
     *  <p>The offending variant values.</p>
     * @param builder function to build the variantValues value
     * @return Builder
     */
    
    public DuplicateVariantValuesErrorBuilder variantValues(Function<com.commercetools.importapi.models.errors.VariantValuesBuilder, com.commercetools.importapi.models.errors.VariantValuesBuilder> builder) {
        this.variantValues = builder.apply(com.commercetools.importapi.models.errors.VariantValuesBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The offending variant values.</p>
     * @param builder function to build the variantValues value
     * @return Builder
     */
    
    public DuplicateVariantValuesErrorBuilder withVariantValues(Function<com.commercetools.importapi.models.errors.VariantValuesBuilder, com.commercetools.importapi.models.errors.VariantValues> builder) {
        this.variantValues = builder.apply(com.commercetools.importapi.models.errors.VariantValuesBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The offending variant values.</p>
     * @param variantValues value to be set
     * @return Builder
     */
    
    public DuplicateVariantValuesErrorBuilder variantValues( final com.commercetools.importapi.models.errors.VariantValues variantValues) {
        this.variantValues = variantValues;
        return this;
    }
    
    

    /**
     * value of message}
     * @return message
     */
    
    
    public String getMessage(){
        return this.message;
    }
    
    /**
     *  <p>The offending variant values.</p>
     * @return variantValues
     */
    
    
    public com.commercetools.importapi.models.errors.VariantValues getVariantValues(){
        return this.variantValues;
    }

    /**
     * builds DuplicateVariantValuesError with checking for non-null required values
     * @return DuplicateVariantValuesError
     */
    public DuplicateVariantValuesError build() {
        Objects.requireNonNull(message, DuplicateVariantValuesError.class + ": message is missing");
        Objects.requireNonNull(variantValues, DuplicateVariantValuesError.class + ": variantValues is missing");
        return new DuplicateVariantValuesErrorImpl(message, variantValues);
    }
    
    /**
     * builds DuplicateVariantValuesError without checking for non-null required values
     * @return DuplicateVariantValuesError
     */
    public DuplicateVariantValuesError buildUnchecked() {
        return new DuplicateVariantValuesErrorImpl(message, variantValues);
    }

    /**
     * factory method for an instance of DuplicateVariantValuesErrorBuilder
     * @return builder 
     */
    public static DuplicateVariantValuesErrorBuilder of() {
        return new DuplicateVariantValuesErrorBuilder();
    }

    /**
     * create builder for DuplicateVariantValuesError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DuplicateVariantValuesErrorBuilder of(final DuplicateVariantValuesError template) {
        DuplicateVariantValuesErrorBuilder builder = new DuplicateVariantValuesErrorBuilder();
        builder.message = template.getMessage();
        builder.variantValues = template.getVariantValues();
        return builder;
    }

}
