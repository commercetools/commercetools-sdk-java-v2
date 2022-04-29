
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductLabelImpl.class)
public interface ProductLabel extends Label {

    String PRODUCT_LABEL = "ProductLabel";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setSlug(final LocalizedString slug);

    public void setName(final LocalizedString name);

    public static ProductLabel of() {
        return new ProductLabelImpl();
    }

    public static ProductLabel of(final ProductLabel template) {
        ProductLabelImpl instance = new ProductLabelImpl();
        instance.setSlug(template.getSlug());
        instance.setName(template.getName());
        return instance;
    }

    public static ProductLabelBuilder builder() {
        return ProductLabelBuilder.of();
    }

    public static ProductLabelBuilder builder(final ProductLabel template) {
        return ProductLabelBuilder.of(template);
    }

    default <T> T withProductLabel(Function<ProductLabel, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductLabel>() {
            @Override
            public String toString() {
                return "TypeReference<ProductLabel>";
            }
        };
    }
}
