package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Price;
import com.commercetools.history.models.change.SetDiscountedPriceChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDiscountedPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDiscountedPriceChange setDiscountedPriceChange = SetDiscountedPriceChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .variant("{variant}")
 *             .priceId("{priceId}")
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
public class SetDiscountedPriceChangeBuilder implements Builder<SetDiscountedPriceChange> {

    
    
    private String change;
    
    
    
    private String catalogData;
    
    
    
    private String variant;
    
    
    
    private String priceId;
    
    
    
    private com.commercetools.history.models.common.Price previousValue;
    
    
    
    private com.commercetools.history.models.common.Price nextValue;

    
    /**
     *  <p>Update action for <code>setDiscountedPrice</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetDiscountedPriceChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the catalogData
     * @param catalogData value to be set
     * @return Builder
     */
    
    public SetDiscountedPriceChangeBuilder catalogData( final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }
    
    
    
    
    /**
     * set the value to the variant
     * @param variant value to be set
     * @return Builder
     */
    
    public SetDiscountedPriceChangeBuilder variant( final String variant) {
        this.variant = variant;
        return this;
    }
    
    
    
    
    /**
     * set the value to the priceId
     * @param priceId value to be set
     * @return Builder
     */
    
    public SetDiscountedPriceChangeBuilder priceId( final String priceId) {
        this.priceId = priceId;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetDiscountedPriceChangeBuilder previousValue(Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetDiscountedPriceChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetDiscountedPriceChangeBuilder previousValue( final com.commercetools.history.models.common.Price previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetDiscountedPriceChangeBuilder nextValue(Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetDiscountedPriceChangeBuilder withNextValue(Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetDiscountedPriceChangeBuilder nextValue( final com.commercetools.history.models.common.Price nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>setDiscountedPrice</code></p>
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
     * value of priceId}
     * @return priceId
     */
    
    
    public String getPriceId(){
        return this.priceId;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.Price getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.Price getNextValue(){
        return this.nextValue;
    }

    /**
     * builds SetDiscountedPriceChange with checking for non-null required values
     * @return SetDiscountedPriceChange
     */
    public SetDiscountedPriceChange build() {
        Objects.requireNonNull(change, SetDiscountedPriceChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetDiscountedPriceChange.class + ": catalogData is missing");
        Objects.requireNonNull(variant, SetDiscountedPriceChange.class + ": variant is missing");
        Objects.requireNonNull(priceId, SetDiscountedPriceChange.class + ": priceId is missing");
        Objects.requireNonNull(previousValue, SetDiscountedPriceChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetDiscountedPriceChange.class + ": nextValue is missing");
        return new SetDiscountedPriceChangeImpl(change, catalogData, variant, priceId, previousValue, nextValue);
    }
    
    /**
     * builds SetDiscountedPriceChange without checking for non-null required values
     * @return SetDiscountedPriceChange
     */
    public SetDiscountedPriceChange buildUnchecked() {
        return new SetDiscountedPriceChangeImpl(change, catalogData, variant, priceId, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetDiscountedPriceChangeBuilder
     * @return builder 
     */
    public static SetDiscountedPriceChangeBuilder of() {
        return new SetDiscountedPriceChangeBuilder();
    }

    /**
     * create builder for SetDiscountedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDiscountedPriceChangeBuilder of(final SetDiscountedPriceChange template) {
        SetDiscountedPriceChangeBuilder builder = new SetDiscountedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.variant = template.getVariant();
        builder.priceId = template.getPriceId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
