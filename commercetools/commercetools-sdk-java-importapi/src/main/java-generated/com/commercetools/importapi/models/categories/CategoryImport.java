
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
 *  <p>The data representation for a Category to be imported that is persisted as a Category in the Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryImport categoryImport = CategoryImport.builder()
 *             .key("{key}")
 *             .name(nameBuilder -> nameBuilder)
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryImportImpl.class)
public interface CategoryImport extends ImportResource {

    /**
     *  <p>Maps to <code>Category.name</code>.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Maps to <code>Category.slug</code>. Must match the pattern <code>[-a-zA-Z0-9_]{2,256}</code>.</p>
     * @return slug
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>Maps to <code>Category.description</code>.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Maps to <code>Category.parent</code>. The Reference to the parent Category with which the Category is associated. If referenced Category does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Category is created.</p>
     * @return parent
     */
    @Valid
    @JsonProperty("parent")
    public CategoryKeyReference getParent();

    /**
     *  <p>Maps to <code>Category.orderHint</code>.</p>
     * @return orderHint
     */

    @JsonProperty("orderHint")
    public String getOrderHint();

    /**
     *  <p>Maps to <code>Category.externalId</code>.</p>
     * @return externalId
     */

    @JsonProperty("externalId")
    public String getExternalId();

    /**
     *  <p>Maps to <code>Category.metaTitle</code>.</p>
     * @return metaTitle
     */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
     *  <p>Maps to <code>Category.metaDescription</code>.</p>
     * @return metaDescription
     */
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    /**
     *  <p>Maps to <code>Category.metaKeywords</code>.</p>
     * @return metaKeywords
     */
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    /**
     *
     * @return assets
     */
    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    /**
     *  <p>The custom fields for this Category.</p>
     * @return custom
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

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryImport>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryImport>";
            }
        };
    }
}
