
package com.commercetools.importapi.models.categories;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
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

    /**
     *  <p>Maps to <code>Category.name</code>.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Maps to <code>Category.slug</code>. Must match the pattern <code>[-a-zA-Z0-9_]{2,256}</code>.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>Maps to <code>Category.description</code>.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Maps to <code>Category.parent</code>. The Reference to the parent Category with which the Category is associated. If referenced Category does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Category is created.</p>
     * @param parent value to be set
     */

    public void setParent(final CategoryKeyReference parent);

    /**
     *  <p>Maps to <code>Category.orderHint</code>.</p>
     * @param orderHint value to be set
     */

    public void setOrderHint(final String orderHint);

    /**
     *  <p>Maps to <code>Category.externalId</code>.</p>
     * @param externalId value to be set
     */

    public void setExternalId(final String externalId);

    /**
     *  <p>Maps to <code>Category.metaTitle</code>.</p>
     * @param metaTitle value to be set
     */

    public void setMetaTitle(final LocalizedString metaTitle);

    /**
     *  <p>Maps to <code>Category.metaDescription</code>.</p>
     * @param metaDescription value to be set
     */

    public void setMetaDescription(final LocalizedString metaDescription);

    /**
     *  <p>Maps to <code>Category.metaKeywords</code>.</p>
     * @param metaKeywords value to be set
     */

    public void setMetaKeywords(final LocalizedString metaKeywords);

    /**
     * set assets
     * @param assets values to be set
     */

    @JsonIgnore
    public void setAssets(final Asset... assets);

    /**
     * set assets
     * @param assets values to be set
     */

    public void setAssets(final List<Asset> assets);

    /**
     *  <p>The custom fields for this Category.</p>
     * @param custom value to be set
     */

    public void setCustom(final Custom custom);

    /**
     * factory method
     * @return instance of CategoryImport
     */
    public static CategoryImport of() {
        return new CategoryImportImpl();
    }

    /**
     * factory method to create a shallow copy CategoryImport
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of CategoryImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryImport deepCopy(@Nullable final CategoryImport template) {
        if (template == null) {
            return null;
        }
        CategoryImportImpl instance = new CategoryImportImpl();
        instance.setKey(template.getKey());
        instance.setName(Optional.ofNullable(template.getName())
                .map(com.commercetools.importapi.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setSlug(Optional.ofNullable(template.getSlug())
                .map(com.commercetools.importapi.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setDescription(Optional.ofNullable(template.getDescription())
                .map(com.commercetools.importapi.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setParent(Optional.ofNullable(template.getParent())
                .map(com.commercetools.importapi.models.common.CategoryKeyReference::deepCopy)
                .orElse(null));
        instance.setOrderHint(template.getOrderHint());
        instance.setExternalId(template.getExternalId());
        instance.setMetaTitle(Optional.ofNullable(template.getMetaTitle())
                .map(com.commercetools.importapi.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setMetaDescription(Optional.ofNullable(template.getMetaDescription())
                .map(com.commercetools.importapi.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setMetaKeywords(Optional.ofNullable(template.getMetaKeywords())
                .map(com.commercetools.importapi.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setAssets(Optional.ofNullable(template.getAssets())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.Asset::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(Optional.ofNullable(template.getCustom())
                .map(com.commercetools.importapi.models.customfields.Custom::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CategoryImport
     * @return builder
     */
    public static CategoryImportBuilder builder() {
        return CategoryImportBuilder.of();
    }

    /**
     * create builder for CategoryImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryImportBuilder builder(final CategoryImport template) {
        return CategoryImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryImport(Function<CategoryImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryImport>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryImport>";
            }
        };
    }
}
