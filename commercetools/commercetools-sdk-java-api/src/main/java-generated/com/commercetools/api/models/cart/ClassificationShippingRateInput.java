package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ShippingRateInput;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.cart.ClassificationShippingRateInputImpl;

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
 * ClassificationShippingRateInput
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ClassificationShippingRateInput classificationShippingRateInput = ClassificationShippingRateInput.builder()
 *             .key("{key}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ClassificationShippingRateInputImpl.class)
public interface ClassificationShippingRateInput extends ShippingRateInput {

    /**
     * discriminator value for ClassificationShippingRateInput
     */
    String CLASSIFICATION = "Classification";

    /**
     *  <p>Key of the value used as a programmatic identifier.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();
    /**
     *  <p>Descriptive localized label of the value.</p>
     * @return label
     */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    /**
     *  <p>Key of the value used as a programmatic identifier.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    
    
    /**
     *  <p>Descriptive localized label of the value.</p>
     * @param label value to be set
     */
    
    public void setLabel(final LocalizedString label);
    

    /**
     * factory method
     * @return instance of ClassificationShippingRateInput
     */
    public static ClassificationShippingRateInput of(){
        return new ClassificationShippingRateInputImpl();
    }
    

    /**
     * factory method to create a shallow copy ClassificationShippingRateInput
     * @param template instance to be copied
     * @return copy instance
     */
    public static ClassificationShippingRateInput of(final ClassificationShippingRateInput template) {
        ClassificationShippingRateInputImpl instance = new ClassificationShippingRateInputImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    /**
     * factory method to create a deep copy of ClassificationShippingRateInput
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ClassificationShippingRateInput deepCopy(@Nullable final ClassificationShippingRateInput template) {
        if (template == null) {
            return null;
        }
        ClassificationShippingRateInputImpl instance = new ClassificationShippingRateInputImpl();
        instance.setKey(template.getKey());
        instance.setLabel(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getLabel()));
        return instance;
    }

    /**
     * builder factory method for ClassificationShippingRateInput
     * @return builder
     */
    public static ClassificationShippingRateInputBuilder builder() {
        return ClassificationShippingRateInputBuilder.of();
    }
    
    /**
     * create builder for ClassificationShippingRateInput instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ClassificationShippingRateInputBuilder builder(final ClassificationShippingRateInput template) {
        return ClassificationShippingRateInputBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withClassificationShippingRateInput(Function<ClassificationShippingRateInput, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ClassificationShippingRateInput> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ClassificationShippingRateInput>() {
            @Override
            public String toString() {
                return "TypeReference<ClassificationShippingRateInput>";
            }
        };
    }
}
