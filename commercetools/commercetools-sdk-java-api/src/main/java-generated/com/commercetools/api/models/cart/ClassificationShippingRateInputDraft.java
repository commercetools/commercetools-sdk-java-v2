
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ClassificationShippingRateInputDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ClassificationShippingRateInputDraft classificationShippingRateInputDraft = ClassificationShippingRateInputDraft.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ClassificationShippingRateInputDraftImpl.class)
public interface ClassificationShippingRateInputDraft
        extends ShippingRateInputDraft, io.vrap.rmf.base.client.Draft<ClassificationShippingRateInputDraft> {

    /**
     * discriminator value for ClassificationShippingRateInputDraft
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
     *  <p>Key of the value used as a programmatic identifier.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ClassificationShippingRateInputDraft
     */
    public static ClassificationShippingRateInputDraft of() {
        return new ClassificationShippingRateInputDraftImpl();
    }

    /**
     * factory method to create a shallow copy ClassificationShippingRateInputDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ClassificationShippingRateInputDraft of(final ClassificationShippingRateInputDraft template) {
        ClassificationShippingRateInputDraftImpl instance = new ClassificationShippingRateInputDraftImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ClassificationShippingRateInputDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ClassificationShippingRateInputDraft deepCopy(
            @Nullable final ClassificationShippingRateInputDraft template) {
        if (template == null) {
            return null;
        }
        ClassificationShippingRateInputDraftImpl instance = new ClassificationShippingRateInputDraftImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ClassificationShippingRateInputDraft
     * @return builder
     */
    public static ClassificationShippingRateInputDraftBuilder builder() {
        return ClassificationShippingRateInputDraftBuilder.of();
    }

    /**
     * create builder for ClassificationShippingRateInputDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ClassificationShippingRateInputDraftBuilder builder(
            final ClassificationShippingRateInputDraft template) {
        return ClassificationShippingRateInputDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withClassificationShippingRateInputDraft(Function<ClassificationShippingRateInputDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ClassificationShippingRateInputDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ClassificationShippingRateInputDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ClassificationShippingRateInputDraft>";
            }
        };
    }
}
