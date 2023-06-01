package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.change.SetNameChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetNameChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetNameChange setNameChange = SetNameChange.builder()
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
public class SetNameChangeBuilder implements Builder<SetNameChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.LocalizedString previousValue;
    
    
    
    private com.commercetools.history.models.common.LocalizedString nextValue;

    
    /**
     *  <p>Shape of the action for <code>setName</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetNameChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetNameChangeBuilder previousValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetNameChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetNameChangeBuilder previousValue( final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetNameChangeBuilder nextValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetNameChangeBuilder withNextValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetNameChangeBuilder nextValue( final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Shape of the action for <code>setName</code></p>
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
     * builds SetNameChange with checking for non-null required values
     * @return SetNameChange
     */
    public SetNameChange build() {
        Objects.requireNonNull(change, SetNameChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetNameChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetNameChange.class + ": nextValue is missing");
        return new SetNameChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds SetNameChange without checking for non-null required values
     * @return SetNameChange
     */
    public SetNameChange buildUnchecked() {
        return new SetNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetNameChangeBuilder
     * @return builder 
     */
    public static SetNameChangeBuilder of() {
        return new SetNameChangeBuilder();
    }

    /**
     * create builder for SetNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetNameChangeBuilder of(final SetNameChange template) {
        SetNameChangeBuilder builder = new SetNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
