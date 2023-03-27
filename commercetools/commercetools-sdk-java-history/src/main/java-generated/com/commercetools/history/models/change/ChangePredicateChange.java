
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangePredicateChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangePredicateChange changePredicateChange = ChangePredicateChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangePredicateChangeImpl.class)
public interface ChangePredicateChange extends Change {

    /**
     * discriminator value for ChangePredicateChange
     */
    String CHANGE_PREDICATE_CHANGE = "ChangePredicateChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>changePredicate</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     *  <p>Shape of the action for <code>changePredicate</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final String previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     * factory method
     * @return instance of ChangePredicateChange
     */
    public static ChangePredicateChange of() {
        return new ChangePredicateChangeImpl();
    }

    /**
     * factory method to copy an instance of ChangePredicateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangePredicateChange of(final ChangePredicateChange template) {
        ChangePredicateChangeImpl instance = new ChangePredicateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangePredicateChange
     * @return builder
     */
    public static ChangePredicateChangeBuilder builder() {
        return ChangePredicateChangeBuilder.of();
    }

    /**
     * create builder for ChangePredicateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangePredicateChangeBuilder builder(final ChangePredicateChange template) {
        return ChangePredicateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangePredicateChange(Function<ChangePredicateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangePredicateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangePredicateChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangePredicateChange>";
            }
        };
    }
}
