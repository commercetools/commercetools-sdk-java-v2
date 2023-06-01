package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.change.ChangeSlugChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeSlugChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeSlugChange changeSlugChange = ChangeSlugChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeSlugChangeBuilder implements Builder<ChangeSlugChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.LocalizedString previousValue;
    
    
    
    private com.commercetools.history.models.common.LocalizedString nextValue;

    
    /**
     *  <p>Shape of the action for <code>changeSlug</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public ChangeSlugChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public ChangeSlugChangeBuilder previousValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public ChangeSlugChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeSlugChangeBuilder previousValue( final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public ChangeSlugChangeBuilder nextValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public ChangeSlugChangeBuilder withNextValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeSlugChangeBuilder nextValue( final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Shape of the action for <code>changeSlug</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.LocalizedString getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.LocalizedString getNextValue(){
        return this.nextValue;
    }

    /**
     * builds ChangeSlugChange with checking for non-null required values
     * @return ChangeSlugChange
     */
    public ChangeSlugChange build() {
        Objects.requireNonNull(change, ChangeSlugChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeSlugChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeSlugChange.class + ": nextValue is missing");
        return new ChangeSlugChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds ChangeSlugChange without checking for non-null required values
     * @return ChangeSlugChange
     */
    public ChangeSlugChange buildUnchecked() {
        return new ChangeSlugChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeSlugChangeBuilder
     * @return builder 
     */
    public static ChangeSlugChangeBuilder of() {
        return new ChangeSlugChangeBuilder();
    }

    /**
     * create builder for ChangeSlugChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeSlugChangeBuilder of(final ChangeSlugChange template) {
        ChangeSlugChangeBuilder builder = new ChangeSlugChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
