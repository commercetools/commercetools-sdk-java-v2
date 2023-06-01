package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.ChangeGroupsChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeGroupsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeGroupsChange changeGroupsChange = ChangeGroupsChange.builder()
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
public class ChangeGroupsChangeBuilder implements Builder<ChangeGroupsChange> {

    
    
    private String change;
    
    
    
    private java.util.List<String> previousValue;
    
    
    
    private java.util.List<String> nextValue;

    
    /**
     *  <p>Update action for <code>changeGroups</code> on stores</p>
     * @param change value to be set
     * @return Builder
     */
    
    public ChangeGroupsChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    /**
     * set values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeGroupsChangeBuilder previousValue( final String ...previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }
    
    /**
     * set value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeGroupsChangeBuilder previousValue( final java.util.List<String> previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    /**
     * add values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeGroupsChangeBuilder plusPreviousValue( final String ...previousValue) {
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
    
    public ChangeGroupsChangeBuilder nextValue( final String ...nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }
    
    /**
     * set value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeGroupsChangeBuilder nextValue( final java.util.List<String> nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    /**
     * add values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeGroupsChangeBuilder plusNextValue( final String ...nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }
    
    
    

    /**
     *  <p>Update action for <code>changeGroups</code> on stores</p>
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
     * builds ChangeGroupsChange with checking for non-null required values
     * @return ChangeGroupsChange
     */
    public ChangeGroupsChange build() {
        Objects.requireNonNull(change, ChangeGroupsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeGroupsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeGroupsChange.class + ": nextValue is missing");
        return new ChangeGroupsChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds ChangeGroupsChange without checking for non-null required values
     * @return ChangeGroupsChange
     */
    public ChangeGroupsChange buildUnchecked() {
        return new ChangeGroupsChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeGroupsChangeBuilder
     * @return builder 
     */
    public static ChangeGroupsChangeBuilder of() {
        return new ChangeGroupsChangeBuilder();
    }

    /**
     * create builder for ChangeGroupsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeGroupsChangeBuilder of(final ChangeGroupsChange template) {
        ChangeGroupsChangeBuilder builder = new ChangeGroupsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
