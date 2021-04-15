
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryCreatedMessagePayloadBuilder {

    private com.commercetools.api.models.category.Category category;

    public CategoryCreatedMessagePayloadBuilder category(
            final com.commercetools.api.models.category.Category category) {
        this.category = category;
        return this;
    }

    public com.commercetools.api.models.category.Category getCategory() {
        return this.category;
    }

    public CategoryCreatedMessagePayload build() {
        return new CategoryCreatedMessagePayloadImpl(category);
    }

    public static CategoryCreatedMessagePayloadBuilder of() {
        return new CategoryCreatedMessagePayloadBuilder();
    }

    public static CategoryCreatedMessagePayloadBuilder of(final CategoryCreatedMessagePayload template) {
        CategoryCreatedMessagePayloadBuilder builder = new CategoryCreatedMessagePayloadBuilder();
        builder.category = template.getCategory();
        return builder;
    }

}
