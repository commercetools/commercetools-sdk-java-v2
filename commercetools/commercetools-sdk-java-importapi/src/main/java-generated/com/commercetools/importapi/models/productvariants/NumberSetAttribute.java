package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.NumberSetAttributeImpl;

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
 *  <p>This type represents an attribute whose value is a set of numbers.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NumberSetAttribute numberSetAttribute = NumberSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = NumberSetAttributeImpl.class)
public interface NumberSetAttribute extends Attribute {

    /**
     * discriminator value for NumberSetAttribute
     */
    String NUMBER_SET = "number-set";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public List<Double> getValue();

    /**
     * set value
     * @param value values to be set
     */
    
    @JsonIgnore
    public void setValue(final Double ...value);
    /**
     * set value
     * @param value values to be set
     */
    
    public void setValue(final List<Double> value);

    /**
     * factory method
     * @return instance of NumberSetAttribute
     */
    public static NumberSetAttribute of(){
        return new NumberSetAttributeImpl();
    }
    

    /**
     * factory method to create a shallow copy NumberSetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static NumberSetAttribute of(final NumberSetAttribute template) {
        NumberSetAttributeImpl instance = new NumberSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of NumberSetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static NumberSetAttribute deepCopy(@Nullable final NumberSetAttribute template) {
        if (template == null) {
            return null;
        }
        NumberSetAttributeImpl instance = new NumberSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(Optional.ofNullable(template.getValue())
                .map(ArrayList::new)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for NumberSetAttribute
     * @return builder
     */
    public static NumberSetAttributeBuilder builder() {
        return NumberSetAttributeBuilder.of();
    }
    
    /**
     * create builder for NumberSetAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NumberSetAttributeBuilder builder(final NumberSetAttribute template) {
        return NumberSetAttributeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withNumberSetAttribute(Function<NumberSetAttribute, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<NumberSetAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<NumberSetAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<NumberSetAttribute>";
            }
        };
    }
}
