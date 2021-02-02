
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSetDescriptionActionImpl.class)
public interface ProductSetDescriptionAction extends ProductUpdateAction {

    String SET_DESCRIPTION = "setDescription";

    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setDescription(final LocalizedString description);

    public void setStaged(final Boolean staged);

    public static ProductSetDescriptionAction of() {
        return new ProductSetDescriptionActionImpl();
    }

    public static ProductSetDescriptionAction of(final ProductSetDescriptionAction template) {
        ProductSetDescriptionActionImpl instance = new ProductSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetDescriptionActionBuilder builder() {
        return ProductSetDescriptionActionBuilder.of();
    }

    public static ProductSetDescriptionActionBuilder builder(final ProductSetDescriptionAction template) {
        return ProductSetDescriptionActionBuilder.of(template);
    }

    default <T> T withProductSetDescriptionAction(Function<ProductSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
