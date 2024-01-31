
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.AssetDraft;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryDraft categoryDraft = CategoryDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryDraftImpl.class)
public interface CategoryDraft extends com.commercetools.api.models.CustomizableDraft<CategoryDraft>,
        com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<CategoryDraft> {

    /**
     *  <p>Name of the Category.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>User-defined identifier used as a deep-link URL to the related Category. A Category can have the same slug for different Locales, but it must be unique across the Project. Valid slugs must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     * @return slug
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>Description of the Category.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Parent Category of the Category. The parent can be set by its <code>id</code> or <code>key</code>.</p>
     * @return parent
     */
    @Valid
    @JsonProperty("parent")
    public CategoryResourceIdentifier getParent();

    /**
     *  <p>Decimal value between 0 and 1. Frontend applications can use this value for ordering Categories within the same level in the category tree. If not set, a random value will be assigned.</p>
     * @return orderHint
     */

    @JsonProperty("orderHint")
    public String getOrderHint();

    /**
     *  <p>Additional identifier for external systems like Customer Relationship Management (CRM) or Enterprise Resource Planning (ERP).</p>
     * @return externalId
     */

    @JsonProperty("externalId")
    public String getExternalId();

    /**
     *  <p>Name of the Category used by external search engines for improved search engine performance.</p>
     * @return metaTitle
     */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
     *  <p>Description of the Category used by external search engines for improved search engine performance.</p>
     * @return metaDescription
     */
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    /**
     *  <p>Keywords related to the Category for improved search engine performance.</p>
     * @return metaKeywords
     */
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    /**
     *  <p>Custom Fields for the Category.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Media related to the Category.</p>
     * @return assets
     */
    @Valid
    @JsonProperty("assets")
    public List<AssetDraft> getAssets();

    /**
     *  <p>User-defined unique identifier for the Category.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the Category.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>User-defined identifier used as a deep-link URL to the related Category. A Category can have the same slug for different Locales, but it must be unique across the Project. Valid slugs must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>Description of the Category.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Parent Category of the Category. The parent can be set by its <code>id</code> or <code>key</code>.</p>
     * @param parent value to be set
     */

    public void setParent(final CategoryResourceIdentifier parent);

    /**
     *  <p>Decimal value between 0 and 1. Frontend applications can use this value for ordering Categories within the same level in the category tree. If not set, a random value will be assigned.</p>
     * @param orderHint value to be set
     */

    public void setOrderHint(final String orderHint);

    /**
     *  <p>Additional identifier for external systems like Customer Relationship Management (CRM) or Enterprise Resource Planning (ERP).</p>
     * @param externalId value to be set
     */

    public void setExternalId(final String externalId);

    /**
     *  <p>Name of the Category used by external search engines for improved search engine performance.</p>
     * @param metaTitle value to be set
     */

    public void setMetaTitle(final LocalizedString metaTitle);

    /**
     *  <p>Description of the Category used by external search engines for improved search engine performance.</p>
     * @param metaDescription value to be set
     */

    public void setMetaDescription(final LocalizedString metaDescription);

    /**
     *  <p>Keywords related to the Category for improved search engine performance.</p>
     * @param metaKeywords value to be set
     */

    public void setMetaKeywords(final LocalizedString metaKeywords);

    /**
     *  <p>Custom Fields for the Category.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     *  <p>Media related to the Category.</p>
     * @param assets values to be set
     */

    @JsonIgnore
    public void setAssets(final AssetDraft... assets);

    /**
     *  <p>Media related to the Category.</p>
     * @param assets values to be set
     */

    public void setAssets(final List<AssetDraft> assets);

    /**
     *  <p>User-defined unique identifier for the Category.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of CategoryDraft
     */
    public static CategoryDraft of() {
        return new CategoryDraftImpl();
    }

    /**
     * factory method to create a shallow copy CategoryDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryDraft of(final CategoryDraft template) {
        CategoryDraftImpl instance = new CategoryDraftImpl();
        instance.setName(template.getName());
        instance.setSlug(template.getSlug());
        instance.setDescription(template.getDescription());
        instance.setParent(template.getParent());
        instance.setOrderHint(template.getOrderHint());
        instance.setExternalId(template.getExternalId());
        instance.setMetaTitle(template.getMetaTitle());
        instance.setMetaDescription(template.getMetaDescription());
        instance.setMetaKeywords(template.getMetaKeywords());
        instance.setCustom(template.getCustom());
        instance.setAssets(template.getAssets());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategoryDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryDraft deepCopy(@Nullable final CategoryDraft template) {
        if (template == null) {
            return null;
        }
        CategoryDraftImpl instance = new CategoryDraftImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setParent(
            com.commercetools.api.models.category.CategoryResourceIdentifier.deepCopy(template.getParent()));
        instance.setOrderHint(template.getOrderHint());
        instance.setExternalId(template.getExternalId());
        instance.setMetaTitle(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaTitle()));
        instance.setMetaDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaDescription()));
        instance.setMetaKeywords(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaKeywords()));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        instance.setAssets(Optional.ofNullable(template.getAssets())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.AssetDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for CategoryDraft
     * @return builder
     */
    public static CategoryDraftBuilder builder() {
        return CategoryDraftBuilder.of();
    }

    /**
     * create builder for CategoryDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryDraftBuilder builder(final CategoryDraft template) {
        return CategoryDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryDraft(Function<CategoryDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryDraft>";
            }
        };
    }
}
