
package com.commercetools.api.models.variant;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantSetAssetTagsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetAssetTagsAction variantSetAssetTagsAction = VariantSetAssetTagsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetAssetTagsActionBuilder implements Builder<VariantSetAssetTagsAction> {

    @Nullable
    private Boolean staged;

    @Nullable
    private String assetId;

    @Nullable
    private String assetKey;

    @Nullable
    private java.util.List<String> tags;

    /**
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantSetAssetTagsActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @param assetId value to be set
     * @return Builder
     */

    public VariantSetAssetTagsActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @param assetKey value to be set
     * @return Builder
     */

    public VariantSetAssetTagsActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags value to be set
     * @return Builder
     */

    public VariantSetAssetTagsActionBuilder tags(@Nullable final String... tags) {
        this.tags = new ArrayList<>(Arrays.asList(tags));
        return this;
    }

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags value to be set
     * @return Builder
     */

    public VariantSetAssetTagsActionBuilder tags(@Nullable final java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags value to be set
     * @return Builder
     */

    public VariantSetAssetTagsActionBuilder plusTags(@Nullable final String... tags) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.addAll(Arrays.asList(tags));
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

    @Nullable
    public String getAssetId() {
        return this.assetId;
    }

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @return assetKey
     */

    @Nullable
    public String getAssetKey() {
        return this.assetKey;
    }

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @return tags
     */

    @Nullable
    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
     * builds VariantSetAssetTagsAction with checking for non-null required values
     * @return VariantSetAssetTagsAction
     */
    public VariantSetAssetTagsAction build() {
        return new VariantSetAssetTagsActionImpl(staged, assetId, assetKey, tags);
    }

    /**
     * builds VariantSetAssetTagsAction without checking for non-null required values
     * @return VariantSetAssetTagsAction
     */
    public VariantSetAssetTagsAction buildUnchecked() {
        return new VariantSetAssetTagsActionImpl(staged, assetId, assetKey, tags);
    }

    /**
     * factory method for an instance of VariantSetAssetTagsActionBuilder
     * @return builder
     */
    public static VariantSetAssetTagsActionBuilder of() {
        return new VariantSetAssetTagsActionBuilder();
    }

    /**
     * create builder for VariantSetAssetTagsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetAssetTagsActionBuilder of(final VariantSetAssetTagsAction template) {
        VariantSetAssetTagsActionBuilder builder = new VariantSetAssetTagsActionBuilder();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.tags = template.getTags();
        return builder;
    }

}
