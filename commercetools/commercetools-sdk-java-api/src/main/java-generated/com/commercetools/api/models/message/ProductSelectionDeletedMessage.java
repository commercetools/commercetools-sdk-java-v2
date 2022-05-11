
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
@JsonDeserialize(as = ProductSelectionDeletedMessageImpl.class)
public interface ProductSelectionDeletedMessage extends Message {

    String PRODUCT_SELECTION_DELETED = "ProductSelectionDeleted";

    /**
    *  <p>JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values are the corresponding strings used for that language.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static ProductSelectionDeletedMessage of() {
        return new ProductSelectionDeletedMessageImpl();
    }

    public static ProductSelectionDeletedMessage of(final ProductSelectionDeletedMessage template) {
        ProductSelectionDeletedMessageImpl instance = new ProductSelectionDeletedMessageImpl();
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
        instance.setName(template.getName());
        return instance;
    }

    public static ProductSelectionDeletedMessageBuilder builder() {
        return ProductSelectionDeletedMessageBuilder.of();
    }

    public static ProductSelectionDeletedMessageBuilder builder(final ProductSelectionDeletedMessage template) {
        return ProductSelectionDeletedMessageBuilder.of(template);
    }

    default <T> T withProductSelectionDeletedMessage(Function<ProductSelectionDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionDeletedMessage>";
            }
        };
    }
}
