package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.ChannelRole;
import com.commercetools.history.models.change.AddChannelRolesChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddChannelRolesChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddChannelRolesChange addChannelRolesChange = AddChannelRolesChange.builder()
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
public class AddChannelRolesChangeBuilder implements Builder<AddChannelRolesChange> {

    
    
    private String change;
    
    
    
    private java.util.List<com.commercetools.history.models.common.ChannelRole> previousValue;
    
    
    
    private java.util.List<com.commercetools.history.models.common.ChannelRole> nextValue;

    
    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */
    
    public AddChannelRolesChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    /**
     * set values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public AddChannelRolesChangeBuilder previousValue( final com.commercetools.history.models.common.ChannelRole ...previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }
    
    /**
     * set value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public AddChannelRolesChangeBuilder previousValue( final java.util.List<com.commercetools.history.models.common.ChannelRole> previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    /**
     * add values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public AddChannelRolesChangeBuilder plusPreviousValue( final com.commercetools.history.models.common.ChannelRole ...previousValue) {
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
    
    public AddChannelRolesChangeBuilder nextValue( final com.commercetools.history.models.common.ChannelRole ...nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }
    
    /**
     * set value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public AddChannelRolesChangeBuilder nextValue( final java.util.List<com.commercetools.history.models.common.ChannelRole> nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    /**
     * add values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public AddChannelRolesChangeBuilder plusNextValue( final com.commercetools.history.models.common.ChannelRole ...nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }
    
    
    

    /**
     * value of change}
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public java.util.List<com.commercetools.history.models.common.ChannelRole> getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public java.util.List<com.commercetools.history.models.common.ChannelRole> getNextValue(){
        return this.nextValue;
    }

    /**
     * builds AddChannelRolesChange with checking for non-null required values
     * @return AddChannelRolesChange
     */
    public AddChannelRolesChange build() {
        Objects.requireNonNull(change, AddChannelRolesChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, AddChannelRolesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, AddChannelRolesChange.class + ": nextValue is missing");
        return new AddChannelRolesChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds AddChannelRolesChange without checking for non-null required values
     * @return AddChannelRolesChange
     */
    public AddChannelRolesChange buildUnchecked() {
        return new AddChannelRolesChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of AddChannelRolesChangeBuilder
     * @return builder 
     */
    public static AddChannelRolesChangeBuilder of() {
        return new AddChannelRolesChangeBuilder();
    }

    /**
     * create builder for AddChannelRolesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddChannelRolesChangeBuilder of(final AddChannelRolesChange template) {
        AddChannelRolesChangeBuilder builder = new AddChannelRolesChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
