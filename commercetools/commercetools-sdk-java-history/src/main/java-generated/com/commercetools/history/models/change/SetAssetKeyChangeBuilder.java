package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.AssetChangeValue;
import com.commercetools.history.models.change.SetAssetKeyChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAssetKeyChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAssetKeyChange setAssetKeyChange = SetAssetKeyChange.builder()
 *             .change("{change}")
 *             .asset(assetBuilder -> assetBuilder)
 *             .nextValue("{nextValue}")
 *             .previousValue("{previousValue}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetAssetKeyChangeBuilder implements Builder<SetAssetKeyChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.change_value.AssetChangeValue asset;
    
    
    
    private String nextValue;
    
    
    
    private String previousValue;

    
    /**
     *  <p>Update action for <code>setAssetKey</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetAssetKeyChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the asset using the builder function
     * @param builder function to build the asset value
     * @return Builder
     */
    
    public SetAssetKeyChangeBuilder asset(Function<com.commercetools.history.models.change_value.AssetChangeValueBuilder, com.commercetools.history.models.change_value.AssetChangeValueBuilder> builder) {
        this.asset = builder.apply(com.commercetools.history.models.change_value.AssetChangeValueBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the asset using the builder function
     * @param builder function to build the asset value
     * @return Builder
     */
    
    public SetAssetKeyChangeBuilder withAsset(Function<com.commercetools.history.models.change_value.AssetChangeValueBuilder, com.commercetools.history.models.change_value.AssetChangeValue> builder) {
        this.asset = builder.apply(com.commercetools.history.models.change_value.AssetChangeValueBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the asset
     * @param asset value to be set
     * @return Builder
     */
    
    public SetAssetKeyChangeBuilder asset( final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.asset = asset;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetAssetKeyChangeBuilder nextValue( final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetAssetKeyChangeBuilder previousValue( final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>setAssetKey</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of asset}
     * @return asset
     */
    
    
    public com.commercetools.history.models.change_value.AssetChangeValue getAsset(){
        return this.asset;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public String getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public String getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds SetAssetKeyChange with checking for non-null required values
     * @return SetAssetKeyChange
     */
    public SetAssetKeyChange build() {
        Objects.requireNonNull(change, SetAssetKeyChange.class + ": change is missing");
        Objects.requireNonNull(asset, SetAssetKeyChange.class + ": asset is missing");
        Objects.requireNonNull(nextValue, SetAssetKeyChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetAssetKeyChange.class + ": previousValue is missing");
        return new SetAssetKeyChangeImpl(change, asset, nextValue, previousValue);
    }
    
    /**
     * builds SetAssetKeyChange without checking for non-null required values
     * @return SetAssetKeyChange
     */
    public SetAssetKeyChange buildUnchecked() {
        return new SetAssetKeyChangeImpl(change, asset, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetAssetKeyChangeBuilder
     * @return builder 
     */
    public static SetAssetKeyChangeBuilder of() {
        return new SetAssetKeyChangeBuilder();
    }

    /**
     * create builder for SetAssetKeyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAssetKeyChangeBuilder of(final SetAssetKeyChange template) {
        SetAssetKeyChangeBuilder builder = new SetAssetKeyChangeBuilder();
        builder.change = template.getChange();
        builder.asset = template.getAsset();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
