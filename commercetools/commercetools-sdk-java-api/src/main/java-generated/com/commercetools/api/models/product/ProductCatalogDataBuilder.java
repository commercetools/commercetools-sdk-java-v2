
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductCatalogDataBuilder implements Builder<ProductCatalogData> {

    private Boolean published;

    private com.commercetools.api.models.product.ProductData current;

    private com.commercetools.api.models.product.ProductData staged;

    private Boolean hasStagedChanges;

    public ProductCatalogDataBuilder published(final Boolean published) {
        this.published = published;
        return this;
    }

    public ProductCatalogDataBuilder current(
            Function<com.commercetools.api.models.product.ProductDataBuilder, com.commercetools.api.models.product.ProductDataBuilder> builder) {
        this.current = builder.apply(com.commercetools.api.models.product.ProductDataBuilder.of()).build();
        return this;
    }

    public ProductCatalogDataBuilder current(final com.commercetools.api.models.product.ProductData current) {
        this.current = current;
        return this;
    }

    public ProductCatalogDataBuilder staged(
            Function<com.commercetools.api.models.product.ProductDataBuilder, com.commercetools.api.models.product.ProductDataBuilder> builder) {
        this.staged = builder.apply(com.commercetools.api.models.product.ProductDataBuilder.of()).build();
        return this;
    }

    public ProductCatalogDataBuilder staged(final com.commercetools.api.models.product.ProductData staged) {
        this.staged = staged;
        return this;
    }

    public ProductCatalogDataBuilder hasStagedChanges(final Boolean hasStagedChanges) {
        this.hasStagedChanges = hasStagedChanges;
        return this;
    }

    public Boolean getPublished() {
        return this.published;
    }

    public com.commercetools.api.models.product.ProductData getCurrent() {
        return this.current;
    }

    public com.commercetools.api.models.product.ProductData getStaged() {
        return this.staged;
    }

    public Boolean getHasStagedChanges() {
        return this.hasStagedChanges;
    }

    public ProductCatalogData build() {
        Objects.requireNonNull(published, ProductCatalogData.class + ": published is missing");
        Objects.requireNonNull(current, ProductCatalogData.class + ": current is missing");
        Objects.requireNonNull(staged, ProductCatalogData.class + ": staged is missing");
        Objects.requireNonNull(hasStagedChanges, ProductCatalogData.class + ": hasStagedChanges is missing");
        return new ProductCatalogDataImpl(published, current, staged, hasStagedChanges);
    }

    /**
     * builds ProductCatalogData without checking for non null required values
     */
    public ProductCatalogData buildUnchecked() {
        return new ProductCatalogDataImpl(published, current, staged, hasStagedChanges);
    }

    public static ProductCatalogDataBuilder of() {
        return new ProductCatalogDataBuilder();
    }

    public static ProductCatalogDataBuilder of(final ProductCatalogData template) {
        ProductCatalogDataBuilder builder = new ProductCatalogDataBuilder();
        builder.published = template.getPublished();
        builder.current = template.getCurrent();
        builder.staged = template.getStaged();
        builder.hasStagedChanges = template.getHasStagedChanges();
        return builder;
    }

}
