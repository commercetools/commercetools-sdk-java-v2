
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetMetaDescriptionActionBuilder implements Builder<ProductSetMetaDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaDescription;

    @Nullable
    private Boolean staged;

    public ProductSetMetaDescriptionActionBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductSetMetaDescriptionActionBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    public ProductSetMetaDescriptionActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductSetMetaDescriptionAction build() {
        return new ProductSetMetaDescriptionActionImpl(metaDescription, staged);
    }

    /**
     * builds ProductSetMetaDescriptionAction without checking for non null required values
     */
    public ProductSetMetaDescriptionAction buildUnchecked() {
        return new ProductSetMetaDescriptionActionImpl(metaDescription, staged);
    }

    public static ProductSetMetaDescriptionActionBuilder of() {
        return new ProductSetMetaDescriptionActionBuilder();
    }

    public static ProductSetMetaDescriptionActionBuilder of(final ProductSetMetaDescriptionAction template) {
        ProductSetMetaDescriptionActionBuilder builder = new ProductSetMetaDescriptionActionBuilder();
        builder.metaDescription = template.getMetaDescription();
        builder.staged = template.getStaged();
        return builder;
    }

}
