
package com.commercetools.api.models.tax_category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxCategoryResourceIdentifierBuilder implements Builder<TaxCategoryResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public TaxCategoryResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public TaxCategoryResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public TaxCategoryResourceIdentifier build() {
        return new TaxCategoryResourceIdentifierImpl(id, key);
    }

    /**
     * builds TaxCategoryResourceIdentifier without checking for non null required values
     */
    public TaxCategoryResourceIdentifier buildUnchecked() {
        return new TaxCategoryResourceIdentifierImpl(id, key);
    }

    public static TaxCategoryResourceIdentifierBuilder of() {
        return new TaxCategoryResourceIdentifierBuilder();
    }

    public static TaxCategoryResourceIdentifierBuilder of(final TaxCategoryResourceIdentifier template) {
        TaxCategoryResourceIdentifierBuilder builder = new TaxCategoryResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
