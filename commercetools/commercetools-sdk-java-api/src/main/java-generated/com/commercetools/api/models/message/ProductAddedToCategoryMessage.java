
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.category.CategoryReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductAddedToCategoryMessageImpl.class)
public interface ProductAddedToCategoryMessage extends Message {

    String PRODUCT_ADDED_TO_CATEGORY = "ProductAddedToCategory";

    @NotNull
    @Valid
    @JsonProperty("category")
    public CategoryReference getCategory();

    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setCategory(final CategoryReference category);

    public void setStaged(final Boolean staged);

    public static ProductAddedToCategoryMessage of() {
        return new ProductAddedToCategoryMessageImpl();
    }

    public static ProductAddedToCategoryMessage of(final ProductAddedToCategoryMessage template) {
        ProductAddedToCategoryMessageImpl instance = new ProductAddedToCategoryMessageImpl();
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
        instance.setCategory(template.getCategory());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductAddedToCategoryMessageBuilder builder() {
        return ProductAddedToCategoryMessageBuilder.of();
    }

    public static ProductAddedToCategoryMessageBuilder builder(final ProductAddedToCategoryMessage template) {
        return ProductAddedToCategoryMessageBuilder.of(template);
    }

    default <T> T withProductAddedToCategoryMessage(Function<ProductAddedToCategoryMessage, T> helper) {
        return helper.apply(this);
    }
}
