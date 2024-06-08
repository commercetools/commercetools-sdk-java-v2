
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.AttributeDefinition;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Add Attribute Definition update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddAttributeDefinitionChange addAttributeDefinitionChange = AddAttributeDefinitionChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddAttributeDefinitionChangeImpl.class)
public interface AddAttributeDefinitionChange extends Change {

    /**
     * discriminator value for AddAttributeDefinitionChange
     */
    String ADD_ATTRIBUTE_DEFINITION_CHANGE = "AddAttributeDefinitionChange";

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
    public AttributeDefinition getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final AttributeDefinition nextValue);

    /**
     * factory method
     * @return instance of AddAttributeDefinitionChange
     */
    public static AddAttributeDefinitionChange of() {
        return new AddAttributeDefinitionChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddAttributeDefinitionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddAttributeDefinitionChange of(final AddAttributeDefinitionChange template) {
        AddAttributeDefinitionChangeImpl instance = new AddAttributeDefinitionChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of AddAttributeDefinitionChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddAttributeDefinitionChange deepCopy(@Nullable final AddAttributeDefinitionChange template) {
        if (template == null) {
            return null;
        }
        AddAttributeDefinitionChangeImpl instance = new AddAttributeDefinitionChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(
            com.commercetools.history.models.common.AttributeDefinition.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for AddAttributeDefinitionChange
     * @return builder
     */
    public static AddAttributeDefinitionChangeBuilder builder() {
        return AddAttributeDefinitionChangeBuilder.of();
    }

    /**
     * create builder for AddAttributeDefinitionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddAttributeDefinitionChangeBuilder builder(final AddAttributeDefinitionChange template) {
        return AddAttributeDefinitionChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddAttributeDefinitionChange(Function<AddAttributeDefinitionChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddAttributeDefinitionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddAttributeDefinitionChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddAttributeDefinitionChange>";
            }
        };
    }
}
