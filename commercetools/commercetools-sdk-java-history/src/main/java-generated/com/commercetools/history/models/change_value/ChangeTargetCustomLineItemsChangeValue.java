
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ChangeTargetCustomLineItemsChangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTargetCustomLineItemsChangeValue changeTargetCustomLineItemsChangeValue = ChangeTargetCustomLineItemsChangeValue.builder()
 *             .predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("customLineItems")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTargetCustomLineItemsChangeValueImpl.class)
public interface ChangeTargetCustomLineItemsChangeValue extends ChangeTargetChangeValue {

    /**
     * discriminator value for ChangeTargetCustomLineItemsChangeValue
     */
    String CUSTOM_LINE_ITEMS = "customLineItems";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Valid CustomLineItem target predicate.</p>
     * @return predicate
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Valid CustomLineItem target predicate.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     * factory method
     * @return instance of ChangeTargetCustomLineItemsChangeValue
     */
    public static ChangeTargetCustomLineItemsChangeValue of() {
        return new ChangeTargetCustomLineItemsChangeValueImpl();
    }

    /**
     * factory method to create a shallow copy ChangeTargetCustomLineItemsChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeTargetCustomLineItemsChangeValue of(final ChangeTargetCustomLineItemsChangeValue template) {
        ChangeTargetCustomLineItemsChangeValueImpl instance = new ChangeTargetCustomLineItemsChangeValueImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    public ChangeTargetCustomLineItemsChangeValue copyDeep();

    /**
     * factory method to create a deep copy of ChangeTargetCustomLineItemsChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeTargetCustomLineItemsChangeValue deepCopy(
            @Nullable final ChangeTargetCustomLineItemsChangeValue template) {
        if (template == null) {
            return null;
        }
        ChangeTargetCustomLineItemsChangeValueImpl instance = new ChangeTargetCustomLineItemsChangeValueImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    /**
     * builder factory method for ChangeTargetCustomLineItemsChangeValue
     * @return builder
     */
    public static ChangeTargetCustomLineItemsChangeValueBuilder builder() {
        return ChangeTargetCustomLineItemsChangeValueBuilder.of();
    }

    /**
     * create builder for ChangeTargetCustomLineItemsChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTargetCustomLineItemsChangeValueBuilder builder(
            final ChangeTargetCustomLineItemsChangeValue template) {
        return ChangeTargetCustomLineItemsChangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTargetCustomLineItemsChangeValue(
            Function<ChangeTargetCustomLineItemsChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTargetCustomLineItemsChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTargetCustomLineItemsChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTargetCustomLineItemsChangeValue>";
            }
        };
    }
}
