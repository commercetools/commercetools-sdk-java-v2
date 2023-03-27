
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeLabelChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLabelChange changeLabelChange = ChangeLabelChange.builder()
 *             .change("{change}")
 *             .fieldName("{fieldName}")
 *             .attributeName("{attributeName}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
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
     *  <p>Update action for <code>changeLabel</code> on product types and types</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>The name of the field definition to update (types).</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
     *  <p>The name of the attribute definition to update (product-type).</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LocalizedString getPreviousValue();

    /**
     *  <p>Update action for <code>changeLabel</code> on product types and types</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>The name of the field definition to update (types).</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

    /**
     *  <p>The name of the attribute definition to update (product-type).</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final LocalizedString nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final LocalizedString previousValue);

    /**
     * factory method
     * @return instance of ChangeLabelChange
     */
    public static ChangeLabelChange of() {
        return new ChangeLabelChangeImpl();
    }

    /**
     * factory method to copy an instance of ChangeLabelChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeLabelChange of(final ChangeLabelChange template) {
        ChangeLabelChangeImpl instance = new ChangeLabelChangeImpl();
        instance.setChange(template.getChange());
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
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
