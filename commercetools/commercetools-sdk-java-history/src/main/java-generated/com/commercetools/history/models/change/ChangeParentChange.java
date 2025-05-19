
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Change Parent update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeParentChange changeParentChange = ChangeParentChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeParentChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeParentChangeImpl.class)
public interface ChangeParentChange extends Change {

    /**
     * discriminator value for ChangeParentChange
     */
    String CHANGE_PARENT_CHANGE = "ChangeParentChange";

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
     * @return instance of ChangeParentChange
     */
    public static ChangeParentChange of() {
        return new ChangeParentChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeParentChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeParentChange of(final ChangeParentChange template) {
        ChangeParentChangeImpl instance = new ChangeParentChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeParentChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeParentChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeParentChange deepCopy(@Nullable final ChangeParentChange template) {
        if (template == null) {
            return null;
        }
        ChangeParentChangeImpl instance = new ChangeParentChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Reference.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Reference.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ChangeParentChange
     * @return builder
     */
    public static ChangeParentChangeBuilder builder() {
        return ChangeParentChangeBuilder.of();
    }

    /**
     * create builder for ChangeParentChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeParentChangeBuilder builder(final ChangeParentChange template) {
        return ChangeParentChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeParentChange(Function<ChangeParentChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeParentChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeParentChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeParentChange>";
            }
        };
    }
}
