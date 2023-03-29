
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
 * ChangeEnumValueLabelChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeEnumValueLabelChange changeEnumValueLabelChange = ChangeEnumValueLabelChange.builder()
 *             .change("{change}")
 *             .fieldName("{fieldName}")
 *             .valueKey("{valueKey}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
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
     *  <p>Update action for <code>changeEnumValueLabel</code> on types</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>The name of the field definition updated.</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

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
     *  <p>Update action for <code>changeEnumValueLabel</code> on types</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>The name of the field definition updated.</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

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
        instance.setFieldName(template.getFieldName());
        instance.setValueKey(template.getValueKey());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

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
        instance.setFieldName(template.getFieldName());
        instance.setValueKey(template.getValueKey());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
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
