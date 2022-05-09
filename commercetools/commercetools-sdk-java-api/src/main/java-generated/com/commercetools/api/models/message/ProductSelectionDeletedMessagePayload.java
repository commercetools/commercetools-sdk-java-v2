
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
@JsonDeserialize(as = ProductSelectionDeletedMessagePayloadImpl.class)
public interface ProductSelectionDeletedMessagePayload extends MessagePayload {

    String PRODUCT_SELECTION_DELETED = "ProductSelectionDeleted";

    /**
    *  <p>JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values are the corresponding strings used for that language.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static ProductSelectionDeletedMessagePayload of() {
        return new ProductSelectionDeletedMessagePayloadImpl();
    }

    public static ProductSelectionDeletedMessagePayload of(final ProductSelectionDeletedMessagePayload template) {
        ProductSelectionDeletedMessagePayloadImpl instance = new ProductSelectionDeletedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static ProductSelectionDeletedMessagePayloadBuilder builder() {
        return ProductSelectionDeletedMessagePayloadBuilder.of();
    }

    public static ProductSelectionDeletedMessagePayloadBuilder builder(
            final ProductSelectionDeletedMessagePayload template) {
        return ProductSelectionDeletedMessagePayloadBuilder.of(template);
    }

    default <T> T withProductSelectionDeletedMessagePayload(Function<ProductSelectionDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionDeletedMessagePayload>";
            }
        };
    }
}
