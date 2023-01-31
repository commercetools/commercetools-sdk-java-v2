
package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

public interface CustomerGroupMixin extends Referencable<CustomerGroup>, ResourceIdentifiable<CustomerGroup> {
    @Override
    public default CustomerGroupResourceIdentifier toResourceIdentifier() {
        return CustomerGroupResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default CustomerGroupReference toReference() {
        return CustomerGroupReference.builder().id(getId()).build();
    }
}
