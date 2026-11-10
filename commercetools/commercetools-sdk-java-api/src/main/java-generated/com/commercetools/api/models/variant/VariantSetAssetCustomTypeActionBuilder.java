
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantSetAssetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetAssetCustomTypeAction variantSetAssetCustomTypeAction = VariantSetAssetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetAssetCustomTypeActionBuilder implements Builder<VariantSetAssetCustomTypeAction> {

    @Nullable
    private Boolean staged;

    @Nullable
    private String assetId;

    @Nullable
    private String assetKey;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Whether only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantSetAssetCustomTypeActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @param assetId value to be set
     * @return Builder
     */

    public VariantSetAssetCustomTypeActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @param assetKey value to be set
     * @return Builder
     */

    public VariantSetAssetCustomTypeActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Asset with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Asset.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public VariantSetAssetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Asset with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Asset.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public VariantSetAssetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Asset with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Asset.</p>
     * @param type value to be set
     * @return Builder
     */

    public VariantSetAssetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Asset.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public VariantSetAssetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Asset.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public VariantSetAssetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Asset.</p>
     * @param fields value to be set
     * @return Builder
     */

    public VariantSetAssetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
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
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Asset with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Asset.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Asset.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds VariantSetAssetCustomTypeAction with checking for non-null required values
     * @return VariantSetAssetCustomTypeAction
     */
    public VariantSetAssetCustomTypeAction build() {
        return new VariantSetAssetCustomTypeActionImpl(staged, assetId, assetKey, type, fields);
    }

    /**
     * builds VariantSetAssetCustomTypeAction without checking for non-null required values
     * @return VariantSetAssetCustomTypeAction
     */
    public VariantSetAssetCustomTypeAction buildUnchecked() {
        return new VariantSetAssetCustomTypeActionImpl(staged, assetId, assetKey, type, fields);
    }

    /**
     * factory method for an instance of VariantSetAssetCustomTypeActionBuilder
     * @return builder
     */
    public static VariantSetAssetCustomTypeActionBuilder of() {
        return new VariantSetAssetCustomTypeActionBuilder();
    }

    /**
     * create builder for VariantSetAssetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetAssetCustomTypeActionBuilder of(final VariantSetAssetCustomTypeAction template) {
        VariantSetAssetCustomTypeActionBuilder builder = new VariantSetAssetCustomTypeActionBuilder();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
