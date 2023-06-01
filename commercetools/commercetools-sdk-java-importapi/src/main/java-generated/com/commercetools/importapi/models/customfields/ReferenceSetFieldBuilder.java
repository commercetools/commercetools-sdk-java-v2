package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.ReferenceSetField;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReferenceSetFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReferenceSetField referenceSetField = ReferenceSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReferenceSetFieldBuilder implements Builder<ReferenceSetField> {

    
    
    private java.util.List<com.commercetools.importapi.models.common.KeyReference> value;

    /**
     * set values to the value
     * @param value value to be set
     * @return Builder
     */
    
    public ReferenceSetFieldBuilder value( final com.commercetools.importapi.models.common.KeyReference ...value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }
    
    /**
     * set value to the value
     * @param value value to be set
     * @return Builder
     */
    
    public ReferenceSetFieldBuilder value( final java.util.List<com.commercetools.importapi.models.common.KeyReference> value) {
        this.value = value;
        return this;
    }
    
    /**
     * add values to the value
     * @param value value to be set
     * @return Builder
     */
    
    public ReferenceSetFieldBuilder plusValue( final com.commercetools.importapi.models.common.KeyReference ...value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }
    
    
    /**
     * add a value to the value using the builder function
     * @param builder function to build the value value
     * @return Builder
     */
    
    public ReferenceSetFieldBuilder plusValue(Function<com.commercetools.importapi.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.importapi.models.common.KeyReference>> builder) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(builder.apply(com.commercetools.importapi.models.common.KeyReferenceBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the value using the builder function
     * @param builder function to build the value value
     * @return Builder
     */
    
    public ReferenceSetFieldBuilder withValue(Function<com.commercetools.importapi.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.importapi.models.common.KeyReference>> builder) {
        this.value = new ArrayList<>();
        this.value.add(builder.apply(com.commercetools.importapi.models.common.KeyReferenceBuilder.of()).build());
        return this;
    }
                    
    

    /**
     * value of value}
     * @return value
     */
    
    
    public java.util.List<com.commercetools.importapi.models.common.KeyReference> getValue(){
        return this.value;
    }

    /**
     * builds ReferenceSetField with checking for non-null required values
     * @return ReferenceSetField
     */
    public ReferenceSetField build() {
        Objects.requireNonNull(value, ReferenceSetField.class + ": value is missing");
        return new ReferenceSetFieldImpl(value);
    }
    
    /**
     * builds ReferenceSetField without checking for non-null required values
     * @return ReferenceSetField
     */
    public ReferenceSetField buildUnchecked() {
        return new ReferenceSetFieldImpl(value);
    }

    /**
     * factory method for an instance of ReferenceSetFieldBuilder
     * @return builder 
     */
    public static ReferenceSetFieldBuilder of() {
        return new ReferenceSetFieldBuilder();
    }

    /**
     * create builder for ReferenceSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReferenceSetFieldBuilder of(final ReferenceSetField template) {
        ReferenceSetFieldBuilder builder = new ReferenceSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
