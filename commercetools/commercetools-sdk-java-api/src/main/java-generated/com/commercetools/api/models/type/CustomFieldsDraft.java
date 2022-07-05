
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
 *  <p>The representation used when creating or updating a customizable data type with Custom Fields.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldsDraft customFieldsDraft = CustomFieldsDraft.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomFieldsDraftImpl.class)
public interface CustomFieldsDraft {

    /**
     *  <p><code>id</code> or <code>key</code> of the Type.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Object containing the Custom Fields for the customized resource or data type.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static CustomFieldsDraft of() {
        return new CustomFieldsDraftImpl();
    }

    public static CustomFieldsDraft of(final CustomFieldsDraft template) {
        CustomFieldsDraftImpl instance = new CustomFieldsDraftImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static CustomFieldsDraftBuilder builder() {
        return CustomFieldsDraftBuilder.of();
    }

    public static CustomFieldsDraftBuilder builder(final CustomFieldsDraft template) {
        return CustomFieldsDraftBuilder.of(template);
    }

    default <T> T withCustomFieldsDraft(Function<CustomFieldsDraft, T> helper) {
        return helper.apply(this);
    }

    public static CustomFieldsDraft of(final CustomFields template) {
        return template.toDraft();
    }

    public static CustomFieldsDraftBuilder builder(final CustomFields template) {
        return template.toDraftBuilder();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldsDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldsDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldsDraft>";
            }
        };
    }
}
