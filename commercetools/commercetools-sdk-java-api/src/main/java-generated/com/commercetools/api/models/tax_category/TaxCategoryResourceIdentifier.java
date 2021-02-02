
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TaxCategoryResourceIdentifierImpl.class)
public interface TaxCategoryResourceIdentifier extends ResourceIdentifier {

    String TAX_CATEGORY = "tax-category";

    public static TaxCategoryResourceIdentifier of() {
        return new TaxCategoryResourceIdentifierImpl();
    }

    public static TaxCategoryResourceIdentifier of(final TaxCategoryResourceIdentifier template) {
        TaxCategoryResourceIdentifierImpl instance = new TaxCategoryResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static TaxCategoryResourceIdentifierBuilder builder() {
        return TaxCategoryResourceIdentifierBuilder.of();
    }

    public static TaxCategoryResourceIdentifierBuilder builder(final TaxCategoryResourceIdentifier template) {
        return TaxCategoryResourceIdentifierBuilder.of(template);
    }

    default <T> T withTaxCategoryResourceIdentifier(Function<TaxCategoryResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
