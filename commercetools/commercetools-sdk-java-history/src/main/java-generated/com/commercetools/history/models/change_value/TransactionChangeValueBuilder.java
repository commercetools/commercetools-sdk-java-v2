
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransactionChangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionChangeValue transactionChangeValue = TransactionChangeValue.builder()
 *             .id("{id}")
 *             .interactionId("{interactionId}")
 *             .timestamp("{timestamp}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionChangeValueBuilder implements Builder<TransactionChangeValue> {

    private String id;

    private String interactionId;

    private String timestamp;

    /**
     *
     * @param id value to be set
     * @return Builder
     */

    public TransactionChangeValueBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @param interactionId value to be set
     * @return Builder
     */

    public TransactionChangeValueBuilder interactionId(final String interactionId) {
        this.interactionId = interactionId;
        return this;
    }

    /**
     *
     * @param timestamp value to be set
     * @return Builder
     */

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

    /**
     * builds TransactionChangeValue with checking for non-null required values
     * @return TransactionChangeValue
     */
    public TransactionChangeValue build() {
        Objects.requireNonNull(id, TransactionChangeValue.class + ": id is missing");
        Objects.requireNonNull(interactionId, TransactionChangeValue.class + ": interactionId is missing");
        Objects.requireNonNull(timestamp, TransactionChangeValue.class + ": timestamp is missing");
        return new TransactionChangeValueImpl(id, interactionId, timestamp);
    }

    /**
     * builds TransactionChangeValue without checking for non-null required values
     * @return TransactionChangeValue
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
