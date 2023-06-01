package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.TextLineItemValue;
import com.commercetools.history.models.change.ChangeTextLineItemsOrderChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTextLineItemsOrderChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTextLineItemsOrderChange changeTextLineItemsOrderChange = ChangeTextLineItemsOrderChange.builder()
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
public class ChangeTextLineItemsOrderChangeBuilder implements Builder<ChangeTextLineItemsOrderChange> {

    
    
    private String change;
    
    
    
    private java.util.List<com.commercetools.history.models.change_value.TextLineItemValue> previousValue;
    
    
    
    private java.util.List<com.commercetools.history.models.change_value.TextLineItemValue> nextValue;

    
    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */
    
    public ChangeTextLineItemsOrderChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    /**
     * set values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeTextLineItemsOrderChangeBuilder previousValue( final com.commercetools.history.models.change_value.TextLineItemValue ...previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }
    
    /**
     * set value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeTextLineItemsOrderChangeBuilder previousValue( final java.util.List<com.commercetools.history.models.change_value.TextLineItemValue> previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    /**
     * add values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeTextLineItemsOrderChangeBuilder plusPreviousValue( final com.commercetools.history.models.change_value.TextLineItemValue ...previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }
    
    
    
    /**
     * add the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public ChangeTextLineItemsOrderChangeBuilder plusPreviousValue(Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValueBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public ChangeTextLineItemsOrderChangeBuilder withPreviousValue(Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValueBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public ChangeTextLineItemsOrderChangeBuilder addPreviousValue(Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValue> builder) {
        return plusPreviousValue(builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of()));
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public ChangeTextLineItemsOrderChangeBuilder setPreviousValue(Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValue> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of()));
    }
                    
    
    /**
     * set values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeTextLineItemsOrderChangeBuilder nextValue( final com.commercetools.history.models.change_value.TextLineItemValue ...nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }
    
    /**
     * set value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeTextLineItemsOrderChangeBuilder nextValue( final java.util.List<com.commercetools.history.models.change_value.TextLineItemValue> nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    /**
     * add values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeTextLineItemsOrderChangeBuilder plusNextValue( final com.commercetools.history.models.change_value.TextLineItemValue ...nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }
    
    
    
    /**
     * add the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public ChangeTextLineItemsOrderChangeBuilder plusNextValue(Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValueBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public ChangeTextLineItemsOrderChangeBuilder withNextValue(Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValueBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public ChangeTextLineItemsOrderChangeBuilder addNextValue(Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValue> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of()));
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public ChangeTextLineItemsOrderChangeBuilder setNextValue(Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValue> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of()));
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
    
    
    public java.util.List<com.commercetools.history.models.change_value.TextLineItemValue> getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public java.util.List<com.commercetools.history.models.change_value.TextLineItemValue> getNextValue(){
        return this.nextValue;
    }

    /**
     * builds ChangeTextLineItemsOrderChange with checking for non-null required values
     * @return ChangeTextLineItemsOrderChange
     */
    public ChangeTextLineItemsOrderChange build() {
        Objects.requireNonNull(change, ChangeTextLineItemsOrderChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeTextLineItemsOrderChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeTextLineItemsOrderChange.class + ": nextValue is missing");
        return new ChangeTextLineItemsOrderChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds ChangeTextLineItemsOrderChange without checking for non-null required values
     * @return ChangeTextLineItemsOrderChange
     */
    public ChangeTextLineItemsOrderChange buildUnchecked() {
        return new ChangeTextLineItemsOrderChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeTextLineItemsOrderChangeBuilder
     * @return builder 
     */
    public static ChangeTextLineItemsOrderChangeBuilder of() {
        return new ChangeTextLineItemsOrderChangeBuilder();
    }

    /**
     * create builder for ChangeTextLineItemsOrderChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTextLineItemsOrderChangeBuilder of(final ChangeTextLineItemsOrderChange template) {
        ChangeTextLineItemsOrderChangeBuilder builder = new ChangeTextLineItemsOrderChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
