
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductRemoveVariantActionImpl.class)
public interface ProductRemoveVariantAction extends ProductUpdateAction {

    String REMOVE_VARIANT = "removeVariant";

    @JsonProperty("id")
    public Long getId();

    @JsonProperty("sku")
    public String getSku();

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setId(final Long id);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public static ProductRemoveVariantAction of() {
        return new ProductRemoveVariantActionImpl();
    }

    public static ProductRemoveVariantAction of(final ProductRemoveVariantAction template) {
        ProductRemoveVariantActionImpl instance = new ProductRemoveVariantActionImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductRemoveVariantActionBuilder builder() {
        return ProductRemoveVariantActionBuilder.of();
    }

    public static ProductRemoveVariantActionBuilder builder(final ProductRemoveVariantAction template) {
        return ProductRemoveVariantActionBuilder.of(template);
    }

    default <T> T withProductRemoveVariantAction(Function<ProductRemoveVariantAction, T> helper) {
        return helper.apply(this);
    }
}
