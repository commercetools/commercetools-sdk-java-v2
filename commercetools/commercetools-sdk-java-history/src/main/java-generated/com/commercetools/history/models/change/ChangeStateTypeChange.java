
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.StateTypeEnum;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StateChangeTypeAction" rel="nofollow">Change State Type</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeStateTypeChange changeStateTypeChange = ChangeStateTypeChange.builder()
 *             .change("{change}")
 *             .previousValue(StateTypeEnum.ORDER_STATE)
 *             .nextValue(StateTypeEnum.ORDER_STATE)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeStateTypeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeStateTypeChangeImpl.class)
public interface ChangeStateTypeChange extends Change {

    /**
     * discriminator value for ChangeStateTypeChange
     */
    String CHANGE_STATE_TYPE_CHANGE = "ChangeStateTypeChange";

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
    public StateTypeEnum getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public StateTypeEnum getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final StateTypeEnum previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final StateTypeEnum nextValue);

    /**
     * factory method
     * @return instance of ChangeStateTypeChange
     */
    public static ChangeStateTypeChange of() {
        return new ChangeStateTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeStateTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeStateTypeChange of(final ChangeStateTypeChange template) {
        ChangeStateTypeChangeImpl instance = new ChangeStateTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeStateTypeChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeStateTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeStateTypeChange deepCopy(@Nullable final ChangeStateTypeChange template) {
        if (template == null) {
            return null;
        }
        ChangeStateTypeChangeImpl instance = new ChangeStateTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeStateTypeChange
     * @return builder
     */
    public static ChangeStateTypeChangeBuilder builder() {
        return ChangeStateTypeChangeBuilder.of();
    }

    /**
     * create builder for ChangeStateTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeStateTypeChangeBuilder builder(final ChangeStateTypeChange template) {
        return ChangeStateTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeStateTypeChange(Function<ChangeStateTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeStateTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeStateTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeStateTypeChange>";
            }
        };
    }
}
