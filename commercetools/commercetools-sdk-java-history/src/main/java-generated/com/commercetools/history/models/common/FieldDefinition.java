package com.commercetools.history.models.common;

import com.commercetools.history.models.common.FieldType;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.TextInputHint;
import com.commercetools.history.models.common.FieldDefinitionImpl;

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
 * FieldDefinition
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FieldDefinition fieldDefinition = FieldDefinition.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .name("{name}")
 *             .label(labelBuilder -> labelBuilder)
 *             .inputHint(TextInputHint.SINGLE_LINE)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = FieldDefinitionImpl.class)
public interface FieldDefinition  {


    /**
     *
     * @return type
     */
    @NotNull
    @Valid
    @JsonProperty("type")
    public FieldType getType();
    /**
     *  <p>The name of the field. The name must be between two and 36 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>). The name must be unique for a given resource type ID. In case there is a field with the same name in another type it has to have the same FieldType also.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();
    /**
     *
     * @return label
     */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();
    /**
     *
     * @return inputHint
     */
    @NotNull
    @JsonProperty("inputHint")
    public TextInputHint getInputHint();

    /**
     * set type
     * @param type value to be set
     */
    
    public void setType(final FieldType type);
    
    
    /**
     *  <p>The name of the field. The name must be between two and 36 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>). The name must be unique for a given resource type ID. In case there is a field with the same name in another type it has to have the same FieldType also.</p>
     * @param name value to be set
     */
    
    public void setName(final String name);
    
    
    /**
     * set label
     * @param label value to be set
     */
    
    public void setLabel(final LocalizedString label);
    
    
    /**
     * set inputHint
     * @param inputHint value to be set
     */
    
    public void setInputHint(final TextInputHint inputHint);
    

    /**
     * factory method
     * @return instance of FieldDefinition
     */
    public static FieldDefinition of(){
        return new FieldDefinitionImpl();
    }
    

    /**
     * factory method to create a shallow copy FieldDefinition
     * @param template instance to be copied
     * @return copy instance
     */
    public static FieldDefinition of(final FieldDefinition template) {
        FieldDefinitionImpl instance = new FieldDefinitionImpl();
        instance.setType(template.getType());
        instance.setName(template.getName());
        instance.setLabel(template.getLabel());
        instance.setInputHint(template.getInputHint());
        return instance;
    }

    /**
     * factory method to create a deep copy of FieldDefinition
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static FieldDefinition deepCopy(@Nullable final FieldDefinition template) {
        if (template == null) {
            return null;
        }
        FieldDefinitionImpl instance = new FieldDefinitionImpl();
        instance.setType(com.commercetools.history.models.common.FieldType.deepCopy(template.getType()));
        instance.setName(template.getName());
        instance.setLabel(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLabel()));
        instance.setInputHint(template.getInputHint());
        return instance;
    }

    /**
     * builder factory method for FieldDefinition
     * @return builder
     */
    public static FieldDefinitionBuilder builder() {
        return FieldDefinitionBuilder.of();
    }
    
    /**
     * create builder for FieldDefinition instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FieldDefinitionBuilder builder(final FieldDefinition template) {
        return FieldDefinitionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withFieldDefinition(Function<FieldDefinition, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<FieldDefinition> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FieldDefinition>() {
            @Override
            public String toString() {
                return "TypeReference<FieldDefinition>";
            }
        };
    }
}
