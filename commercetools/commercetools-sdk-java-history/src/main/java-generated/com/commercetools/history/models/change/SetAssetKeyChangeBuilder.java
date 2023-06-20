
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

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
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .asset(assetBuilder -> assetBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAssetKeyChangeBuilder implements Builder<SetAssetKeyChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetAssetKeyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAssetKeyChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAssetKeyChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Information about the updated Asset.</p>
     * @param builder function to build the asset value
     * @return Builder
     */

    public SetAssetKeyChangeBuilder asset(
            Function<com.commercetools.history.models.change_value.AssetChangeValueBuilder, com.commercetools.history.models.change_value.AssetChangeValueBuilder> builder) {
        this.asset = builder.apply(com.commercetools.history.models.change_value.AssetChangeValueBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Information about the updated Asset.</p>
     * @param builder function to build the asset value
     * @return Builder
     */

    public SetAssetKeyChangeBuilder withAsset(
            Function<com.commercetools.history.models.change_value.AssetChangeValueBuilder, com.commercetools.history.models.change_value.AssetChangeValue> builder) {
        this.asset = builder.apply(com.commercetools.history.models.change_value.AssetChangeValueBuilder.of());
        return this;
    }

    /**
     *  <p>Information about the updated Asset.</p>
     * @param asset value to be set
     * @return Builder
     */

    public SetAssetKeyChangeBuilder asset(final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.asset = asset;
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Information about the updated Asset.</p>
     * @return asset
     */

    public com.commercetools.history.models.change_value.AssetChangeValue getAsset() {
        return this.asset;
    }

    /**
     * builds SetAssetKeyChange with checking for non-null required values
     * @return SetAssetKeyChange
     */
    public SetAssetKeyChange build() {
        Objects.requireNonNull(change, SetAssetKeyChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetAssetKeyChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetAssetKeyChange.class + ": nextValue is missing");
        Objects.requireNonNull(asset, SetAssetKeyChange.class + ": asset is missing");
        return new SetAssetKeyChangeImpl(change, previousValue, nextValue, asset);
    }

    /**
     * builds SetAssetKeyChange without checking for non-null required values
     * @return SetAssetKeyChange
     */
    public SetAssetKeyChange buildUnchecked() {
        return new SetAssetKeyChangeImpl(change, previousValue, nextValue, asset);
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
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.asset = template.getAsset();
        return builder;
    }

}
