
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.ChangeTargetChangeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Change Target update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTargetChange changeTargetChange = ChangeTargetChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeTargetChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTargetChangeImpl.class)
public interface ChangeTargetChange extends Change {

    /**
     * discriminator value for ChangeTargetChange
     */
    String CHANGE_TARGET_CHANGE = "ChangeTargetChange";

    /**
     *
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
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ChangeTargetChangeValue getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ChangeTargetChangeValue getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ChangeTargetChangeValue previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final ChangeTargetChangeValue nextValue);

    /**
     * factory method
     * @return instance of ChangeTargetChange
     */
    public static ChangeTargetChange of() {
        return new ChangeTargetChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeTargetChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeTargetChange of(final ChangeTargetChange template) {
        ChangeTargetChangeImpl instance = new ChangeTargetChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeTargetChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeTargetChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeTargetChange deepCopy(@Nullable final ChangeTargetChange template) {
        if (template == null) {
            return null;
        }
        ChangeTargetChangeImpl instance = new ChangeTargetChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(com.commercetools.history.models.change_value.ChangeTargetChangeValue
                .deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.change_value.ChangeTargetChangeValue.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ChangeTargetChange
     * @return builder
     */
    public static ChangeTargetChangeBuilder builder() {
        return ChangeTargetChangeBuilder.of();
    }

    /**
     * create builder for ChangeTargetChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTargetChangeBuilder builder(final ChangeTargetChange template) {
        return ChangeTargetChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTargetChange(Function<ChangeTargetChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTargetChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTargetChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTargetChange>";
            }
        };
    }
}
