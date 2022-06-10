
package com.commercetools.api.models.category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryRemoveAssetActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryRemoveAssetAction categoryRemoveAssetAction = CategoryRemoveAssetAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryRemoveAssetActionBuilder implements Builder<CategoryRemoveAssetAction> {

    @Nullable
    private String assetId;

    @Nullable
    private String assetKey;

    /**
     *  <p>Value to remove. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     */

    public CategoryRemoveAssetActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>Value to remove. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     */

    public CategoryRemoveAssetActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    @Nullable
    public String getAssetId() {
        return this.assetId;
    }

    @Nullable
    public String getAssetKey() {
        return this.assetKey;
    }

    public CategoryRemoveAssetAction build() {
        return new CategoryRemoveAssetActionImpl(assetId, assetKey);
    }

    /**
     * builds CategoryRemoveAssetAction without checking for non null required values
     */
    public CategoryRemoveAssetAction buildUnchecked() {
        return new CategoryRemoveAssetActionImpl(assetId, assetKey);
    }

    public static CategoryRemoveAssetActionBuilder of() {
        return new CategoryRemoveAssetActionBuilder();
    }

    public static CategoryRemoveAssetActionBuilder of(final CategoryRemoveAssetAction template) {
        CategoryRemoveAssetActionBuilder builder = new CategoryRemoveAssetActionBuilder();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        return builder;
    }

}
