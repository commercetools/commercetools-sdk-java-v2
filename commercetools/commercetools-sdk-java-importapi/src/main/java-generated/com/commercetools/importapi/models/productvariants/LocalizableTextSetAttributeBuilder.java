package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.LocalizableTextSetAttribute;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LocalizableTextSetAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizableTextSetAttribute localizableTextSetAttribute = LocalizableTextSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class LocalizableTextSetAttributeBuilder implements Builder<LocalizableTextSetAttribute> {

    
    @Nullable
    private String name;
    
    
    
    private java.util.List<com.commercetools.importapi.models.common.LocalizedString> value;

    
    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public LocalizableTextSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }
    
    
    
    /**
     * set values to the value
     * @param value value to be set
     * @return Builder
     */
    
    public LocalizableTextSetAttributeBuilder value( final com.commercetools.importapi.models.common.LocalizedString ...value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }
    
    /**
     * set value to the value
     * @param value value to be set
     * @return Builder
     */
    
    public LocalizableTextSetAttributeBuilder value( final java.util.List<com.commercetools.importapi.models.common.LocalizedString> value) {
        this.value = value;
        return this;
    }
    
    /**
     * add values to the value
     * @param value value to be set
     * @return Builder
     */
    
    public LocalizableTextSetAttributeBuilder plusValue( final com.commercetools.importapi.models.common.LocalizedString ...value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }
    
    
    
    /**
     * add the value to the value using the builder function
     * @param builder function to build the value value
     * @return Builder
     */
    
    public LocalizableTextSetAttributeBuilder plusValue(Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the value using the builder function
     * @param builder function to build the value value
     * @return Builder
     */
    
    public LocalizableTextSetAttributeBuilder withValue(Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.value = new ArrayList<>();
        this.value.add(builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the value using the builder function
     * @param builder function to build the value value
     * @return Builder
     */
    
    public LocalizableTextSetAttributeBuilder addValue(Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        return plusValue(builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()));
    }
    
    /**
     * set the value to the value using the builder function
     * @param builder function to build the value value
     * @return Builder
     */
    
    public LocalizableTextSetAttributeBuilder setValue(Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        return value(builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()));
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
    
    
    public java.util.List<com.commercetools.importapi.models.common.LocalizedString> getValue(){
        return this.value;
    }

    /**
     * builds LocalizableTextSetAttribute with checking for non-null required values
     * @return LocalizableTextSetAttribute
     */
    public LocalizableTextSetAttribute build() {
        Objects.requireNonNull(value, LocalizableTextSetAttribute.class + ": value is missing");
        return new LocalizableTextSetAttributeImpl(name, value);
    }
    
    /**
     * builds LocalizableTextSetAttribute without checking for non-null required values
     * @return LocalizableTextSetAttribute
     */
    public LocalizableTextSetAttribute buildUnchecked() {
        return new LocalizableTextSetAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of LocalizableTextSetAttributeBuilder
     * @return builder 
     */
    public static LocalizableTextSetAttributeBuilder of() {
        return new LocalizableTextSetAttributeBuilder();
    }

    /**
     * create builder for LocalizableTextSetAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizableTextSetAttributeBuilder of(final LocalizableTextSetAttribute template) {
        LocalizableTextSetAttributeBuilder builder = new LocalizableTextSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
