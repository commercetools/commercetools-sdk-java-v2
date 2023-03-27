
package com.commercetools.api.models.category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetAssetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetAssetKeyAction categorySetAssetKeyAction = CategorySetAssetKeyAction.builder()
 *             .assetId("{assetId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategorySetAssetKeyActionBuilder implements Builder<CategorySetAssetKeyAction> {

    private String assetId;

    @Nullable
    private String assetKey;

    /**
     *  <p>Value to set.</p>
     * @param assetId value to be set
     * @return Builder
     */

    public CategorySetAssetKeyActionBuilder assetId(final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param assetKey value to be set
     * @return Builder
     */

    public CategorySetAssetKeyActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    /**
     *  <p>Value to set.</p>
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
     * builds CategorySetAssetKeyAction with checking for non-null required values
     * @return CategorySetAssetKeyAction
     */
    public CategorySetAssetKeyAction build() {
        Objects.requireNonNull(assetId, CategorySetAssetKeyAction.class + ": assetId is missing");
        return new CategorySetAssetKeyActionImpl(assetId, assetKey);
    }

    /**
     * builds CategorySetAssetKeyAction without checking for non-null required values
     * @return CategorySetAssetKeyAction
     */
    public CategorySetAssetKeyAction buildUnchecked() {
        return new CategorySetAssetKeyActionImpl(assetId, assetKey);
    }

    /**
     * factory method for an instance of CategorySetAssetKeyActionBuilder
     * @return builder
     */
    public static CategorySetAssetKeyActionBuilder of() {
        return new CategorySetAssetKeyActionBuilder();
    }

    /**
     * create builder for CategorySetAssetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetAssetKeyActionBuilder of(final CategorySetAssetKeyAction template) {
        CategorySetAssetKeyActionBuilder builder = new CategorySetAssetKeyActionBuilder();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        return builder;
    }

}
