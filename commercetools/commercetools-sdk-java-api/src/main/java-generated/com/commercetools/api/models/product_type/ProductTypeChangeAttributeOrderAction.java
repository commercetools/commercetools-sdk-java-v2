
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
@JsonDeserialize(as = ProductTypeChangeAttributeOrderActionImpl.class)
public interface ProductTypeChangeAttributeOrderAction extends ProductTypeUpdateAction {

    String CHANGE_ATTRIBUTE_ORDER = "changeAttributeOrder";

    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<AttributeDefinition> getAttributes();

    @JsonIgnore
    public void setAttributes(final AttributeDefinition... attributes);

    public void setAttributes(final List<AttributeDefinition> attributes);

    public static ProductTypeChangeAttributeOrderAction of() {
        return new ProductTypeChangeAttributeOrderActionImpl();
    }

    public static ProductTypeChangeAttributeOrderAction of(final ProductTypeChangeAttributeOrderAction template) {
        ProductTypeChangeAttributeOrderActionImpl instance = new ProductTypeChangeAttributeOrderActionImpl();
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    public static ProductTypeChangeAttributeOrderActionBuilder builder() {
        return ProductTypeChangeAttributeOrderActionBuilder.of();
    }

    public static ProductTypeChangeAttributeOrderActionBuilder builder(
            final ProductTypeChangeAttributeOrderAction template) {
        return ProductTypeChangeAttributeOrderActionBuilder.of(template);
    }

    default <T> T withProductTypeChangeAttributeOrderAction(Function<ProductTypeChangeAttributeOrderAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeAttributeOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeAttributeOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeAttributeOrderAction>";
            }
        };
    }
}
