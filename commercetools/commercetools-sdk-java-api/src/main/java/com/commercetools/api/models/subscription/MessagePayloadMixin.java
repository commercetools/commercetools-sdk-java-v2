
package com.commercetools.api.models.subscription;

import com.commercetools.api.models.message.MessagePayload;

public interface MessagePayloadMixin {
    @SuppressWarnings("unchecked")
    default <M extends MessagePayload> M as(Class<M> clazz) {
        if (clazz.isInstance(this)) {
            return (M) this;
        }
        throw new IllegalArgumentException("message type mismatch");
    }
}
