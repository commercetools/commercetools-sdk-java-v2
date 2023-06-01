package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Asset;
import com.commercetools.history.models.change.AddAssetChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddAssetChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddAssetChange addAssetChange = AddAssetChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AddAssetChangeBuilder implements Builder<AddAssetChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.Asset nextValue;
    
    
    
    private com.commercetools.history.models.common.Asset previousValue;

    
    /**
     *  <p>Update action for <code>addAsset</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public AddAssetChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public AddAssetChangeBuilder nextValue(Function<com.commercetools.history.models.common.AssetBuilder, com.commercetools.history.models.common.AssetBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AssetBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public AddAssetChangeBuilder withNextValue(Function<com.commercetools.history.models.common.AssetBuilder, com.commercetools.history.models.common.Asset> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AssetBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public AddAssetChangeBuilder nextValue( final com.commercetools.history.models.common.Asset nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public AddAssetChangeBuilder previousValue(Function<com.commercetools.history.models.common.AssetBuilder, com.commercetools.history.models.common.AssetBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AssetBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public AddAssetChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.AssetBuilder, com.commercetools.history.models.common.Asset> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AssetBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public AddAssetChangeBuilder previousValue( final com.commercetools.history.models.common.Asset previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>addAsset</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.Asset getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.Asset getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds AddAssetChange with checking for non-null required values
     * @return AddAssetChange
     */
    public AddAssetChange build() {
        Objects.requireNonNull(change, AddAssetChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddAssetChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, AddAssetChange.class + ": previousValue is missing");
        return new AddAssetChangeImpl(change, nextValue, previousValue);
    }
    
    /**
     * builds AddAssetChange without checking for non-null required values
     * @return AddAssetChange
     */
    public AddAssetChange buildUnchecked() {
        return new AddAssetChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of AddAssetChangeBuilder
     * @return builder 
     */
    public static AddAssetChangeBuilder of() {
        return new AddAssetChangeBuilder();
    }

    /**
     * create builder for AddAssetChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddAssetChangeBuilder of(final AddAssetChange template) {
        AddAssetChangeBuilder builder = new AddAssetChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
