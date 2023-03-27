
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
     * @param assetId value to be set
     * @return Builder
     */

    public CategorySetAssetDescriptionActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @param assetKey value to be set
     * @return Builder
     */

    public CategorySetAssetDescriptionActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public CategorySetAssetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     * @return Builder
     */

    public CategorySetAssetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @return assetId
     */

    @Nullable
    public String getAssetId() {
        return this.assetId;
    }

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @return assetKey
     */

    @Nullable
    public String getAssetKey() {
        return this.assetKey;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     * builds CategorySetAssetDescriptionAction with checking for non-null required values
     * @return CategorySetAssetDescriptionAction
     */
    public CategorySetAssetDescriptionAction build() {
        return new CategorySetAssetDescriptionActionImpl(assetId, assetKey, description);
    }

    /**
     * builds CategorySetAssetDescriptionAction without checking for non-null required values
     * @return CategorySetAssetDescriptionAction
     */
    public CategorySetAssetDescriptionAction buildUnchecked() {
        return new CategorySetAssetDescriptionActionImpl(assetId, assetKey, description);
    }

    /**
     * factory method for an instance of CategorySetAssetDescriptionActionBuilder
     * @return builder
     */
    public static CategorySetAssetDescriptionActionBuilder of() {
        return new CategorySetAssetDescriptionActionBuilder();
    }

    /**
     * create builder for CategorySetAssetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetAssetDescriptionActionBuilder of(final CategorySetAssetDescriptionAction template) {
        CategorySetAssetDescriptionActionBuilder builder = new CategorySetAssetDescriptionActionBuilder();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.description = template.getDescription();
        return builder;
    }

}
