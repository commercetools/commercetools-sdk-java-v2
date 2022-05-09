
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

    /**
    *  <p>JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values are the corresponding strings used for that language.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
    *  <p>JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values are the corresponding strings used for that language.</p>
    */
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

    public static com.fasterxml.jackson.core.type.TypeReference<CategorySlugChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySlugChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySlugChangedMessagePayload>";
            }
        };
    }
}
