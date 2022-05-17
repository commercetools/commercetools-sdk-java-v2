
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountDraftImpl.class)
public interface ProductDiscountDraft {

    /**
    *  <p>Name of the ProductDiscount.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>User-defined unique identifier for the ProductDiscount.</p>
    */

    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>Description of the ProductDiscount.</p>
    */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
    *  <p>Type of Discount and its corresponding value.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("value")
    public ProductDiscountValueDraft getValue();

    /**
    *  <p>Valid <a href="/../api/projects/predicates#productdiscount-predicates">ProductDiscount predicate</a>.</p>
    */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
    *  <p>Decimal value between 0 and 1 (passed as String literal) that defines the order of ProductDiscounts to apply in case more than one is applicable and active. A ProductDiscount with a higher <code>sortOrder</code> is prioritized.
    *  The value must be <strong>unique</strong> among all ProductDiscounts in the <a href="ctp:api:type:Project">Project</a>.</p>
    */
    @NotNull
    @JsonProperty("sortOrder")
    public String getSortOrder();

    /**
    *  <p>Set to <code>true</code> to activate the ProductDiscount, set to <code>false</code> to deactivate it (even though the <code>predicate</code> matches).</p>
    */
    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
    *  <p>Date and time (UTC) from which the Discount is effective.
    *  Take <a href="/../api/general-concepts#eventual-consistency">Eventual Consistency</a> into account for calculated discount values.</p>
    */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
    *  <p>Date and time (UTC) until which the Discount is effective.
    *  Take <a href="/../api/general-concepts#eventual-consistency">Eventual Consistency</a> into account for calculated undiscounted values.</p>
    */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    public void setName(final LocalizedString name);

    public void setKey(final String key);

    public void setDescription(final LocalizedString description);

    public void setValue(final ProductDiscountValueDraft value);

    public void setPredicate(final String predicate);

    public void setSortOrder(final String sortOrder);

    public void setIsActive(final Boolean isActive);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public static ProductDiscountDraft of() {
        return new ProductDiscountDraftImpl();
    }

    public static ProductDiscountDraft of(final ProductDiscountDraft template) {
        ProductDiscountDraftImpl instance = new ProductDiscountDraftImpl();
        instance.setName(template.getName());
        instance.setKey(template.getKey());
        instance.setDescription(template.getDescription());
        instance.setValue(template.getValue());
        instance.setPredicate(template.getPredicate());
        instance.setSortOrder(template.getSortOrder());
        instance.setIsActive(template.getIsActive());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    public static ProductDiscountDraftBuilder builder() {
        return ProductDiscountDraftBuilder.of();
    }

    public static ProductDiscountDraftBuilder builder(final ProductDiscountDraft template) {
        return ProductDiscountDraftBuilder.of(template);
    }

    default <T> T withProductDiscountDraft(Function<ProductDiscountDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountDraft>";
            }
        };
    }
}
