
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTypeChangeLabelAction" rel="nofollow">Change AttributeDefinition Label</a> on Product Types.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:TypeChangeLabelAction" rel="nofollow">Change FieldDefinition Label</a> on Types.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLabelChange changeLabelChange = ChangeLabelChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .fieldName("{fieldName}")
 *             .attributeName("{attributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeLabelChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeLabelChangeImpl.class)
public interface ChangeLabelChange extends Change {

    /**
     * discriminator value for ChangeLabelChange
     */
    String CHANGE_LABEL_CHANGE = "ChangeLabelChange";

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
    public LocalizedString getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>; only present on changes to Types).</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>; only present on changes to Product Types.</p>
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

    public void setPreviousValue(final LocalizedString previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final LocalizedString nextValue);

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>; only present on changes to Types).</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>; only present on changes to Product Types.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     * factory method
     * @return instance of ChangeLabelChange
     */
    public static ChangeLabelChange of() {
        return new ChangeLabelChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeLabelChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeLabelChange of(final ChangeLabelChange template) {
        ChangeLabelChangeImpl instance = new ChangeLabelChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        return instance;
    }

    public ChangeLabelChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeLabelChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeLabelChange deepCopy(@Nullable final ChangeLabelChange template) {
        if (template == null) {
            return null;
        }
        ChangeLabelChangeImpl instance = new ChangeLabelChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getNextValue()));
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        return instance;
    }

    /**
     * builder factory method for ChangeLabelChange
     * @return builder
     */
    public static ChangeLabelChangeBuilder builder() {
        return ChangeLabelChangeBuilder.of();
    }

    /**
     * create builder for ChangeLabelChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLabelChangeBuilder builder(final ChangeLabelChange template) {
        return ChangeLabelChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeLabelChange(Function<ChangeLabelChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeLabelChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeLabelChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeLabelChange>";
            }
        };
    }
}
