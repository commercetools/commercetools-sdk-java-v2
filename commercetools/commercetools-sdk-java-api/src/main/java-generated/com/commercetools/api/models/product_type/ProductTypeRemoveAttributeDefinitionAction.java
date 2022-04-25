
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeRemoveAttributeDefinitionActionImpl.class)
public interface ProductTypeRemoveAttributeDefinitionAction extends ProductTypeUpdateAction {

    String REMOVE_ATTRIBUTE_DEFINITION = "removeAttributeDefinition";

    /**
    *  <p>The name of the attribute to remove.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    public void setName(final String name);

    public static ProductTypeRemoveAttributeDefinitionAction of() {
        return new ProductTypeRemoveAttributeDefinitionActionImpl();
    }

    public static ProductTypeRemoveAttributeDefinitionAction of(
            final ProductTypeRemoveAttributeDefinitionAction template) {
        ProductTypeRemoveAttributeDefinitionActionImpl instance = new ProductTypeRemoveAttributeDefinitionActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static ProductTypeRemoveAttributeDefinitionActionBuilder builder() {
        return ProductTypeRemoveAttributeDefinitionActionBuilder.of();
    }

    public static ProductTypeRemoveAttributeDefinitionActionBuilder builder(
            final ProductTypeRemoveAttributeDefinitionAction template) {
        return ProductTypeRemoveAttributeDefinitionActionBuilder.of(template);
    }

    default <T> T withProductTypeRemoveAttributeDefinitionAction(
            Function<ProductTypeRemoveAttributeDefinitionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeRemoveAttributeDefinitionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeRemoveAttributeDefinitionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeRemoveAttributeDefinitionAction>";
            }
        };
    }
}
