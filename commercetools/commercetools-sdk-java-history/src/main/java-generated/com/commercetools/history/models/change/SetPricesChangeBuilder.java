package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Price;
import com.commercetools.history.models.change.SetPricesChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetPricesChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPricesChange setPricesChange = SetPricesChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .variant("{variant}")
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
public class SetPricesChangeBuilder implements Builder<SetPricesChange> {

    
    
    private String change;
    
    
    
    private String catalogData;
    
    
    
    private String variant;
    
    
    
    private java.util.List<com.commercetools.history.models.common.Price> previousValue;
    
    
    
    private java.util.List<com.commercetools.history.models.common.Price> nextValue;

    
    /**
     *  <p>Update action for <code>setPrices</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetPricesChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the catalogData
     * @param catalogData value to be set
     * @return Builder
     */
    
    public SetPricesChangeBuilder catalogData( final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }
    
    
    
    
    /**
     * set the value to the variant
     * @param variant value to be set
     * @return Builder
     */
    
    public SetPricesChangeBuilder variant( final String variant) {
        this.variant = variant;
        return this;
    }
    
    
    
    /**
     * set values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetPricesChangeBuilder previousValue( final com.commercetools.history.models.common.Price ...previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }
    
    /**
     * set value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetPricesChangeBuilder previousValue( final java.util.List<com.commercetools.history.models.common.Price> previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    /**
     * add values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetPricesChangeBuilder plusPreviousValue( final com.commercetools.history.models.common.Price ...previousValue) {
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
    
    public SetPricesChangeBuilder plusPreviousValue(Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetPricesChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetPricesChangeBuilder addPreviousValue(Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        return plusPreviousValue(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()));
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetPricesChangeBuilder setPreviousValue(Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()));
    }
                    
    
    /**
     * set values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetPricesChangeBuilder nextValue( final com.commercetools.history.models.common.Price ...nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }
    
    /**
     * set value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetPricesChangeBuilder nextValue( final java.util.List<com.commercetools.history.models.common.Price> nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    /**
     * add values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetPricesChangeBuilder plusNextValue( final com.commercetools.history.models.common.Price ...nextValue) {
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
    
    public SetPricesChangeBuilder plusNextValue(Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetPricesChangeBuilder withNextValue(Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetPricesChangeBuilder addNextValue(Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()));
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetPricesChangeBuilder setNextValue(Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()));
    }
                    

    /**
     *  <p>Update action for <code>setPrices</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of catalogData}
     * @return catalogData
     */
    
    
    public String getCatalogData(){
        return this.catalogData;
    }
    
    /**
     * value of variant}
     * @return variant
     */
    
    
    public String getVariant(){
        return this.variant;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public java.util.List<com.commercetools.history.models.common.Price> getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public java.util.List<com.commercetools.history.models.common.Price> getNextValue(){
        return this.nextValue;
    }

    /**
     * builds SetPricesChange with checking for non-null required values
     * @return SetPricesChange
     */
    public SetPricesChange build() {
        Objects.requireNonNull(change, SetPricesChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetPricesChange.class + ": catalogData is missing");
        Objects.requireNonNull(variant, SetPricesChange.class + ": variant is missing");
        Objects.requireNonNull(previousValue, SetPricesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetPricesChange.class + ": nextValue is missing");
        return new SetPricesChangeImpl(change, catalogData, variant, previousValue, nextValue);
    }
    
    /**
     * builds SetPricesChange without checking for non-null required values
     * @return SetPricesChange
     */
    public SetPricesChange buildUnchecked() {
        return new SetPricesChangeImpl(change, catalogData, variant, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetPricesChangeBuilder
     * @return builder 
     */
    public static SetPricesChangeBuilder of() {
        return new SetPricesChangeBuilder();
    }

    /**
     * create builder for SetPricesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPricesChangeBuilder of(final SetPricesChange template) {
        SetPricesChangeBuilder builder = new SetPricesChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.variant = template.getVariant();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
