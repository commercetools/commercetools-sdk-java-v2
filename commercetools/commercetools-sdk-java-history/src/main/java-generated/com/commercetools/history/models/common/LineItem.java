
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * LineItem
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItem lineItem = LineItem.builder()
 *             .addedAt("{addedAt}")
 *             .custom(customBuilder -> customBuilder)
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .productId("{productId}")
 *             .productSlug(productSlugBuilder -> productSlugBuilder)
 *             .productType(productTypeBuilder -> productTypeBuilder)
 *             .quantity(1)
 *             .variant(variantBuilder -> variantBuilder)
 *             .variantId(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LineItemImpl.class)
public interface LineItem {

    /**
     *
     * @return addedAt
     */
    @NotNull
    @JsonProperty("addedAt")
    public String getAddedAt();

    /**
     *
     * @return custom
     */
    @NotNull
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *
     * @return productId
     */
    @NotNull
    @JsonProperty("productId")
    public String getProductId();

    /**
     *
     * @return productSlug
     */
    @NotNull
    @Valid
    @JsonProperty("productSlug")
    public LocalizedString getProductSlug();

    /**
     *
     * @return productType
     */
    @NotNull
    @Valid
    @JsonProperty("productType")
    public Reference getProductType();

    /**
     *
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Integer getQuantity();

    /**
     *
     * @return variant
     */
    @NotNull
    @Valid
    @JsonProperty("variant")
    public Variant getVariant();

    /**
     *
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    /**
     * set addedAt
     * @param addedAt value to be set
     */

    public void setAddedAt(final String addedAt);

    /**
     * set custom
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * set id
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * set name
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * set productId
     * @param productId value to be set
     */

    public void setProductId(final String productId);

    /**
     * set productSlug
     * @param productSlug value to be set
     */

    public void setProductSlug(final LocalizedString productSlug);

    /**
     * set productType
     * @param productType value to be set
     */

    public void setProductType(final Reference productType);

    /**
     * set quantity
     * @param quantity value to be set
     */

    public void setQuantity(final Integer quantity);

    /**
     * set variant
     * @param variant value to be set
     */

    public void setVariant(final Variant variant);

    /**
     * set variantId
     * @param variantId value to be set
     */

    public void setVariantId(final Integer variantId);

    /**
     * factory method
     * @return instance of LineItem
     */
    public static LineItem of() {
        return new LineItemImpl();
    }

    /**
     * factory method to copy an instance of LineItem
     * @param template instance to be copied
     * @return copy instance
     */
    public static LineItem of(final LineItem template) {
        LineItemImpl instance = new LineItemImpl();
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setProductId(template.getProductId());
        instance.setProductSlug(template.getProductSlug());
        instance.setProductType(template.getProductType());
        instance.setQuantity(template.getQuantity());
        instance.setVariant(template.getVariant());
        instance.setVariantId(template.getVariantId());
        return instance;
    }

    /**
     * builder factory method for LineItem
     * @return builder
     */
    public static LineItemBuilder builder() {
        return LineItemBuilder.of();
    }

    /**
     * create builder for LineItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemBuilder builder(final LineItem template) {
        return LineItemBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLineItem(Function<LineItem, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LineItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LineItem>() {
            @Override
            public String toString() {
                return "TypeReference<LineItem>";
            }
        };
    }
}
