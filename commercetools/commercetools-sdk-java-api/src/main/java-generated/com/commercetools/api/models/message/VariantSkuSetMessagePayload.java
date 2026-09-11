
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantSetSkuAction" rel="nofollow">Set SKU</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSkuSetMessagePayload variantSkuSetMessagePayload = VariantSkuSetMessagePayload.builder()
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("VariantSkuSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantSkuSetMessagePayloadImpl.class)
public interface VariantSkuSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for VariantSkuSetMessagePayload
     */
    String VARIANT_SKU_SET = "VariantSkuSet";

    /**
     *  <p>The SKU that was set on the Variant.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>The previous SKU of the Variant.</p>
     * @return oldSku
     */

    @JsonProperty("oldSku")
    public String getOldSku();

    /**
     *  <p>Whether the update was only applied to the staged Variant.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The SKU that was set on the Variant.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>The previous SKU of the Variant.</p>
     * @param oldSku value to be set
     */

    public void setOldSku(final String oldSku);

    /**
     *  <p>Whether the update was only applied to the staged Variant.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of VariantSkuSetMessagePayload
     */
    public static VariantSkuSetMessagePayload of() {
        return new VariantSkuSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy VariantSkuSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantSkuSetMessagePayload of(final VariantSkuSetMessagePayload template) {
        VariantSkuSetMessagePayloadImpl instance = new VariantSkuSetMessagePayloadImpl();
        instance.setSku(template.getSku());
        instance.setOldSku(template.getOldSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public VariantSkuSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of VariantSkuSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantSkuSetMessagePayload deepCopy(@Nullable final VariantSkuSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        VariantSkuSetMessagePayloadImpl instance = new VariantSkuSetMessagePayloadImpl();
        instance.setSku(template.getSku());
        instance.setOldSku(template.getOldSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for VariantSkuSetMessagePayload
     * @return builder
     */
    public static VariantSkuSetMessagePayloadBuilder builder() {
        return VariantSkuSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for VariantSkuSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSkuSetMessagePayloadBuilder builder(final VariantSkuSetMessagePayload template) {
        return VariantSkuSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantSkuSetMessagePayload(Function<VariantSkuSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantSkuSetMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantSkuSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<VariantSkuSetMessagePayload>";
            }
        };
    }
}
