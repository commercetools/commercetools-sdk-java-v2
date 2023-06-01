package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.BooleanSetAttribute;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BooleanSetAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BooleanSetAttribute booleanSetAttribute = BooleanSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BooleanSetAttributeBuilder implements Builder<BooleanSetAttribute> {

    
    @Nullable
    private String name;
    
    
    
    private java.util.List<Boolean> value;

    
    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public BooleanSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }
    
    
    
    /**
     * set values to the value
     * @param value value to be set
     * @return Builder
     */
    
    public BooleanSetAttributeBuilder value( final Boolean ...value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }
    
    /**
     * set value to the value
     * @param value value to be set
     * @return Builder
     */
    
    public BooleanSetAttributeBuilder value( final java.util.List<Boolean> value) {
        this.value = value;
        return this;
    }
    
    /**
     * add values to the value
     * @param value value to be set
     * @return Builder
     */
    
    public BooleanSetAttributeBuilder plusValue( final Boolean ...value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }
    
    
    

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @return name
     */
    
    @Nullable
    public String getName(){
        return this.name;
    }
    
    /**
     * value of value}
     * @return value
     */
    
    
    public java.util.List<Boolean> getValue(){
        return this.value;
    }

    /**
     * builds BooleanSetAttribute with checking for non-null required values
     * @return BooleanSetAttribute
     */
    public BooleanSetAttribute build() {
        Objects.requireNonNull(value, BooleanSetAttribute.class + ": value is missing");
        return new BooleanSetAttributeImpl(name, value);
    }
    
    /**
     * builds BooleanSetAttribute without checking for non-null required values
     * @return BooleanSetAttribute
     */
    public BooleanSetAttribute buildUnchecked() {
        return new BooleanSetAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of BooleanSetAttributeBuilder
     * @return builder 
     */
    public static BooleanSetAttributeBuilder of() {
        return new BooleanSetAttributeBuilder();
    }

    /**
     * create builder for BooleanSetAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BooleanSetAttributeBuilder of(final BooleanSetAttribute template) {
        BooleanSetAttributeBuilder builder = new BooleanSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
