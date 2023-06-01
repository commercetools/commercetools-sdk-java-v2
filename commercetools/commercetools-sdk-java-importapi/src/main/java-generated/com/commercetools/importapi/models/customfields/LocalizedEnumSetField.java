package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.LocalizedEnumSetFieldImpl;

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
 *  <p>A field with a localized enum set value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizedEnumSetField localizedEnumSetField = LocalizedEnumSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = LocalizedEnumSetFieldImpl.class)
public interface LocalizedEnumSetField extends CustomField {

    /**
     * discriminator value for LocalizedEnumSetField
     */
    String LOCALIZED_ENUM_SET = "LocalizedEnumSet";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public List<String> getValue();

    /**
     * set value
     * @param value values to be set
     */
    
    @JsonIgnore
    public void setValue(final String ...value);
    /**
     * set value
     * @param value values to be set
     */
    
    public void setValue(final List<String> value);

    /**
     * factory method
     * @return instance of LocalizedEnumSetField
     */
    public static LocalizedEnumSetField of(){
        return new LocalizedEnumSetFieldImpl();
    }
    

    /**
     * factory method to create a shallow copy LocalizedEnumSetField
     * @param template instance to be copied
     * @return copy instance
     */
    public static LocalizedEnumSetField of(final LocalizedEnumSetField template) {
        LocalizedEnumSetFieldImpl instance = new LocalizedEnumSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of LocalizedEnumSetField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LocalizedEnumSetField deepCopy(@Nullable final LocalizedEnumSetField template) {
        if (template == null) {
            return null;
        }
        LocalizedEnumSetFieldImpl instance = new LocalizedEnumSetFieldImpl();
        instance.setValue(Optional.ofNullable(template.getValue())
                .map(ArrayList::new)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for LocalizedEnumSetField
     * @return builder
     */
    public static LocalizedEnumSetFieldBuilder builder() {
        return LocalizedEnumSetFieldBuilder.of();
    }
    
    /**
     * create builder for LocalizedEnumSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizedEnumSetFieldBuilder builder(final LocalizedEnumSetField template) {
        return LocalizedEnumSetFieldBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLocalizedEnumSetField(Function<LocalizedEnumSetField, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LocalizedEnumSetField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizedEnumSetField>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizedEnumSetField>";
            }
        };
    }
}
