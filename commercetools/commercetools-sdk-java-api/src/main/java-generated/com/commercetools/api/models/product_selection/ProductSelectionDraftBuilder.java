
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

    @Nullable
    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public ProductSelectionDraft build() {
        Objects.requireNonNull(name, ProductSelectionDraft.class + ": name is missing");
        return new ProductSelectionDraftImpl(key, name);
    }

    /**
     * builds ProductSelectionDraft without checking for non null required values
     */
    public ProductSelectionDraft buildUnchecked() {
        return new ProductSelectionDraftImpl(key, name);
    }

    public static ProductSelectionDraftBuilder of() {
        return new ProductSelectionDraftBuilder();
    }

    public static ProductSelectionDraftBuilder of(final ProductSelectionDraft template) {
        ProductSelectionDraftBuilder builder = new ProductSelectionDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        return builder;
    }

}
