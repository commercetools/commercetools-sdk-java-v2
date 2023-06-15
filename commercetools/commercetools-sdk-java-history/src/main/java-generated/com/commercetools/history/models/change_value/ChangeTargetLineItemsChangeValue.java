
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
 * ChangeTargetLineItemsChangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTargetLineItemsChangeValue changeTargetLineItemsChangeValue = ChangeTargetLineItemsChangeValue.builder()
 *             .predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTargetLineItemsChangeValueImpl.class)
public interface ChangeTargetLineItemsChangeValue extends ChangeTargetChangeValue {

    /**
     * discriminator value for ChangeTargetLineItemsChangeValue
     */
    String LINE_ITEMS = "lineItems";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Valid LineItem target predicate.</p>
     * @return predicate
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Valid LineItem target predicate.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     * factory method
     * @return instance of ChangeTargetLineItemsChangeValue
     */
    public static ChangeTargetLineItemsChangeValue of() {
        return new ChangeTargetLineItemsChangeValueImpl();
    }

    /**
     * factory method to create a shallow copy ChangeTargetLineItemsChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeTargetLineItemsChangeValue of(final ChangeTargetLineItemsChangeValue template) {
        ChangeTargetLineItemsChangeValueImpl instance = new ChangeTargetLineItemsChangeValueImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeTargetLineItemsChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeTargetLineItemsChangeValue deepCopy(@Nullable final ChangeTargetLineItemsChangeValue template) {
        if (template == null) {
            return null;
        }
        ChangeTargetLineItemsChangeValueImpl instance = new ChangeTargetLineItemsChangeValueImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    /**
     * builder factory method for ChangeTargetLineItemsChangeValue
     * @return builder
     */
    public static ChangeTargetLineItemsChangeValueBuilder builder() {
        return ChangeTargetLineItemsChangeValueBuilder.of();
    }

    /**
     * create builder for ChangeTargetLineItemsChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTargetLineItemsChangeValueBuilder builder(final ChangeTargetLineItemsChangeValue template) {
        return ChangeTargetLineItemsChangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTargetLineItemsChangeValue(Function<ChangeTargetLineItemsChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTargetLineItemsChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTargetLineItemsChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTargetLineItemsChangeValue>";
            }
        };
    }
}
