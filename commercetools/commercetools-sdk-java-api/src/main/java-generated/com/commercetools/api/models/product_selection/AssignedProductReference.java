
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AssignedProductReferenceImpl.class)
public interface AssignedProductReference {

    /**
    *  <p>Reference to a Product that is assigned to the Product Selection.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    public void setProduct(final ProductReference product);

    public static AssignedProductReference of() {
        return new AssignedProductReferenceImpl();
    }

    public static AssignedProductReference of(final AssignedProductReference template) {
        AssignedProductReferenceImpl instance = new AssignedProductReferenceImpl();
        instance.setProduct(template.getProduct());
        return instance;
    }

    public static AssignedProductReferenceBuilder builder() {
        return AssignedProductReferenceBuilder.of();
    }

    public static AssignedProductReferenceBuilder builder(final AssignedProductReference template) {
        return AssignedProductReferenceBuilder.of(template);
    }

    default <T> T withAssignedProductReference(Function<AssignedProductReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AssignedProductReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssignedProductReference>() {
            @Override
            public String toString() {
                return "TypeReference<AssignedProductReference>";
            }
        };
    }
}
