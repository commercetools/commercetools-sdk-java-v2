
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetRestockableInDaysChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetRestockableInDaysChange setRestockableInDaysChange = SetRestockableInDaysChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetRestockableInDaysChangeImpl.class)
public interface SetRestockableInDaysChange extends Change {

    /**
     * discriminator value for SetRestockableInDaysChange
     */
    String SET_RESTOCKABLE_IN_DAYS_CHANGE = "SetRestockableInDaysChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>setRestockableInDays</code></p>
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
    public Integer getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    /**
     *  <p>Shape of the action for <code>setRestockableInDays</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Integer previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Integer nextValue);

    /**
     * factory method
     * @return instance of SetRestockableInDaysChange
     */
    public static SetRestockableInDaysChange of() {
        return new SetRestockableInDaysChangeImpl();
    }

    /**
     * factory method to copy an instance of SetRestockableInDaysChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetRestockableInDaysChange of(final SetRestockableInDaysChange template) {
        SetRestockableInDaysChangeImpl instance = new SetRestockableInDaysChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetRestockableInDaysChange
     * @return builder
     */
    public static SetRestockableInDaysChangeBuilder builder() {
        return SetRestockableInDaysChangeBuilder.of();
    }

    /**
     * create builder for SetRestockableInDaysChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetRestockableInDaysChangeBuilder builder(final SetRestockableInDaysChange template) {
        return SetRestockableInDaysChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetRestockableInDaysChange(Function<SetRestockableInDaysChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetRestockableInDaysChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetRestockableInDaysChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetRestockableInDaysChange>";
            }
        };
    }
}
