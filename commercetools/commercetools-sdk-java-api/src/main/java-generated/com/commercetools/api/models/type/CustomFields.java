
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Serves as value of the <code>custom</code> field on a resource or data type customized with a Type.</p>
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
     *  <p>Reference to the Type that holds the FieldDefinitions for the Custom Fields.</p>
     * @return type
     */
    @NotNull
    @Valid
    @JsonProperty("type")
    public TypeReference getType();

    /**
     *  <p>Object containing the Custom Fields for the customized resource or data type.</p>
     * @return fields
     */
    @NotNull
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Reference to the Type that holds the FieldDefinitions for the Custom Fields.</p>
     * @param type value to be set
     */

    public void setType(final TypeReference type);

    /**
     *  <p>Object containing the Custom Fields for the customized resource or data type.</p>
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
     * factory method to copy an instance of CustomFields
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomFields of(final CustomFields template) {
        CustomFieldsImpl instance = new CustomFieldsImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
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
