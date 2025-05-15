
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
 *  <p>Changes the order of LocalizedEnumValues in a LocalizedEnumType FieldDefinition. This update action can be used to update a LocalizedEnumType FieldDefinition and a SetType of LocalizedEnumType FieldDefinitions.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeChangeLocalizedEnumValueOrderAction typeChangeLocalizedEnumValueOrderAction = TypeChangeLocalizedEnumValueOrderAction.builder()
 *             .fieldName("{fieldName}")
 *             .plusKeys(keysBuilder -> keysBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeLocalizedEnumValueOrder")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeChangeLocalizedEnumValueOrderActionImpl.class)
public interface TypeChangeLocalizedEnumValueOrderAction extends TypeUpdateAction {

    /**
     * discriminator value for TypeChangeLocalizedEnumValueOrderAction
     */
    String CHANGE_LOCALIZED_ENUM_VALUE_ORDER = "changeLocalizedEnumValueOrder";

    /**
     *  <p><code>name</code> of the Field Definition to update.</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
     *  <p>Must match the set of <code>key</code>s of the LocalizedEnumValues in the FieldDefinition (up to order).</p>
     * @return keys
     */
    @NotNull
    @JsonProperty("keys")
    public List<String> getKeys();

    /**
     *  <p><code>name</code> of the Field Definition to update.</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

    /**
     *  <p>Must match the set of <code>key</code>s of the LocalizedEnumValues in the FieldDefinition (up to order).</p>
     * @param keys values to be set
     */

    @JsonIgnore
    public void setKeys(final String... keys);

    /**
     *  <p>Must match the set of <code>key</code>s of the LocalizedEnumValues in the FieldDefinition (up to order).</p>
     * @param keys values to be set
     */

    public void setKeys(final List<String> keys);

    /**
     * factory method
     * @return instance of TypeChangeLocalizedEnumValueOrderAction
     */
    public static TypeChangeLocalizedEnumValueOrderAction of() {
        return new TypeChangeLocalizedEnumValueOrderActionImpl();
    }

    /**
     * factory method to create a shallow copy TypeChangeLocalizedEnumValueOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeChangeLocalizedEnumValueOrderAction of(final TypeChangeLocalizedEnumValueOrderAction template) {
        TypeChangeLocalizedEnumValueOrderActionImpl instance = new TypeChangeLocalizedEnumValueOrderActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setKeys(template.getKeys());
        return instance;
    }

    public TypeChangeLocalizedEnumValueOrderAction copyDeep();

    /**
     * factory method to create a deep copy of TypeChangeLocalizedEnumValueOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeChangeLocalizedEnumValueOrderAction deepCopy(
            @Nullable final TypeChangeLocalizedEnumValueOrderAction template) {
        if (template == null) {
            return null;
        }
        TypeChangeLocalizedEnumValueOrderActionImpl instance = new TypeChangeLocalizedEnumValueOrderActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setKeys(Optional.ofNullable(template.getKeys()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for TypeChangeLocalizedEnumValueOrderAction
     * @return builder
     */
    public static TypeChangeLocalizedEnumValueOrderActionBuilder builder() {
        return TypeChangeLocalizedEnumValueOrderActionBuilder.of();
    }

    /**
     * create builder for TypeChangeLocalizedEnumValueOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeChangeLocalizedEnumValueOrderActionBuilder builder(
            final TypeChangeLocalizedEnumValueOrderAction template) {
        return TypeChangeLocalizedEnumValueOrderActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeChangeLocalizedEnumValueOrderAction(
            Function<TypeChangeLocalizedEnumValueOrderAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeChangeLocalizedEnumValueOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeChangeLocalizedEnumValueOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeChangeLocalizedEnumValueOrderAction>";
            }
        };
    }
}
