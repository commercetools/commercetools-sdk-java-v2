package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.ProductVariantAvailability;
import com.commercetools.history.models.change.SetVariantAvailabilityChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetVariantAvailabilityChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetVariantAvailabilityChange setVariantAvailabilityChange = SetVariantAvailabilityChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .variant("{variant}")
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
public class SetVariantAvailabilityChangeBuilder implements Builder<SetVariantAvailabilityChange> {

    
    
    private String change;
    
    
    
    private String catalogData;
    
    
    
    private String variant;
    
    
    
    private com.commercetools.history.models.common.ProductVariantAvailability previousValue;
    
    
    
    private com.commercetools.history.models.common.ProductVariantAvailability nextValue;

    
    /**
     *  <p>Update action for <code>setVariantAvailability</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetVariantAvailabilityChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the catalogData
     * @param catalogData value to be set
     * @return Builder
     */
    
    public SetVariantAvailabilityChangeBuilder catalogData( final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }
    
    
    
    
    /**
     * set the value to the variant
     * @param variant value to be set
     * @return Builder
     */
    
    public SetVariantAvailabilityChangeBuilder variant( final String variant) {
        this.variant = variant;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetVariantAvailabilityChangeBuilder previousValue(Function<com.commercetools.history.models.common.ProductVariantAvailabilityBuilder, com.commercetools.history.models.common.ProductVariantAvailabilityBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ProductVariantAvailabilityBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetVariantAvailabilityChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.ProductVariantAvailabilityBuilder, com.commercetools.history.models.common.ProductVariantAvailability> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ProductVariantAvailabilityBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetVariantAvailabilityChangeBuilder previousValue( final com.commercetools.history.models.common.ProductVariantAvailability previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetVariantAvailabilityChangeBuilder nextValue(Function<com.commercetools.history.models.common.ProductVariantAvailabilityBuilder, com.commercetools.history.models.common.ProductVariantAvailabilityBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ProductVariantAvailabilityBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetVariantAvailabilityChangeBuilder withNextValue(Function<com.commercetools.history.models.common.ProductVariantAvailabilityBuilder, com.commercetools.history.models.common.ProductVariantAvailability> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ProductVariantAvailabilityBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetVariantAvailabilityChangeBuilder nextValue( final com.commercetools.history.models.common.ProductVariantAvailability nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>setVariantAvailability</code></p>
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
    
    
    public com.commercetools.history.models.common.ProductVariantAvailability getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.ProductVariantAvailability getNextValue(){
        return this.nextValue;
    }

    /**
     * builds SetVariantAvailabilityChange with checking for non-null required values
     * @return SetVariantAvailabilityChange
     */
    public SetVariantAvailabilityChange build() {
        Objects.requireNonNull(change, SetVariantAvailabilityChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetVariantAvailabilityChange.class + ": catalogData is missing");
        Objects.requireNonNull(variant, SetVariantAvailabilityChange.class + ": variant is missing");
        Objects.requireNonNull(previousValue, SetVariantAvailabilityChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetVariantAvailabilityChange.class + ": nextValue is missing");
        return new SetVariantAvailabilityChangeImpl(change, catalogData, variant, previousValue, nextValue);
    }
    
    /**
     * builds SetVariantAvailabilityChange without checking for non-null required values
     * @return SetVariantAvailabilityChange
     */
    public SetVariantAvailabilityChange buildUnchecked() {
        return new SetVariantAvailabilityChangeImpl(change, catalogData, variant, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetVariantAvailabilityChangeBuilder
     * @return builder 
     */
    public static SetVariantAvailabilityChangeBuilder of() {
        return new SetVariantAvailabilityChangeBuilder();
    }

    /**
     * create builder for SetVariantAvailabilityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetVariantAvailabilityChangeBuilder of(final SetVariantAvailabilityChange template) {
        SetVariantAvailabilityChangeBuilder builder = new SetVariantAvailabilityChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.variant = template.getVariant();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
