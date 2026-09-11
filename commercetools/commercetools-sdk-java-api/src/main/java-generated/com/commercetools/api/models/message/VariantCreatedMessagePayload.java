
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Asset;
import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.product.Attribute;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <span>Create Variant</span> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantCreatedMessagePayload variantCreatedMessagePayload = VariantCreatedMessagePayload.builder()
 *             .id("{id}")
 *             .productId("{productId}")
 *             .variantId(1)
 *             .publish(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("VariantCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantCreatedMessagePayloadImpl.class)
public interface VariantCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for VariantCreatedMessagePayload
     */
    String VARIANT_CREATED = "VariantCreated";

    /**
     *  <p>Unique identifier of the Variant.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique identifier of the Product to which the Variant belongs.</p>
     * @return productId
     */
    @NotNull
    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p>Unique identifier of the Variant within its parent Product.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    /**
     *  <p>User-defined unique identifier of the Variant.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>SKU of the Variant.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Attributes of the Variant.</p>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>Assets of the Variant.</p>
     * @return assets
     */
    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    /**
     *  <p>Images of the Variant.</p>
     * @return images
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>Whether the Variant was published.</p>
     * @return publish
     */
    @NotNull
    @JsonProperty("publish")
    public Boolean getPublish();

    /**
     *  <p>Unique identifier of the Variant.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Unique identifier of the Product to which the Variant belongs.</p>
     * @param productId value to be set
     */

    public void setProductId(final String productId);

    /**
     *  <p>Unique identifier of the Variant within its parent Product.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Integer variantId);

    /**
     *  <p>User-defined unique identifier of the Variant.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>SKU of the Variant.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Attributes of the Variant.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     *  <p>Attributes of the Variant.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<Attribute> attributes);

    /**
     *  <p>Assets of the Variant.</p>
     * @param assets values to be set
     */

    @JsonIgnore
    public void setAssets(final Asset... assets);

    /**
     *  <p>Assets of the Variant.</p>
     * @param assets values to be set
     */

    public void setAssets(final List<Asset> assets);

    /**
     *  <p>Images of the Variant.</p>
     * @param images values to be set
     */

    @JsonIgnore
    public void setImages(final Image... images);

    /**
     *  <p>Images of the Variant.</p>
     * @param images values to be set
     */

    public void setImages(final List<Image> images);

    /**
     *  <p>Whether the Variant was published.</p>
     * @param publish value to be set
     */

    public void setPublish(final Boolean publish);

    /**
     * factory method
     * @return instance of VariantCreatedMessagePayload
     */
    public static VariantCreatedMessagePayload of() {
        return new VariantCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy VariantCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantCreatedMessagePayload of(final VariantCreatedMessagePayload template) {
        VariantCreatedMessagePayloadImpl instance = new VariantCreatedMessagePayloadImpl();
        instance.setId(template.getId());
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setAttributes(template.getAttributes());
        instance.setAssets(template.getAssets());
        instance.setImages(template.getImages());
        instance.setPublish(template.getPublish());
        return instance;
    }

    public VariantCreatedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of VariantCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantCreatedMessagePayload deepCopy(@Nullable final VariantCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        VariantCreatedMessagePayloadImpl instance = new VariantCreatedMessagePayloadImpl();
        instance.setId(template.getId());
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product.Attribute::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAssets(Optional.ofNullable(template.getAssets())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Asset::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setImages(Optional.ofNullable(template.getImages())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Image::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setPublish(template.getPublish());
        return instance;
    }

    /**
     * builder factory method for VariantCreatedMessagePayload
     * @return builder
     */
    public static VariantCreatedMessagePayloadBuilder builder() {
        return VariantCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for VariantCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantCreatedMessagePayloadBuilder builder(final VariantCreatedMessagePayload template) {
        return VariantCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantCreatedMessagePayload(Function<VariantCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantCreatedMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<VariantCreatedMessagePayload>";
            }
        };
    }
}
