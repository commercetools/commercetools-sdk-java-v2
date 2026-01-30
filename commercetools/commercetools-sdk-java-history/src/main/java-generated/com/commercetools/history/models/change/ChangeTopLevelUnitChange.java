
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeParentUnitAction" rel="nofollow">Change Parent Unit</a> update actions.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTopLevelUnitChange changeTopLevelUnitChange = ChangeTopLevelUnitChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeTopLevelUnitChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTopLevelUnitChangeImpl.class)
public interface ChangeTopLevelUnitChange extends Change {

    /**
     * discriminator value for ChangeTopLevelUnitChange
     */
    String CHANGE_TOP_LEVEL_UNIT_CHANGE = "ChangeTopLevelUnitChange";

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
     * @return instance of ChangeTopLevelUnitChange
     */
    public static ChangeTopLevelUnitChange of() {
        return new ChangeTopLevelUnitChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeTopLevelUnitChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeTopLevelUnitChange of(final ChangeTopLevelUnitChange template) {
        ChangeTopLevelUnitChangeImpl instance = new ChangeTopLevelUnitChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeTopLevelUnitChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeTopLevelUnitChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeTopLevelUnitChange deepCopy(@Nullable final ChangeTopLevelUnitChange template) {
        if (template == null) {
            return null;
        }
        ChangeTopLevelUnitChangeImpl instance = new ChangeTopLevelUnitChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.KeyReference.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.KeyReference.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ChangeTopLevelUnitChange
     * @return builder
     */
    public static ChangeTopLevelUnitChangeBuilder builder() {
        return ChangeTopLevelUnitChangeBuilder.of();
    }

    /**
     * create builder for ChangeTopLevelUnitChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTopLevelUnitChangeBuilder builder(final ChangeTopLevelUnitChange template) {
        return ChangeTopLevelUnitChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTopLevelUnitChange(Function<ChangeTopLevelUnitChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTopLevelUnitChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTopLevelUnitChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTopLevelUnitChange>";
            }
        };
    }
}
