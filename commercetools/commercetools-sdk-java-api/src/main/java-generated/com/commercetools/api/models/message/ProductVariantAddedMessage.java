package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.message.ProductVariantAddedMessageImpl;

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
 *  <p>Generated after a successful Add Product Variant update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantAddedMessage productVariantAddedMessage = ProductVariantAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .variant(variantBuilder -> variantBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductVariantAddedMessageImpl.class)
public interface ProductVariantAddedMessage extends Message {

    /**
     * discriminator value for ProductVariantAddedMessage
     */
    String PRODUCT_VARIANT_ADDED = "ProductVariantAdded";

    /**
     *  <p>Unique identifier of the Product Variant that was added.</p>
     * @return variant
     */
    @NotNull
    @Valid
    @JsonProperty("variant")
    public ProductVariant getVariant();
    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Unique identifier of the Product Variant that was added.</p>
     * @param variant value to be set
     */
    
    public void setVariant(final ProductVariant variant);
    
    
    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     */
    
    public void setStaged(final Boolean staged);
    

    /**
     * factory method
     * @return instance of ProductVariantAddedMessage
     */
    public static ProductVariantAddedMessage of(){
        return new ProductVariantAddedMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductVariantAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantAddedMessage of(final ProductVariantAddedMessage template) {
        ProductVariantAddedMessageImpl instance = new ProductVariantAddedMessageImpl();
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
        instance.setVariant(template.getVariant());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductVariantAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantAddedMessage deepCopy(@Nullable final ProductVariantAddedMessage template) {
        if (template == null) {
            return null;
        }
        ProductVariantAddedMessageImpl instance = new ProductVariantAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers.deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setVariant(com.commercetools.api.models.product.ProductVariant.deepCopy(template.getVariant()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductVariantAddedMessage
     * @return builder
     */
    public static ProductVariantAddedMessageBuilder builder() {
        return ProductVariantAddedMessageBuilder.of();
    }
    
    /**
     * create builder for ProductVariantAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantAddedMessageBuilder builder(final ProductVariantAddedMessage template) {
        return ProductVariantAddedMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantAddedMessage(Function<ProductVariantAddedMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantAddedMessage>";
            }
        };
    }
}
