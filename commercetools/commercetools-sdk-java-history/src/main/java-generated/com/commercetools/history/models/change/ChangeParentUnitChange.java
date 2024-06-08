
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.KeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Change Parent Unit update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeParentUnitChange changeParentUnitChange = ChangeParentUnitChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeParentUnitChangeImpl.class)
public interface ChangeParentUnitChange extends Change {

    /**
     * discriminator value for ChangeParentUnitChange
     */
    String CHANGE_PARENT_UNIT_CHANGE = "ChangeParentUnitChange";

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
    public KeyReference getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public KeyReference getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final KeyReference previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final KeyReference nextValue);

    /**
     * factory method
     * @return instance of ChangeParentUnitChange
     */
    public static ChangeParentUnitChange of() {
        return new ChangeParentUnitChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeParentUnitChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeParentUnitChange of(final ChangeParentUnitChange template) {
        ChangeParentUnitChangeImpl instance = new ChangeParentUnitChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeParentUnitChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeParentUnitChange deepCopy(@Nullable final ChangeParentUnitChange template) {
        if (template == null) {
            return null;
        }
        ChangeParentUnitChangeImpl instance = new ChangeParentUnitChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.KeyReference.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.KeyReference.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ChangeParentUnitChange
     * @return builder
     */
    public static ChangeParentUnitChangeBuilder builder() {
        return ChangeParentUnitChangeBuilder.of();
    }

    /**
     * create builder for ChangeParentUnitChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeParentUnitChangeBuilder builder(final ChangeParentUnitChange template) {
        return ChangeParentUnitChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeParentUnitChange(Function<ChangeParentUnitChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeParentUnitChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeParentUnitChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeParentUnitChange>";
            }
        };
    }
}
