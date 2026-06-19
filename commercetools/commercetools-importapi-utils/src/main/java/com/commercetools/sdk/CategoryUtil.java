
package com.commercetools.sdk;

import static com.commercetools.sdk.CommonImportUtil.*;

import java.util.Optional;

import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.importapi.models.categories.CategoryImport;
import com.commercetools.importapi.models.common.CategoryKeyReference;
import com.commercetools.importapi.models.common.LocalizedStringBuilder;

public class CategoryUtil {

    private final KeyResolverService keyResolverService;
    private final CommonImportUtil util;
    public CategoryUtil() {
        keyResolverService = new ExpandObjResolverService();
        util = new CommonImportUtil(keyResolverService);
    }

    public CategoryUtil(final KeyResolverService resolverService) {
        keyResolverService = resolverService;
        util = new CommonImportUtil(keyResolverService);
    }

    public CategoryImport toCategoryImport(Category category) {
        return CategoryImport.builder()
                .key(category.getKey()) // required field
                .name(getLocalizedStringBuilder(category.getName()).build()) // required field
                .slug(getLocalizedStringBuilder(category.getSlug()).build()) // required field
                .description(Optional.ofNullable(category.getDescription())
                        .map(CommonImportUtil::getLocalizedStringBuilder)
                        .map(LocalizedStringBuilder::build)
                        .orElse(null))
                .parent(categoryKeyReference(category.getParent()))
                .orderHint(category.getOrderHint())
                .externalId(category.getExternalId())
                .metaTitle(Optional.ofNullable(category.getMetaTitle())
                        .map(CommonImportUtil::getLocalizedStringBuilder)
                        .map(LocalizedStringBuilder::build)
                        .orElse(null))
                .metaDescription(Optional.ofNullable(category.getMetaDescription())
                        .map(CommonImportUtil::getLocalizedStringBuilder)
                        .map(LocalizedStringBuilder::build)
                        .orElse(null))
                .metaKeywords(Optional.ofNullable(category.getMetaKeywords())
                        .map(CommonImportUtil::getLocalizedStringBuilder)
                        .map(LocalizedStringBuilder::build)
                        .orElse(null))
                .assets(importAssets(category.getAssets()))
                .custom(util.getImportApiCustom(category.getCustom()))
                .build();
    }

    private CategoryKeyReference categoryKeyReference(CategoryReference categoryReference) {
        if (categoryReference == null) {
            return null;
        }
        return CategoryKeyReference.builder().key(keyResolverService.resolveKey(categoryReference)).build();
    }
}
