
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.TextInputHint;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Change AttributeDefinition InputHint on Product Types.</li>
 *   <li>Change InputHint on Types.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeInputHintChange changeInputHintChange = ChangeInputHintChange.builder()
 *             .change("{change}")
 *             .previousValue(TextInputHint.SINGLE_LINE)
 *             .nextValue(TextInputHint.SINGLE_LINE)
 *             .fieldName("{fieldName}")
 *             .attributeName("{attributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeInputHintChangeImpl.class)
public interface ChangeInputHintChange extends Change {

    /**
     * discriminator value for ChangeInputHintChange
     */
    String CHANGE_INPUT_HINT_CHANGE = "ChangeInputHintChange";

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
    public TextInputHint getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public TextInputHint getNextValue();

    /**
     *  <p>Name of the updated FieldDefinition; only present on changes to Types.</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
     *  <p>Name of the updated AttributeDefinition; only present on changes to Product Types.</p>
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

    public void setPreviousValue(final TextInputHint previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final TextInputHint nextValue);

    /**
     *  <p>Name of the updated FieldDefinition; only present on changes to Types.</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

    /**
     *  <p>Name of the updated AttributeDefinition; only present on changes to Product Types.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     * factory method
     * @return instance of ChangeInputHintChange
     */
    public static ChangeInputHintChange of() {
        return new ChangeInputHintChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeInputHintChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeInputHintChange of(final ChangeInputHintChange template) {
        ChangeInputHintChangeImpl instance = new ChangeInputHintChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeInputHintChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeInputHintChange deepCopy(@Nullable final ChangeInputHintChange template) {
        if (template == null) {
            return null;
        }
        ChangeInputHintChangeImpl instance = new ChangeInputHintChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        return instance;
    }

    /**
     * builder factory method for ChangeInputHintChange
     * @return builder
     */
    public static ChangeInputHintChangeBuilder builder() {
        return ChangeInputHintChangeBuilder.of();
    }

    /**
     * create builder for ChangeInputHintChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeInputHintChangeBuilder builder(final ChangeInputHintChange template) {
        return ChangeInputHintChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeInputHintChange(Function<ChangeInputHintChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeInputHintChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeInputHintChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeInputHintChange>";
            }
        };
    }
}
