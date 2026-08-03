
package com.commercetools.api.models.variant;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantRemoveAssetActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantRemoveAssetAction variantRemoveAssetAction = VariantRemoveAssetAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantRemoveAssetActionBuilder implements Builder<VariantRemoveAssetAction> {

    @Nullable
    private Boolean staged;

    @Nullable
    private String assetId;

    @Nullable
    private String assetKey;

    /**
     *  <p>Whether only the staged Asset is removed. If <code>false</code>, both the current and staged Asset is removed.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantRemoveAssetActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Asset to remove.</p>
     * @param assetId value to be set
     * @return Builder
     */

    public VariantRemoveAssetActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the Asset to remove.</p>
     * @param assetKey value to be set
     * @return Builder
     */

    public VariantRemoveAssetActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    /**
     *  <p>Whether only the staged Asset is removed. If <code>false</code>, both the current and staged Asset is removed.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The <code>id</code> of the Asset to remove.</p>
     * @return assetId
     */

    @Nullable
    public String getAssetId() {
        return this.assetId;
    }

    /**
     *  <p>The <code>key</code> of the Asset to remove.</p>
     * @return assetKey
     */

    @Nullable
    public String getAssetKey() {
        return this.assetKey;
    }

    /**
     * builds VariantRemoveAssetAction with checking for non-null required values
     * @return VariantRemoveAssetAction
     */
    public VariantRemoveAssetAction build() {
        return new VariantRemoveAssetActionImpl(staged, assetId, assetKey);
    }

    /**
     * builds VariantRemoveAssetAction without checking for non-null required values
     * @return VariantRemoveAssetAction
     */
    public VariantRemoveAssetAction buildUnchecked() {
        return new VariantRemoveAssetActionImpl(staged, assetId, assetKey);
    }

    /**
     * factory method for an instance of VariantRemoveAssetActionBuilder
     * @return builder
     */
    public static VariantRemoveAssetActionBuilder of() {
        return new VariantRemoveAssetActionBuilder();
    }

    /**
     * create builder for VariantRemoveAssetAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantRemoveAssetActionBuilder of(final VariantRemoveAssetAction template) {
        VariantRemoveAssetActionBuilder builder = new VariantRemoveAssetActionBuilder();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        return builder;
    }

}
