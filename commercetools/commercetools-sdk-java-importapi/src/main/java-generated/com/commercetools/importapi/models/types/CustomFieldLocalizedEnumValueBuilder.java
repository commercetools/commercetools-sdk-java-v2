package com.commercetools.importapi.models.types;

import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.types.CustomFieldLocalizedEnumValue;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldLocalizedEnumValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldLocalizedEnumValue customFieldLocalizedEnumValue = CustomFieldLocalizedEnumValue.builder()
 *             .key("{key}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomFieldLocalizedEnumValueBuilder implements Builder<CustomFieldLocalizedEnumValue> {

    
    
    private String key;
    
    
    
    private com.commercetools.importapi.models.common.LocalizedString label;

    
    /**
     *  <p>Key of the value used as a programmatic identifier.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public CustomFieldLocalizedEnumValueBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    
    
    
    /**
     *  <p>Descriptive localized label of the value.</p>
     * @param builder function to build the label value
     * @return Builder
     */
    
    public CustomFieldLocalizedEnumValueBuilder label(Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Descriptive localized label of the value.</p>
     * @param builder function to build the label value
     * @return Builder
     */
    
    public CustomFieldLocalizedEnumValueBuilder withLabel(Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.label = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Descriptive localized label of the value.</p>
     * @param label value to be set
     * @return Builder
     */
    
    public CustomFieldLocalizedEnumValueBuilder label( final com.commercetools.importapi.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }
    
    

    /**
     *  <p>Key of the value used as a programmatic identifier.</p>
     * @return key
     */
    
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>Descriptive localized label of the value.</p>
     * @return label
     */
    
    
    public com.commercetools.importapi.models.common.LocalizedString getLabel(){
        return this.label;
    }

    /**
     * builds CustomFieldLocalizedEnumValue with checking for non-null required values
     * @return CustomFieldLocalizedEnumValue
     */
    public CustomFieldLocalizedEnumValue build() {
        Objects.requireNonNull(key, CustomFieldLocalizedEnumValue.class + ": key is missing");
        Objects.requireNonNull(label, CustomFieldLocalizedEnumValue.class + ": label is missing");
        return new CustomFieldLocalizedEnumValueImpl(key, label);
    }
    
    /**
     * builds CustomFieldLocalizedEnumValue without checking for non-null required values
     * @return CustomFieldLocalizedEnumValue
     */
    public CustomFieldLocalizedEnumValue buildUnchecked() {
        return new CustomFieldLocalizedEnumValueImpl(key, label);
    }

    /**
     * factory method for an instance of CustomFieldLocalizedEnumValueBuilder
     * @return builder 
     */
    public static CustomFieldLocalizedEnumValueBuilder of() {
        return new CustomFieldLocalizedEnumValueBuilder();
    }

    /**
     * create builder for CustomFieldLocalizedEnumValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldLocalizedEnumValueBuilder of(final CustomFieldLocalizedEnumValue template) {
        CustomFieldLocalizedEnumValueBuilder builder = new CustomFieldLocalizedEnumValueBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
