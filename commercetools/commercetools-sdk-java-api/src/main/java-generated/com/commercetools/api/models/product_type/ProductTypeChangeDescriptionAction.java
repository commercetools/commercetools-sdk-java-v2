
package com.commercetools.api.models.product_type;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_type.ProductTypeChangeDescriptionActionImpl;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeDescriptionActionImpl.class)
public interface ProductTypeChangeDescriptionAction extends ProductTypeUpdateAction {

    @NotNull
    @JsonProperty("description")
    public String getDescription();

    public void setDescription(final String description);

    public static ProductTypeChangeDescriptionAction of() {
        return new ProductTypeChangeDescriptionActionImpl();
    }

    public static ProductTypeChangeDescriptionAction of(final ProductTypeChangeDescriptionAction template) {
        ProductTypeChangeDescriptionActionImpl instance = new ProductTypeChangeDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static ProductTypeChangeDescriptionActionBuilder builder() {
        return ProductTypeChangeDescriptionActionBuilder.of();
    }

    public static ProductTypeChangeDescriptionActionBuilder builder(final ProductTypeChangeDescriptionAction template) {
        return ProductTypeChangeDescriptionActionBuilder.of(template);
    }

    default <T> T withProductTypeChangeDescriptionAction(Function<ProductTypeChangeDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
