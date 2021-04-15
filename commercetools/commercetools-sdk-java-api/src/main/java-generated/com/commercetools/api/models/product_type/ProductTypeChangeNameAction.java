
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeNameActionImpl.class)
public interface ProductTypeChangeNameAction extends ProductTypeUpdateAction {

    String CHANGE_NAME = "changeName";

    @NotNull
    @JsonProperty("name")
    public String getName();

    public void setName(final String name);

    public static ProductTypeChangeNameAction of() {
        return new ProductTypeChangeNameActionImpl();
    }

    public static ProductTypeChangeNameAction of(final ProductTypeChangeNameAction template) {
        ProductTypeChangeNameActionImpl instance = new ProductTypeChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static ProductTypeChangeNameActionBuilder builder() {
        return ProductTypeChangeNameActionBuilder.of();
    }

    public static ProductTypeChangeNameActionBuilder builder(final ProductTypeChangeNameAction template) {
        return ProductTypeChangeNameActionBuilder.of(template);
    }

    default <T> T withProductTypeChangeNameAction(Function<ProductTypeChangeNameAction, T> helper) {
        return helper.apply(this);
    }
}
