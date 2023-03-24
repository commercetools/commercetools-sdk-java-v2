
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionDraft productSelectionDraft = ProductSelectionDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionDraftBuilder implements Builder<ProductSelectionDraft> {

    @Nullable
    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.product_selection.ProductSelectionTypeEnum type;

    /**
     *  <p>User-defined unique identifier for the ProductSelection.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductSelectionDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the ProductSelection. Not checked for uniqueness, but distinct names are recommended.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductSelectionDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the ProductSelection. Not checked for uniqueness, but distinct names are recommended.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductSelectionDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Custom Fields of this ProductSelection.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ProductSelectionDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of this ProductSelection.</p>
     * @param custom value to be set
     * @return Builder
     */

    public ProductSelectionDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Type of the Product Selection.</p>
     * @param type value to be set
     * @return Builder
     */

    public ProductSelectionDraftBuilder type(
            @Nullable final com.commercetools.api.models.product_selection.ProductSelectionTypeEnum type) {
        this.type = type;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.product_selection.ProductSelectionTypeEnum getType() {
        return this.type;
    }

    /**
     * builds ProductSelectionDraft with checking for non-null required values
     * @return ProductSelectionDraft
     */
    public ProductSelectionDraft build() {
        Objects.requireNonNull(name, ProductSelectionDraft.class + ": name is missing");
        return new ProductSelectionDraftImpl(key, name, custom, type);
    }

    /**
     * builds ProductSelectionDraft without checking for non-null required values
     * @return ProductSelectionDraft
     */
    public ProductSelectionDraft buildUnchecked() {
        return new ProductSelectionDraftImpl(key, name, custom, type);
    }

    public static ProductSelectionDraftBuilder of() {
        return new ProductSelectionDraftBuilder();
    }

    public static ProductSelectionDraftBuilder of(final ProductSelectionDraft template) {
        ProductSelectionDraftBuilder builder = new ProductSelectionDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.custom = template.getCustom();
        builder.type = template.getType();
        return builder;
    }

}
