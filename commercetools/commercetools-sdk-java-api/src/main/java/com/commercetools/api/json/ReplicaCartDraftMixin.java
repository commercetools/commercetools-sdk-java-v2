
package com.commercetools.api.json;

import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.order.OrderReference;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

public interface ReplicaCartDraftMixin {

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "typeId", visible = true)
    @JsonSubTypes({ @JsonSubTypes.Type(value = CartReference.class, name = "cart"),
            @JsonSubTypes.Type(value = OrderReference.class, name = "order") })
    public Object getReference();

}
