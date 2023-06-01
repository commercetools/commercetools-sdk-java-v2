package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.change.SetMetaTitleChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetMetaTitleChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMetaTitleChange setMetaTitleChange = SetMetaTitleChange.builder()
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
public class SetMetaTitleChangeBuilder implements Builder<SetMetaTitleChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.LocalizedString previousValue;
    
    
    
    private com.commercetools.history.models.common.LocalizedString nextValue;

    
    /**
     *  <p>Shape of the action for <code>setMetaTitle</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetMetaTitleChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetMetaTitleChangeBuilder previousValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetMetaTitleChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetMetaTitleChangeBuilder previousValue( final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetMetaTitleChangeBuilder nextValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetMetaTitleChangeBuilder withNextValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetMetaTitleChangeBuilder nextValue( final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Shape of the action for <code>setMetaTitle</code></p>
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
     * builds SetMetaTitleChange with checking for non-null required values
     * @return SetMetaTitleChange
     */
    public SetMetaTitleChange build() {
        Objects.requireNonNull(change, SetMetaTitleChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetMetaTitleChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetMetaTitleChange.class + ": nextValue is missing");
        return new SetMetaTitleChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds SetMetaTitleChange without checking for non-null required values
     * @return SetMetaTitleChange
     */
    public SetMetaTitleChange buildUnchecked() {
        return new SetMetaTitleChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetMetaTitleChangeBuilder
     * @return builder 
     */
    public static SetMetaTitleChangeBuilder of() {
        return new SetMetaTitleChangeBuilder();
    }

    /**
     * create builder for SetMetaTitleChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMetaTitleChangeBuilder of(final SetMetaTitleChange template) {
        SetMetaTitleChangeBuilder builder = new SetMetaTitleChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
