
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetMetaTitleActionBuilder implements Builder<ProductSetMetaTitleAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaTitle;

    @Nullable
    private Boolean staged;

    public ProductSetMetaTitleActionBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductSetMetaTitleActionBuilder metaTitle(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    public ProductSetMetaTitleActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductSetMetaTitleAction build() {
        return new ProductSetMetaTitleActionImpl(metaTitle, staged);
    }

    /**
     * builds ProductSetMetaTitleAction without checking for non null required values
     */
    public ProductSetMetaTitleAction buildUnchecked() {
        return new ProductSetMetaTitleActionImpl(metaTitle, staged);
    }

    public static ProductSetMetaTitleActionBuilder of() {
        return new ProductSetMetaTitleActionBuilder();
    }

    public static ProductSetMetaTitleActionBuilder of(final ProductSetMetaTitleAction template) {
        ProductSetMetaTitleActionBuilder builder = new ProductSetMetaTitleActionBuilder();
        builder.metaTitle = template.getMetaTitle();
        builder.staged = template.getStaged();
        return builder;
    }

}
