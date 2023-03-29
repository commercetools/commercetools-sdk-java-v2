
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransactionChangeValue
 *
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
@JsonDeserialize(as = TransactionChangeValueImpl.class)
public interface TransactionChangeValue {

    /**
     *
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *
     * @return interactionId
     */
    @NotNull
    @JsonProperty("interactionId")
    public String getInteractionId();

    /**
     *
     * @return timestamp
     */
    @NotNull
    @JsonProperty("timestamp")
    public String getTimestamp();

    /**
     * set id
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * set interactionId
     * @param interactionId value to be set
     */

    public void setInteractionId(final String interactionId);

    /**
     * set timestamp
     * @param timestamp value to be set
     */

    public void setTimestamp(final String timestamp);

    /**
     * factory method
     * @return instance of TransactionChangeValue
     */
    public static TransactionChangeValue of() {
        return new TransactionChangeValueImpl();
    }

    /**
     * factory method to create a shallow copy TransactionChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static TransactionChangeValue of(final TransactionChangeValue template) {
        TransactionChangeValueImpl instance = new TransactionChangeValueImpl();
        instance.setId(template.getId());
        instance.setInteractionId(template.getInteractionId());
        instance.setTimestamp(template.getTimestamp());
        return instance;
    }

    /**
     * factory method to create a deep copy of TransactionChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TransactionChangeValue deepCopy(@Nullable final TransactionChangeValue template) {
        if (template == null) {
            return null;
        }
        TransactionChangeValueImpl instance = new TransactionChangeValueImpl();
        instance.setId(template.getId());
        instance.setInteractionId(template.getInteractionId());
        instance.setTimestamp(template.getTimestamp());
        return instance;
    }

    /**
     * builder factory method for TransactionChangeValue
     * @return builder
     */
    public static TransactionChangeValueBuilder builder() {
        return TransactionChangeValueBuilder.of();
    }

    /**
     * create builder for TransactionChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionChangeValueBuilder builder(final TransactionChangeValue template) {
        return TransactionChangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTransactionChangeValue(Function<TransactionChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TransactionChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TransactionChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<TransactionChangeValue>";
            }
        };
    }
}
