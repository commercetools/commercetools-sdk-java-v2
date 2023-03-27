
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeSortOrderChange
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
     *  <p>Shape of the action for <code>changeSortOrder</code></p>
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
     *  <p>Shape of the action for <code>changeSortOrder</code></p>
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
     * @return instance of ChangeSortOrderChange
     */
    public static ChangeSortOrderChange of() {
        return new ChangeSortOrderChangeImpl();
    }

    /**
     * factory method to copy an instance of ChangeSortOrderChange
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
