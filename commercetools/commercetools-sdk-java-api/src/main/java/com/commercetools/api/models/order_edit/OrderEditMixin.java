
package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;
import com.commercetools.api.models.common.ReferenceTypeId;

public interface OrderEditMixin extends Referencable<OrderEdit>, ResourceIdentifiable<OrderEdit> {
    @Override
    public default OrderEditResourceIdentifier toResourceIdentifier() {
        return OrderEditResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default OrderEditReference toReference() {
        return OrderEditReference.builder().id(getId()).build();
    }

    public static ReferenceTypeId referenceTypeId() {
        return ReferenceTypeId.ORDER_EDIT;
    }
}
