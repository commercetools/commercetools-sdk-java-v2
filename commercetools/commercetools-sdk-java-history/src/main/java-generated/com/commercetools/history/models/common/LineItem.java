
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = LineItemImpl.class)
public interface LineItem {

    @NotNull
    @JsonProperty("addedAt")
    public String getAddedAt();

    @NotNull
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    @NotNull
    @JsonProperty("productId")
    public String getProductId();

    @NotNull
    @Valid
    @JsonProperty("productSlug")
    public LocalizedString getProductSlug();

    @NotNull
    @Valid
    @JsonProperty("productType")
    public Reference getProductType();

    @NotNull
    @JsonProperty("quantity")
    public Integer getQuantity();

    @NotNull
    @Valid
    @JsonProperty("variant")
    public Variant getVariant();

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
