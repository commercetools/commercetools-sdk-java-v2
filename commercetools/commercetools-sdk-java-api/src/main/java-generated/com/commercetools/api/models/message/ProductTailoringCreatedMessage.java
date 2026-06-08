
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_tailoring.ProductTailoringAttribute;
import com.commercetools.api.models.product_tailoring.ProductVariantTailoring;
import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <span>Create Product Tailoring</span> or <span>Create Product Tailoring in Store</span> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringCreatedMessage productTailoringCreatedMessage = ProductTailoringCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .published(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductTailoringCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringCreatedMessageImpl.class)
public interface ProductTailoringCreatedMessage extends Message {

    /**
     * discriminator value for ProductTailoringCreatedMessage
     */
    String PRODUCT_TAILORING_CREATED = "ProductTailoringCreated";

    /**
     *  <p>User-defined unique identifier of the Product Tailoring.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>User-defined unique identifier of the Product this Product Tailoring belongs to.</p>
     * @return productKey
     */

    @JsonProperty("productKey")
    public String getProductKey();

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>The description of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> at the time of creation.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>The name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> at the time of creation.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>The slug of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> at the time of creation.</p>
     * @return slug
     */
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>The metaTitle of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> at the time of creation.</p>
     * @return metaTitle
     */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
     *  <p>The metaDescription of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> at the time of creation.</p>
     * @return metaDescription
     */
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    /**
     *  <p>The metaKeywords of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> at the time of creation.</p>
     * @return metaKeywords
     */
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    /**
     *  <p>The variants of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> at the time of creation.</p>
     * @return variants
     */
    @Valid
    @JsonProperty("variants")
    public List<ProductVariantTailoring> getVariants();

    /**
     *  <p>Attributes of the tailored Product. If available, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<ProductTailoringAttribute> getAttributes();

    /**
     *  <p><code>true</code> if the ProductTailoring is published.</p>
     * @return published
     */
    @NotNull
    @JsonProperty("published")
    public Boolean getPublished();

    /**
     *  <p>User-defined unique identifier of the Product Tailoring.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     *  <p>User-defined unique identifier of the Product this Product Tailoring belongs to.</p>
     * @param productKey value to be set
     */

    public void setProductKey(final String productKey);

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     *  <p>The description of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> at the time of creation.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>The name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> at the time of creation.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>The slug of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> at the time of creation.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>The metaTitle of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> at the time of creation.</p>
     * @param metaTitle value to be set
     */

    public void setMetaTitle(final LocalizedString metaTitle);

    /**
     *  <p>The metaDescription of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> at the time of creation.</p>
     * @param metaDescription value to be set
     */

    public void setMetaDescription(final LocalizedString metaDescription);

    /**
     *  <p>The metaKeywords of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> at the time of creation.</p>
     * @param metaKeywords value to be set
     */

    public void setMetaKeywords(final LocalizedString metaKeywords);

    /**
     *  <p>The variants of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> at the time of creation.</p>
     * @param variants values to be set
     */

    @JsonIgnore
    public void setVariants(final ProductVariantTailoring... variants);

    /**
     *  <p>The variants of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> at the time of creation.</p>
     * @param variants values to be set
     */

    public void setVariants(final List<ProductVariantTailoring> variants);

    /**
     *  <p>Attributes of the tailored Product. If available, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final ProductTailoringAttribute... attributes);

    /**
     *  <p>Attributes of the tailored Product. If available, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<ProductTailoringAttribute> attributes);

    /**
     *  <p><code>true</code> if the ProductTailoring is published.</p>
     * @param published value to be set
     */

    public void setPublished(final Boolean published);

    /**
     * factory method
     * @return instance of ProductTailoringCreatedMessage
     */
    public static ProductTailoringCreatedMessage of() {
        return new ProductTailoringCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringCreatedMessage of(final ProductTailoringCreatedMessage template) {
        ProductTailoringCreatedMessageImpl instance = new ProductTailoringCreatedMessageImpl();
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
        instance.setKey(template.getKey());
        instance.setStore(template.getStore());
        instance.setProductKey(template.getProductKey());
        instance.setProduct(template.getProduct());
        instance.setDescription(template.getDescription());
        instance.setName(template.getName());
        instance.setSlug(template.getSlug());
        instance.setMetaTitle(template.getMetaTitle());
        instance.setMetaDescription(template.getMetaDescription());
        instance.setMetaKeywords(template.getMetaKeywords());
        instance.setVariants(template.getVariants());
        instance.setAttributes(template.getAttributes());
        instance.setPublished(template.getPublished());
        return instance;
    }

    public ProductTailoringCreatedMessage copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringCreatedMessage deepCopy(@Nullable final ProductTailoringCreatedMessage template) {
        if (template == null) {
            return null;
        }
        ProductTailoringCreatedMessageImpl instance = new ProductTailoringCreatedMessageImpl();
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
        instance.setKey(template.getKey());
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        instance.setProductKey(template.getProductKey());
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setMetaTitle(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaTitle()));
        instance.setMetaDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaDescription()));
        instance.setMetaKeywords(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaKeywords()));
        instance.setVariants(Optional.ofNullable(template.getVariants())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_tailoring.ProductVariantTailoring::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_tailoring.ProductTailoringAttribute::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setPublished(template.getPublished());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringCreatedMessage
     * @return builder
     */
    public static ProductTailoringCreatedMessageBuilder builder() {
        return ProductTailoringCreatedMessageBuilder.of();
    }

    /**
     * create builder for ProductTailoringCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringCreatedMessageBuilder builder(final ProductTailoringCreatedMessage template) {
        return ProductTailoringCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringCreatedMessage(Function<ProductTailoringCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringCreatedMessage>";
            }
        };
    }
}
