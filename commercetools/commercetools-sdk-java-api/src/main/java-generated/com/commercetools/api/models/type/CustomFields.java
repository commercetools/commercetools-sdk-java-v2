
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
 *  <p>Serves as value of the <code>custom</code> field on a resource or data type customized with a <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFields customFields = CustomFields.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .fields(fieldsBuilder -> fieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomFieldsImpl.class)
public interface CustomFields extends CustomFieldsMixin {

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that holds the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinitions</a> for the Custom Fields.</p>
     * @return type
     */
    @NotNull
    @Valid
    @JsonProperty("type")
    public TypeReference getType();

    /**
     *  <p>Object containing the Custom Fields of the <span>customized resource or data type</span>.</p>
     * @return fields
     */
    @NotNull
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that holds the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinitions</a> for the Custom Fields.</p>
     * @param type value to be set
     */

    public void setType(final TypeReference type);

    /**
     *  <p>Object containing the Custom Fields of the <span>customized resource or data type</span>.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of CustomFields
     */
    public static CustomFields of() {
        return new CustomFieldsImpl();
    }

    /**
     * factory method to create a shallow copy CustomFields
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomFields of(final CustomFields template) {
        CustomFieldsImpl instance = new CustomFieldsImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public CustomFields copyDeep();

    /**
     * factory method to create a deep copy of CustomFields
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomFields deepCopy(@Nullable final CustomFields template) {
        if (template == null) {
            return null;
        }
        CustomFieldsImpl instance = new CustomFieldsImpl();
        instance.setType(com.commercetools.api.models.type.TypeReference.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for CustomFields
     * @return builder
     */
    public static CustomFieldsBuilder builder() {
        return CustomFieldsBuilder.of();
    }

    /**
     * create builder for CustomFields instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldsBuilder builder(final CustomFields template) {
        return CustomFieldsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomFields(Function<CustomFields, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomFields> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFields>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFields>";
            }
        };
    }
}
