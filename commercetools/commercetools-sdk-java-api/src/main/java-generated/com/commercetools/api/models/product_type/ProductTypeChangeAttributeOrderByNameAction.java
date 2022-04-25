
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeAttributeOrderByNameActionImpl.class)
public interface ProductTypeChangeAttributeOrderByNameAction extends ProductTypeUpdateAction {

    String CHANGE_ATTRIBUTE_ORDER_BY_NAME = "changeAttributeOrderByName";

    @NotNull
    @JsonProperty("attributeNames")
    public List<String> getAttributeNames();

    @JsonIgnore
    public void setAttributeNames(final String... attributeNames);

    public void setAttributeNames(final List<String> attributeNames);

    public static ProductTypeChangeAttributeOrderByNameAction of() {
        return new ProductTypeChangeAttributeOrderByNameActionImpl();
    }

    public static ProductTypeChangeAttributeOrderByNameAction of(
            final ProductTypeChangeAttributeOrderByNameAction template) {
        ProductTypeChangeAttributeOrderByNameActionImpl instance = new ProductTypeChangeAttributeOrderByNameActionImpl();
        instance.setAttributeNames(template.getAttributeNames());
        return instance;
    }

    public static ProductTypeChangeAttributeOrderByNameActionBuilder builder() {
        return ProductTypeChangeAttributeOrderByNameActionBuilder.of();
    }

    public static ProductTypeChangeAttributeOrderByNameActionBuilder builder(
            final ProductTypeChangeAttributeOrderByNameAction template) {
        return ProductTypeChangeAttributeOrderByNameActionBuilder.of(template);
    }

    default <T> T withProductTypeChangeAttributeOrderByNameAction(
            Function<ProductTypeChangeAttributeOrderByNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeAttributeOrderByNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeAttributeOrderByNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeAttributeOrderByNameAction>";
            }
        };
    }
}
