
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSelectionDraftBuilder implements Builder<ProductSelectionDraft> {

    @Nullable
    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    public ProductSelectionDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public ProductSelectionDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductSelectionDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public ProductSelectionDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public ProductSelectionDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
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

    public ProductSelectionDraft build() {
        Objects.requireNonNull(name, ProductSelectionDraft.class + ": name is missing");
        return new ProductSelectionDraftImpl(key, name, custom);
    }

    /**
     * builds ProductSelectionDraft without checking for non null required values
     */
    public ProductSelectionDraft buildUnchecked() {
        return new ProductSelectionDraftImpl(key, name, custom);
    }

    public static ProductSelectionDraftBuilder of() {
        return new ProductSelectionDraftBuilder();
    }

    public static ProductSelectionDraftBuilder of(final ProductSelectionDraft template) {
        ProductSelectionDraftBuilder builder = new ProductSelectionDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.custom = template.getCustom();
        return builder;
    }

}
