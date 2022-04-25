
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
@JsonDeserialize(as = ProductUpdateImpl.class)
public interface ProductUpdate
        extends com.commercetools.api.models.ResourceUpdate<ProductUpdate, ProductUpdateAction, ProductUpdateBuilder> {

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ProductUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final ProductUpdateAction... actions);

    public void setActions(final List<ProductUpdateAction> actions);

    public static ProductUpdate of() {
        return new ProductUpdateImpl();
    }

    public static ProductUpdate of(final ProductUpdate template) {
        ProductUpdateImpl instance = new ProductUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static ProductUpdateBuilder builder() {
        return ProductUpdateBuilder.of();
    }

    public static ProductUpdateBuilder builder(final ProductUpdate template) {
        return ProductUpdateBuilder.of(template);
    }

    default <T> T withProductUpdate(Function<ProductUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ProductUpdate>";
            }
        };
    }
}
