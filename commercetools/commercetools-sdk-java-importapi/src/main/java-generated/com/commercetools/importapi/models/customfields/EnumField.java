package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.EnumFieldImpl;

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
 *  <p>A field with an enum value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EnumField enumField = EnumField.builder()
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = EnumFieldImpl.class)
public interface EnumField extends CustomField {

    /**
     * discriminator value for EnumField
     */
    String ENUM = "Enum";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public String getValue();

    /**
     * set value
     * @param value value to be set
     */
    
    public void setValue(final String value);
    

    /**
     * factory method
     * @return instance of EnumField
     */
    public static EnumField of(){
        return new EnumFieldImpl();
    }
    

    /**
     * factory method to create a shallow copy EnumField
     * @param template instance to be copied
     * @return copy instance
     */
    public static EnumField of(final EnumField template) {
        EnumFieldImpl instance = new EnumFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of EnumField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static EnumField deepCopy(@Nullable final EnumField template) {
        if (template == null) {
            return null;
        }
        EnumFieldImpl instance = new EnumFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for EnumField
     * @return builder
     */
    public static EnumFieldBuilder builder() {
        return EnumFieldBuilder.of();
    }
    
    /**
     * create builder for EnumField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EnumFieldBuilder builder(final EnumField template) {
        return EnumFieldBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withEnumField(Function<EnumField, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<EnumField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EnumField>() {
            @Override
            public String toString() {
                return "TypeReference<EnumField>";
            }
        };
    }
}
