package com.commercetools.sdk;

import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.importapi.models.categories.CategoryImport;
import com.commercetools.importapi.models.common.CategoryKeyReference;
import com.commercetools.importapi.models.common.LocalizedStringBuilder;

import java.util.Optional;

import static com.commercetools.sdk.CommonImportUtil.*;

public class CategoryUtil {

    public CategoryImport toCategoryImport(Category category) {
       return CategoryImport.builder()
               .key(category.getKey())  // required field
               .name(getLocalizedStringBuilder(category.getName()).build())  // required field
               .slug(getLocalizedStringBuilder(category.getSlug()).build())  // required field
               .description(Optional.ofNullable(category.getDescription()).map(CommonImportUtil::getLocalizedStringBuilder)
                       .map(LocalizedStringBuilder::build)
                       .orElse(null))
               .parent(CategoryKeyReference(category.getParent()))
               .orderHint(category.getOrderHint())
               .externalId(category.getId())
               .metaTitle(Optional.ofNullable(category.getMetaTitle()).map(CommonImportUtil::getLocalizedStringBuilder)
                       .map(LocalizedStringBuilder::build)
                       .orElse(null))
               .metaDescription(Optional.ofNullable(category.getMetaDescription()).map(CommonImportUtil::getLocalizedStringBuilder)
                       .map(LocalizedStringBuilder::build)
                       .orElse(null))
               .metaKeywords(Optional.ofNullable(category.getMetaKeywords()).map(CommonImportUtil::getLocalizedStringBuilder)
                       .map(LocalizedStringBuilder::build)
                       .orElse(null))
               .assets(importAssets(category.getAssets()))
               .custom(getImportApiCustom(category.getCustom()))
               .build();
    }

    private CategoryKeyReference CategoryKeyReference(CategoryReference categoryReference) {
        if (categoryReference == null) {
            return null;
        }
        return CategoryKeyReference.builder().key(categoryReference.getId()).build();
    }
}
