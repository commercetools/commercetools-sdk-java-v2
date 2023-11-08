
package com.commercetools.api.models.subscription;

import com.commercetools.api.models.message.MessagePayload;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

public interface MessageDeliveryPayloadMixin {
    @JsonUnwrapped
    MessagePayload getMessagePayload();

    /**
     * Returns true if this payload contains a complete message.
     *
     * @return true if this payload contains a complete message
     * @see #getMessagePayload()
     */
    @JsonIgnore
    default boolean hasCompleteMessage() {
        return getMessagePayload().getType() != null;
    }
}
