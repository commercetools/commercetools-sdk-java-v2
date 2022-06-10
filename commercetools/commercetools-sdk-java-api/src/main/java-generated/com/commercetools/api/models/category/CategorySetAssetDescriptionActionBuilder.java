
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetAssetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetAssetDescriptionAction categorySetAssetDescriptionAction = CategorySetAssetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategorySetAssetDescriptionActionBuilder implements Builder<CategorySetAssetDescriptionAction> {

    @Nullable
    private String assetId;

    @Nullable
    private String assetKey;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     */

    public CategorySetAssetDescriptionActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     */

    public CategorySetAssetDescriptionActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public CategorySetAssetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public CategorySetAssetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
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

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public CategorySetAssetDescriptionAction build() {
        return new CategorySetAssetDescriptionActionImpl(assetId, assetKey, description);
    }

    /**
     * builds CategorySetAssetDescriptionAction without checking for non null required values
     */
    public CategorySetAssetDescriptionAction buildUnchecked() {
        return new CategorySetAssetDescriptionActionImpl(assetId, assetKey, description);
    }

    public static CategorySetAssetDescriptionActionBuilder of() {
        return new CategorySetAssetDescriptionActionBuilder();
    }

    public static CategorySetAssetDescriptionActionBuilder of(final CategorySetAssetDescriptionAction template) {
        CategorySetAssetDescriptionActionBuilder builder = new CategorySetAssetDescriptionActionBuilder();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.description = template.getDescription();
        return builder;
    }

}
