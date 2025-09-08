
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:TypeChangeEnumValueLabelAction" rel="nofollow">Change EnumValue Label</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeEnumValueLabelChange changeEnumValueLabelChange = ChangeEnumValueLabelChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .fieldName("{fieldName}")
 *             .valueKey("{valueKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeEnumValueLabelChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeEnumValueLabelChangeImpl.class)
public interface ChangeEnumValueLabelChange extends Change {

    /**
     * discriminator value for ChangeEnumValueLabelChange
     */
    String CHANGE_ENUM_VALUE_LABEL_CHANGE = "ChangeEnumValueLabelChange";

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
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>.</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

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
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>.</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

    /**
     *  <p>Key of the updated values.</p>
     * @param valueKey value to be set
     */

    public void setValueKey(final String valueKey);

    /**
     * factory method
     * @return instance of ChangeEnumValueLabelChange
     */
    public static ChangeEnumValueLabelChange of() {
        return new ChangeEnumValueLabelChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeEnumValueLabelChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeEnumValueLabelChange of(final ChangeEnumValueLabelChange template) {
        ChangeEnumValueLabelChangeImpl instance = new ChangeEnumValueLabelChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setFieldName(template.getFieldName());
        instance.setValueKey(template.getValueKey());
        return instance;
    }

    public ChangeEnumValueLabelChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeEnumValueLabelChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeEnumValueLabelChange deepCopy(@Nullable final ChangeEnumValueLabelChange template) {
        if (template == null) {
            return null;
        }
        ChangeEnumValueLabelChangeImpl instance = new ChangeEnumValueLabelChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setFieldName(template.getFieldName());
        instance.setValueKey(template.getValueKey());
        return instance;
    }

    /**
     * builder factory method for ChangeEnumValueLabelChange
     * @return builder
     */
    public static ChangeEnumValueLabelChangeBuilder builder() {
        return ChangeEnumValueLabelChangeBuilder.of();
    }

    /**
     * create builder for ChangeEnumValueLabelChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeEnumValueLabelChangeBuilder builder(final ChangeEnumValueLabelChange template) {
        return ChangeEnumValueLabelChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeEnumValueLabelChange(Function<ChangeEnumValueLabelChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeEnumValueLabelChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeEnumValueLabelChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeEnumValueLabelChange>";
            }
        };
    }
}
