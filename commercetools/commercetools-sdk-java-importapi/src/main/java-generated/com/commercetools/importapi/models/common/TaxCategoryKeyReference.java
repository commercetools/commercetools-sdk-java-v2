
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>References a tax category by its key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TaxCategoryKeyReferenceImpl.class)
public interface TaxCategoryKeyReference extends KeyReference {

    String TAX_CATEGORY = "tax-category";

    public static TaxCategoryKeyReference of() {
        return new TaxCategoryKeyReferenceImpl();
    }

    public static TaxCategoryKeyReference of(final TaxCategoryKeyReference template) {
        TaxCategoryKeyReferenceImpl instance = new TaxCategoryKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static TaxCategoryKeyReferenceBuilder builder() {
        return TaxCategoryKeyReferenceBuilder.of();
    }

    public static TaxCategoryKeyReferenceBuilder builder(final TaxCategoryKeyReference template) {
        return TaxCategoryKeyReferenceBuilder.of(template);
    }

    default <T> T withTaxCategoryKeyReference(Function<TaxCategoryKeyReference, T> helper) {
        return helper.apply(this);
    }
}
