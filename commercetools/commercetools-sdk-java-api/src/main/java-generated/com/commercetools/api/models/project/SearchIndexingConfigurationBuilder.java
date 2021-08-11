
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SearchIndexingConfigurationBuilder implements Builder<SearchIndexingConfiguration> {

    @Nullable
    private com.commercetools.api.models.project.SearchIndexingConfigurationValues products;

    public SearchIndexingConfigurationBuilder products(
            Function<com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder, com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder> builder) {
        this.products = builder
                .apply(com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder.of())
                .build();
        return this;
    }

    public SearchIndexingConfigurationBuilder products(
            @Nullable final com.commercetools.api.models.project.SearchIndexingConfigurationValues products) {
        this.products = products;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.project.SearchIndexingConfigurationValues getProducts() {
        return this.products;
    }

    public SearchIndexingConfiguration build() {
        return new SearchIndexingConfigurationImpl(products);
    }

    /**
     * builds SearchIndexingConfiguration without checking for non null required values
     */
    public SearchIndexingConfiguration buildUnchecked() {
        return new SearchIndexingConfigurationImpl(products);
    }

    public static SearchIndexingConfigurationBuilder of() {
        return new SearchIndexingConfigurationBuilder();
    }

    public static SearchIndexingConfigurationBuilder of(final SearchIndexingConfiguration template) {
        SearchIndexingConfigurationBuilder builder = new SearchIndexingConfigurationBuilder();
        builder.products = template.getProducts();
        return builder;
    }

}
