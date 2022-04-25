
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductRevertedStagedChangesMessageImpl.class)
public interface ProductRevertedStagedChangesMessage extends Message {

    String PRODUCT_REVERTED_STAGED_CHANGES = "ProductRevertedStagedChanges";

    @NotNull
    @JsonProperty("removedImageUrls")
    public List<String> getRemovedImageUrls();

    @JsonIgnore
    public void setRemovedImageUrls(final String... removedImageUrls);

    public void setRemovedImageUrls(final List<String> removedImageUrls);

    public static ProductRevertedStagedChangesMessage of() {
        return new ProductRevertedStagedChangesMessageImpl();
    }

    public static ProductRevertedStagedChangesMessage of(final ProductRevertedStagedChangesMessage template) {
        ProductRevertedStagedChangesMessageImpl instance = new ProductRevertedStagedChangesMessageImpl();
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
        instance.setRemovedImageUrls(template.getRemovedImageUrls());
        return instance;
    }

    public static ProductRevertedStagedChangesMessageBuilder builder() {
        return ProductRevertedStagedChangesMessageBuilder.of();
    }

    public static ProductRevertedStagedChangesMessageBuilder builder(
            final ProductRevertedStagedChangesMessage template) {
        return ProductRevertedStagedChangesMessageBuilder.of(template);
    }

    default <T> T withProductRevertedStagedChangesMessage(Function<ProductRevertedStagedChangesMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductRevertedStagedChangesMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRevertedStagedChangesMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRevertedStagedChangesMessage>";
            }
        };
    }
}
