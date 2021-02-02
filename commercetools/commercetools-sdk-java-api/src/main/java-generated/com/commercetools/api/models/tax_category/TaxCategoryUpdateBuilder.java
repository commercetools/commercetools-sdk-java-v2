
package com.commercetools.api.models.tax_category;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxCategoryUpdateBuilder {

    private Long version;

    private java.util.List<com.commercetools.api.models.tax_category.TaxCategoryUpdateAction> actions;

    public TaxCategoryUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public TaxCategoryUpdateBuilder actions(
            final com.commercetools.api.models.tax_category.TaxCategoryUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public TaxCategoryUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.tax_category.TaxCategoryUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.tax_category.TaxCategoryUpdateAction> getActions() {
        return this.actions;
    }

    public TaxCategoryUpdate build() {
        return new TaxCategoryUpdateImpl(version, actions);
    }

    public static TaxCategoryUpdateBuilder of() {
        return new TaxCategoryUpdateBuilder();
    }

    public static TaxCategoryUpdateBuilder of(final TaxCategoryUpdate template) {
        TaxCategoryUpdateBuilder builder = new TaxCategoryUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
