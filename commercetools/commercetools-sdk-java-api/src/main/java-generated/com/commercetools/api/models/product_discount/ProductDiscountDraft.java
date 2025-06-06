
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ProductDiscountDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountDraft productDiscountDraft = ProductDiscountDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .value(valueBuilder -> valueBuilder)
 *             .predicate("{predicate}")
 *             .sortOrder("{sortOrder}")
 *             .isActive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountDraftImpl.class)
public interface ProductDiscountDraft
        extends com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<ProductDiscountDraft> {

    /**
     *  <p>Name of the ProductDiscount.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>User-defined unique identifier for the ProductDiscount.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Description of the ProductDiscount.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Type of Discount and its corresponding value.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public ProductDiscountValueDraft getValue();

    /**
     *  <p>Valid ProductDiscount predicate.</p>
     * @return predicate
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Decimal value between 0 and 1 (passed as String literal) that defines the order of ProductDiscounts to apply in case more than one is applicable and active. A ProductDiscount with a higher <code>sortOrder</code> is prioritized. The value must be <strong>unique</strong> among all ProductDiscounts in the Project.</p>
     * @return sortOrder
     */
    @NotNull
    @JsonProperty("sortOrder")
    public String getSortOrder();

    /**
     *  <p>Set to <code>true</code> to activate the ProductDiscount, set to <code>false</code> to deactivate it (even though the <code>predicate</code> matches).</p>
     * @return isActive
     */
    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
     *  <p>Date and time (UTC) from which the Discount is effective. Take Eventual Consistency into account for calculated discount values.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Date and time (UTC) until which the Discount is effective. Take Eventual Consistency into account for calculated undiscounted values.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Name of the ProductDiscount.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>User-defined unique identifier for the ProductDiscount.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Description of the ProductDiscount.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Type of Discount and its corresponding value.</p>
     * @param value value to be set
     */

    public void setValue(final ProductDiscountValueDraft value);

    /**
     *  <p>Valid ProductDiscount predicate.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     *  <p>Decimal value between 0 and 1 (passed as String literal) that defines the order of ProductDiscounts to apply in case more than one is applicable and active. A ProductDiscount with a higher <code>sortOrder</code> is prioritized. The value must be <strong>unique</strong> among all ProductDiscounts in the Project.</p>
     * @param sortOrder value to be set
     */

    public void setSortOrder(final String sortOrder);

    /**
     *  <p>Set to <code>true</code> to activate the ProductDiscount, set to <code>false</code> to deactivate it (even though the <code>predicate</code> matches).</p>
     * @param isActive value to be set
     */

    public void setIsActive(final Boolean isActive);

    /**
     *  <p>Date and time (UTC) from which the Discount is effective. Take Eventual Consistency into account for calculated discount values.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Date and time (UTC) until which the Discount is effective. Take Eventual Consistency into account for calculated undiscounted values.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     * factory method
     * @return instance of ProductDiscountDraft
     */
    public static ProductDiscountDraft of() {
        return new ProductDiscountDraftImpl();
    }

    /**
     * factory method to create a shallow copy ProductDiscountDraft
     * @param template instance to be copied
     * @return copy instance
     */
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

    public ProductDiscountDraft copyDeep();

    /**
     * factory method to create a deep copy of ProductDiscountDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountDraft deepCopy(@Nullable final ProductDiscountDraft template) {
        if (template == null) {
            return null;
        }
        ProductDiscountDraftImpl instance = new ProductDiscountDraftImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setKey(template.getKey());
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setValue(
            com.commercetools.api.models.product_discount.ProductDiscountValueDraft.deepCopy(template.getValue()));
        instance.setPredicate(template.getPredicate());
        instance.setSortOrder(template.getSortOrder());
        instance.setIsActive(template.getIsActive());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    /**
     * builder factory method for ProductDiscountDraft
     * @return builder
     */
    public static ProductDiscountDraftBuilder builder() {
        return ProductDiscountDraftBuilder.of();
    }

    /**
     * create builder for ProductDiscountDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountDraftBuilder builder(final ProductDiscountDraft template) {
        return ProductDiscountDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountDraft(Function<ProductDiscountDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountDraft>";
            }
        };
    }
}
