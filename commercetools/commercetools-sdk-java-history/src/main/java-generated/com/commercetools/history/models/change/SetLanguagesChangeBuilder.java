package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetLanguagesChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLanguagesChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLanguagesChange setLanguagesChange = SetLanguagesChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetLanguagesChangeBuilder implements Builder<SetLanguagesChange> {

    
    
    private String change;
    
    
    
    private java.util.List<String> previousValue;
    
    
    
    private java.util.List<String> nextValue;

    
    /**
     *  <p>Update action for <code>setLanguages</code> on stores</p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetLanguagesChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    /**
     * set values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetLanguagesChangeBuilder previousValue( final String ...previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }
    
    /**
     * set value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetLanguagesChangeBuilder previousValue( final java.util.List<String> previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    /**
     * add values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetLanguagesChangeBuilder plusPreviousValue( final String ...previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }
    
    
    
    
    /**
     * set values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetLanguagesChangeBuilder nextValue( final String ...nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }
    
    /**
     * set value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetLanguagesChangeBuilder nextValue( final java.util.List<String> nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    /**
     * add values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetLanguagesChangeBuilder plusNextValue( final String ...nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }
    
    
    

    /**
     *  <p>Update action for <code>setLanguages</code> on stores</p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public java.util.List<String> getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public java.util.List<String> getNextValue(){
        return this.nextValue;
    }

    /**
     * builds SetLanguagesChange with checking for non-null required values
     * @return SetLanguagesChange
     */
    public SetLanguagesChange build() {
        Objects.requireNonNull(change, SetLanguagesChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetLanguagesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetLanguagesChange.class + ": nextValue is missing");
        return new SetLanguagesChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds SetLanguagesChange without checking for non-null required values
     * @return SetLanguagesChange
     */
    public SetLanguagesChange buildUnchecked() {
        return new SetLanguagesChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetLanguagesChangeBuilder
     * @return builder 
     */
    public static SetLanguagesChangeBuilder of() {
        return new SetLanguagesChangeBuilder();
    }

    /**
     * create builder for SetLanguagesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLanguagesChangeBuilder of(final SetLanguagesChange template) {
        SetLanguagesChangeBuilder builder = new SetLanguagesChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
