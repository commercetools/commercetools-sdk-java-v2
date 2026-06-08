
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListSetBusinessUnitAction" rel="nofollow">Set Business Unit</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetBusinessUnitChange setBusinessUnitChange = SetBusinessUnitChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetBusinessUnitChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetBusinessUnitChangeImpl.class)
public interface SetBusinessUnitChange extends Change {

    /**
     * discriminator value for SetBusinessUnitChange
     */
    String SET_BUSINESS_UNIT_CHANGE = "SetBusinessUnitChange";

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
     * @return instance of SetBusinessUnitChange
     */
    public static SetBusinessUnitChange of() {
        return new SetBusinessUnitChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetBusinessUnitChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetBusinessUnitChange of(final SetBusinessUnitChange template) {
        SetBusinessUnitChangeImpl instance = new SetBusinessUnitChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetBusinessUnitChange copyDeep();

    /**
     * factory method to create a deep copy of SetBusinessUnitChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetBusinessUnitChange deepCopy(@Nullable final SetBusinessUnitChange template) {
        if (template == null) {
            return null;
        }
        SetBusinessUnitChangeImpl instance = new SetBusinessUnitChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.KeyReference.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.KeyReference.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetBusinessUnitChange
     * @return builder
     */
    public static SetBusinessUnitChangeBuilder builder() {
        return SetBusinessUnitChangeBuilder.of();
    }

    /**
     * create builder for SetBusinessUnitChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetBusinessUnitChangeBuilder builder(final SetBusinessUnitChange template) {
        return SetBusinessUnitChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetBusinessUnitChange(Function<SetBusinessUnitChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetBusinessUnitChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetBusinessUnitChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetBusinessUnitChange>";
            }
        };
    }
}
