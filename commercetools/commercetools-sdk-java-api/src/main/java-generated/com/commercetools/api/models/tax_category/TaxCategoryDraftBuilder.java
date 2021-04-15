
package com.commercetools.api.models.tax_category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxCategoryDraftBuilder {

    private String name;

    @Nullable
    private String description;

    private java.util.List<com.commercetools.api.models.tax_category.TaxRateDraft> rates;

    @Nullable
    private String key;

    public TaxCategoryDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public TaxCategoryDraftBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    public TaxCategoryDraftBuilder rates(final com.commercetools.api.models.tax_category.TaxRateDraft... rates) {
        this.rates = new ArrayList<>(Arrays.asList(rates));
        return this;
    }

    public TaxCategoryDraftBuilder rates(
            final java.util.List<com.commercetools.api.models.tax_category.TaxRateDraft> rates) {
        this.rates = rates;
        return this;
    }

    public TaxCategoryDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    public java.util.List<com.commercetools.api.models.tax_category.TaxRateDraft> getRates() {
        return this.rates;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public TaxCategoryDraft build() {
        return new TaxCategoryDraftImpl(name, description, rates, key);
    }

    public static TaxCategoryDraftBuilder of() {
        return new TaxCategoryDraftBuilder();
    }

    public static TaxCategoryDraftBuilder of(final TaxCategoryDraft template) {
        TaxCategoryDraftBuilder builder = new TaxCategoryDraftBuilder();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.rates = template.getRates();
        builder.key = template.getKey();
        return builder;
    }

}
