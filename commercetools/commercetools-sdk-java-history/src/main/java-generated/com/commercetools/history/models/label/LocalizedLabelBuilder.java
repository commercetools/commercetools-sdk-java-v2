package com.commercetools.history.models.label;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.label.Label;
import com.commercetools.history.models.label.LocalizedLabel;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LocalizedLabelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizedLabel localizedLabel = LocalizedLabel.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class LocalizedLabelBuilder implements Builder<LocalizedLabel> {

    
    
    private com.commercetools.history.models.common.LocalizedString value;

    
    /**
     * set the value to the value using the builder function
     * @param builder function to build the value value
     * @return Builder
     */
    
    public LocalizedLabelBuilder value(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.value = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the value using the builder function
     * @param builder function to build the value value
     * @return Builder
     */
    
    public LocalizedLabelBuilder withValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.value = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */
    
    public LocalizedLabelBuilder value( final com.commercetools.history.models.common.LocalizedString value) {
        this.value = value;
        return this;
    }
    
    

    /**
     * value of value}
     * @return value
     */
    
    
    public com.commercetools.history.models.common.LocalizedString getValue(){
        return this.value;
    }

    /**
     * builds LocalizedLabel with checking for non-null required values
     * @return LocalizedLabel
     */
    public LocalizedLabel build() {
        Objects.requireNonNull(value, LocalizedLabel.class + ": value is missing");
        return new LocalizedLabelImpl(value);
    }
    
    /**
     * builds LocalizedLabel without checking for non-null required values
     * @return LocalizedLabel
     */
    public LocalizedLabel buildUnchecked() {
        return new LocalizedLabelImpl(value);
    }

    /**
     * factory method for an instance of LocalizedLabelBuilder
     * @return builder 
     */
    public static LocalizedLabelBuilder of() {
        return new LocalizedLabelBuilder();
    }

    /**
     * create builder for LocalizedLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizedLabelBuilder of(final LocalizedLabel template) {
        LocalizedLabelBuilder builder = new LocalizedLabelBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
