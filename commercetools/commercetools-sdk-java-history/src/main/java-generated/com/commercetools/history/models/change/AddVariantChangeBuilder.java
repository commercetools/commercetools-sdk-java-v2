package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Variant;
import com.commercetools.history.models.change.AddVariantChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddVariantChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddVariantChange addVariantChange = AddVariantChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
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
public class AddVariantChangeBuilder implements Builder<AddVariantChange> {

    
    
    private String change;
    
    
    
    private String catalogData;
    
    
    
    private com.commercetools.history.models.common.Variant previousValue;
    
    
    
    private com.commercetools.history.models.common.Variant nextValue;

    
    /**
     *  <p>Update action for <code>addVariant</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public AddVariantChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the catalogData
     * @param catalogData value to be set
     * @return Builder
     */
    
    public AddVariantChangeBuilder catalogData( final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public AddVariantChangeBuilder previousValue(Function<com.commercetools.history.models.common.VariantBuilder, com.commercetools.history.models.common.VariantBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.VariantBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public AddVariantChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.VariantBuilder, com.commercetools.history.models.common.Variant> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.VariantBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public AddVariantChangeBuilder previousValue( final com.commercetools.history.models.common.Variant previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public AddVariantChangeBuilder nextValue(Function<com.commercetools.history.models.common.VariantBuilder, com.commercetools.history.models.common.VariantBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.VariantBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public AddVariantChangeBuilder withNextValue(Function<com.commercetools.history.models.common.VariantBuilder, com.commercetools.history.models.common.Variant> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.VariantBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public AddVariantChangeBuilder nextValue( final com.commercetools.history.models.common.Variant nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>addVariant</code></p>
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
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.Variant getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.Variant getNextValue(){
        return this.nextValue;
    }

    /**
     * builds AddVariantChange with checking for non-null required values
     * @return AddVariantChange
     */
    public AddVariantChange build() {
        Objects.requireNonNull(change, AddVariantChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, AddVariantChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, AddVariantChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, AddVariantChange.class + ": nextValue is missing");
        return new AddVariantChangeImpl(change, catalogData, previousValue, nextValue);
    }
    
    /**
     * builds AddVariantChange without checking for non-null required values
     * @return AddVariantChange
     */
    public AddVariantChange buildUnchecked() {
        return new AddVariantChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * factory method for an instance of AddVariantChangeBuilder
     * @return builder 
     */
    public static AddVariantChangeBuilder of() {
        return new AddVariantChangeBuilder();
    }

    /**
     * create builder for AddVariantChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddVariantChangeBuilder of(final AddVariantChange template) {
        AddVariantChangeBuilder builder = new AddVariantChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
