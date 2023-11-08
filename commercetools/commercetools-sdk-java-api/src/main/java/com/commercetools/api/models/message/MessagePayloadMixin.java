
package com.commercetools.api.models.message;

public interface MessagePayloadMixin {
    @SuppressWarnings("unchecked")
    default <M extends MessagePayload> M as(Class<M> clazz) {
        if (clazz.isInstance(this)) {
            return (M) this;
        }
        throw new IllegalArgumentException("message type mismatch");
    }
}
