
package com.commercetools.api.models.variant;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantSetAssetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetAssetKeyAction variantSetAssetKeyAction = VariantSetAssetKeyAction.builder()
 *             .assetId("{assetId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetAssetKeyActionBuilder implements Builder<VariantSetAssetKeyAction> {

    @Nullable
    private Boolean staged;

    private String assetId;

    @Nullable
    private String assetKey;

    /**
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantSetAssetKeyActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @param assetId value to be set
     * @return Builder
     */

    public VariantSetAssetKeyActionBuilder assetId(final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param assetKey value to be set
     * @return Builder
     */

    public VariantSetAssetKeyActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @return assetId
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return assetKey
     */

    @Nullable
    public String getAssetKey() {
        return this.assetKey;
    }

    /**
     * builds VariantSetAssetKeyAction with checking for non-null required values
     * @return VariantSetAssetKeyAction
     */
    public VariantSetAssetKeyAction build() {
        Objects.requireNonNull(assetId, VariantSetAssetKeyAction.class + ": assetId is missing");
        return new VariantSetAssetKeyActionImpl(staged, assetId, assetKey);
    }

    /**
     * builds VariantSetAssetKeyAction without checking for non-null required values
     * @return VariantSetAssetKeyAction
     */
    public VariantSetAssetKeyAction buildUnchecked() {
        return new VariantSetAssetKeyActionImpl(staged, assetId, assetKey);
    }

    /**
     * factory method for an instance of VariantSetAssetKeyActionBuilder
     * @return builder
     */
    public static VariantSetAssetKeyActionBuilder of() {
        return new VariantSetAssetKeyActionBuilder();
    }

    /**
     * create builder for VariantSetAssetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetAssetKeyActionBuilder of(final VariantSetAssetKeyAction template) {
        VariantSetAssetKeyActionBuilder builder = new VariantSetAssetKeyActionBuilder();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        return builder;
    }

}
