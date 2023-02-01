
package com.commercetools.api.models.review;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

public interface ReviewMixin extends Referencable<Review>, ResourceIdentifiable<Review> {
    @Override
    public default ReviewResourceIdentifier toResourceIdentifier() {
        return ReviewResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default ReviewReference toReference() {
        return ReviewReference.builder().id(getId()).build();
    }
}
