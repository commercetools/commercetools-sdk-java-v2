
package com.commercetools.importapi.models.categories;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.Asset;
import com.commercetools.importapi.models.common.CategoryKeyReference;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Import representation for a category.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategoryImportImpl.class)
public interface CategoryImport extends ImportResource {

    /**
    *  <p>Maps to <code>Category.name</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>Maps to <code>Category.slug</code>.
    *  Must match the pattern <code>[-a-zA-Z0-9_]{2,256}</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
    *  <p>Maps to <code>Category.description</code>.</p>
    */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
    *  <p>Maps to <code>Category.parent</code>.
    *  The parent category referenced must already exist
    *  in the commercetools project, or the import operation
    *  will have an <code>Unresolved</code> state.</p>
    */
    @Valid
    @JsonProperty("parent")
    public CategoryKeyReference getParent();

    /**
    *  <p>Maps to <code>Category.orderHint</code>.</p>
    */

    @JsonProperty("orderHint")
    public String getOrderHint();

    /**
    *  <p>Maps to <code>Category.externalId</code>.</p>
    */

    @JsonProperty("externalId")
    public String getExternalId();

    /**
    *  <p>Maps to <code>Category.metaTitle</code>.</p>
    */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
    *  <p>Maps to <code>Category.metaDescription</code>.</p>
    */
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    /**
    *  <p>Maps to <code>Category.metaKeywords</code>.</p>
    */
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    /**
    *  <p>The custom fields for this category.</p>
    */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    public void setName(final LocalizedString name);

    public void setSlug(final LocalizedString slug);

    public void setDescription(final LocalizedString description);

    public void setParent(final CategoryKeyReference parent);

    public void setOrderHint(final String orderHint);

    public void setExternalId(final String externalId);

    public void setMetaTitle(final LocalizedString metaTitle);

    public void setMetaDescription(final LocalizedString metaDescription);

    public void setMetaKeywords(final LocalizedString metaKeywords);

    @JsonIgnore
    public void setAssets(final Asset... assets);

    public void setAssets(final List<Asset> assets);

    public void setCustom(final Custom custom);

    public static CategoryImport of() {
        return new CategoryImportImpl();
    }

    public static CategoryImport of(final CategoryImport template) {
        CategoryImportImpl instance = new CategoryImportImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setSlug(template.getSlug());
        instance.setDescription(template.getDescription());
        instance.setParent(template.getParent());
        instance.setOrderHint(template.getOrderHint());
        instance.setExternalId(template.getExternalId());
        instance.setMetaTitle(template.getMetaTitle());
        instance.setMetaDescription(template.getMetaDescription());
        instance.setMetaKeywords(template.getMetaKeywords());
        instance.setAssets(template.getAssets());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static CategoryImportBuilder builder() {
        return CategoryImportBuilder.of();
    }

    public static CategoryImportBuilder builder(final CategoryImport template) {
        return CategoryImportBuilder.of(template);
    }

    default <T> T withCategoryImport(Function<CategoryImport, T> helper) {
        return helper.apply(this);
    }
}
