
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
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountChangeSortOrderAction" rel="nofollow">Change Sort Order</a> on Cart Discounts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscountChangeSortOrderAction" rel="nofollow">Change Sort Order</a> on Product Discounts.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeSortOrderChange changeSortOrderChange = ChangeSortOrderChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeSortOrderChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeSortOrderChangeImpl.class)
public interface ChangeSortOrderChange extends Change {

    /**
     * discriminator value for ChangeSortOrderChange
     */
    String CHANGE_SORT_ORDER_CHANGE = "ChangeSortOrderChange";

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
     * @return instance of ChangeSortOrderChange
     */
    public static ChangeSortOrderChange of() {
        return new ChangeSortOrderChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeSortOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeSortOrderChange of(final ChangeSortOrderChange template) {
        ChangeSortOrderChangeImpl instance = new ChangeSortOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeSortOrderChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeSortOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeSortOrderChange deepCopy(@Nullable final ChangeSortOrderChange template) {
        if (template == null) {
            return null;
        }
        ChangeSortOrderChangeImpl instance = new ChangeSortOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeSortOrderChange
     * @return builder
     */
    public static ChangeSortOrderChangeBuilder builder() {
        return ChangeSortOrderChangeBuilder.of();
    }

    /**
     * create builder for ChangeSortOrderChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeSortOrderChangeBuilder builder(final ChangeSortOrderChange template) {
        return ChangeSortOrderChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeSortOrderChange(Function<ChangeSortOrderChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeSortOrderChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeSortOrderChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeSortOrderChange>";
            }
        };
    }
}
