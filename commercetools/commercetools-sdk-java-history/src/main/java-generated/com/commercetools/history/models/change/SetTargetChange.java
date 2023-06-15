
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the Set Target update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTargetChange setTargetChange = SetTargetChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetTargetChangeImpl.class)
public interface SetTargetChange extends Change {

    /**
     * discriminator value for SetTargetChange
     */
    String SET_TARGET_CHANGE = "SetTargetChange";

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
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Reference previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Reference nextValue);

    /**
     * factory method
     * @return instance of SetTargetChange
     */
    public static SetTargetChange of() {
        return new SetTargetChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetTargetChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetTargetChange of(final SetTargetChange template) {
        SetTargetChangeImpl instance = new SetTargetChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetTargetChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetTargetChange deepCopy(@Nullable final SetTargetChange template) {
        if (template == null) {
            return null;
        }
        SetTargetChangeImpl instance = new SetTargetChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Reference.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Reference.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetTargetChange
     * @return builder
     */
    public static SetTargetChangeBuilder builder() {
        return SetTargetChangeBuilder.of();
    }

    /**
     * create builder for SetTargetChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTargetChangeBuilder builder(final SetTargetChange template) {
        return SetTargetChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetTargetChange(Function<SetTargetChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetTargetChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetTargetChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetTargetChange>";
            }
        };
    }
}
