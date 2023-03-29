
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Change Slug update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSlugChangedMessagePayload productSlugChangedMessagePayload = ProductSlugChangedMessagePayload.builder()
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSlugChangedMessagePayloadImpl.class)
public interface ProductSlugChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductSlugChangedMessagePayload
     */
    String PRODUCT_SLUG_CHANGED = "ProductSlugChanged";

    /**
     *  <p>The slug of the Product after the Change Slug update action.</p>
     * @return slug
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>The slug of the Product before the Change Slug update action.</p>
     * @return oldSlug
     */
    @Valid
    @JsonProperty("oldSlug")
    public LocalizedString getOldSlug();

    /**
     *  <p>The slug of the Product after the Change Slug update action.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>The slug of the Product before the Change Slug update action.</p>
     * @param oldSlug value to be set
     */

    public void setOldSlug(final LocalizedString oldSlug);

    /**
     * factory method
     * @return instance of ProductSlugChangedMessagePayload
     */
    public static ProductSlugChangedMessagePayload of() {
        return new ProductSlugChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductSlugChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSlugChangedMessagePayload of(final ProductSlugChangedMessagePayload template) {
        ProductSlugChangedMessagePayloadImpl instance = new ProductSlugChangedMessagePayloadImpl();
        instance.setSlug(template.getSlug());
        instance.setOldSlug(template.getOldSlug());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSlugChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSlugChangedMessagePayload deepCopy(@Nullable final ProductSlugChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductSlugChangedMessagePayloadImpl instance = new ProductSlugChangedMessagePayloadImpl();
        instance.setSlug(Optional.ofNullable(template.getSlug())
                .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setOldSlug(Optional.ofNullable(template.getOldSlug())
                .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductSlugChangedMessagePayload
     * @return builder
     */
    public static ProductSlugChangedMessagePayloadBuilder builder() {
        return ProductSlugChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductSlugChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSlugChangedMessagePayloadBuilder builder(final ProductSlugChangedMessagePayload template) {
        return ProductSlugChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSlugChangedMessagePayload(Function<ProductSlugChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSlugChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSlugChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSlugChangedMessagePayload>";
            }
        };
    }
}
