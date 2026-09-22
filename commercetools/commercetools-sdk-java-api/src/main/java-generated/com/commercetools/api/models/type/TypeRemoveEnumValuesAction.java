
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Removes EnumValues from an <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldEnumType" rel="nofollow">EnumType</a> FieldDefinition. This update action can be used to update an <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldEnumType" rel="nofollow">EnumType</a> FieldDefinition and a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">SetType</a> FieldDefinition of <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldEnumType" rel="nofollow">EnumType</a>.</p>
 *  <p>This update action is always allowed, even if the FieldDefinition is <code>required</code> and even if a resource still has a Custom Field value referencing one of the removed keys. Existing Custom Field values are not updated or removed by this update action, and are returned unchanged until they are explicitly updated. Note that a subsequent update of a single Custom Field on such a resource can fail, because that update revalidates all Custom Field values on the resource.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeRemoveEnumValuesAction typeRemoveEnumValuesAction = TypeRemoveEnumValuesAction.builder()
 *             .fieldName("{fieldName}")
 *             .plusKeys(keysBuilder -> keysBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeEnumValues")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeRemoveEnumValuesActionImpl.class)
public interface TypeRemoveEnumValuesAction extends TypeUpdateAction {

    /**
     * discriminator value for TypeRemoveEnumValuesAction
     */
    String REMOVE_ENUM_VALUES = "removeEnumValues";

    /**
     *  <p><code>name</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a> to update.</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
     *  <p>Keys of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldEnumValue" rel="nofollow">EnumValues</a> to remove. An empty array results in no change.</p>
     * @return keys
     */
    @NotNull
    @JsonProperty("keys")
    public List<String> getKeys();

    /**
     *  <p><code>name</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a> to update.</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

    /**
     *  <p>Keys of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldEnumValue" rel="nofollow">EnumValues</a> to remove. An empty array results in no change.</p>
     * @param keys values to be set
     */

    @JsonIgnore
    public void setKeys(final String... keys);

    /**
     *  <p>Keys of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldEnumValue" rel="nofollow">EnumValues</a> to remove. An empty array results in no change.</p>
     * @param keys values to be set
     */

    public void setKeys(final List<String> keys);

    /**
     * factory method
     * @return instance of TypeRemoveEnumValuesAction
     */
    public static TypeRemoveEnumValuesAction of() {
        return new TypeRemoveEnumValuesActionImpl();
    }

    /**
     * factory method to create a shallow copy TypeRemoveEnumValuesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeRemoveEnumValuesAction of(final TypeRemoveEnumValuesAction template) {
        TypeRemoveEnumValuesActionImpl instance = new TypeRemoveEnumValuesActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setKeys(template.getKeys());
        return instance;
    }

    public TypeRemoveEnumValuesAction copyDeep();

    /**
     * factory method to create a deep copy of TypeRemoveEnumValuesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeRemoveEnumValuesAction deepCopy(@Nullable final TypeRemoveEnumValuesAction template) {
        if (template == null) {
            return null;
        }
        TypeRemoveEnumValuesActionImpl instance = new TypeRemoveEnumValuesActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setKeys(Optional.ofNullable(template.getKeys()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for TypeRemoveEnumValuesAction
     * @return builder
     */
    public static TypeRemoveEnumValuesActionBuilder builder() {
        return TypeRemoveEnumValuesActionBuilder.of();
    }

    /**
     * create builder for TypeRemoveEnumValuesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeRemoveEnumValuesActionBuilder builder(final TypeRemoveEnumValuesAction template) {
        return TypeRemoveEnumValuesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeRemoveEnumValuesAction(Function<TypeRemoveEnumValuesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<TypeRemoveEnumValuesAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<TypeRemoveEnumValuesAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeRemoveEnumValuesAction>";
            }
        };
    }
}
