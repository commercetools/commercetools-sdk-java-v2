
package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;
import com.commercetools.api.models.common.ReferenceTypeId;

public interface CustomerGroupMixin extends Referencable<CustomerGroup>, ResourceIdentifiable<CustomerGroup> {
    @Override
    public default CustomerGroupResourceIdentifier toResourceIdentifier() {
        return CustomerGroupResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default CustomerGroupReference toReference() {
        return CustomerGroupReference.builder().id(getId()).build();
    }

    public static ReferenceTypeId referenceTypeId() {
        return ReferenceTypeId.CUSTOMER_GROUP;
    }
}
