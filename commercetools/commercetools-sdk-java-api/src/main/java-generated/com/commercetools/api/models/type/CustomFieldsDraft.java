package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomFieldsDraftImpl.class)
public interface CustomFieldsDraft extends io.vrap.rmf.base.client.Draft<CustomFieldsDraft> {


    /**
     *  <p><code>id</code> or <code>key</code> of the Type.</p>
     * @return type
     */
    @NotNull
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();
    /**
     *  <p>Object containing the Custom Fields for the customized resource or data type.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p><code>id</code> or <code>key</code> of the Type.</p>
     * @param type value to be set
     */
    
    public void setType(final TypeResourceIdentifier type);
    
    
    /**
     *  <p>Object containing the Custom Fields for the customized resource or data type.</p>
     * @param fields value to be set
     */
    
    public void setFields(final FieldContainer fields);
    

    /**
     * factory method
     * @return instance of CustomFieldsDraft
     */
    public static CustomFieldsDraft of(){
        return new CustomFieldsDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomFieldsDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomFieldsDraft of(final CustomFieldsDraft template) {
        CustomFieldsDraftImpl instance = new CustomFieldsDraftImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomFieldsDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomFieldsDraft deepCopy(@Nullable final CustomFieldsDraft template) {
        if (template == null) {
            return null;
        }
        CustomFieldsDraftImpl instance = new CustomFieldsDraftImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for CustomFieldsDraft
     * @return builder
     */
    public static CustomFieldsDraftBuilder builder() {
        return CustomFieldsDraftBuilder.of();
    }
    
    /**
     * create builder for CustomFieldsDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldsDraftBuilder builder(final CustomFieldsDraft template) {
        return CustomFieldsDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomFieldsDraft(Function<CustomFieldsDraft, T> helper) {
        return helper.apply(this);
    }
    public static CustomFieldsDraft of(final CustomFields template) {
        return template.toDraft();
    }
    
    public static CustomFieldsDraftBuilder builder(final CustomFields template) {
        return template.toDraftBuilder();
    }
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldsDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldsDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldsDraft>";
            }
        };
    }
}
