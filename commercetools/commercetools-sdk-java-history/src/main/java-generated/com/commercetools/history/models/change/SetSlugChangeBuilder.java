package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.change.SetSlugChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetSlugChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetSlugChange setSlugChange = SetSlugChange.builder()
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
public class SetSlugChangeBuilder implements Builder<SetSlugChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.LocalizedString previousValue;
    
    
    
    private com.commercetools.history.models.common.LocalizedString nextValue;

    
    /**
     *  <p>Shape of the action for <code>setSlug</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetSlugChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetSlugChangeBuilder previousValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetSlugChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetSlugChangeBuilder previousValue( final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetSlugChangeBuilder nextValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetSlugChangeBuilder withNextValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetSlugChangeBuilder nextValue( final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Shape of the action for <code>setSlug</code></p>
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
     * builds SetSlugChange with checking for non-null required values
     * @return SetSlugChange
     */
    public SetSlugChange build() {
        Objects.requireNonNull(change, SetSlugChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetSlugChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetSlugChange.class + ": nextValue is missing");
        return new SetSlugChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds SetSlugChange without checking for non-null required values
     * @return SetSlugChange
     */
    public SetSlugChange buildUnchecked() {
        return new SetSlugChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetSlugChangeBuilder
     * @return builder 
     */
    public static SetSlugChangeBuilder of() {
        return new SetSlugChangeBuilder();
    }

    /**
     * create builder for SetSlugChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetSlugChangeBuilder of(final SetSlugChange template) {
        SetSlugChangeBuilder builder = new SetSlugChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
