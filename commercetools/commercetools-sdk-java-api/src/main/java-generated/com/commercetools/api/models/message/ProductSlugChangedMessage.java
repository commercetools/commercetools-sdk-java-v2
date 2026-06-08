
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductChangeSlugAction" rel="nofollow">Change Slug</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSlugChangedMessage productSlugChangedMessage = ProductSlugChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductSlugChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSlugChangedMessageImpl.class)
public interface ProductSlugChangedMessage extends Message {

    /**
     * discriminator value for ProductSlugChangedMessage
     */
    String PRODUCT_SLUG_CHANGED = "ProductSlugChanged";

    /**
     *  <p>The slug of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductChangeSlugAction" rel="nofollow">Change Slug</a> update action.</p>
     * @return slug
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>The slug of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductChangeSlugAction" rel="nofollow">Change Slug</a> update action.</p>
     * @return oldSlug
     */
    @Valid
    @JsonProperty("oldSlug")
    public LocalizedString getOldSlug();

    /**
     *  <p>The slug of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductChangeSlugAction" rel="nofollow">Change Slug</a> update action.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>The slug of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductChangeSlugAction" rel="nofollow">Change Slug</a> update action.</p>
     * @param oldSlug value to be set
     */

    public void setOldSlug(final LocalizedString oldSlug);

    /**
     * factory method
     * @return instance of ProductSlugChangedMessage
     */
    public static ProductSlugChangedMessage of() {
        return new ProductSlugChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductSlugChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSlugChangedMessage of(final ProductSlugChangedMessage template) {
        ProductSlugChangedMessageImpl instance = new ProductSlugChangedMessageImpl();
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
        instance.setSlug(template.getSlug());
        instance.setOldSlug(template.getOldSlug());
        return instance;
    }

    public ProductSlugChangedMessage copyDeep();

    /**
     * factory method to create a deep copy of ProductSlugChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSlugChangedMessage deepCopy(@Nullable final ProductSlugChangedMessage template) {
        if (template == null) {
            return null;
        }
        ProductSlugChangedMessageImpl instance = new ProductSlugChangedMessageImpl();
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
        instance.setSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setOldSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getOldSlug()));
        return instance;
    }

    /**
     * builder factory method for ProductSlugChangedMessage
     * @return builder
     */
    public static ProductSlugChangedMessageBuilder builder() {
        return ProductSlugChangedMessageBuilder.of();
    }

    /**
     * create builder for ProductSlugChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSlugChangedMessageBuilder builder(final ProductSlugChangedMessage template) {
        return ProductSlugChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSlugChangedMessage(Function<ProductSlugChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSlugChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSlugChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSlugChangedMessage>";
            }
        };
    }
}
