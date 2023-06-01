package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ClassificationShippingRateInput;
import com.commercetools.api.models.cart.ScoreShippingRateInput;


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
 * ShippingRateInput
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRateInput shippingRateInput = ShippingRateInput.classificationBuilder()
 *             key("{key}")
 *             label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.ClassificationShippingRateInputImpl.class, name = ClassificationShippingRateInput.CLASSIFICATION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.ScoreShippingRateInputImpl.class, name = ScoreShippingRateInput.SCORE)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    defaultImpl = ShippingRateInputImpl.class,
    visible = true
)
@JsonDeserialize(as = ShippingRateInputImpl.class)
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface ShippingRateInput  {


    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();




    /**
     * factory method to create a deep copy of ShippingRateInput
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingRateInput deepCopy(@Nullable final ShippingRateInput template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.cart.ClassificationShippingRateInput) {
            return com.commercetools.api.models.cart.ClassificationShippingRateInput.deepCopy((com.commercetools.api.models.cart.ClassificationShippingRateInput)template);
        }
        if (template instanceof com.commercetools.api.models.cart.ScoreShippingRateInput) {
            return com.commercetools.api.models.cart.ScoreShippingRateInput.deepCopy((com.commercetools.api.models.cart.ScoreShippingRateInput)template);
        }
        ShippingRateInputImpl instance = new ShippingRateInputImpl();
        return instance;
    }


    /**
     * builder for classification subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.ClassificationShippingRateInputBuilder classificationBuilder() {
       return com.commercetools.api.models.cart.ClassificationShippingRateInputBuilder.of();
    }
    /**
     * builder for score subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.ScoreShippingRateInputBuilder scoreBuilder() {
       return com.commercetools.api.models.cart.ScoreShippingRateInputBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingRateInput(Function<ShippingRateInput, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingRateInput> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingRateInput>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingRateInput>";
            }
        };
    }
}
