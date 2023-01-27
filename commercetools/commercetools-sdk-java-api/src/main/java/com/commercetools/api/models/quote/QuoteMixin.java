
package com.commercetools.api.models.quote;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;
import com.commercetools.api.models.common.ReferenceTypeId;

public interface QuoteMixin extends Referencable<Quote>, ResourceIdentifiable<Quote> {
    @Override
    public default QuoteResourceIdentifier toResourceIdentifier() {
        return QuoteResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default QuoteReference toReference() {
        return QuoteReference.builder().id(getId()).build();
    }

    public static ReferenceTypeId referenceTypeId() {
        return ReferenceTypeId.QUOTE;
    }
}
