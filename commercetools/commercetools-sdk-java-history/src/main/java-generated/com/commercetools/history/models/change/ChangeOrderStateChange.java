
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.OrderState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Change OrderState on Orders.</li>
 *   <li>Change OrderState on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeOrderStateChange changeOrderStateChange = ChangeOrderStateChange.builder()
 *             .change("{change}")
 *             .previousValue(OrderState.OPEN)
 *             .nextValue(OrderState.OPEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeOrderStateChangeImpl.class)
public interface ChangeOrderStateChange extends Change {

    /**
     * discriminator value for ChangeOrderStateChange
     */
    String CHANGE_ORDER_STATE_CHANGE = "ChangeOrderStateChange";

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
    public OrderState getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public OrderState getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final OrderState previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final OrderState nextValue);

    /**
     * factory method
     * @return instance of ChangeOrderStateChange
     */
    public static ChangeOrderStateChange of() {
        return new ChangeOrderStateChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeOrderStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeOrderStateChange of(final ChangeOrderStateChange template) {
        ChangeOrderStateChangeImpl instance = new ChangeOrderStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeOrderStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeOrderStateChange deepCopy(@Nullable final ChangeOrderStateChange template) {
        if (template == null) {
            return null;
        }
        ChangeOrderStateChangeImpl instance = new ChangeOrderStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeOrderStateChange
     * @return builder
     */
    public static ChangeOrderStateChangeBuilder builder() {
        return ChangeOrderStateChangeBuilder.of();
    }

    /**
     * create builder for ChangeOrderStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeOrderStateChangeBuilder builder(final ChangeOrderStateChange template) {
        return ChangeOrderStateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeOrderStateChange(Function<ChangeOrderStateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeOrderStateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeOrderStateChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeOrderStateChange>";
            }
        };
    }
}
