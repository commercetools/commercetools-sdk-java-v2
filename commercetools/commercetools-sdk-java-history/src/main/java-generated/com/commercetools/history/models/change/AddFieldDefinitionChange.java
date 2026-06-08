
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.FieldDefinition;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:TypeAddFieldDefinitionAction" rel="nofollow">Add FieldDefinition</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddFieldDefinitionChange addFieldDefinitionChange = AddFieldDefinitionChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AddFieldDefinitionChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddFieldDefinitionChangeImpl.class)
public interface AddFieldDefinitionChange extends Change {

    /**
     * discriminator value for AddFieldDefinitionChange
     */
    String ADD_FIELD_DEFINITION_CHANGE = "AddFieldDefinitionChange";

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
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public FieldDefinition getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final FieldDefinition nextValue);

    /**
     * factory method
     * @return instance of AddFieldDefinitionChange
     */
    public static AddFieldDefinitionChange of() {
        return new AddFieldDefinitionChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddFieldDefinitionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddFieldDefinitionChange of(final AddFieldDefinitionChange template) {
        AddFieldDefinitionChangeImpl instance = new AddFieldDefinitionChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public AddFieldDefinitionChange copyDeep();

    /**
     * factory method to create a deep copy of AddFieldDefinitionChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddFieldDefinitionChange deepCopy(@Nullable final AddFieldDefinitionChange template) {
        if (template == null) {
            return null;
        }
        AddFieldDefinitionChangeImpl instance = new AddFieldDefinitionChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(
            com.commercetools.history.models.common.FieldDefinition.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for AddFieldDefinitionChange
     * @return builder
     */
    public static AddFieldDefinitionChangeBuilder builder() {
        return AddFieldDefinitionChangeBuilder.of();
    }

    /**
     * create builder for AddFieldDefinitionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddFieldDefinitionChangeBuilder builder(final AddFieldDefinitionChange template) {
        return AddFieldDefinitionChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddFieldDefinitionChange(Function<AddFieldDefinitionChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddFieldDefinitionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddFieldDefinitionChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddFieldDefinitionChange>";
            }
        };
    }
}
