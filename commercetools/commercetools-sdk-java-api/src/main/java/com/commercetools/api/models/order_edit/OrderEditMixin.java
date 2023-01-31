
package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

public interface OrderEditMixin extends Referencable<OrderEdit>, ResourceIdentifiable<OrderEdit> {
    @Override
    public default OrderEditResourceIdentifier toResourceIdentifier() {
        return OrderEditResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default OrderEditReference toReference() {
        return OrderEditReference.builder().id(getId()).build();
    }
}
