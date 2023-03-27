
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetOrderNumberChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetOrderNumberChange setOrderNumberChange = SetOrderNumberChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetOrderNumberChangeImpl.class)
public interface SetOrderNumberChange extends Change {

    /**
     * discriminator value for SetOrderNumberChange
     */
    String SET_ORDER_NUMBER_CHANGE = "SetOrderNumberChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>setOrderNumber</code></p>
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
     *  <p>Shape of the action for <code>setOrderNumber</code></p>
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
     * @return instance of SetOrderNumberChange
     */
    public static SetOrderNumberChange of() {
        return new SetOrderNumberChangeImpl();
    }

    /**
     * factory method to copy an instance of SetOrderNumberChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetOrderNumberChange of(final SetOrderNumberChange template) {
        SetOrderNumberChangeImpl instance = new SetOrderNumberChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetOrderNumberChange
     * @return builder
     */
    public static SetOrderNumberChangeBuilder builder() {
        return SetOrderNumberChangeBuilder.of();
    }

    /**
     * create builder for SetOrderNumberChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetOrderNumberChangeBuilder builder(final SetOrderNumberChange template) {
        return SetOrderNumberChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetOrderNumberChange(Function<SetOrderNumberChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetOrderNumberChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetOrderNumberChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetOrderNumberChange>";
            }
        };
    }
}
