
package com.commercetools.migration;

import java.util.Locale;

import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.category.CategoryDraft;
import com.commercetools.api.models.category.CategoryDraftBuilder;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.LocalizedStringBuilder;

public class CreateV2Command implements MigrateV2Example {
    @Override
    public void v2() {
        String en = Locale.ENGLISH.toLanguageTag();
        LocalizedString name = LocalizedStringBuilder.of().addValue(en, "name").build();
        LocalizedString slug = LocalizedStringBuilder.of().addValue(en, "slug").build();
        CategoryDraft categoryDraft = CategoryDraftBuilder.of().name(name).slug(slug).build();
        Category category = projectClient().with().categories().post(categoryDraft).executeBlocking().getBody();
    }
}
