
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <span>Delete Variant</span> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantDeletedMessage variantDeletedMessage = VariantDeletedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("VariantDeleted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantDeletedMessageImpl.class)
public interface VariantDeletedMessage extends Message {

    /**
     * discriminator value for VariantDeletedMessage
     */
    String VARIANT_DELETED = "VariantDeleted";

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     * factory method
     * @return instance of VariantDeletedMessage
     */
    public static VariantDeletedMessage of() {
        return new VariantDeletedMessageImpl();
    }

    /**
     * factory method to create a shallow copy VariantDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantDeletedMessage of(final VariantDeletedMessage template) {
        VariantDeletedMessageImpl instance = new VariantDeletedMessageImpl();
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
        instance.setProduct(template.getProduct());
        return instance;
    }

    public VariantDeletedMessage copyDeep();

    /**
     * factory method to create a deep copy of VariantDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantDeletedMessage deepCopy(@Nullable final VariantDeletedMessage template) {
        if (template == null) {
            return null;
        }
        VariantDeletedMessageImpl instance = new VariantDeletedMessageImpl();
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
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        return instance;
    }

    /**
     * builder factory method for VariantDeletedMessage
     * @return builder
     */
    public static VariantDeletedMessageBuilder builder() {
        return VariantDeletedMessageBuilder.of();
    }

    /**
     * create builder for VariantDeletedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantDeletedMessageBuilder builder(final VariantDeletedMessage template) {
        return VariantDeletedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantDeletedMessage(Function<VariantDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantDeletedMessage> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<VariantDeletedMessage>";
            }
        };
    }
}
