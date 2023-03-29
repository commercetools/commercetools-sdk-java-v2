
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangePlainEnumValueLabelChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangePlainEnumValueLabelChange changePlainEnumValueLabelChange = ChangePlainEnumValueLabelChange.builder()
 *             .change("{change}")
 *             .attributeName("{attributeName}")
 *             .valueKey("{valueKey}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangePlainEnumValueLabelChangeImpl.class)
public interface ChangePlainEnumValueLabelChange extends Change {

    /**
     * discriminator value for ChangePlainEnumValueLabelChange
     */
    String CHANGE_PLAIN_ENUM_VALUE_LABEL_CHANGE = "ChangePlainEnumValueLabelChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>changePlainEnumValueLabel</code> on types</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>The name of the attribute updated.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>Key of the values that was updated</p>
     * @return valueKey
     */
    @NotNull
    @JsonProperty("valueKey")
    public String getValueKey();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     *  <p>Update action for <code>changePlainEnumValueLabel</code> on types</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>The name of the attribute updated.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     *  <p>Key of the values that was updated</p>
     * @param valueKey value to be set
     */

    public void setValueKey(final String valueKey);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final String previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     * factory method
     * @return instance of ChangePlainEnumValueLabelChange
     */
    public static ChangePlainEnumValueLabelChange of() {
        return new ChangePlainEnumValueLabelChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangePlainEnumValueLabelChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangePlainEnumValueLabelChange of(final ChangePlainEnumValueLabelChange template) {
        ChangePlainEnumValueLabelChangeImpl instance = new ChangePlainEnumValueLabelChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setValueKey(template.getValueKey());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangePlainEnumValueLabelChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangePlainEnumValueLabelChange deepCopy(@Nullable final ChangePlainEnumValueLabelChange template) {
        if (template == null) {
            return null;
        }
        ChangePlainEnumValueLabelChangeImpl instance = new ChangePlainEnumValueLabelChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setValueKey(template.getValueKey());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangePlainEnumValueLabelChange
     * @return builder
     */
    public static ChangePlainEnumValueLabelChangeBuilder builder() {
        return ChangePlainEnumValueLabelChangeBuilder.of();
    }

    /**
     * create builder for ChangePlainEnumValueLabelChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangePlainEnumValueLabelChangeBuilder builder(final ChangePlainEnumValueLabelChange template) {
        return ChangePlainEnumValueLabelChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangePlainEnumValueLabelChange(Function<ChangePlainEnumValueLabelChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangePlainEnumValueLabelChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangePlainEnumValueLabelChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangePlainEnumValueLabelChange>";
            }
        };
    }
}
