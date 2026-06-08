
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTypeChangePlainEnumValueLabelAction" rel="nofollow">Change the label of an EnumValue</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangePlainEnumValueLabelChange changePlainEnumValueLabelChange = ChangePlainEnumValueLabelChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .attributeName("{attributeName}")
 *             .valueKey("{valueKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangePlainEnumValueLabelChange")
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
    public String getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>Key of the updated values.</p>
     * @return valueKey
     */
    @NotNull
    @JsonProperty("valueKey")
    public String getValueKey();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final String previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     *  <p>Key of the updated values.</p>
     * @param valueKey value to be set
     */

    public void setValueKey(final String valueKey);

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
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setAttributeName(template.getAttributeName());
        instance.setValueKey(template.getValueKey());
        return instance;
    }

    public ChangePlainEnumValueLabelChange copyDeep();

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
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setAttributeName(template.getAttributeName());
        instance.setValueKey(template.getValueKey());
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
