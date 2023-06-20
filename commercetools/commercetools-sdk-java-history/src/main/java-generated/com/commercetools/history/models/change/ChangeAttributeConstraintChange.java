
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.AttributeConstraintEnum;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the Change AttributeDefinition AttributeConstraint update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAttributeConstraintChange changeAttributeConstraintChange = ChangeAttributeConstraintChange.builder()
 *             .change("{change}")
 *             .previousValue(AttributeConstraintEnum.NONE)
 *             .nextValue(AttributeConstraintEnum.NONE)
 *             .attributeName("{attributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeAttributeConstraintChangeImpl.class)
public interface ChangeAttributeConstraintChange extends Change {

    /**
     * discriminator value for ChangeAttributeConstraintChange
     */
    String CHANGE_ATTRIBUTE_CONSTRAINT_CHANGE = "ChangeAttributeConstraintChange";

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
    public AttributeConstraintEnum getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public AttributeConstraintEnum getNextValue();

    /**
     *  <p>Name of the updated AttributeDefinition.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final AttributeConstraintEnum previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final AttributeConstraintEnum nextValue);

    /**
     *  <p>Name of the updated AttributeDefinition.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     * factory method
     * @return instance of ChangeAttributeConstraintChange
     */
    public static ChangeAttributeConstraintChange of() {
        return new ChangeAttributeConstraintChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeAttributeConstraintChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeAttributeConstraintChange of(final ChangeAttributeConstraintChange template) {
        ChangeAttributeConstraintChangeImpl instance = new ChangeAttributeConstraintChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setAttributeName(template.getAttributeName());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeAttributeConstraintChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeAttributeConstraintChange deepCopy(@Nullable final ChangeAttributeConstraintChange template) {
        if (template == null) {
            return null;
        }
        ChangeAttributeConstraintChangeImpl instance = new ChangeAttributeConstraintChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setAttributeName(template.getAttributeName());
        return instance;
    }

    /**
     * builder factory method for ChangeAttributeConstraintChange
     * @return builder
     */
    public static ChangeAttributeConstraintChangeBuilder builder() {
        return ChangeAttributeConstraintChangeBuilder.of();
    }

    /**
     * create builder for ChangeAttributeConstraintChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeAttributeConstraintChangeBuilder builder(final ChangeAttributeConstraintChange template) {
        return ChangeAttributeConstraintChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeAttributeConstraintChange(Function<ChangeAttributeConstraintChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeAttributeConstraintChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeAttributeConstraintChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeAttributeConstraintChange>";
            }
        };
    }
}
