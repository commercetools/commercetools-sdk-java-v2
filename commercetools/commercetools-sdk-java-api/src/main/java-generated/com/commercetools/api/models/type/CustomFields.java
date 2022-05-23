
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
public interface CustomFields {

    /**
     <*  <p>Reference to the Type that holds the FieldDefinitions for the Custom Fields.</p>>
     */
    @NotNull
    @Valid
    @JsonProperty("type")
    public TypeReference getType();

    /**
     <*  <p>Object containing the Custom Fields for the customized resource or data type.</p>>
     */
    @NotNull
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeReference type);

    public void setFields(final FieldContainer fields);

    public static CustomFields of() {
        return new CustomFieldsImpl();
    }

    public static CustomFields of(final CustomFields template) {
        CustomFieldsImpl instance = new CustomFieldsImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static CustomFieldsBuilder builder() {
        return CustomFieldsBuilder.of();
    }

    public static CustomFieldsBuilder builder(final CustomFields template) {
        return CustomFieldsBuilder.of(template);
    }

    default <T> T withCustomFields(Function<CustomFields, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomFields> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFields>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFields>";
            }
        };
    }
}
