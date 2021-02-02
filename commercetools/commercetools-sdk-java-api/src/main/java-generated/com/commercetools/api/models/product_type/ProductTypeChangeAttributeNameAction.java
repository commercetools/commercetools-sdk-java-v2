
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeAttributeNameActionImpl.class)
public interface ProductTypeChangeAttributeNameAction extends ProductTypeUpdateAction {

    String CHANGE_ATTRIBUTE_NAME = "changeAttributeName";

    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    @NotNull
    @JsonProperty("newAttributeName")
    public String getNewAttributeName();

    public void setAttributeName(final String attributeName);

    public void setNewAttributeName(final String newAttributeName);

    public static ProductTypeChangeAttributeNameAction of() {
        return new ProductTypeChangeAttributeNameActionImpl();
    }

    public static ProductTypeChangeAttributeNameAction of(final ProductTypeChangeAttributeNameAction template) {
        ProductTypeChangeAttributeNameActionImpl instance = new ProductTypeChangeAttributeNameActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setNewAttributeName(template.getNewAttributeName());
        return instance;
    }

    public static ProductTypeChangeAttributeNameActionBuilder builder() {
        return ProductTypeChangeAttributeNameActionBuilder.of();
    }

    public static ProductTypeChangeAttributeNameActionBuilder builder(
            final ProductTypeChangeAttributeNameAction template) {
        return ProductTypeChangeAttributeNameActionBuilder.of(template);
    }

    default <T> T withProductTypeChangeAttributeNameAction(Function<ProductTypeChangeAttributeNameAction, T> helper) {
        return helper.apply(this);
    }
}
