
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryCreatedMessagePayloadBuilder implements Builder<CategoryCreatedMessagePayload> {

    private com.commercetools.api.models.category.Category category;

    public CategoryCreatedMessagePayloadBuilder category(
            Function<com.commercetools.api.models.category.CategoryBuilder, com.commercetools.api.models.category.CategoryBuilder> builder) {
        this.category = builder.apply(com.commercetools.api.models.category.CategoryBuilder.of()).build();
        return this;
    }

    public CategoryCreatedMessagePayloadBuilder category(
            final com.commercetools.api.models.category.Category category) {
        this.category = category;
        return this;
    }

    public com.commercetools.api.models.category.Category getCategory() {
        return this.category;
    }

    public CategoryCreatedMessagePayload build() {
        Objects.requireNonNull(category, CategoryCreatedMessagePayload.class + ": category is missing");
        return new CategoryCreatedMessagePayloadImpl(category);
    }

    /**
     * builds CategoryCreatedMessagePayload without checking for non null required values
     */
    public CategoryCreatedMessagePayload buildUnchecked() {
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
