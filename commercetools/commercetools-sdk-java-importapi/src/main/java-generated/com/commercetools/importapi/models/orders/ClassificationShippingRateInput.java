
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ClassificationShippingRateInputImpl.class)
public interface ClassificationShippingRateInput extends ShippingRateInput {

    /**
     * discriminator value for ClassificationShippingRateInput
     */
    String CLASSIFICATION = "Classification";

    /**
     *
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @return label
     */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    /**
     * set key
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @param label value to be set
     */

    public void setLabel(final LocalizedString label);

    /**
     * factory method
     * @return instance of ClassificationShippingRateInput
     */
    public static ClassificationShippingRateInput of() {
        return new ClassificationShippingRateInputImpl();
    }

    /**
     * factory method to copy an instance of ClassificationShippingRateInput
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
