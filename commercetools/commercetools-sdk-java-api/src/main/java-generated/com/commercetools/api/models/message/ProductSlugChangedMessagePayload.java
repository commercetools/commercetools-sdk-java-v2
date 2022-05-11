
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
@JsonDeserialize(as = ProductSlugChangedMessagePayloadImpl.class)
public interface ProductSlugChangedMessagePayload extends MessagePayload {

    String PRODUCT_SLUG_CHANGED = "ProductSlugChanged";

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

    public static ProductSlugChangedMessagePayload of() {
        return new ProductSlugChangedMessagePayloadImpl();
    }

    public static ProductSlugChangedMessagePayload of(final ProductSlugChangedMessagePayload template) {
        ProductSlugChangedMessagePayloadImpl instance = new ProductSlugChangedMessagePayloadImpl();
        instance.setSlug(template.getSlug());
        instance.setOldSlug(template.getOldSlug());
        return instance;
    }

    public static ProductSlugChangedMessagePayloadBuilder builder() {
        return ProductSlugChangedMessagePayloadBuilder.of();
    }

    public static ProductSlugChangedMessagePayloadBuilder builder(final ProductSlugChangedMessagePayload template) {
        return ProductSlugChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withProductSlugChangedMessagePayload(Function<ProductSlugChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSlugChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSlugChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSlugChangedMessagePayload>";
            }
        };
    }
}
