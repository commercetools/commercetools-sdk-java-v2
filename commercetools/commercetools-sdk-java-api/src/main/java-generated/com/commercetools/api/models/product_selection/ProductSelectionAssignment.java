
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

/**
*  <p>Specifies which Product is assigned to which Product Selection.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSelectionAssignmentImpl.class)
public interface ProductSelectionAssignment {

    /**
    *  <p>Reference to a Product that is assigned to the Product Selection.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
    *  <p>Reference to the Product Selection that this assignment is part of.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ProductSelectionReference getProductSelection();

    public void setProduct(final ProductReference product);

    public void setProductSelection(final ProductSelectionReference productSelection);

    public static ProductSelectionAssignment of() {
        return new ProductSelectionAssignmentImpl();
    }

    public static ProductSelectionAssignment of(final ProductSelectionAssignment template) {
        ProductSelectionAssignmentImpl instance = new ProductSelectionAssignmentImpl();
        instance.setProduct(template.getProduct());
        instance.setProductSelection(template.getProductSelection());
        return instance;
    }

    public static ProductSelectionAssignmentBuilder builder() {
        return ProductSelectionAssignmentBuilder.of();
    }

    public static ProductSelectionAssignmentBuilder builder(final ProductSelectionAssignment template) {
        return ProductSelectionAssignmentBuilder.of(template);
    }

    default <T> T withProductSelectionAssignment(Function<ProductSelectionAssignment, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionAssignment> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionAssignment>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionAssignment>";
            }
        };
    }
}
