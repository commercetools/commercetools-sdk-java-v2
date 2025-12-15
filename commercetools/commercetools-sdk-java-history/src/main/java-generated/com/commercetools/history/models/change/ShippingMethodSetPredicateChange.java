
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethodSetPredicateAction" rel="nofollow">Set Predicate</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetPredicateChange shippingMethodSetPredicateChange = ShippingMethodSetPredicateChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShippingMethodSetPredicateChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetPredicateChangeImpl.class)
public interface ShippingMethodSetPredicateChange extends Change {

    /**
     * discriminator value for ShippingMethodSetPredicateChange
     */
    String SHIPPING_METHOD_SET_PREDICATE_CHANGE = "ShippingMethodSetPredicateChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final String previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     * factory method
     * @return instance of ShippingMethodSetPredicateChange
     */
    public static ShippingMethodSetPredicateChange of() {
        return new ShippingMethodSetPredicateChangeImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodSetPredicateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodSetPredicateChange of(final ShippingMethodSetPredicateChange template) {
        ShippingMethodSetPredicateChangeImpl instance = new ShippingMethodSetPredicateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ShippingMethodSetPredicateChange copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodSetPredicateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodSetPredicateChange deepCopy(@Nullable final ShippingMethodSetPredicateChange template) {
        if (template == null) {
            return null;
        }
        ShippingMethodSetPredicateChangeImpl instance = new ShippingMethodSetPredicateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodSetPredicateChange
     * @return builder
     */
    public static ShippingMethodSetPredicateChangeBuilder builder() {
        return ShippingMethodSetPredicateChangeBuilder.of();
    }

    /**
     * create builder for ShippingMethodSetPredicateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetPredicateChangeBuilder builder(final ShippingMethodSetPredicateChange template) {
        return ShippingMethodSetPredicateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodSetPredicateChange(Function<ShippingMethodSetPredicateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetPredicateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetPredicateChange>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetPredicateChange>";
            }
        };
    }
}
