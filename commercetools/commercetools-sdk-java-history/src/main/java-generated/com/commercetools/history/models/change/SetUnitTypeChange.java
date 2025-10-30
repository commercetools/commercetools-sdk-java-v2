
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.BusinessUnitResourceIdentifier;
import com.commercetools.history.models.common.BusinessUnitType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetUnitTypeChange setUnitTypeChange = SetUnitTypeChange.builder()
 *             .change("{change}")
 *             .parentUnit(parentUnitBuilder -> parentUnitBuilder)
 *             .previousValue(BusinessUnitType.COMPANY)
 *             .nextValue(BusinessUnitType.COMPANY)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetUnitTypeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetUnitTypeChangeImpl.class)
public interface SetUnitTypeChange extends Change {

    /**
     * discriminator value for SetUnitTypeChange
     */
    String SET_UNIT_TYPE_CHANGE = "SetUnitTypeChange";

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
     *  <p>If <code>unitType="Division"</code>, reference to the new parent unit for the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @return parentUnit
     */
    @NotNull
    @Valid
    @JsonProperty("parentUnit")
    public BusinessUnitResourceIdentifier getParentUnit();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public BusinessUnitType getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public BusinessUnitType getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>If <code>unitType="Division"</code>, reference to the new parent unit for the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @param parentUnit value to be set
     */

    public void setParentUnit(final BusinessUnitResourceIdentifier parentUnit);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final BusinessUnitType previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final BusinessUnitType nextValue);

    /**
     * factory method
     * @return instance of SetUnitTypeChange
     */
    public static SetUnitTypeChange of() {
        return new SetUnitTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetUnitTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetUnitTypeChange of(final SetUnitTypeChange template) {
        SetUnitTypeChangeImpl instance = new SetUnitTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setParentUnit(template.getParentUnit());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetUnitTypeChange copyDeep();

    /**
     * factory method to create a deep copy of SetUnitTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetUnitTypeChange deepCopy(@Nullable final SetUnitTypeChange template) {
        if (template == null) {
            return null;
        }
        SetUnitTypeChangeImpl instance = new SetUnitTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setParentUnit(
            com.commercetools.history.models.common.BusinessUnitResourceIdentifier.deepCopy(template.getParentUnit()));
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetUnitTypeChange
     * @return builder
     */
    public static SetUnitTypeChangeBuilder builder() {
        return SetUnitTypeChangeBuilder.of();
    }

    /**
     * create builder for SetUnitTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetUnitTypeChangeBuilder builder(final SetUnitTypeChange template) {
        return SetUnitTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetUnitTypeChange(Function<SetUnitTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetUnitTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetUnitTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetUnitTypeChange>";
            }
        };
    }
}
