
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryChangeAssetNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryChangeAssetNameAction categoryChangeAssetNameAction = CategoryChangeAssetNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryChangeAssetNameActionBuilder implements Builder<CategoryChangeAssetNameAction> {

    @Nullable
    private String assetId;

    @Nullable
    private String assetKey;

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     */

    public CategoryChangeAssetNameActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     */

    public CategoryChangeAssetNameActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public CategoryChangeAssetNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public CategoryChangeAssetNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
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

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public CategoryChangeAssetNameAction build() {
        Objects.requireNonNull(name, CategoryChangeAssetNameAction.class + ": name is missing");
        return new CategoryChangeAssetNameActionImpl(assetId, assetKey, name);
    }

    /**
     * builds CategoryChangeAssetNameAction without checking for non null required values
     */
    public CategoryChangeAssetNameAction buildUnchecked() {
        return new CategoryChangeAssetNameActionImpl(assetId, assetKey, name);
    }

    public static CategoryChangeAssetNameActionBuilder of() {
        return new CategoryChangeAssetNameActionBuilder();
    }

    public static CategoryChangeAssetNameActionBuilder of(final CategoryChangeAssetNameAction template) {
        CategoryChangeAssetNameActionBuilder builder = new CategoryChangeAssetNameActionBuilder();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.name = template.getName();
        return builder;
    }

}
