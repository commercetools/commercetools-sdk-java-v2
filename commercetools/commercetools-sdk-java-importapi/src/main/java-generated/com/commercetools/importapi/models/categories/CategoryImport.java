
package com.commercetools.importapi.models.categories;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.Asset;
import com.commercetools.importapi.models.common.CategoryKeyReference;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents the data used to import a Category. Once imported, this data is persisted as a <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> in the Project.</p>
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
     *  <p>User-defined unique identifier. If a <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> with this <code>key</code> exists, it is updated with the imported data.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Maps to <code>Category.name</code>.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Maps to <code>Category.slug</code>. Must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
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
     *  <p>Maps to <code>Category.parent</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Category is created.</p>
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
     *  <p>Maps to <code>Category.assets</code>.</p>
     * @return assets
     */
    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    /**
     *  <p>Maps to <code>Category.custom</code>.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    /**
     *  <p>User-defined unique identifier. If a <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> with this <code>key</code> exists, it is updated with the imported data.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Maps to <code>Category.name</code>.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Maps to <code>Category.slug</code>. Must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>Maps to <code>Category.description</code>.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Maps to <code>Category.parent</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Category is created.</p>
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
     *  <p>Maps to <code>Category.assets</code>.</p>
     * @param assets values to be set
     */

    @JsonIgnore
    public void setAssets(final Asset... assets);

    /**
     *  <p>Maps to <code>Category.assets</code>.</p>
     * @param assets values to be set
     */

    public void setAssets(final List<Asset> assets);

    /**
     *  <p>Maps to <code>Category.custom</code>.</p>
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

    public CategoryImport copyDeep();

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
        instance.setName(com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setSlug(com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setDescription(
            com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setParent(
            com.commercetools.importapi.models.common.CategoryKeyReference.deepCopy(template.getParent()));
        instance.setOrderHint(template.getOrderHint());
        instance.setExternalId(template.getExternalId());
        instance.setMetaTitle(
            com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getMetaTitle()));
        instance.setMetaDescription(
            com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getMetaDescription()));
        instance.setMetaKeywords(
            com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getMetaKeywords()));
        instance.setAssets(Optional.ofNullable(template.getAssets())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.Asset::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(com.commercetools.importapi.models.customfields.Custom.deepCopy(template.getCustom()));
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
