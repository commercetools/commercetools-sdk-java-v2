
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.AttributeConstraintEnum;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeAttributeConstraintChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAttributeConstraintChange changeAttributeConstraintChange = ChangeAttributeConstraintChange.builder()
 *             .change("{change}")
 *             .attributeName("{attributeName}")
 *             .previousValue(AttributeConstraintEnum.NONE)
 *             .nextValue(AttributeConstraintEnum.NONE)
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
     *  <p>name of the updated attribute</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public AttributeConstraintEnum getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public AttributeConstraintEnum getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>name of the updated attribute</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final AttributeConstraintEnum previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final AttributeConstraintEnum nextValue);

    /**
     * factory method
     * @return instance of ChangeAttributeConstraintChange
     */
    public static ChangeAttributeConstraintChange of() {
        return new ChangeAttributeConstraintChangeImpl();
    }

    /**
     * factory method to copy an instance of ChangeAttributeConstraintChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeAttributeConstraintChange of(final ChangeAttributeConstraintChange template) {
        ChangeAttributeConstraintChangeImpl instance = new ChangeAttributeConstraintChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
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
