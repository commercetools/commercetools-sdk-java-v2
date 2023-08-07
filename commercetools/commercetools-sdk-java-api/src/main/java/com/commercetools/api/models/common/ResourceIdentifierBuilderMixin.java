
package com.commercetools.api.models.common;

public interface ResourceIdentifierBuilderMixin {
    @Deprecated
    default com.commercetools.api.models.order.OrderResourceIdentifierBuilder orderBuilder() {
        return com.commercetools.api.models.order.OrderResourceIdentifierBuilder.of();
    }
}
