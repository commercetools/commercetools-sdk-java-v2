
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
@JsonDeserialize(as = ProductSlugChangedMessageImpl.class)
public interface ProductSlugChangedMessage extends Message {

    String PRODUCT_SLUG_CHANGED = "ProductSlugChanged";

    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    @Valid
    @JsonProperty("oldSlug")
    public LocalizedString getOldSlug();

    public void setSlug(final LocalizedString slug);

    public void setOldSlug(final LocalizedString oldSlug);

    public static ProductSlugChangedMessage of() {
        return new ProductSlugChangedMessageImpl();
    }

    public static ProductSlugChangedMessage of(final ProductSlugChangedMessage template) {
        ProductSlugChangedMessageImpl instance = new ProductSlugChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setSlug(template.getSlug());
        instance.setOldSlug(template.getOldSlug());
        return instance;
    }

    public static ProductSlugChangedMessageBuilder builder() {
        return ProductSlugChangedMessageBuilder.of();
    }

    public static ProductSlugChangedMessageBuilder builder(final ProductSlugChangedMessage template) {
        return ProductSlugChangedMessageBuilder.of(template);
    }

    default <T> T withProductSlugChangedMessage(Function<ProductSlugChangedMessage, T> helper) {
        return helper.apply(this);
    }
}
