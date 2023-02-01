
package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;
import com.commercetools.api.models.common.ReferenceTypeId;

public interface TaxCategoryMixin extends Referencable<TaxCategory>, ResourceIdentifiable<TaxCategory> {
    @Override
    public default TaxCategoryResourceIdentifier toResourceIdentifier() {
        return TaxCategoryResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default TaxCategoryReference toReference() {
        return TaxCategoryReference.builder().id(getId()).build();
    }

    public static ReferenceTypeId referenceTypeId() {
        return ReferenceTypeId.TAX_CATEGORY;
    }
}
