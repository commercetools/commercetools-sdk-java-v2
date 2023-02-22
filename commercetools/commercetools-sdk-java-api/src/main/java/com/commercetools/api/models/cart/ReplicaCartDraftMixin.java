
package com.commercetools.api.models.cart;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.JsonIgnore;

public interface ReplicaCartDraftMixin {
    @JsonIgnore
    @Deprecated
    public default void setReference(final Object reference) {
        setReference((Reference) reference);
    };
}
