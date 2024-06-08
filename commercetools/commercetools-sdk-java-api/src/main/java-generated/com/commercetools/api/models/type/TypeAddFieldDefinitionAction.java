
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Defines a new field for a Type. Adding new required fields to a Type that is already referenced by existing entities can put those entities in a temporarily inconsistent state.</p>
 *  <p>If a Type that is already in use requires new fields, we recommend making them optional (<code>required</code> set to <code>false</code>) whenever possible. Alternatively, any new required fields should be added one at a time followed by an update to all the resources using the Type. This prevents validation errors caused by an entity missing more than one required custom field.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeAddFieldDefinitionAction typeAddFieldDefinitionAction = TypeAddFieldDefinitionAction.builder()
 *             .fieldDefinition(fieldDefinitionBuilder -> fieldDefinitionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeAddFieldDefinitionActionImpl.class)
public interface TypeAddFieldDefinitionAction extends TypeUpdateAction {

    /**
     * discriminator value for TypeAddFieldDefinitionAction
     */
    String ADD_FIELD_DEFINITION = "addFieldDefinition";

    /**
     *  <p>Value to append to the array.</p>
     * @return fieldDefinition
     */
    @NotNull
    @Valid
    @JsonProperty("fieldDefinition")
    public FieldDefinition getFieldDefinition();

    /**
     *  <p>Value to append to the array.</p>
     * @param fieldDefinition value to be set
     */

    public void setFieldDefinition(final FieldDefinition fieldDefinition);

    /**
     * factory method
     * @return instance of TypeAddFieldDefinitionAction
     */
    public static TypeAddFieldDefinitionAction of() {
        return new TypeAddFieldDefinitionActionImpl();
    }

    /**
     * factory method to create a shallow copy TypeAddFieldDefinitionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeAddFieldDefinitionAction of(final TypeAddFieldDefinitionAction template) {
        TypeAddFieldDefinitionActionImpl instance = new TypeAddFieldDefinitionActionImpl();
        instance.setFieldDefinition(template.getFieldDefinition());
        return instance;
    }

    /**
     * factory method to create a deep copy of TypeAddFieldDefinitionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeAddFieldDefinitionAction deepCopy(@Nullable final TypeAddFieldDefinitionAction template) {
        if (template == null) {
            return null;
        }
        TypeAddFieldDefinitionActionImpl instance = new TypeAddFieldDefinitionActionImpl();
        instance.setFieldDefinition(
            com.commercetools.api.models.type.FieldDefinition.deepCopy(template.getFieldDefinition()));
        return instance;
    }

    /**
     * builder factory method for TypeAddFieldDefinitionAction
     * @return builder
     */
    public static TypeAddFieldDefinitionActionBuilder builder() {
        return TypeAddFieldDefinitionActionBuilder.of();
    }

    /**
     * create builder for TypeAddFieldDefinitionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeAddFieldDefinitionActionBuilder builder(final TypeAddFieldDefinitionAction template) {
        return TypeAddFieldDefinitionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeAddFieldDefinitionAction(Function<TypeAddFieldDefinitionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeAddFieldDefinitionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeAddFieldDefinitionAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeAddFieldDefinitionAction>";
            }
        };
    }
}
