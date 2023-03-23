
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

    public void setAddedAt(final String addedAt);

    public void setCustom(final CustomFields custom);

    public void setId(final String id);

    public void setName(final LocalizedString name);

    public void setProductId(final String productId);

    public void setProductSlug(final LocalizedString productSlug);

    public void setProductType(final Reference productType);

    public void setQuantity(final Integer quantity);

    public void setVariant(final Variant variant);

    public void setVariantId(final Integer variantId);

    public static LineItem of() {
        return new LineItemImpl();
    }

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

    public static LineItemBuilder builder() {
        return LineItemBuilder.of();
    }

    public static LineItemBuilder builder(final LineItem template) {
        return LineItemBuilder.of(template);
    }

    default <T> T withLineItem(Function<LineItem, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<LineItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LineItem>() {
            @Override
            public String toString() {
                return "TypeReference<LineItem>";
            }
        };
    }
}
