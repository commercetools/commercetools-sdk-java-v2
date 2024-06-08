
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ProductTailoringUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringUpdateAction productTailoringUpdateAction = ProductTailoringUpdateAction.publishBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringPublishActionImpl.class, name = ProductTailoringPublishAction.PUBLISH),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetDescriptionActionImpl.class, name = ProductTailoringSetDescriptionAction.SET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaAttributesActionImpl.class, name = ProductTailoringSetMetaAttributesAction.SET_META_ATTRIBUTES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaDescriptionActionImpl.class, name = ProductTailoringSetMetaDescriptionAction.SET_META_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaKeywordsActionImpl.class, name = ProductTailoringSetMetaKeywordsAction.SET_META_KEYWORDS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaTitleActionImpl.class, name = ProductTailoringSetMetaTitleAction.SET_META_TITLE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetNameActionImpl.class, name = ProductTailoringSetNameAction.SET_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetSlugActionImpl.class, name = ProductTailoringSetSlugAction.SET_SLUG),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringUnpublishActionImpl.class, name = ProductTailoringUnpublishAction.UNPUBLISH) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ProductTailoringUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ProductTailoringUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductTailoringUpdateAction {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * factory method to create a deep copy of ProductTailoringUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringUpdateAction deepCopy(@Nullable final ProductTailoringUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringPublishAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringPublishAction
                    .deepCopy((com.commercetools.api.models.product_tailoring.ProductTailoringPublishAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetDescriptionAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetDescriptionAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringSetDescriptionAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaAttributesAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaAttributesAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaAttributesAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaDescriptionAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaDescriptionAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaDescriptionAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaKeywordsAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaKeywordsAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaKeywordsAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaTitleAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaTitleAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaTitleAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetNameAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetNameAction
                    .deepCopy((com.commercetools.api.models.product_tailoring.ProductTailoringSetNameAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetSlugAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetSlugAction
                    .deepCopy((com.commercetools.api.models.product_tailoring.ProductTailoringSetSlugAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringUnpublishAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringUnpublishAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringUnpublishAction) template);
        }
        ProductTailoringUpdateActionImpl instance = new ProductTailoringUpdateActionImpl();
        return instance;
    }

    /**
     * builder for publish subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringPublishActionBuilder publishBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringPublishActionBuilder.of();
    }

    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetDescriptionActionBuilder.of();
    }

    /**
     * builder for setMetaAttributes subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaAttributesActionBuilder setMetaAttributesBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaAttributesActionBuilder.of();
    }

    /**
     * builder for setMetaDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaDescriptionActionBuilder setMetaDescriptionBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaDescriptionActionBuilder.of();
    }

    /**
     * builder for setMetaKeywords subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaKeywordsActionBuilder setMetaKeywordsBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaKeywordsActionBuilder.of();
    }

    /**
     * builder for setMetaTitle subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaTitleActionBuilder setMetaTitleBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaTitleActionBuilder.of();
    }

    /**
     * builder for setName subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetNameActionBuilder setNameBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetNameActionBuilder.of();
    }

    /**
     * builder for setSlug subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetSlugActionBuilder setSlugBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetSlugActionBuilder.of();
    }

    /**
     * builder for unpublish subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringUnpublishActionBuilder unpublishBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringUnpublishActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringUpdateAction(Function<ProductTailoringUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringUpdateAction>";
            }
        };
    }
}
