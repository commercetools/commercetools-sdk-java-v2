
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductPriceModeEnum;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetPriceModeAction" rel="nofollow">Set PriceMode</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceModeSetMessage productPriceModeSetMessage = ProductPriceModeSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .to(ProductPriceModeEnum.EMBEDDED)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductPriceModeSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceModeSetMessageImpl.class)
public interface ProductPriceModeSetMessage extends Message {

    /**
     * discriminator value for ProductPriceModeSetMessage
     */
    String PRODUCT_PRICE_MODE_SET = "ProductPriceModeSet";

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPriceModeEnum" rel="nofollow">PriceMode</a> that was set.</p>
     * @return to
     */
    @NotNull
    @JsonProperty("to")
    public ProductPriceModeEnum getTo();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPriceModeEnum" rel="nofollow">PriceMode</a> that was set.</p>
     * @param to value to be set
     */

    public void setTo(final ProductPriceModeEnum to);

    /**
     * factory method
     * @return instance of ProductPriceModeSetMessage
     */
    public static ProductPriceModeSetMessage of() {
        return new ProductPriceModeSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductPriceModeSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPriceModeSetMessage of(final ProductPriceModeSetMessage template) {
        ProductPriceModeSetMessageImpl instance = new ProductPriceModeSetMessageImpl();
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
        instance.setTo(template.getTo());
        return instance;
    }

    public ProductPriceModeSetMessage copyDeep();

    /**
     * factory method to create a deep copy of ProductPriceModeSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPriceModeSetMessage deepCopy(@Nullable final ProductPriceModeSetMessage template) {
        if (template == null) {
            return null;
        }
        ProductPriceModeSetMessageImpl instance = new ProductPriceModeSetMessageImpl();
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
        instance.setTo(template.getTo());
        return instance;
    }

    /**
     * builder factory method for ProductPriceModeSetMessage
     * @return builder
     */
    public static ProductPriceModeSetMessageBuilder builder() {
        return ProductPriceModeSetMessageBuilder.of();
    }

    /**
     * create builder for ProductPriceModeSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceModeSetMessageBuilder builder(final ProductPriceModeSetMessage template) {
        return ProductPriceModeSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceModeSetMessage(Function<ProductPriceModeSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceModeSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceModeSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceModeSetMessage>";
            }
        };
    }
}
