
package com.commercetools.api.models.tax_category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxCategoryReferenceBuilder implements Builder<TaxCategoryReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategory obj;

    public TaxCategoryReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public TaxCategoryReferenceBuilder obj(
            Function<com.commercetools.api.models.tax_category.TaxCategoryBuilder, com.commercetools.api.models.tax_category.TaxCategoryBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.tax_category.TaxCategoryBuilder.of()).build();
        return this;
    }

    public TaxCategoryReferenceBuilder obj(@Nullable final com.commercetools.api.models.tax_category.TaxCategory obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategory getObj() {
        return this.obj;
    }

    public TaxCategoryReference build() {
        Objects.requireNonNull(id, TaxCategoryReference.class + ": id is missing");
        return new TaxCategoryReferenceImpl(id, obj);
    }

    /**
     * builds TaxCategoryReference without checking for non null required values
     */
    public TaxCategoryReference buildUnchecked() {
        return new TaxCategoryReferenceImpl(id, obj);
    }

    public static TaxCategoryReferenceBuilder of() {
        return new TaxCategoryReferenceBuilder();
    }

    public static TaxCategoryReferenceBuilder of(final TaxCategoryReference template) {
        TaxCategoryReferenceBuilder builder = new TaxCategoryReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
