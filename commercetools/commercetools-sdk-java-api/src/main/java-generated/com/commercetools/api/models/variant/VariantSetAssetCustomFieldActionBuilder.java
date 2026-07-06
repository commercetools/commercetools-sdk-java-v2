
package com.commercetools.api.models.variant;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantSetAssetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetAssetCustomFieldAction variantSetAssetCustomFieldAction = VariantSetAssetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetAssetCustomFieldActionBuilder implements Builder<VariantSetAssetCustomFieldAction> {

    @Nullable
    private Boolean staged;

    @Nullable
    private String assetId;

    @Nullable
    private String assetKey;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantSetAssetCustomFieldActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @param assetId value to be set
     * @return Builder
     */

    public VariantSetAssetCustomFieldActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @param assetKey value to be set
     * @return Builder
     */

    public VariantSetAssetCustomFieldActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public VariantSetAssetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public VariantSetAssetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
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
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds VariantSetAssetCustomFieldAction with checking for non-null required values
     * @return VariantSetAssetCustomFieldAction
     */
    public VariantSetAssetCustomFieldAction build() {
        Objects.requireNonNull(name, VariantSetAssetCustomFieldAction.class + ": name is missing");
        return new VariantSetAssetCustomFieldActionImpl(staged, assetId, assetKey, name, value);
    }

    /**
     * builds VariantSetAssetCustomFieldAction without checking for non-null required values
     * @return VariantSetAssetCustomFieldAction
     */
    public VariantSetAssetCustomFieldAction buildUnchecked() {
        return new VariantSetAssetCustomFieldActionImpl(staged, assetId, assetKey, name, value);
    }

    /**
     * factory method for an instance of VariantSetAssetCustomFieldActionBuilder
     * @return builder
     */
    public static VariantSetAssetCustomFieldActionBuilder of() {
        return new VariantSetAssetCustomFieldActionBuilder();
    }

    /**
     * create builder for VariantSetAssetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetAssetCustomFieldActionBuilder of(final VariantSetAssetCustomFieldAction template) {
        VariantSetAssetCustomFieldActionBuilder builder = new VariantSetAssetCustomFieldActionBuilder();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
