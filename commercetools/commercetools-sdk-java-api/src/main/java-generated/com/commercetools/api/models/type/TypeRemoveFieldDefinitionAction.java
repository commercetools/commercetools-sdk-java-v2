
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * TypeRemoveFieldDefinitionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeRemoveFieldDefinitionAction typeRemoveFieldDefinitionAction = TypeRemoveFieldDefinitionAction.builder()
 *             .fieldName("{fieldName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeRemoveFieldDefinitionActionImpl.class)
public interface TypeRemoveFieldDefinitionAction extends TypeUpdateAction {

    /**
     * discriminator value for TypeRemoveFieldDefinitionAction
     */
    String REMOVE_FIELD_DEFINITION = "removeFieldDefinition";

    /**
     *  <p><code>name</code> of the FieldDefinition to remove. The removal of a FieldDefinition deletes asynchronously all Custom Fields using the FieldDefinition as well.</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
     *  <p><code>name</code> of the FieldDefinition to remove. The removal of a FieldDefinition deletes asynchronously all Custom Fields using the FieldDefinition as well.</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

    /**
     * factory method
     * @return instance of TypeRemoveFieldDefinitionAction
     */
    public static TypeRemoveFieldDefinitionAction of() {
        return new TypeRemoveFieldDefinitionActionImpl();
    }

    /**
     * factory method to create a shallow copy TypeRemoveFieldDefinitionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeRemoveFieldDefinitionAction of(final TypeRemoveFieldDefinitionAction template) {
        TypeRemoveFieldDefinitionActionImpl instance = new TypeRemoveFieldDefinitionActionImpl();
        instance.setFieldName(template.getFieldName());
        return instance;
    }

    /**
     * factory method to create a deep copy of TypeRemoveFieldDefinitionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeRemoveFieldDefinitionAction deepCopy(@Nullable final TypeRemoveFieldDefinitionAction template) {
        if (template == null) {
            return null;
        }
        TypeRemoveFieldDefinitionActionImpl instance = new TypeRemoveFieldDefinitionActionImpl();
        instance.setFieldName(template.getFieldName());
        return instance;
    }

    /**
     * builder factory method for TypeRemoveFieldDefinitionAction
     * @return builder
     */
    public static TypeRemoveFieldDefinitionActionBuilder builder() {
        return TypeRemoveFieldDefinitionActionBuilder.of();
    }

    /**
     * create builder for TypeRemoveFieldDefinitionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeRemoveFieldDefinitionActionBuilder builder(final TypeRemoveFieldDefinitionAction template) {
        return TypeRemoveFieldDefinitionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeRemoveFieldDefinitionAction(Function<TypeRemoveFieldDefinitionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeRemoveFieldDefinitionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeRemoveFieldDefinitionAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeRemoveFieldDefinitionAction>";
            }
        };
    }
}
