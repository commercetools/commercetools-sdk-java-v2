
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductCatalogDataBuilder {

    private Boolean published;

    private com.commercetools.api.models.product.ProductData current;

    private com.commercetools.api.models.product.ProductData staged;

    private Boolean hasStagedChanges;

    public ProductCatalogDataBuilder published(final Boolean published) {
        this.published = published;
        return this;
    }

    public ProductCatalogDataBuilder current(final com.commercetools.api.models.product.ProductData current) {
        this.current = current;
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
