package com.commercetools.importer.models.categories;

import com.commercetools.importer.models.common.Asset;
import com.commercetools.importer.models.common.CategoryKeyReference;
import com.commercetools.importer.models.common.ImportResource;
import com.commercetools.importer.models.common.LocalizedString;
import com.commercetools.importer.models.customfields.Custom;
import com.commercetools.importer.models.categories.CategoryImport;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategoryImportBuilder {

    
    private String key;
    
    
    private com.commercetools.importer.models.common.LocalizedString name;
    
    
    private com.commercetools.importer.models.common.LocalizedString slug;
    
    @Nullable
    private com.commercetools.importer.models.common.LocalizedString description;
    
    @Nullable
    private com.commercetools.importer.models.common.CategoryKeyReference parent;
    
    @Nullable
    private String orderHint;
    
    @Nullable
    private String externalId;
    
    @Nullable
    private com.commercetools.importer.models.common.LocalizedString metaTitle;
    
    @Nullable
    private com.commercetools.importer.models.common.LocalizedString metaDescription;
    
    @Nullable
    private com.commercetools.importer.models.common.LocalizedString metaKeywords;
    
    @Nullable
    private java.util.List<com.commercetools.importer.models.common.Asset> assets;
    
    @Nullable
    private com.commercetools.importer.models.customfields.Custom custom;

    public CategoryImportBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    public CategoryImportBuilder name( final com.commercetools.importer.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }
    
    public CategoryImportBuilder slug( final com.commercetools.importer.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }
    
    public CategoryImportBuilder description(@Nullable final com.commercetools.importer.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }
    
    public CategoryImportBuilder parent(@Nullable final com.commercetools.importer.models.common.CategoryKeyReference parent) {
        this.parent = parent;
        return this;
    }
    
    public CategoryImportBuilder orderHint(@Nullable final String orderHint) {
        this.orderHint = orderHint;
        return this;
    }
    
    public CategoryImportBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }
    
    public CategoryImportBuilder metaTitle(@Nullable final com.commercetools.importer.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }
    
    public CategoryImportBuilder metaDescription(@Nullable final com.commercetools.importer.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }
    
    public CategoryImportBuilder metaKeywords(@Nullable final com.commercetools.importer.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }
    
    public CategoryImportBuilder assets(@Nullable final java.util.List<com.commercetools.importer.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }
    
    public CategoryImportBuilder custom(@Nullable final com.commercetools.importer.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    
    public String getKey(){
        return this.key;
    }
    
    
    public com.commercetools.importer.models.common.LocalizedString getName(){
        return this.name;
    }
    
    
    public com.commercetools.importer.models.common.LocalizedString getSlug(){
        return this.slug;
    }
    
    @Nullable
    public com.commercetools.importer.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    @Nullable
    public com.commercetools.importer.models.common.CategoryKeyReference getParent(){
        return this.parent;
    }
    
    @Nullable
    public String getOrderHint(){
        return this.orderHint;
    }
    
    @Nullable
    public String getExternalId(){
        return this.externalId;
    }
    
    @Nullable
    public com.commercetools.importer.models.common.LocalizedString getMetaTitle(){
        return this.metaTitle;
    }
    
    @Nullable
    public com.commercetools.importer.models.common.LocalizedString getMetaDescription(){
        return this.metaDescription;
    }
    
    @Nullable
    public com.commercetools.importer.models.common.LocalizedString getMetaKeywords(){
        return this.metaKeywords;
    }
    
    @Nullable
    public java.util.List<com.commercetools.importer.models.common.Asset> getAssets(){
        return this.assets;
    }
    
    @Nullable
    public com.commercetools.importer.models.customfields.Custom getCustom(){
        return this.custom;
    }

    public CategoryImport build() {
        return new CategoryImportImpl(key, name, slug, description, parent, orderHint, externalId, metaTitle, metaDescription, metaKeywords, assets, custom);
    }

    public static CategoryImportBuilder of() {
        return new CategoryImportBuilder();
    }

    public static CategoryImportBuilder of(final CategoryImport template) {
        CategoryImportBuilder builder = new CategoryImportBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.slug = template.getSlug();
        builder.description = template.getDescription();
        builder.parent = template.getParent();
        builder.orderHint = template.getOrderHint();
        builder.externalId = template.getExternalId();
        builder.metaTitle = template.getMetaTitle();
        builder.metaDescription = template.getMetaDescription();
        builder.metaKeywords = template.getMetaKeywords();
        builder.assets = template.getAssets();
        builder.custom = template.getCustom();
        return builder;
    }

}
