
package com.commercetools.api.models.category;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Asset;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
public interface Category extends BaseResource, com.commercetools.api.models.DomainResource<Category>,
        com.commercetools.api.models.Referencable<Category>,
        com.commercetools.api.models.ResourceIdentifiable<Category>,
        com.commercetools.api.models.Customizable<Category> {

    /**
     *  <p>Unique identifier of the Category.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Category.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Category was initially created.</p>
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Category was last updated.</p>
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Name of the Category.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>User-defined identifier used as a deep-link URL to the related Category per Locale. A Category can have the same slug for different Locales, but they are unique across the Project. Valid slugs match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>. For good performance, indexes are provided for the first 15 <code>languages</code> set in a Project.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>Description of the Category.</p>
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Contains the parent path towards the root Category.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("ancestors")
    public List<CategoryReference> getAncestors();

    /**
     *  <p>Parent Category of this Category.</p>
     */
    @Valid
    @JsonProperty("parent")
    public CategoryReference getParent();

    /**
     *  <p>Decimal value between 0 and 1 used to order Categories that are on the same level in the Category tree.</p>
     */
    @NotNull
    @JsonProperty("orderHint")
    public String getOrderHint();

    /**
     *  <p>Additional identifier for external systems like Customer Relationship Management (CRM) or Enterprise Resource Planning (ERP).</p>
     */

    @JsonProperty("externalId")
    public String getExternalId();

    /**
     *  <p>Name of the Category used by external search engines for improved search engine performance.</p>
     */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
     *  <p>Description of the Category used by external search engines for improved search engine performance.</p>
     */
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    /**
     *  <p>Keywords related to the Category for improved search engine performance.</p>
     */
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    /**
     *  <p>Custom Fields for the Category.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Media related to the Category.</p>
     */
    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    /**
     *  <p>User-defined unique identifier of the Category.</p>
     */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setName(final LocalizedString name);

    public void setSlug(final LocalizedString slug);

    public void setDescription(final LocalizedString description);

    @JsonIgnore
    public void setAncestors(final CategoryReference... ancestors);

    public void setAncestors(final List<CategoryReference> ancestors);

    public void setParent(final CategoryReference parent);

    public void setOrderHint(final String orderHint);

    public void setExternalId(final String externalId);

    public void setMetaTitle(final LocalizedString metaTitle);

    public void setMetaDescription(final LocalizedString metaDescription);

    public void setMetaKeywords(final LocalizedString metaKeywords);

    public void setCustom(final CustomFields custom);

    @JsonIgnore
    public void setAssets(final Asset... assets);

    public void setAssets(final List<Asset> assets);

    public void setKey(final String key);

    public static Category of() {
        return new CategoryImpl();
    }

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

    public static CategoryBuilder builder() {
        return CategoryBuilder.of();
    }

    public static CategoryBuilder builder(final Category template) {
        return CategoryBuilder.of(template);
    }

    default <T> T withCategory(Function<Category, T> helper) {
        return helper.apply(this);
    }

    @Override
    public default com.commercetools.api.models.common.ResourceIdentifier toResourceIdentifier() {
        return com.commercetools.api.models.category.CategoryResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default com.commercetools.api.models.common.Reference toReference() {
        return com.commercetools.api.models.category.CategoryReference.builder().id(getId()).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Category> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Category>() {
            @Override
            public String toString() {
                return "TypeReference<Category>";
            }
        };
    }
}
