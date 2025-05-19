
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
 *  <p>Change triggered by the Change Cart Predicate update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeCartPredicateChange changeCartPredicateChange = ChangeCartPredicateChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeCartPredicateChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeCartPredicateChangeImpl.class)
public interface ChangeCartPredicateChange extends Change {

    /**
     * discriminator value for ChangeCartPredicateChange
     */
    String CHANGE_CART_PREDICATE_CHANGE = "ChangeCartPredicateChange";

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
     * @return instance of ChangeCartPredicateChange
     */
    public static ChangeCartPredicateChange of() {
        return new ChangeCartPredicateChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeCartPredicateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeCartPredicateChange of(final ChangeCartPredicateChange template) {
        ChangeCartPredicateChangeImpl instance = new ChangeCartPredicateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeCartPredicateChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeCartPredicateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeCartPredicateChange deepCopy(@Nullable final ChangeCartPredicateChange template) {
        if (template == null) {
            return null;
        }
        ChangeCartPredicateChangeImpl instance = new ChangeCartPredicateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeCartPredicateChange
     * @return builder
     */
    public static ChangeCartPredicateChangeBuilder builder() {
        return ChangeCartPredicateChangeBuilder.of();
    }

    /**
     * create builder for ChangeCartPredicateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeCartPredicateChangeBuilder builder(final ChangeCartPredicateChange template) {
        return ChangeCartPredicateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeCartPredicateChange(Function<ChangeCartPredicateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeCartPredicateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeCartPredicateChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeCartPredicateChange>";
            }
        };
    }
}
