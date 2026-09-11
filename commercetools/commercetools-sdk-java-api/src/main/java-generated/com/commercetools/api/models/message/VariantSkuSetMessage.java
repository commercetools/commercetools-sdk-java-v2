
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
 *     VariantSkuSetMessage variantSkuSetMessage = VariantSkuSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("VariantSkuSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantSkuSetMessageImpl.class)
public interface VariantSkuSetMessage extends Message {

    /**
     * discriminator value for VariantSkuSetMessage
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
     * @return instance of VariantSkuSetMessage
     */
    public static VariantSkuSetMessage of() {
        return new VariantSkuSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy VariantSkuSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantSkuSetMessage of(final VariantSkuSetMessage template) {
        VariantSkuSetMessageImpl instance = new VariantSkuSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setSku(template.getSku());
        instance.setOldSku(template.getOldSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public VariantSkuSetMessage copyDeep();

    /**
     * factory method to create a deep copy of VariantSkuSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantSkuSetMessage deepCopy(@Nullable final VariantSkuSetMessage template) {
        if (template == null) {
            return null;
        }
        VariantSkuSetMessageImpl instance = new VariantSkuSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setSku(template.getSku());
        instance.setOldSku(template.getOldSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for VariantSkuSetMessage
     * @return builder
     */
    public static VariantSkuSetMessageBuilder builder() {
        return VariantSkuSetMessageBuilder.of();
    }

    /**
     * create builder for VariantSkuSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSkuSetMessageBuilder builder(final VariantSkuSetMessage template) {
        return VariantSkuSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantSkuSetMessage(Function<VariantSkuSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantSkuSetMessage> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantSkuSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<VariantSkuSetMessage>";
            }
        };
    }
}
