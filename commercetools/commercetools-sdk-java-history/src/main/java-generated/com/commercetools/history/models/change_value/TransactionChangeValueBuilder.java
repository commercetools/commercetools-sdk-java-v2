
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TransactionChangeValueBuilder implements Builder<TransactionChangeValue> {

    private String id;

    private String interactionId;

    private String timestamp;

    public TransactionChangeValueBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public TransactionChangeValueBuilder interactionId(final String interactionId) {
        this.interactionId = interactionId;
        return this;
    }

    public TransactionChangeValueBuilder timestamp(final String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public String getInteractionId() {
        return this.interactionId;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public TransactionChangeValue build() {
        Objects.requireNonNull(id, TransactionChangeValue.class + ": id is missing");
        Objects.requireNonNull(interactionId, TransactionChangeValue.class + ": interactionId is missing");
        Objects.requireNonNull(timestamp, TransactionChangeValue.class + ": timestamp is missing");
        return new TransactionChangeValueImpl(id, interactionId, timestamp);
    }

    /**
     * builds TransactionChangeValue without checking for non null required values
     */
    public TransactionChangeValue buildUnchecked() {
        return new TransactionChangeValueImpl(id, interactionId, timestamp);
    }

    public static TransactionChangeValueBuilder of() {
        return new TransactionChangeValueBuilder();
    }

    public static TransactionChangeValueBuilder of(final TransactionChangeValue template) {
        TransactionChangeValueBuilder builder = new TransactionChangeValueBuilder();
        builder.id = template.getId();
        builder.interactionId = template.getInteractionId();
        builder.timestamp = template.getTimestamp();
        return builder;
    }

}
