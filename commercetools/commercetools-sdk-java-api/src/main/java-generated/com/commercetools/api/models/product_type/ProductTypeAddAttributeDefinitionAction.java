
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
@JsonDeserialize(as = ProductTypeAddAttributeDefinitionActionImpl.class)
public interface ProductTypeAddAttributeDefinitionAction extends ProductTypeUpdateAction {

    String ADD_ATTRIBUTE_DEFINITION = "addAttributeDefinition";

    @NotNull
    @Valid
    @JsonProperty("attribute")
    public AttributeDefinitionDraft getAttribute();

    public void setAttribute(final AttributeDefinitionDraft attribute);

    public static ProductTypeAddAttributeDefinitionAction of() {
        return new ProductTypeAddAttributeDefinitionActionImpl();
    }

    public static ProductTypeAddAttributeDefinitionAction of(final ProductTypeAddAttributeDefinitionAction template) {
        ProductTypeAddAttributeDefinitionActionImpl instance = new ProductTypeAddAttributeDefinitionActionImpl();
        instance.setAttribute(template.getAttribute());
        return instance;
    }

    public static ProductTypeAddAttributeDefinitionActionBuilder builder() {
        return ProductTypeAddAttributeDefinitionActionBuilder.of();
    }

    public static ProductTypeAddAttributeDefinitionActionBuilder builder(
            final ProductTypeAddAttributeDefinitionAction template) {
        return ProductTypeAddAttributeDefinitionActionBuilder.of(template);
    }

    default <T> T withProductTypeAddAttributeDefinitionAction(
            Function<ProductTypeAddAttributeDefinitionAction, T> helper) {
        return helper.apply(this);
    }
}
