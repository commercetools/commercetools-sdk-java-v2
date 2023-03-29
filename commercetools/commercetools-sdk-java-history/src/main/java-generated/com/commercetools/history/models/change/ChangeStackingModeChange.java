
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.StackingMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeStackingModeChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeStackingModeChange changeStackingModeChange = ChangeStackingModeChange.builder()
 *             .change("{change}")
 *             .nextValue(StackingMode.STACKING)
 *             .previousValue(StackingMode.STACKING)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeStackingModeChangeImpl.class)
public interface ChangeStackingModeChange extends Change {

    /**
     * discriminator value for ChangeStackingModeChange
     */
    String CHANGE_STACKING_MODE_CHANGE = "ChangeStackingModeChange";

    /**
     *  <p>Update action for <code>changeStackingMode</code> on cart discounts</p>
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
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public StackingMode getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public StackingMode getPreviousValue();

    /**
     *  <p>Update action for <code>changeStackingMode</code> on cart discounts</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final StackingMode nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final StackingMode previousValue);

    /**
     * factory method
     * @return instance of ChangeStackingModeChange
     */
    public static ChangeStackingModeChange of() {
        return new ChangeStackingModeChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeStackingModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeStackingModeChange of(final ChangeStackingModeChange template) {
        ChangeStackingModeChangeImpl instance = new ChangeStackingModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeStackingModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeStackingModeChange deepCopy(@Nullable final ChangeStackingModeChange template) {
        if (template == null) {
            return null;
        }
        ChangeStackingModeChangeImpl instance = new ChangeStackingModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for ChangeStackingModeChange
     * @return builder
     */
    public static ChangeStackingModeChangeBuilder builder() {
        return ChangeStackingModeChangeBuilder.of();
    }

    /**
     * create builder for ChangeStackingModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeStackingModeChangeBuilder builder(final ChangeStackingModeChange template) {
        return ChangeStackingModeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeStackingModeChange(Function<ChangeStackingModeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeStackingModeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeStackingModeChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeStackingModeChange>";
            }
        };
    }
}
