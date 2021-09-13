
package com.commercetools.migration;

import java.io.IOException;

import com.commercetools.TestUtils;
import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.category.CategoryDraft;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

public class CreateFromJsonV2 implements MigrateV2Example {
    @Override
    public void v2() throws IOException {
        final CategoryDraft categoryDraft = JsonUtils.fromJsonString(TestUtils.stringFromResource("category.json"),
            CategoryDraft.class);
        final Category category = projectClient().with().categories().post(categoryDraft).executeBlocking().getBody();
    }
}
