
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategorySlugChangedMessagePayloadImpl.class)
public interface CategorySlugChangedMessagePayload extends MessagePayload {

    String CATEGORY_SLUG_CHANGED = "CategorySlugChanged";

    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    @Valid
    @JsonProperty("oldSlug")
    public LocalizedString getOldSlug();

    public void setSlug(final LocalizedString slug);

    public void setOldSlug(final LocalizedString oldSlug);

    public static CategorySlugChangedMessagePayload of() {
        return new CategorySlugChangedMessagePayloadImpl();
    }

    public static CategorySlugChangedMessagePayload of(final CategorySlugChangedMessagePayload template) {
        CategorySlugChangedMessagePayloadImpl instance = new CategorySlugChangedMessagePayloadImpl();
        instance.setSlug(template.getSlug());
        instance.setOldSlug(template.getOldSlug());
        return instance;
    }

    public static CategorySlugChangedMessagePayloadBuilder builder() {
        return CategorySlugChangedMessagePayloadBuilder.of();
    }

    public static CategorySlugChangedMessagePayloadBuilder builder(final CategorySlugChangedMessagePayload template) {
        return CategorySlugChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withCategorySlugChangedMessagePayload(Function<CategorySlugChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
