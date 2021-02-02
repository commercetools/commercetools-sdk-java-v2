
package com.commercetools.ml.models.similar_products;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetSelectorBuilder {

    private String projectKey;

    @Nullable
    private java.util.List<String> productIds;

    @Nullable
    private java.util.List<String> productTypeIds;

    @Nullable
    private Boolean staged;

    @Nullable
    private Boolean includeVariants;

    @Nullable
    private Long productSetLimit;

    public ProductSetSelectorBuilder projectKey(final String projectKey) {
        this.projectKey = projectKey;
        return this;
    }

    public ProductSetSelectorBuilder productIds(@Nullable final String... productIds) {
        this.productIds = new ArrayList<>(Arrays.asList(productIds));
        return this;
    }

    public ProductSetSelectorBuilder productIds(@Nullable final java.util.List<String> productIds) {
        this.productIds = productIds;
        return this;
    }

    public ProductSetSelectorBuilder productTypeIds(@Nullable final String... productTypeIds) {
        this.productTypeIds = new ArrayList<>(Arrays.asList(productTypeIds));
        return this;
    }

    public ProductSetSelectorBuilder productTypeIds(@Nullable final java.util.List<String> productTypeIds) {
        this.productTypeIds = productTypeIds;
        return this;
    }

    public ProductSetSelectorBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public ProductSetSelectorBuilder includeVariants(@Nullable final Boolean includeVariants) {
        this.includeVariants = includeVariants;
        return this;
    }

    public ProductSetSelectorBuilder productSetLimit(@Nullable final Long productSetLimit) {
        this.productSetLimit = productSetLimit;
        return this;
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    @Nullable
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

    @Nullable
    public java.util.List<String> getProductTypeIds() {
        return this.productTypeIds;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    @Nullable
    public Boolean getIncludeVariants() {
        return this.includeVariants;
    }

    @Nullable
    public Long getProductSetLimit() {
        return this.productSetLimit;
    }

    public ProductSetSelector build() {
        return new ProductSetSelectorImpl(projectKey, productIds, productTypeIds, staged, includeVariants,
            productSetLimit);
    }

    public static ProductSetSelectorBuilder of() {
        return new ProductSetSelectorBuilder();
    }

    public static ProductSetSelectorBuilder of(final ProductSetSelector template) {
        ProductSetSelectorBuilder builder = new ProductSetSelectorBuilder();
        builder.projectKey = template.getProjectKey();
        builder.productIds = template.getProductIds();
        builder.productTypeIds = template.getProductTypeIds();
        builder.staged = template.getStaged();
        builder.includeVariants = template.getIncludeVariants();
        builder.productSetLimit = template.getProductSetLimit();
        return builder;
    }

}
