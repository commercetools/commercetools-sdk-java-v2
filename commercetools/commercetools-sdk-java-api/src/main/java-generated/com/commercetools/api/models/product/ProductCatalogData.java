
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductCatalogDataImpl.class)
public interface ProductCatalogData {

    @NotNull
    @JsonProperty("published")
    public Boolean getPublished();

    @NotNull
    @Valid
    @JsonProperty("current")
    public ProductData getCurrent();

    @NotNull
    @Valid
    @JsonProperty("staged")
    public ProductData getStaged();

    @NotNull
    @JsonProperty("hasStagedChanges")
    public Boolean getHasStagedChanges();

    public void setPublished(final Boolean published);

    public void setCurrent(final ProductData current);

    public void setStaged(final ProductData staged);

    public void setHasStagedChanges(final Boolean hasStagedChanges);

    public static ProductCatalogData of() {
        return new ProductCatalogDataImpl();
    }

    public static ProductCatalogData of(final ProductCatalogData template) {
        ProductCatalogDataImpl instance = new ProductCatalogDataImpl();
        instance.setPublished(template.getPublished());
        instance.setCurrent(template.getCurrent());
        instance.setStaged(template.getStaged());
        instance.setHasStagedChanges(template.getHasStagedChanges());
        return instance;
    }

    public static ProductCatalogDataBuilder builder() {
        return ProductCatalogDataBuilder.of();
    }

    public static ProductCatalogDataBuilder builder(final ProductCatalogData template) {
        return ProductCatalogDataBuilder.of(template);
    }

    default <T> T withProductCatalogData(Function<ProductCatalogData, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductCatalogData> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductCatalogData>() {
            @Override
            public String toString() {
                return "TypeReference<ProductCatalogData>";
            }
        };
    }
}
