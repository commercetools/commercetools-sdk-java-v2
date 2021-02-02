
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeUpdateImpl.class)
public interface ProductTypeUpdate
        extends com.commercetools.api.models.ResourceUpdate<ProductTypeUpdate, ProductTypeUpdateAction> {

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ProductTypeUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final ProductTypeUpdateAction... actions);

    public void setActions(final List<ProductTypeUpdateAction> actions);

    public static ProductTypeUpdate of() {
        return new ProductTypeUpdateImpl();
    }

    public static ProductTypeUpdate of(final ProductTypeUpdate template) {
        ProductTypeUpdateImpl instance = new ProductTypeUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static ProductTypeUpdateBuilder builder() {
        return ProductTypeUpdateBuilder.of();
    }

    public static ProductTypeUpdateBuilder builder(final ProductTypeUpdate template) {
        return ProductTypeUpdateBuilder.of(template);
    }

    default <T> T withProductTypeUpdate(Function<ProductTypeUpdate, T> helper) {
        return helper.apply(this);
    }
}
