
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
 *  <p>Change triggered by the Set Cart Predicate update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCartPredicateChange setCartPredicateChange = SetCartPredicateChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetCartPredicateChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCartPredicateChangeImpl.class)
public interface SetCartPredicateChange extends Change {

    /**
     * discriminator value for SetCartPredicateChange
     */
    String SET_CART_PREDICATE_CHANGE = "SetCartPredicateChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

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
     * @return instance of SetCartPredicateChange
     */
    public static SetCartPredicateChange of() {
        return new SetCartPredicateChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCartPredicateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCartPredicateChange of(final SetCartPredicateChange template) {
        SetCartPredicateChangeImpl instance = new SetCartPredicateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetCartPredicateChange copyDeep();

    /**
     * factory method to create a deep copy of SetCartPredicateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCartPredicateChange deepCopy(@Nullable final SetCartPredicateChange template) {
        if (template == null) {
            return null;
        }
        SetCartPredicateChangeImpl instance = new SetCartPredicateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetCartPredicateChange
     * @return builder
     */
    public static SetCartPredicateChangeBuilder builder() {
        return SetCartPredicateChangeBuilder.of();
    }

    /**
     * create builder for SetCartPredicateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCartPredicateChangeBuilder builder(final SetCartPredicateChange template) {
        return SetCartPredicateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCartPredicateChange(Function<SetCartPredicateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCartPredicateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCartPredicateChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCartPredicateChange>";
            }
        };
    }
}
