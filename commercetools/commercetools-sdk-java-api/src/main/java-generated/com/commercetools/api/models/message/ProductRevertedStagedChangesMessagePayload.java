
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductRevertedStagedChangesMessagePayloadImpl.class)
public interface ProductRevertedStagedChangesMessagePayload extends MessagePayload {

    String PRODUCT_REVERTED_STAGED_CHANGES = "ProductRevertedStagedChanges";

    @NotNull
    @JsonProperty("removedImageUrls")
    public List<String> getRemovedImageUrls();

    @JsonIgnore
    public void setRemovedImageUrls(final String... removedImageUrls);

    public void setRemovedImageUrls(final List<String> removedImageUrls);

    public static ProductRevertedStagedChangesMessagePayload of() {
        return new ProductRevertedStagedChangesMessagePayloadImpl();
    }

    public static ProductRevertedStagedChangesMessagePayload of(
            final ProductRevertedStagedChangesMessagePayload template) {
        ProductRevertedStagedChangesMessagePayloadImpl instance = new ProductRevertedStagedChangesMessagePayloadImpl();
        instance.setRemovedImageUrls(template.getRemovedImageUrls());
        return instance;
    }

    public static ProductRevertedStagedChangesMessagePayloadBuilder builder() {
        return ProductRevertedStagedChangesMessagePayloadBuilder.of();
    }

    public static ProductRevertedStagedChangesMessagePayloadBuilder builder(
            final ProductRevertedStagedChangesMessagePayload template) {
        return ProductRevertedStagedChangesMessagePayloadBuilder.of(template);
    }

    default <T> T withProductRevertedStagedChangesMessagePayload(
            Function<ProductRevertedStagedChangesMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
