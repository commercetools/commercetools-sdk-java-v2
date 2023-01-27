
package com.commercetools.api.models.payment;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;
import com.commercetools.api.models.common.ReferenceTypeId;

public interface PaymentMixin extends Referencable<Payment>, ResourceIdentifiable<Payment> {
    @Override
    public default PaymentResourceIdentifier toResourceIdentifier() {
        return PaymentResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default PaymentReference toReference() {
        return PaymentReference.builder().id(getId()).build();
    }

    public static ReferenceTypeId referenceTypeId() {
        return ReferenceTypeId.PAYMENT;
    }
}
