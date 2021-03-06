
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeDescriptionActionImpl.class)
public interface ProductTypeChangeDescriptionAction extends ProductTypeUpdateAction {

    String CHANGE_DESCRIPTION = "changeDescription";

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
