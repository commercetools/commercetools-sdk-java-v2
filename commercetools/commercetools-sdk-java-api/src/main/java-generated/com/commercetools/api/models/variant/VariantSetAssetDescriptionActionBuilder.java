
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantSetAssetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetAssetDescriptionAction variantSetAssetDescriptionAction = VariantSetAssetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetAssetDescriptionActionBuilder implements Builder<VariantSetAssetDescriptionAction> {

    @Nullable
    private Boolean staged;

    @Nullable
    private String assetId;

    @Nullable
    private String assetKey;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    /**
     *  <p>Whether only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantSetAssetDescriptionActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @param assetId value to be set
     * @return Builder
     */

    public VariantSetAssetDescriptionActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @param assetKey value to be set
     * @return Builder
     */

    public VariantSetAssetDescriptionActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    /**
     *  <p>Value to set. If omitted, any existing value is removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public VariantSetAssetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If omitted, any existing value is removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public VariantSetAssetDescriptionActionBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If omitted, any existing value is removed.</p>
     * @param description value to be set
     * @return Builder
     */

    public VariantSetAssetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Whether only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
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
     *  <p>Value to set. If omitted, any existing value is removed.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     * builds VariantSetAssetDescriptionAction with checking for non-null required values
     * @return VariantSetAssetDescriptionAction
     */
    public VariantSetAssetDescriptionAction build() {
        return new VariantSetAssetDescriptionActionImpl(staged, assetId, assetKey, description);
    }

    /**
     * builds VariantSetAssetDescriptionAction without checking for non-null required values
     * @return VariantSetAssetDescriptionAction
     */
    public VariantSetAssetDescriptionAction buildUnchecked() {
        return new VariantSetAssetDescriptionActionImpl(staged, assetId, assetKey, description);
    }

    /**
     * factory method for an instance of VariantSetAssetDescriptionActionBuilder
     * @return builder
     */
    public static VariantSetAssetDescriptionActionBuilder of() {
        return new VariantSetAssetDescriptionActionBuilder();
    }

    /**
     * create builder for VariantSetAssetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetAssetDescriptionActionBuilder of(final VariantSetAssetDescriptionAction template) {
        VariantSetAssetDescriptionActionBuilder builder = new VariantSetAssetDescriptionActionBuilder();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.description = template.getDescription();
        return builder;
    }

}
