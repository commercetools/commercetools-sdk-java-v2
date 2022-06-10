
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
public interface CategoryDraft extends com.commercetools.api.models.CustomizableDraft<CategoryDraft> {

    /**
     *  <p>Name of the Category.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>User-defined identifier used as a deep-link URL to the related Category. A Category can have the same slug for different Locales, but it must be unique across the Project. Valid slugs must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
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
     *  <p>Parent Category of the Category. The parent can be set by its <code>id</code> or <code>key</code>.</p>
     */
    @Valid
    @JsonProperty("parent")
    public CategoryResourceIdentifier getParent();

    /**
     *  <p>Decimal value between 0 and 1 used to order Categories that are on the same level in the Category tree. If not set, a random value will be assigned.</p>
     */

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
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Media related to the Category.</p>
     */
    @Valid
    @JsonProperty("assets")
    public List<AssetDraft> getAssets();

    /**
     *  <p>User-defined unique identifier for the Category.</p>
     */

    @JsonProperty("key")
    public String getKey();

    public void setName(final LocalizedString name);

    public void setSlug(final LocalizedString slug);

    public void setDescription(final LocalizedString description);

    public void setParent(final CategoryResourceIdentifier parent);

    public void setOrderHint(final String orderHint);

    public void setExternalId(final String externalId);

    public void setMetaTitle(final LocalizedString metaTitle);

    public void setMetaDescription(final LocalizedString metaDescription);

    public void setMetaKeywords(final LocalizedString metaKeywords);

    public void setCustom(final CustomFieldsDraft custom);

    @JsonIgnore
    public void setAssets(final AssetDraft... assets);

    public void setAssets(final List<AssetDraft> assets);

    public void setKey(final String key);

    public static CategoryDraft of() {
        return new CategoryDraftImpl();
    }

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

    public static CategoryDraftBuilder builder() {
        return CategoryDraftBuilder.of();
    }

    public static CategoryDraftBuilder builder(final CategoryDraft template) {
        return CategoryDraftBuilder.of(template);
    }

    default <T> T withCategoryDraft(Function<CategoryDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryDraft>";
            }
        };
    }
}
