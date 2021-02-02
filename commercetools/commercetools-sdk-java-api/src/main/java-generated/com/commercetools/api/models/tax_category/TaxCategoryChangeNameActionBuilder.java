
package com.commercetools.api.models.tax_category;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxCategoryChangeNameActionBuilder {

    private String name;

    public TaxCategoryChangeNameActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public TaxCategoryChangeNameAction build() {
        return new TaxCategoryChangeNameActionImpl(name);
    }

    public static TaxCategoryChangeNameActionBuilder of() {
        return new TaxCategoryChangeNameActionBuilder();
    }

    public static TaxCategoryChangeNameActionBuilder of(final TaxCategoryChangeNameAction template) {
        TaxCategoryChangeNameActionBuilder builder = new TaxCategoryChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
