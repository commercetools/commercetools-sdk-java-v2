
package com.commercetools.api.models.tax_category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxCategorySetDescriptionActionBuilder implements Builder<TaxCategorySetDescriptionAction> {

    @Nullable
    private String description;

    public TaxCategorySetDescriptionActionBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    public TaxCategorySetDescriptionAction build() {
        return new TaxCategorySetDescriptionActionImpl(description);
    }

    /**
     * builds TaxCategorySetDescriptionAction without checking for non null required values
     */
    public TaxCategorySetDescriptionAction buildUnchecked() {
        return new TaxCategorySetDescriptionActionImpl(description);
    }

    public static TaxCategorySetDescriptionActionBuilder of() {
        return new TaxCategorySetDescriptionActionBuilder();
    }

    public static TaxCategorySetDescriptionActionBuilder of(final TaxCategorySetDescriptionAction template) {
        TaxCategorySetDescriptionActionBuilder builder = new TaxCategorySetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
