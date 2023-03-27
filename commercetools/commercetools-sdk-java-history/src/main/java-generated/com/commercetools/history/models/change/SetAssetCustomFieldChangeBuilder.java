
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAssetCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAssetCustomFieldChange setAssetCustomFieldChange = SetAssetCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .asset(assetBuilder -> assetBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAssetCustomFieldChangeBuilder implements Builder<SetAssetCustomFieldChange> {

    private String change;

    private String name;

    private String customTypeId;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    private java.lang.Object nextValue;

    private java.lang.Object previousValue;

    /**
     *  <p>Update action for <code>setAssetCustomField</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetAssetCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */

    public SetAssetCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     * set the value to the customTypeId
     * @param customTypeId value to be set
     * @return Builder
     */

    public SetAssetCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     * set the value to the asset using the builder function
     * @param builder function to build the asset value
     * @return Builder
     */

    public SetAssetCustomFieldChangeBuilder asset(
            Function<com.commercetools.history.models.change_value.AssetChangeValueBuilder, com.commercetools.history.models.change_value.AssetChangeValueBuilder> builder) {
        this.asset = builder.apply(com.commercetools.history.models.change_value.AssetChangeValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the asset
     * @param asset value to be set
     * @return Builder
     */

    public SetAssetCustomFieldChangeBuilder asset(
            final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.asset = asset;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAssetCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAssetCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setAssetCustomField</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of name}
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * value of customTypeId}
     * @return customTypeId
     */

    public String getCustomTypeId() {
        return this.customTypeId;
    }

    /**
     * value of asset}
     * @return asset
     */

    public com.commercetools.history.models.change_value.AssetChangeValue getAsset() {
        return this.asset;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetAssetCustomFieldChange with checking for non-null required values
     * @return SetAssetCustomFieldChange
     */
    public SetAssetCustomFieldChange build() {
        Objects.requireNonNull(change, SetAssetCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(name, SetAssetCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId, SetAssetCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(asset, SetAssetCustomFieldChange.class + ": asset is missing");
        Objects.requireNonNull(nextValue, SetAssetCustomFieldChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetAssetCustomFieldChange.class + ": previousValue is missing");
        return new SetAssetCustomFieldChangeImpl(change, name, customTypeId, asset, nextValue, previousValue);
    }

    /**
     * builds SetAssetCustomFieldChange without checking for non-null required values
     * @return SetAssetCustomFieldChange
     */
    public SetAssetCustomFieldChange buildUnchecked() {
        return new SetAssetCustomFieldChangeImpl(change, name, customTypeId, asset, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetAssetCustomFieldChangeBuilder
     * @return builder
     */
    public static SetAssetCustomFieldChangeBuilder of() {
        return new SetAssetCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetAssetCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAssetCustomFieldChangeBuilder of(final SetAssetCustomFieldChange template) {
        SetAssetCustomFieldChangeBuilder builder = new SetAssetCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.asset = template.getAsset();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
