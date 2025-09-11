
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.EnumValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTypeChangePlainEnumValueOrderAction" rel="nofollow">Change the order of EnumValues</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangePlainEnumValueOrderChange changePlainEnumValueOrderChange = ChangePlainEnumValueOrderChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .attributeName("{attributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangePlainEnumValueOrderChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangePlainEnumValueOrderChangeImpl.class)
public interface ChangePlainEnumValueOrderChange extends Change {

    /**
     * discriminator value for ChangePlainEnumValueOrderChange
     */
    String CHANGE_PLAIN_ENUM_VALUE_ORDER_CHANGE = "ChangePlainEnumValueOrderChange";

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
    public List<EnumValue> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<EnumValue> getNextValue();

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
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
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final EnumValue... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<EnumValue> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final EnumValue... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<EnumValue> nextValue);

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     * factory method
     * @return instance of ChangePlainEnumValueOrderChange
     */
    public static ChangePlainEnumValueOrderChange of() {
        return new ChangePlainEnumValueOrderChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangePlainEnumValueOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangePlainEnumValueOrderChange of(final ChangePlainEnumValueOrderChange template) {
        ChangePlainEnumValueOrderChangeImpl instance = new ChangePlainEnumValueOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setAttributeName(template.getAttributeName());
        return instance;
    }

    public ChangePlainEnumValueOrderChange copyDeep();

    /**
     * factory method to create a deep copy of ChangePlainEnumValueOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangePlainEnumValueOrderChange deepCopy(@Nullable final ChangePlainEnumValueOrderChange template) {
        if (template == null) {
            return null;
        }
        ChangePlainEnumValueOrderChangeImpl instance = new ChangePlainEnumValueOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.change_value.EnumValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.change_value.EnumValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAttributeName(template.getAttributeName());
        return instance;
    }

    /**
     * builder factory method for ChangePlainEnumValueOrderChange
     * @return builder
     */
    public static ChangePlainEnumValueOrderChangeBuilder builder() {
        return ChangePlainEnumValueOrderChangeBuilder.of();
    }

    /**
     * create builder for ChangePlainEnumValueOrderChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangePlainEnumValueOrderChangeBuilder builder(final ChangePlainEnumValueOrderChange template) {
        return ChangePlainEnumValueOrderChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangePlainEnumValueOrderChange(Function<ChangePlainEnumValueOrderChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangePlainEnumValueOrderChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangePlainEnumValueOrderChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangePlainEnumValueOrderChange>";
            }
        };
    }
}
