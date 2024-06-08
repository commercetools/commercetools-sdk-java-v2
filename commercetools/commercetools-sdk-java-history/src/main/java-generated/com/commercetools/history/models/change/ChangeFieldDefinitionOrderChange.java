
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.FieldDefinitionOrderValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Change the order of FieldDefinitions update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeFieldDefinitionOrderChange changeFieldDefinitionOrderChange = ChangeFieldDefinitionOrderChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeFieldDefinitionOrderChangeImpl.class)
public interface ChangeFieldDefinitionOrderChange extends Change {

    /**
     * discriminator value for ChangeFieldDefinitionOrderChange
     */
    String CHANGE_FIELD_DEFINITION_ORDER_CHANGE = "ChangeFieldDefinitionOrderChange";

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
    public List<FieldDefinitionOrderValue> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<FieldDefinitionOrderValue> getNextValue();

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
    public void setPreviousValue(final FieldDefinitionOrderValue... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<FieldDefinitionOrderValue> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final FieldDefinitionOrderValue... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<FieldDefinitionOrderValue> nextValue);

    /**
     * factory method
     * @return instance of ChangeFieldDefinitionOrderChange
     */
    public static ChangeFieldDefinitionOrderChange of() {
        return new ChangeFieldDefinitionOrderChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeFieldDefinitionOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeFieldDefinitionOrderChange of(final ChangeFieldDefinitionOrderChange template) {
        ChangeFieldDefinitionOrderChangeImpl instance = new ChangeFieldDefinitionOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeFieldDefinitionOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeFieldDefinitionOrderChange deepCopy(@Nullable final ChangeFieldDefinitionOrderChange template) {
        if (template == null) {
            return null;
        }
        ChangeFieldDefinitionOrderChangeImpl instance = new ChangeFieldDefinitionOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.change_value.FieldDefinitionOrderValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.change_value.FieldDefinitionOrderValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ChangeFieldDefinitionOrderChange
     * @return builder
     */
    public static ChangeFieldDefinitionOrderChangeBuilder builder() {
        return ChangeFieldDefinitionOrderChangeBuilder.of();
    }

    /**
     * create builder for ChangeFieldDefinitionOrderChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeFieldDefinitionOrderChangeBuilder builder(final ChangeFieldDefinitionOrderChange template) {
        return ChangeFieldDefinitionOrderChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeFieldDefinitionOrderChange(Function<ChangeFieldDefinitionOrderChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeFieldDefinitionOrderChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeFieldDefinitionOrderChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeFieldDefinitionOrderChange>";
            }
        };
    }
}
