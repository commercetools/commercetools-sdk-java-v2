package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.StoreCountry;
import com.commercetools.history.models.change.SetCountriesChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCountriesChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCountriesChange setCountriesChange = SetCountriesChange.builder()
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
public class SetCountriesChangeBuilder implements Builder<SetCountriesChange> {

    
    
    private String change;
    
    
    
    private java.util.List<com.commercetools.history.models.common.StoreCountry> previousValue;
    
    
    
    private java.util.List<com.commercetools.history.models.common.StoreCountry> nextValue;

    
    /**
     *  <p>Update action for <code>setCountries</code>.</p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetCountriesChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    /**
     *  <p>Countries defined for the Store prior to the update action.</p>
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetCountriesChangeBuilder previousValue( final com.commercetools.history.models.common.StoreCountry ...previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }
    
    /**
     *  <p>Countries defined for the Store prior to the update action.</p>
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetCountriesChangeBuilder previousValue( final java.util.List<com.commercetools.history.models.common.StoreCountry> previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    /**
     *  <p>Countries defined for the Store prior to the update action.</p>
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetCountriesChangeBuilder plusPreviousValue( final com.commercetools.history.models.common.StoreCountry ...previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }
    
    
    
    /**
     *  <p>Countries defined for the Store prior to the update action.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetCountriesChangeBuilder plusPreviousValue(Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountryBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Countries defined for the Store prior to the update action.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetCountriesChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountryBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Countries defined for the Store prior to the update action.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetCountriesChangeBuilder addPreviousValue(Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountry> builder) {
        return plusPreviousValue(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()));
    }
    
    /**
     *  <p>Countries defined for the Store prior to the update action.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetCountriesChangeBuilder setPreviousValue(Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountry> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()));
    }
                    
    
    /**
     *  <p>Countries defined for the Store after the update action.</p>
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetCountriesChangeBuilder nextValue( final com.commercetools.history.models.common.StoreCountry ...nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }
    
    /**
     *  <p>Countries defined for the Store after the update action.</p>
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetCountriesChangeBuilder nextValue( final java.util.List<com.commercetools.history.models.common.StoreCountry> nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    /**
     *  <p>Countries defined for the Store after the update action.</p>
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetCountriesChangeBuilder plusNextValue( final com.commercetools.history.models.common.StoreCountry ...nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }
    
    
    
    /**
     *  <p>Countries defined for the Store after the update action.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetCountriesChangeBuilder plusNextValue(Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountryBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Countries defined for the Store after the update action.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetCountriesChangeBuilder withNextValue(Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountryBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Countries defined for the Store after the update action.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetCountriesChangeBuilder addNextValue(Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountry> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()));
    }
    
    /**
     *  <p>Countries defined for the Store after the update action.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetCountriesChangeBuilder setNextValue(Function<com.commercetools.history.models.common.StoreCountryBuilder, com.commercetools.history.models.common.StoreCountry> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.StoreCountryBuilder.of()));
    }
                    

    /**
     *  <p>Update action for <code>setCountries</code>.</p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *  <p>Countries defined for the Store prior to the update action.</p>
     * @return previousValue
     */
    
    
    public java.util.List<com.commercetools.history.models.common.StoreCountry> getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     *  <p>Countries defined for the Store after the update action.</p>
     * @return nextValue
     */
    
    
    public java.util.List<com.commercetools.history.models.common.StoreCountry> getNextValue(){
        return this.nextValue;
    }

    /**
     * builds SetCountriesChange with checking for non-null required values
     * @return SetCountriesChange
     */
    public SetCountriesChange build() {
        Objects.requireNonNull(change, SetCountriesChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetCountriesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCountriesChange.class + ": nextValue is missing");
        return new SetCountriesChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds SetCountriesChange without checking for non-null required values
     * @return SetCountriesChange
     */
    public SetCountriesChange buildUnchecked() {
        return new SetCountriesChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetCountriesChangeBuilder
     * @return builder 
     */
    public static SetCountriesChangeBuilder of() {
        return new SetCountriesChangeBuilder();
    }

    /**
     * create builder for SetCountriesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCountriesChangeBuilder of(final SetCountriesChange template) {
        SetCountriesChangeBuilder builder = new SetCountriesChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
