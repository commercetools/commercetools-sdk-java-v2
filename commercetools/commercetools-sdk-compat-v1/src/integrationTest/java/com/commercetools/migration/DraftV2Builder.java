
package com.commercetools.migration;

import java.util.Locale;

import com.commercetools.api.models.category.CategoryDraft;
import com.commercetools.api.models.category.CategoryDraftBuilder;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.LocalizedStringBuilder;

public class DraftV2Builder implements MigrateV2Example {

    @Override
    public void v2() {
        String en = Locale.ENGLISH.toLanguageTag();
        LocalizedString name = LocalizedStringBuilder.of().addValue(en, "name").build();
        LocalizedString slug = LocalizedStringBuilder.of().addValue(en, "slug").build();
        LocalizedString metaDescription = LocalizedStringBuilder.of().addValue(en, "metaDescription").build();
        LocalizedString metaTitle = LocalizedStringBuilder.of().addValue(en, "metaTitle").build();
        LocalizedString metaKeywords = LocalizedStringBuilder.of().addValue(en, "metaKeywords").build();
        CategoryDraft categoryDraft = CategoryDraftBuilder.of()
                .name(name)
                .slug(slug)
                .externalId("externalId")
                .metaTitle(metaTitle)
                .metaDescription(metaDescription)
                .metaKeywords(metaKeywords)
                .build();
    }
}
