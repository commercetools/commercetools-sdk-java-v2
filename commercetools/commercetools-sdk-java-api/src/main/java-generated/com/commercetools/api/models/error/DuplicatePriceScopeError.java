
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Price;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a Price scope conflicts with an existing one during an <span>Update Product</span> request.</p>
 *  <p>Every Price of a Product Variant must have a distinct combination of currency, Customer Group, country, and Channel that constitute the scope of a Price.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicatePriceScopeError duplicatePriceScopeError = DuplicatePriceScopeError.builder()
 *             .message("{message}")
 *             .conflictingPrice(conflictingPriceBuilder -> conflictingPriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DuplicatePriceScope")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DuplicatePriceScopeErrorImpl.class)
public interface DuplicatePriceScopeError extends ErrorObject {

    /**
     * discriminator value for DuplicatePriceScopeError
     */
    String DUPLICATE_PRICE_SCOPE = "DuplicatePriceScope";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Duplicate price scope: $priceScope. The combination of currency, country, customerGroup and channel must be unique for each price of a product variant."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Conflicting Embedded Price.</p>
     * @return conflictingPrice
     */
    @NotNull
    @Valid
    @JsonProperty("conflictingPrice")
    public Price getConflictingPrice();

    /**
     *  <p><code>"Duplicate price scope: $priceScope. The combination of currency, country, customerGroup and channel must be unique for each price of a product variant."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Conflicting Embedded Price.</p>
     * @param conflictingPrice value to be set
     */

    public void setConflictingPrice(final Price conflictingPrice);

    /**
     * factory method
     * @return instance of DuplicatePriceScopeError
     */
    public static DuplicatePriceScopeError of() {
        return new DuplicatePriceScopeErrorImpl();
    }

    /**
     * factory method to create a shallow copy DuplicatePriceScopeError
     * @param template instance to be copied
     * @return copy instance
     */
    public static DuplicatePriceScopeError of(final DuplicatePriceScopeError template) {
        DuplicatePriceScopeErrorImpl instance = new DuplicatePriceScopeErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingPrice(template.getConflictingPrice());
        return instance;
    }

    public DuplicatePriceScopeError copyDeep();

    /**
     * factory method to create a deep copy of DuplicatePriceScopeError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DuplicatePriceScopeError deepCopy(@Nullable final DuplicatePriceScopeError template) {
        if (template == null) {
            return null;
        }
        DuplicatePriceScopeErrorImpl instance = new DuplicatePriceScopeErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingPrice(
            com.commercetools.api.models.common.Price.deepCopy(template.getConflictingPrice()));
        return instance;
    }

    /**
     * builder factory method for DuplicatePriceScopeError
     * @return builder
     */
    public static DuplicatePriceScopeErrorBuilder builder() {
        return DuplicatePriceScopeErrorBuilder.of();
    }

    /**
     * create builder for DuplicatePriceScopeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DuplicatePriceScopeErrorBuilder builder(final DuplicatePriceScopeError template) {
        return DuplicatePriceScopeErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDuplicatePriceScopeError(Function<DuplicatePriceScopeError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DuplicatePriceScopeError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DuplicatePriceScopeError>() {
            @Override
            public String toString() {
                return "TypeReference<DuplicatePriceScopeError>";
            }
        };
    }
}
