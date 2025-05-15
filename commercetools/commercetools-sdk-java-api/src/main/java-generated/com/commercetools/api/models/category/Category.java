
package com.commercetools.api.models.category;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Asset;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Category
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Category category = Category.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name(nameBuilder -> nameBuilder)
 *             .slug(slugBuilder -> slugBuilder)
 *             .plusAncestors(ancestorsBuilder -> ancestorsBuilder)
 *             .orderHint("{orderHint}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryImpl.class)
public interface Category extends BaseResource, CategoryMixin, com.commercetools.api.models.DomainResource<Category>,
        com.commercetools.api.models.Referencable<Category>,
        com.commercetools.api.models.ResourceIdentifiable<Category>,
        com.commercetools.api.models.Customizable<Category>, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the Category.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Category.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Category was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Category was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the Category.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the Category.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Name of the Category.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>User-defined identifier used as a deep-link URL to the related Category per Locale. A Category can have the same slug for different Locales, but they are unique across the Project. Valid slugs match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>. For good performance, indexes are provided for the first 15 <code>languages</code> set in a Project.</p>
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
     *  <p>Contains the parent path towards the root Category.</p>
     * @return ancestors
     */
    @NotNull
    @Valid
    @JsonProperty("ancestors")
    public List<CategoryReference> getAncestors();

    /**
     *  <p>Parent Category of this Category.</p>
     * @return parent
     */
    @Valid
    @JsonProperty("parent")
    public CategoryReference getParent();

    /**
     *  <p>Decimal value between 0 and 1. Frontend applications can use this value for ordering Categories within the same level in the category tree.</p>
     * @return orderHint
     */
    @NotNull
    @JsonProperty("orderHint")
    public String getOrderHint();

    /**
     *  <p>Additional identifier for external systems like customer relationship management (CRM) or enterprise resource planning (ERP).</p>
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
    public CustomFields getCustom();

    /**
     *  <p>Media related to the Category.</p>
     * @return assets
     */
    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    /**
     *  <p>User-defined unique identifier of the Category.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the Category.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Category.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the Category was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the Category was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the Category.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the Category.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>Name of the Category.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>User-defined identifier used as a deep-link URL to the related Category per Locale. A Category can have the same slug for different Locales, but they are unique across the Project. Valid slugs match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>. For good performance, indexes are provided for the first 15 <code>languages</code> set in a Project.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>Description of the Category.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Contains the parent path towards the root Category.</p>
     * @param ancestors values to be set
     */

    @JsonIgnore
    public void setAncestors(final CategoryReference... ancestors);

    /**
     *  <p>Contains the parent path towards the root Category.</p>
     * @param ancestors values to be set
     */

    public void setAncestors(final List<CategoryReference> ancestors);

    /**
     *  <p>Parent Category of this Category.</p>
     * @param parent value to be set
     */

    public void setParent(final CategoryReference parent);

    /**
     *  <p>Decimal value between 0 and 1. Frontend applications can use this value for ordering Categories within the same level in the category tree.</p>
     * @param orderHint value to be set
     */

    public void setOrderHint(final String orderHint);

    /**
     *  <p>Additional identifier for external systems like customer relationship management (CRM) or enterprise resource planning (ERP).</p>
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

    public void setCustom(final CustomFields custom);

    /**
     *  <p>Media related to the Category.</p>
     * @param assets values to be set
     */

    @JsonIgnore
    public void setAssets(final Asset... assets);

    /**
     *  <p>Media related to the Category.</p>
     * @param assets values to be set
     */

    public void setAssets(final List<Asset> assets);

    /**
     *  <p>User-defined unique identifier of the Category.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of Category
     */
    public static Category of() {
        return new CategoryImpl();
    }

    /**
     * factory method to create a shallow copy Category
     * @param template instance to be copied
     * @return copy instance
     */
    public static Category of(final Category template) {
        CategoryImpl instance = new CategoryImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setName(template.getName());
        instance.setSlug(template.getSlug());
        instance.setDescription(template.getDescription());
        instance.setAncestors(template.getAncestors());
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

    public Category copyDeep();

    /**
     * factory method to create a deep copy of Category
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Category deepCopy(@Nullable final Category template) {
        if (template == null) {
            return null;
        }
        CategoryImpl instance = new CategoryImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setAncestors(Optional.ofNullable(template.getAncestors())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.category.CategoryReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setParent(com.commercetools.api.models.category.CategoryReference.deepCopy(template.getParent()));
        instance.setOrderHint(template.getOrderHint());
        instance.setExternalId(template.getExternalId());
        instance.setMetaTitle(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaTitle()));
        instance.setMetaDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaDescription()));
        instance.setMetaKeywords(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaKeywords()));
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setAssets(Optional.ofNullable(template.getAssets())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Asset::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for Category
     * @return builder
     */
    public static CategoryBuilder builder() {
        return CategoryBuilder.of();
    }

    /**
     * create builder for Category instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryBuilder builder(final Category template) {
        return CategoryBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategory(Function<Category, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.CATEGORY;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Category> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Category>() {
            @Override
            public String toString() {
                return "TypeReference<Category>";
            }
        };
    }
}
