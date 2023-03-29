
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changes the order of EnumValues in an EnumType FieldDefinition. This update action can be used to update an EnumType FieldDefinition and a SetType FieldDefinition of EnumType.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeChangeEnumValueOrderAction typeChangeEnumValueOrderAction = TypeChangeEnumValueOrderAction.builder()
 *             .fieldName("{fieldName}")
 *             .plusKeys(keysBuilder -> keysBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeChangeEnumValueOrderActionImpl.class)
public interface TypeChangeEnumValueOrderAction extends TypeUpdateAction {

    /**
     * discriminator value for TypeChangeEnumValueOrderAction
     */
    String CHANGE_ENUM_VALUE_ORDER = "changeEnumValueOrder";

    /**
     *  <p><code>name</code> of the FieldDefinition to update.</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
     *  <p>Must match the set of <code>key</code>s of the EnumValues in the FieldDefinition (apart from their order).</p>
     * @return keys
     */
    @NotNull
    @JsonProperty("keys")
    public List<String> getKeys();

    /**
     *  <p><code>name</code> of the FieldDefinition to update.</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

    /**
     *  <p>Must match the set of <code>key</code>s of the EnumValues in the FieldDefinition (apart from their order).</p>
     * @param keys values to be set
     */

    @JsonIgnore
    public void setKeys(final String... keys);

    /**
     *  <p>Must match the set of <code>key</code>s of the EnumValues in the FieldDefinition (apart from their order).</p>
     * @param keys values to be set
     */

    public void setKeys(final List<String> keys);

    /**
     * factory method
     * @return instance of TypeChangeEnumValueOrderAction
     */
    public static TypeChangeEnumValueOrderAction of() {
        return new TypeChangeEnumValueOrderActionImpl();
    }

    /**
     * factory method to create a shallow copy TypeChangeEnumValueOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeChangeEnumValueOrderAction of(final TypeChangeEnumValueOrderAction template) {
        TypeChangeEnumValueOrderActionImpl instance = new TypeChangeEnumValueOrderActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setKeys(template.getKeys());
        return instance;
    }

    /**
     * factory method to create a deep copy of TypeChangeEnumValueOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeChangeEnumValueOrderAction deepCopy(@Nullable final TypeChangeEnumValueOrderAction template) {
        if (template == null) {
            return null;
        }
        TypeChangeEnumValueOrderActionImpl instance = new TypeChangeEnumValueOrderActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setKeys(Optional.ofNullable(template.getKeys()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for TypeChangeEnumValueOrderAction
     * @return builder
     */
    public static TypeChangeEnumValueOrderActionBuilder builder() {
        return TypeChangeEnumValueOrderActionBuilder.of();
    }

    /**
     * create builder for TypeChangeEnumValueOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeChangeEnumValueOrderActionBuilder builder(final TypeChangeEnumValueOrderAction template) {
        return TypeChangeEnumValueOrderActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeChangeEnumValueOrderAction(Function<TypeChangeEnumValueOrderAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeChangeEnumValueOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeChangeEnumValueOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeChangeEnumValueOrderAction>";
            }
        };
    }
}
