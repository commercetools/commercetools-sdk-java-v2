
package com.commercetools.migration;

import io.sphere.sdk.categories.CategoryDraft;
import io.sphere.sdk.categories.CategoryDraftBuilder;
import io.sphere.sdk.models.LocalizedString;

public class DraftV1Builder implements MigrateV1Example {

    @Override
    public void v1() {
        LocalizedString name = LocalizedString.ofEnglish("name");
        LocalizedString slug = LocalizedString.ofEnglish("slug");
        LocalizedString metaDescription = LocalizedString.ofEnglish("metaDescription");
        LocalizedString metaTitle = LocalizedString.ofEnglish("metaTitle");
        LocalizedString metaKeywords = LocalizedString.ofEnglish("metaKeywords");
        CategoryDraft categoryDraft = CategoryDraftBuilder.of(name, slug)
                .metaDescription(metaDescription)
                .metaTitle(metaTitle)
                .metaKeywords(metaKeywords)
                .externalId("externalId")
                .build();
    }

}
